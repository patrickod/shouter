(ns shouter.core
  (:use [compojure.core :only (defroutes GET)]
        [ring.adapter.jetty :as ring]))

(defroutes routes
  (GET "/" [] "<h2>Hello world</h2>"))


(defn -main []
  (run-jetty #'routes {:port 8080 :join? false}))
