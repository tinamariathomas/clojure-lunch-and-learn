(ns clojure-excercises.local-maxima-test
  (:require [clojure.test :refer :all]
            [clojure-excercises.local_maxima :refer :all]))

(deftest local-maxima
  (testing "For empty array"
    (is (= (localMaxima '(10 9)) '()) )
    )
  (testing "For array of size 3"
    (is (= (localMaxima '(5 9 6)) '(9)) )
    (is (= (localMaxima '(5 4 6)) '() ) )
    (is (= (localMaxima '(10 4 3)) '() ) )
    )
  (testing "For arrays of size > 3"
    (is (= (localMaxima '(2 9 5 6 1)) '(9 6)) )
    (is (= (localMaxima '(2 3 4 1 5)) '(4)) )
    (is (= (localMaxima '(1 2 3 4 5)) '()) )
    )
  )