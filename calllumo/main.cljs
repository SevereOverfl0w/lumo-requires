#!/usr/bin/env lumo
(ns main
  (:require
    [cljs.nodejs :as nodejs]
    ;; This does work:
    [impl :as impl]))

;; This doesn't work without NODE_PATH in bin:
(def ini (nodejs/require "ini"))

(println impl/x)
