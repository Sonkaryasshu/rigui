(defproject rigui "0.4.1-SNAPSHOT"
  :description "Timing Wheels"
  :url "https://github.com/sunng87/rigui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228" :scope "provided"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :cljsbuild {:builds [{
                        :source-paths ["src"]
                        :compiler {:optimizations :whitespace
                                   :output-to "target/rigui.js"
                                   :output-dir "target"
                                   :pretty-print true}}]}
  )

;;   :hooks [leiningen.cljsbuild]
