# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Allows using distutils2-like setup.cfg files for a package's metadata with a distribute/setuptools setup.py"
HOMEPAGE = "https://github.com/embray/d2to1"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ec5c9882880dafb7f5a0b8d2642ea581"

SRC_URI = "https://files.pythonhosted.org/packages/dc/bd/eac45e4e77d76f6c0ae539819c40f1babb891d7855129663e37957a7c2df/d2to1-${PV}.tar.gz"
SRC_URI[md5sum] = "1ba7e64ead23cbf104993122f0871030"
SRC_URI[sha256sum] = "49ef2d16862b3efdc81fc5c32eac373b984945cde5fc02bb01a0a11ff03dd825"

inherit setuptools3

# WARNING: the following rdepends are from setuptools install_requires. These
# upstream names may not correspond exactly to bitbake package names.
RDEPENDS_${PN} += "python3-setuptools"

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-compression python3-core python3-distutils python3-io python3-logging python3-multiprocessing python3-netclient python3-pkg-resources python3-setuptools python3-shell"

# WARNING: We were unable to map the following python package/module
# dependencies to the bitbake packages which include them:
#    StringIO
#    urllib2
#    zest.releaser
#    zest.releaser.git
#    zest.releaser.pypi
#    zest.releaser.release
#    zest.releaser.vcs


