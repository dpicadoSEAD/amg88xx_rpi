# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Composable style cycles"
HOMEPAGE = "http://github.com/matplotlib/cycler"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7713fe42cd766b15c710e19392bfa811"

SRC_URI = "https://files.pythonhosted.org/packages/source/c/cycler/cycler-${PV}.tar.gz"
SRC_URI[md5sum] = "4cb42917ac5007d1cdff6cccfe2d016b"
SRC_URI[sha256sum] = "cd7b2d1018258d7247a71425e9f26463dfb444d411c39569972f4ce586b0c9d8"

inherit setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "python3-six"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core python3-six"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    six.moves


