;; randPass

(defn password [n]
  (apply str
    (take n
      (shuffle
        (map char (range 33 127))))))


(password 20) ; call password fn with length as arg