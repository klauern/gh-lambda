(ns github.core
(:import (org.eclipse.egit.github.core.client GitHubClient)
         (org.eclipse.egit.github.core.service RepositoryService
                                                PullRequestService
                                                GistService)))

; don't have a way to use GitHub:FI if this needs to override the GitHubClient URL

(defn client
  "create a GitHubClient that can communicate with GitHub."
  ([token] (-> (GitHubClient.) (.setOauth2Token token)))
  ([user pass] (-> (GitHubClient.) (.setCredentials user pass))))

(defn repositories
  "List repositories for a given username"
  [username]
  (-> (RepositoryService.) (.getRepositories username)))

(defn http-proxy
  [^String host ^String port]
  (do
    (System/setProperty "http.proxyHost" host)
    (System/setProperty "http.proxyPort" (str port)))) ; in case they pass a Long into it

