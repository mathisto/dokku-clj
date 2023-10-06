(ns mattkelly-io.env
  (:require
   [selmer.parser :as parser]
   [clojure.tools.logging :as log]
   [mattkelly-io.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[mattkelly-io started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[mattkelly-io has shut down successfully]=-"))
   :middleware wrap-dev})
