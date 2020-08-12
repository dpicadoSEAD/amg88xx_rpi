# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A fast implementation of the Cassowary constraint solver"
HOMEPAGE = "https://github.com/nucleic/kiwi"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.txt
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=0fa569fba9352e311f2acb8ba1657550"

SRC_URI = "https://files.pythonhosted.org/packages/source/k/kiwisolver/kiwisolver-${PV}.tar.gz"
SRC_URI[md5sum] = "e2a1718b837e2cd001f7c06934616fcd"
SRC_URI[sha256sum] = "ce3be5d520b4d2c3e5eeb4cd2ef62b9b9ab8ac6b6fedbaa0e39cdb6f50644278"

inherit setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "python3-setuptools"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core"


