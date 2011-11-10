(ns github.clj.core
(:import '(org.eclipse.egit.github.core.client GitHubClient)
         '(org.eclipse.egit.github.core.service RepositoryService)))

(defn client
  "create a GitHubClient that can communicate with GitHub."
  ([token] (-> (GitHubClient.) (.setOauth2Token token)))
  ([user pass] (-> (GitHubClient.) (.setCredentials user pass))))

(defn repositories
  [username]
  (-> (Repositories.) (.getRepositories username)))

