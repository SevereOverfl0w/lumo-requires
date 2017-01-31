#!/usr/bin/lumo
(ns bin
  (:require
    [cljs.nodejs :as nodejs]
    ;; This doesn't work, as there's no relative requires in lumo:
    #_[impl :as impl]))

;; I'd expect this to work, like in the node example, but it doesn't:
(def ini (nodejs/require "ini"))
(println
 (ini.stringify #js {"hello" "world"}))

#_(println impl/x)
