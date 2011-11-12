#!/bin/sh

java -cp `lein classpath` vimclojure.nailgun.NGServer 127.0.0.1
