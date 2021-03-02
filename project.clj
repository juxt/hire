(defproject air-quality-app "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}

  :min-lein-version "2.9.1"

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.773"]
                 [cljs-ajax "0.8.0"]
                 [reagent "1.0.0-alpha2"]]

  :source-paths ["src"]
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev"]
            "cljs-prod" ["run" "-m" "figwheel.main" "--build-once" "prod"]}

  :profiles {:dev {:dependencies [[binaryage/devtools "1.0.2"]
                                  [com.bhauman/figwheel-main "0.2.11"]]

                   ;; need to add dev source path here to get user.clj loaded
                   :source-paths ["src"]
                   ;; need to add the compiled assets to the :clean-targets
                   :clean-targets ^{:protect false} ["resources/public/cljs-out"
                                                     :target-path]}})
