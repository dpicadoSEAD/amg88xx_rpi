# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Library to provide a cross-platform GPIO interface on the Raspberry Pi and Beaglebone Black using the RPi.GPIO and Adafruit_BBIO libraries."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_GPIO/"
# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
# NOTE: Original package / source metadata indicates license is: MIT
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "https://files.pythonhosted.org/packages/db/1c/2dc8a674514219f287fa344e44cadfd77b3e2878d6ff602a8c2149b50dd8/Adafruit_GPIO-${PV}.tar.gz"
SRC_URI[md5sum] = "dfcdb1ba90188d18ba80b6d2958c8c33"
SRC_URI[sha256sum] = "d6465b92c866c51ca8f3bc1e8f2ec36f5ccdb46d0fd54101c1109756d4a2dcd0"

S = "${WORKDIR}/Adafruit_GPIO-${PV}"

inherit setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "adafruit-pureio python3-spidev"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core python3-logging python3-unittest"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    Adafruit_BBIO.GPIO
#    Adafruit_BBIO.PWM
#    Adafruit_PureIO.smbus
#    RPi.GPIO
#    ftdi1
#    mock
#    mraa


