DESCRIPTION = "Example for ROS package into meta-ros."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS = "roscpp catkin std-msgs"
RDEPENDS_${PN} = "roscpp rospy std-msgs"

SRC_URI = "file://cb-${PV}/user_program"
#SRC_URI = "file://cb-${PV}/user_program/CMakeLists.txt"
#SRC_URI += "file://cb-${PV}/${USER_PACKAGE}/package.xml"
#SRC_URI += "file://cb-${PV}/${USER_PACKAGE}/src/listener.cpp"
#SRC_URI += "file://cb-${PV}/${USER_PACKAGE}/src/talker.cpp"

USER_PACKAGE = "user_program"
PV = "1.0.0"
S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "cb"
