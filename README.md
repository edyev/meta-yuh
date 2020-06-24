# meta-edyev
This is a repo of an example layer for Yocto (specifcally for imx8m)

This layer includes a new tool called devmem2

This layers also includes patches for both recipes for kernel and bsp (u-boot) and its appropriate .bbappends and patches

u-boot patch sets fdt_file environment variable which translates in setting the name for the device tree that will be used when loading kernel

linux-imx patch adds the proper device tree

You can use this a starting point for your own layer and modify recipes.

Please bear in mind that if you want to patch an existing recipe defined in another layer you only need to include a directory indicating the name of the recipe (i.e recipes-kernel, recipes-bsp) and follow the path convention for the specific recipe.

Example.

u-boot original recipe is definied in *meta-fsl-bsp-release/imx/meta-bsp/recipes-bsp/u-boot* and it recipe file is *u-boot-imx_2019.04.bb* so to patch in layer meta-edyev you need to add recipes-bsp/u-boot/ and there create u-boot-imx_2019.04.bbappend. 

Although altogether with its enviroment this layer is fully functional, this repo is just meant for reference on how to include a new layer with a new recipe and patching exisiting recipes.

