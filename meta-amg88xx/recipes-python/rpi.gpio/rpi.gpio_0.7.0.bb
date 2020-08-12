# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "A module to control Raspberry Pi GPIO channels"
HOMEPAGE = "http://sourceforge.net/projects/raspberry-gpio-python/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE.txt;md5=9b95630a648966b142f1a0dcea001cb7"

SRC_URI = "https://files.pythonhosted.org/packages/cb/88/d3817eb11fc77a8d9a63abeab8fe303266b1e3b85e2952238f0da43fed4e/RPi.GPIO-${PV}.tar.gz"
SRC_URI[md5sum] = "777617f9dea9a1680f9af43db0cf150e"
SRC_URI[sha256sum] = "7424bc6c205466764f30f666c18187a0824077daf20b295c42f08aea2cb87d3f"

S = "${WORKDIR}/RPi.GPIO-${PV}"

inherit distutils3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS_${PN} += "python3-core"


