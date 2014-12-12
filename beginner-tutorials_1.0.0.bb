DESCRIPTION = "Example for ROS package into meta-ros."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS = "roscpp catkin std-msgs"
RDEPENDS_${PN} = "roscpp rospy std-msgs"

SRC_URI = "file://."

S = "${WORKDIR}"

inherit catkin

