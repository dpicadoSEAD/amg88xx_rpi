# amg88xx_rpi
This repository contains recepies to build a Yocto image that gives support to the Adafruit AMG8833 thermal camera for a Raspberrypi4. It includes all the necesarry libraries and configurations to activate the hardware needed and command it (ie.i2c,adafruit amg88xx library). It installs 2 simple python scripts, python-captura takes a .jpeg thermal image from the sensor and returns the maximum and minimum temperature. On the other hand python-hotspots detects the hotspots in the image and circles them and generates a report in a .json file. 

Dependencies:

poky zeus branch git://git.yoctoproject.org/poky\

meta-raspberrypi zeus branch git://git.yoctoproject.org/meta-raspberrypi\

meta-openembedded zeus branch https://github.com/openembedded/meta-openembedded\

Dependencies to perform a native build:

python3.6 or greater\
python2.7\
build-essential\
chrpath\
diffstat\
gawk\
libncurses5-dev\
python3-distutils\
texinfo\
setuptools-scm\

Note: This is a high level guide, you might need more native build tools, refer to https://www.yoctoproject.org/ for more information on how to perform and initial build. Change the paths in bblayers.conf to match what you have in your native system. 


This repository is intended to work with https://github.com/macho1997/amg88xx_UI which adds a private web service with nodejs to display the image and report. 


