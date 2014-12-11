Example of cross-compiling the local source code in meta-ros using bitbake
===========================================================================

I tested this code on Yocto project, poky 1.6.2.

This is my folder structure: ::

    yocto/poky/meta-ros/recipes-ros$ tree cb/
    cb/
    ├── files
    │   └── cb-1.0.0
    │       └── user_program
    │           ├── CMakeLists.txt
    │           ├── include
    │           │   └── user_program
    │           ├── package.xml
    │           └── src
    │               ├── listener.cpp
    │               └── talker.cpp
    ├── README.rst
    └── user-program_1.0.0.bb

    6 directories, 6 files


Compile this code: ::

    yocto/build$ bitbake user-program


