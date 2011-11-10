(ns github.url
  (:require [clj-http.client :as client]))

(def shortener "http://git.io")

(defn shorten
  ([url]
    (client/post shortener {:form-params {:url url}}))
  ([url code]
    (client/post shortener {:form-params {"url" url, "code" code}})))