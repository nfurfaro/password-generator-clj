;; randPass

(def length (do
                    (print "How many characters should your password be?")
                    (flush)
                    (read-line)))

(def n
    (read-string
        (do
           (print "How many characters should your password be?")
           (flush)
           (read-line))))

(def password
  (apply str
    (take 40
      (shuffle (concat
                   (map char (range 48 58))
                   (map char (range 66 91))
                   (map char (range 97 123))
                   (seq "!@#$%^&*(){}[]/~|/?<>]"))))))


(println password)





   ;(def length (do (print "How many characters should your password be? ") (flush) (read-line)))

   (concat
        (seq "!@#$%^&*(){}[]/~|/?<>]")