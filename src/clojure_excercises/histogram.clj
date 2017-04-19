(ns clojure-excercises.histogram)
(def getCount (fn [ numbers, searchNumber]
                (if (== (count numbers) 1)
                  (if ( == (nth numbers 0) searchNumber) 1 0)
                  (+ (getCount (subvec numbers 0 1) searchNumber)(getCount (subvec numbers 1) searchNumber))
                  )
                ))

(defrecord histogramStruct [number count])

(def computHistogram( fn [numbers]
                (map #(histogramStruct. %1 (getCount numbers %1))(range 1 9))
                ))

(defmulti histogramToString class)
(defmethod histogramToString histogramStruct [histogram] (map #(star :count histogram %1) (range 1 10)
                                                           ))
(defmulti getNumber class)
(defmethod getNumber histogramStruct [histogram] (:count histogram))

(def star
  (fn [number, count]
    (if (< number count) " " "*" )
    )
  )


((map #(star 10 %1) (range 1 10)))

(map #(star 10 %1) (range 1 10))
(map #(star :count histogram %1) (range 1 10))

(map #(star :count histogram %1) (range 1 10))