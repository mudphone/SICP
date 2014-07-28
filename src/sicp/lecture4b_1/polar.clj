(ns sicp.lecture4b-1.polar
  (:require [sicp.lecture4b-1.math :refer [atan square]]))

;; Generic Operators
;; Lecture 4B, Part 1 - Text Section 2.3
;; Dispatch on Type (First Half)
;; https://www.youtube.com/watch?v=h6Z7vx9iUB8&index=8&list=PLB63C06FAF154F047

;; Selectors - POLAR
;; Complex number represented as a pair of magnitude and angle.

(defn magnitude
  [z]
  (first z))

(defn angle
  [z]
  (last z))

(defn real-part
  [z]
  (* (magnitude z) (Math/cos (angle z))))

(defn imag-part
  [z]
  (* (magnitude z) (Math/sin (angle z))))


;; Constructors 14:52 

(defn make-rectangular
  [x y]
  "Make polar representation from real part and imaginary part"
  [(Math/sqrt (+ (square x) (square y)))
   (atan y x)])

(defn make-polar
  "Make polar representation from magnitude and angle"
  [r a]
  [r a])


;; Complex Math Operators

(defn add-c
  [z1 z2]
)

(defn sub-c
  [z1 z2]
)

(defn mul-c
  [z1 z2]
)

(defn div-c
  [z1 z2]
)
