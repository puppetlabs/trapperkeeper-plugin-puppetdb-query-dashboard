(ns puppetlabs.trapperkeeper.plugins.puppetdb-query-dashboard
  (:require [puppetlabs.trapperkeeper.core :as trapperkeeper]
            [compojure.core :as compojure]
            [compojure.route :as route]
            [ring.util.response :as ring]))

(def main-routes
  (compojure/routes
    (compojure/GET "/" [] (ring/redirect "query.html"))
    (route/resources "/" {:root "query-dashboard/public"})
    (route/not-found "Page not found!")))

(trapperkeeper/defservice query-dashboard
  {:depends  [[:webserver-service add-ring-handler]]
   :provides []}
  (let [url-prefix  "/query-dashboard"]
    (-> url-prefix
        (compojure/context [] main-routes)
        (add-ring-handler url-prefix)))
  {})
