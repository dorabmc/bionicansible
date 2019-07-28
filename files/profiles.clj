{:repl {:dependencies [[org.clojure/tools.nrepl "RELEASE"]]}
 :user {:plugins [
                  [lein-ancient "RELEASE"]      ; look for outdated dependency versions
                  [venantius/yagni "RELEASE"]   ; look for dead code
                  [jonase/eastwood "RELEASE"]   ; clojure lint
                  [lein-kibit "RELEASE"]        ; code suggestions
                  [lein-bikeshed "RELEASE"]     ; check spacing and lengths
                  [lein-cljfmt "0.6.4"]         ; check formatting
                  [lein-cloverage "RELEASE"]    ; code coverage
                  [criterium "0.4.4"]           ; benchmarking
                  [bansd/deploy-uberjar "0.1.2"] ; to allow deploying an uberjar instead of a jar
                  [lein-pprint "RELEASE"]       ; pprint the project.clj
                  ]
        :dependencies [
                       [org.clojure/clojure "1.10.1"]
                       [slamhound "RELEASE"] ;auto-create the ns form
                       [com.cemerick/pomegranate "RELEASE"] ;dynamically add to the classpath
                       ]
        :aliases {
                  "slamhound" ["run" "-m" "slam.hound"]
                  }
        }
 }
