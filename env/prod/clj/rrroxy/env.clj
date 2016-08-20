(ns rrroxy.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[rrroxy started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[rrroxy has shut down successfully]=-"))
   :middleware identity})
