PATCHTOOL = "git"
FILESEXTRAPATHS_prepend := "${THISDIR}/patches:"
SRC_URI_append = " file://0001-Add-new-custom-device-tree.patch "