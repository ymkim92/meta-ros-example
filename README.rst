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
    │           ├── package.xml
    │           └── src
    │               ├── listener.cpp
    │               └── talker.cpp
    ├── README.rst
    └── user-program_1.0.0.bb

Compile this code: ::

    yocto/build$ bitbake user-program

This code came from http://wiki.ros.org/ROS/Tutorials/WritingPublisherSubscriber%28c%2B%2B%29.
I modified it to fit to bitabke and meta-ros. It is not compiled on ``catkin_make``.
