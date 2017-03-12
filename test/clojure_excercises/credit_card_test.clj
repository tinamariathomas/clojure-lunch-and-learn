(ns clojure-excercises.credit-card-test
  (:require [clojure.test :refer :all]
            [clojure-excercises.credit-card :refer :all]))

(deftest to-digits
  (testing "Should convert integer number to digits"
    (is (= (toDigits 1123) '(1 1 2 3)) )
    )
  )

(deftest double-every-other
  (testing "For even list size"
    (is (= (doubleEveryOther '(1 2 3 4)) '(2 2 6 4)) )
    )
  (testing "For odd list size"
    (is (= (doubleEveryOther '(1 2 3)) '(1 4 3)) )
    )
  )
(deftest sum-digits
  (testing "Compute sum of digits"
    (is (= (sumDigits '(16 7 12 5)) 22 ))
    )
  )

(deftest validate-cc
  (testing "For valid card"
    (is (= (validateCC 4012888888881881) true ))
    )
  (testing "For invalid card"
    (is (= (validateCC 4012888888881882) false ))
    )
  )