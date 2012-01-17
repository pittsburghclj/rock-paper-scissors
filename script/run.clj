(when-let [run-swank (System/getenv "RPS_SWANK")]
  (println "Starting swank...")
  ;; Drop the enclosing double quotes from the environment variable and eval it.
  (load-string (if-let [found (re-find #"^\"(.*)\"$" run-swank)]
                 (second found)
                 run-swank)))

(require 'rock-paper-scissors.core)
(set! *print-length* 100)