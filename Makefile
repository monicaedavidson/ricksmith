
PACKAGE=ricksmith-www
# set these at the command line for versioned RPMs, otherwise
# they default to these values
VERSION ?= 0.1.1
RELEASE ?= 1

JARVERSION=0.2.0
SCALA_VERSION=2.11
PREFIX=/usr/local

# should not need to change these
JAR=${PACKAGE}-${JARVERSION}.jar
TARGET=target/scala-${SCALA_VERSION}
LIBDIR=${PREFIX}/lib
CONFDIR=/etc/packager
SBT_JAVA_OPT=""


all: build-sbt release

build-sbt:
	sbt -verbose ${SBT_JAVA_OPT} compile

release: build-sbt
	sbt -verbose ${SBT_JAVA_OPT} dist

