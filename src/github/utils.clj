(ns github.utils)

(defn set-http-proxy
  [host port]
  (do
    (System/setProperty "http.proxyHost" host)
    (System/setProperty "http.proxyPort" port)))

