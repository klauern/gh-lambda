(ns github.repositories
  (:import (org.eclipse.egit.github.core Repository
                                         RepositoryId)
           (org.eclipse.egit.github.core.service RepositoryService
                                                 )))
(def repo-svc
  (RepositoryService.))


(defn repositories
  "List repositories for a given username"
  [username]
  (.getRepositories repo-svc username))

(defn repository-id
  "create a repository id for a user and project name"
  [user project]
  (RepositoryId. user project))


(defn fork-repo
  "Fork a repository"
  [user pass ^RepositoryId repo-id]
  (-> (.getClient repo-svc) (.setCredentials user pass) (.forkRepository repo-svc repo-id)))

