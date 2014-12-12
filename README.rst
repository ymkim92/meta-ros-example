Example of cross-compiling the local source code in meta-ros using bitbake
===========================================================================

I tested this code on Yocto project, poky 1.6.2.

This is my folder structure: ::

    yocto/poky/meta-ros/recipes-ros/beginner-tutorials$ tree .
    .
    ├── beginner-tutorials_1.0.0.bb
    ├── files
    │   ├── CMakeLists.txt
    │   ├── include
    │   │   └── beginner_tutorials
    │   ├── package.xml
    │   └── src
    │       ├── listener.cpp
    │       └── talker.cpp
    └── README.rst

    4 directories, 6 files

Compile this code: ::

    yocto/build$ bitbake beginner-tutorials 

The files under ``files`` folder came from http://wiki.ros.org/ROS/Tutorials/WritingPublisherSubscriber%28c%2B%2B%29.
I just add a recipe(bb file). You can compiled this code on both ``catkin_make`` and ``bitbake``.
