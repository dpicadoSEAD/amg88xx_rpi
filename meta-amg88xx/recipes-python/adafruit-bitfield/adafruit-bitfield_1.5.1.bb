# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Simple bitfield helper library."
HOMEPAGE = "https://github.com/adafruit/Adafruit_bitfield_python/"
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

SRC_URI = "https://files.pythonhosted.org/packages/30/21/42e6a08d9149db3ec97ae5ab4f268973e7d2b1a1d26427e41d11550980ac/Adafruit-bitfield-${PV}.tar.gz"
SRC_URI[md5sum] = "f6ad9659747d661d493e3b55ff5a6280"
SRC_URI[sha256sum] = "0e2258ddcd05b6a82d9b53cbf424447ca562b1506fa565b578056b854dc6010f"

S = "${WORKDIR}/Adafruit-bitfield-${PV}"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core"


