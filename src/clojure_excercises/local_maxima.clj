(ns clojure-excercises.local_maxima)
(def splitIntoThrees(fn [input]
                  (map vector input (rest input) (rest (rest input)))
                  )
  )
(def isLocalMaxima (fn [triplet]
                     (and ( > (nth triplet 1) (nth triplet 0) ) ( > (nth triplet 1) (nth triplet 2) ))
                     ))

(def localMaxima (fn [input]
                   (map #(nth % 1 ) (filter (fn [triplet]
                                               (= (isLocalMaxima triplet) true) ) (splitIntoThrees input)))
                   ))

