(ns mattkelly-io.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[mattkelly-io started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[mattkelly-io has shut down successfully]=-"))
   :middleware identity})
