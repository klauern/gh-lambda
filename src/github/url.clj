(ns github.url
  (:require [clj-http.client :as client]))

(def shortener "http://git.io")

(defn shorten
  "Shorten a GitHub URL

Can take either a single URL argument, or
can take two arguments:
  - URL
  - preferred short name

Returns: your url"
  ([url]
    (client/post shortener {:form-params {:url url}}))
  ([url code]
    (client/post shortener {:form-params {"url" url, "code" code}})))