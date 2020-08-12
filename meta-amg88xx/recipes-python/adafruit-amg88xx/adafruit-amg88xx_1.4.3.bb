# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Python library to use the AMG88xx Grid-EYE 8x8 thermal sensor with raspberry pi or other linux boards."
HOMEPAGE = "https://github.com/adafruit/Adafruit_AMG88xx_python/"
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

SRC_URI = "https://files.pythonhosted.org/packages/c8/e2/39584452778fa85f333446418a37ea09d5cee1a01885e111f401f9900c92/Adafruit_AMG88xx-${PV}.tar.gz"
SRC_URI[md5sum] = "c416a0c5dad6c5a0863dbc91b438ae7d"
SRC_URI[sha256sum] = "e4e0b77396d308b546b5383ac0e4a67077e5d11c51bb762a893b0ab8c4a3cd6e"

S = "${WORKDIR}/Adafruit_AMG88xx-${PV}"

inherit setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "adafruit-gpio adafruit-bitfield"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core python3-logging"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    Adafruit_GPIO.I2C
#    Adafruit_bitfield


