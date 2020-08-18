(ns ^:figwheel-hooks weather-app.core
  (:require [reagent.dom :as rd]))

(enable-console-print!)

(defn weather-component
  []
  [:div "Hello Juxt"])

(defn ^:after-load ^:export init
  []
  (rd/render [weather-component]
             (.getElementById js/document "app")))
