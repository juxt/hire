(ns ^:figwheel-hooks air-quality-app.core
  (:require [reagent.dom :as rd]))

(enable-console-print!)

(defn air-quality-component
  []
  [:div "Hello Juxt"])

(defn ^:after-load ^:export init
  []
  (rd/render [air-quality-component]
             (.getElementById js/document "app")))
