#!/usr/bin/env python3
import argparse
from time import sleep
from colour import Color

from Adafruit_AMG88xx import Adafruit_AMG88xx
from PIL import Image, ImageDraw

# parse command line arguments
parser = argparse.ArgumentParser(description='Take a still image.')
parser.add_argument('-o','--output', metavar='filename', default='amg88xx_still.jpg', help='specify output filename')
parser.add_argument('-s','--scale', type=int, default=100, help='specify image scale')
parser.add_argument('--min', type=float, help='specify minimum temperature')
parser.add_argument('--max', type=float, help='specify maximum temperature')
parser.add_argument('--report', action='store_true', default=False, help='show sensor information without saving image')

args = parser.parse_args()
    
# sensor setup
NX = 8
NY = 8
sensor = Adafruit_AMG88xx()

# wait for it to boot
sleep(.1)

# get sensor readings  
pixels = sensor.readPixels()

#if args.report:
#    print "Min Pixel = {0} C".format(min(pixels))
#    print "Max Pixel = {0} C".format(max(pixels))
#    print "Thermistor = {0} C".format(sensor.readThermistor())
#    exit()

x=max(pixels)
y=min(pixels)

print(x,y)

# output image buffer
image = Image.new("RGB", (NX, NY), "white")
draw = ImageDraw.Draw(image)

# color map
COLORDEPTH = 256
colors = list(Color("red").range_to(Color("indigo"), COLORDEPTH))
colors = [(int(c.red * 255), int(c.green * 255), int(c.blue * 255)) for c in colors]

#some utility functions
def constrain(val, min_val, max_val):
    return min(max_val, max(min_val, val))

def map(x, in_min, in_max, out_min, out_max):
    return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min

# map sensor readings to color map
MINTEMP = min(pixels) if args.min == None else args.min
MAXTEMP = max(pixels) if args.max == None else args.max
pixels = [map(p, MINTEMP, MAXTEMP, 0, COLORDEPTH - 1) for p in pixels]

# create the image
for ix in range(NX):
    for iy in range(NY):
        draw.point([(ix,iy%NX)], fill=colors[constrain(int(pixels[ix+NX*iy]), 0, COLORDEPTH- 1)])

# scale and save
image.resize((NX*args.scale, NY*args.scale),Image.BILINEAR).save('/nodejs/public/panel.jpg')
