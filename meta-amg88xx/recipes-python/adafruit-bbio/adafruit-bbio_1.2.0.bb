# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A module to control BeagleBone IO channels"
HOMEPAGE = "https://github.com/adafruit/adafruit-beaglebone-io-python/"
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

SRC_URI = "https://files.pythonhosted.org/packages/19/db/0d7afa47b97bb3786b564032fe56b0cf2bf7537ef96c24ae1d95fa4c54e9/Adafruit_BBIO-${PV}.tar.gz"
SRC_URI[md5sum] = "0a5e6883af4341bbb40a8e5f3c960ff2"
SRC_URI[sha256sum] = "5edcb8abd32b5f78365f6131f1d24cd78c419d60f469fc828518688cf39fdbad"

S = "${WORKDIR}/Adafruit_BBIO-${PV}"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-compression python3-core python3-distutils python3-io python3-logging python3-netclient python3-pkg-resources python3-setuptools python3-shell"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    urllib2


