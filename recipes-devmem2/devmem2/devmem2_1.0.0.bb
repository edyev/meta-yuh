DESCRIPTION = "devmem2"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://devmem2.c"

S = "${WORKDIR}"

do_compile() {
	${CC} devmem2.c ${LDFLAGS} -o devmem2
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 devmem2 ${D}${bindir}
}
