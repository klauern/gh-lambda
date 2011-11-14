(defproject github "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.eclipse.mylyn.github/org.eclipse.egit.github.core "1.1.1"]
                 [clj-http "0.2.3"]
                 ]
  :dev-dependencies [
;                     [swank-clojure "1.3.3"]
                     [org.clojure/tools.nrepl "0.0.5"]
                     [org.thnetos/cd-client "0.3.1"]
                     [vimclojure/server "2.3.0"]
                     ;[com.cemerick/pomegranate "0.0.1"]
                     ]
  :repl-init github.repl-init)
