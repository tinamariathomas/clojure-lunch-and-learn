(ns clojure-excercises.homework3_test
  (:require [clojure.test :refer :all]
            [clojure-excercises.homework3 :refer :all]))

(deftest test-getAllNths
  (testing  "should get all nth integers from odd list"
    (is ( = (getAllNths '(10 9 8 7 6) 2) '(9 7)))
    )
  (testing  "should get all nth integers from even list"
    (is ( = (getAllNths '(10 9 8 7 6 5) 2) '(9 7 5)))
    )
  )

(deftest test-skip-function
  (testing "should generate skip string"
    (is (= (skip "ABCD") '((\A \B \C \D) (\B \D) (\C) (\D))))
    )
  )