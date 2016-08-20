(ns user
  (:require [mount.core :as mount]
            rrroxy.core))

(defn start []
  (mount/start-without #'rrroxy.core/repl-server))

(defn stop []
  (mount/stop-except #'rrroxy.core/repl-server))

(defn restart []
  (stop)
  (start))


