#! /system/bin/sh
base=$PWD
export CLASSPATH=$base/pdfc.jar
exec app_process /system/bin com.glanexdev.pdf.compresser.Main "$@"