FOR /F %x IN ('lein classpath') DO java -cp %x vimclojure.nailgun.NGServer 127.0.0.1
