# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Pure python (i.e. no native extensions) access to Linux IO    including I2C and SPI. Drop in replacement for smbus and spidev modules."
HOMEPAGE = "https://github.com/adafruit/Adafruit_Python_PureIO"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a21fcca821a506d4c36f7bbecc0d009"

SRC_URI = "https://files.pythonhosted.org/packages/01/ee/da6d2c6848571a65eaa0f1e37b1cd13ba8fefdea962455faabef7c61e7f4/Adafruit_PureIO-${PV}.tar.gz"
SRC_URI[md5sum] = "54509c34347099390c2427aa851477ef"
SRC_URI[sha256sum] = "ebab172823f7249e02a644844a64e6dc2e4b3ded38ba42099068fd3e96623cfb"

S = "${WORKDIR}/Adafruit_PureIO-${PV}"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core python3-ctypes python3-fcntl"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"
