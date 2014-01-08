(defproject trapperkeeper-plugin-puppetdb-query-dashboard "0.1.0-SNAPSHOT"
  :dependencies [[compojure "1.1.6"]]

  :exclusions [org.clojure/clojure
               org.clojure/core.incubator
               clj-time/clj-time
               commons-io/commons-io
               ring/ring-core]

  :uberjar-name "puppetdb-query-dashboard.jar")
