DESCRIPTION = "A Car Mileage Calculator."
HOMEPAGE = "http://mileage.sourceforge.net"
SECTION = "opie/applications"
LICENSE = "GPLv2"
#Change to form x.y.z+cvs${SRCDATE} when 4.2.0 changes in PV
SRCDATE = "20060814"
PV = "4.2.0-cvs-${SRCDATE}"
PR = "r2"

SRC_URI = "cvs://anonymous@mileage.cvs.sourceforge.net/cvsroot/mileage;module=mileage"
S = "${WORKDIR}/mileage"

LIC_FILES_CHKSUM = "file://LICENSE;md5=8ca43cbc842c2336e835926c2166c28b"

inherit palmtop
export OE_QMAKE_LINK="${CXX}"

do_install() {
	install -d ${D}${palmtopdir}/apps/Applications/
	install -d ${D}${palmtopdir}/pics/
	install -d ${D}${palmtopdir}/bin/
	install -m 0755 ${PN} ${D}${palmtopdir}/bin/
	install -m 0644 ${PN}.desktop ${D}${palmtopdir}/apps/Applications/
	install -m 0644 ${PN}.png ${D}${palmtopdir}/pics/
#FIXME: Package and install help files seperatly
}

