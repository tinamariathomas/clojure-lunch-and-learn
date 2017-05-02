(ns clojure-excercises.local_maxima)
(def localMaxima(fn [input]
                  (cond
                    (< (count input) 3) '()
                    (= (count input) 3) (if (and ( > (nth input 1) (nth input 0) ) ( > (nth input 1) (nth input 2) )) (list (nth input 1))  '())
                    :else (concat (localMaxima (subvec (vec input) 0 3)) (localMaxima (subvec (vec input) 1)))
                    ))
                  )



