#!/usr/bin/env python3
import os
import cv2
import numpy as np
from matplotlib import pyplot as plt
import json


#Carga imagen termica
original = cv2.imread('/nodejs/public/panel.jpg')

#Carga imagen en escala de grises
gris = cv2.imread('/nodejs/public/panel.jpg',0)

#Filtro Gaussiano
img = cv2.GaussianBlur(gris,(7,7),3)

#Binarizacion
_, binaz = cv2.threshold(img,150, 255, cv2.THRESH_BINARY)

#Obtener contornos de imagen binarizada
contornos, y = cv2.findContours(binaz, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE)

#Dibujar contornos
#n numero de puntos calientes encontrados
n=0
for c in contornos:
    area = cv2.contourArea(c)
    #Se delimita el tamaño de los contornos
    if area > 5000 and area < 50000:
        cv2.drawContours(original, [c], 0, (0, 255, 0), 2, cv2.LINE_AA)
        n=n+1

#Guardar imagen
path = '/nodejs/public/'  #Direccion de la imagen 'panelfinal.jpg'
cv2.imwrite(os.path.join(path , 'panelfinal.jpg'), original)
cv2.waitKey(0)


#Generar .json
data = {}
if (n > 0):
	data['Status'] = 'Dirty'
	data['Numberofhotspots'] = str(n)
	#data['Imagen'] = original
else:
	data['Status'] = 'Clean'
	data['Numberofhotspots'] = '0'
	#data['Imagen'] = original

#Direccion del json	
dir = '/nodejs/'
file_name = "status.json"

with open(os.path.join(dir, file_name), 'w') as file:
    json.dump(data, file)
