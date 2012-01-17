(ns rock-paper-scissors.core)

;; Rules map: Rock beats scissors, scissors beats paper, and paper beats rock.
(def dominates
  {:rock     :paper
   :scissors :rock
   :paper    :scissors})
