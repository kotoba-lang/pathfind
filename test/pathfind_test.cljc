(ns pathfind-test
  (:require [clojure.test :refer [deftest is testing]]
            [pathfind]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? pathfind))))
