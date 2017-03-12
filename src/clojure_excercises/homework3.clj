(ns clojure-excercises.homework3)
(def getAllNths(fn [inputString, n]
                 (map #(nth inputString %1) (range (- n 1) (count inputString) n) )
                 ))


( def skip(fn [inputString]
            (println (count inputString))
            (map #(getAllNths inputString %1)(range 1 (+ (count inputString) 1 )))
            ))
