{:repl {:dependencies [[org.clojure/tools.nrepl "RELEASE"]]}
 :user {:plugins [[lein-ancient "RELEASE"]    ;look for outdated dependency versions
                  [venantius/yagni "RELEASE"] ;look for dead code
                  [jonase/eastwood "RELEASE"] ;clojure lint
                  ]
        :dependencies [
                       [org.clojure/clojure "1.9.0"]
                       [slamhound "RELEASE"] ;auto-create the ns form
                       [com.cemerick/pomegranate "RELEASE"] ;dynamically add to the classpath
                       ]
        :aliases {
                  "slamhound" ["run" "-m" "slam.hound"]
                  }
        }
 }
