# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "converts and manipulates various color representation (HSL, RVB, web, X11, ...)"
HOMEPAGE = "http://github.com/vaab/colour"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6b7ab5035d6c69f8bb5e2c34e8bb8d1e"

SRC_URI = "https://files.pythonhosted.org/packages/75/03/d0f40a2a0116afcc6ab37ad085876ee430f504fe5746e9d058c0dca815a5/colour-${PV}.tar.gz"
SRC_URI[md5sum] = "dcc768d2a4a43048bc53c39d97a7303e"
SRC_URI[sha256sum] = "6c1cc631cbe372df985822d213e8bfb464a7b03ae44c2fb2673ace1be8650fec"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core python3-crypt"


