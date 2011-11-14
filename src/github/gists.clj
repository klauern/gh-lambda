(ns github.gists
  (:import (org.eclipse.egit.github.core GistFile
                                         Gist
                                         GistChangeStatus
                                         GistRevision)
           (org.eclipse.egit.github.core.service GistService)))
(require (clojure.i))
(defn file-content
  ([content] 
    (-> (GistFile.) (.setContent content)))
  ([content gistfile]
    (-> (.setContent gistfile content))))

(defn create
  "Create gist"
  [^Gist gist]
  (.createGist gist))

(defn gist-svc
  ([]  (GistService.))
  ([user pass] (-> (GistService.) (.getClient) (.setCredentials user pass))))





