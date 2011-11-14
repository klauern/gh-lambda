#!/bin/sh

#java -cp `lein classpath` vimclojure.nailgun.NGServer 127.0.0.1
# Leiningen 1.6.2-SNAPSHOT has a working way to do this now (as of Nov 11 2011)
lein run -m vimclojure.nailgun.NGServer 127.0.0.1
