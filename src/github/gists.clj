(ns github.gists
  (:import (org.eclipse.egit.github.core GistFile
                                         Gist
                                         GistChangeStatus
                                         GistRevision)
           (org.eclipse.egit.github.core.service GistService)))

(defn create-gist
  "Create a gist"
  )

(defn gist
  ([]  (GistService.))
  ([user pass] (-> (GistService.) (.getClient) (.setCredentials user pass))))





