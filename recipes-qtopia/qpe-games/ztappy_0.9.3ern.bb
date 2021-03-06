DESCRIPTION = "ZTappy"
SECTION = "opie/games"
LICENSE = "GPL"
AUTHOR = "Kart Bartel, Robert Ernst"
HOMEPAGE = "http://www.linux-solutions.at/projects/zaurus/games-ZTappy.html"



SRC_URI = "http://sources.openembedded.org/ztappy_V0.9.3ern.tar.gz "

S = "${WORKDIR}/ztappy_V${PV}"

# No license files present in the source distribution, although there are
# some comments embedded in the source/build script confirming it is GPL;
# however it's not really practical to checksum them in this case
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

APPNAME = "ztappy"
APPTYPE = "binary"
APPDESKTOP = "${S}"

do_install () {
	install -d ${D}${palmtopdir}/apps/Games/
	install -d ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/pics/*.png ${D}${palmtopdir}/pics/${APPNAME}/
	install -m 0644 ${S}/${APPNAME}.desktop ${D}${palmtopdir}/apps/Games
}

inherit opie

SRC_URI[md5sum] = "2c3881503615d86b78b89ad5f4ec675c"
SRC_URI[sha256sum] = "006c061dc031e711cc3ccccbb659ffb9b09b74ff3be6c5768aecd7297738b1c0"
