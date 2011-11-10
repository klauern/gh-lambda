(ns github.core
(:import (org.eclipse.egit.github.core.client GitHubClient)
         (org.eclipse.egit.github.core.service RepositoryService
                                                PullRequestService
                                                GistService)))

(defn client
  "create a GitHubClient that can communicate with GitHub."
  ([token] (-> (GitHubClient.) (.setOauth2Token token)))
  ([user pass] (-> (GitHubClient.) (.setCredentials user pass))))

(defn repositories
  "List repositories for a given username"
  [username]
  (-> (RepositoryService.) (.getRepositories username)))

