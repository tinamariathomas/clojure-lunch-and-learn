(ns clojure-excercises.credit-card)

(def toDigits(fn [inputNumber]
               (cond
                 (< inputNumber 1) []
                 :else (concat (toDigits (quot inputNumber 10)) [(rem inputNumber 10)]))))

(def doubleEveryOther(fn [digitList]
                       (reverse (map * (reverse digitList) (cycle [1 2])))
                       ))

(def sumDigits(fn [integerList]
                (reduce + (map (comp (partial reduce +) (partial toDigits)) integerList))
                ))

(def validateCC(fn [inputNumber]
               ( == (rem (sumDigits (doubleEveryOther (toDigits inputNumber))) 10) 0)
               ))