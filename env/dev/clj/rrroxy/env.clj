(ns rrroxy.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [rrroxy.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[rrroxy started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[rrroxy has shut down successfully]=-"))
   :middleware wrap-dev})
