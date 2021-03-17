(ns cljc.java-time.format.text-style (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.format TextStyle]))
(def short java.time.format.TextStyle/SHORT)
(def full-standalone java.time.format.TextStyle/FULL_STANDALONE)
(def full java.time.format.TextStyle/FULL)
(def short-standalone java.time.format.TextStyle/SHORT_STANDALONE)
(def narrow java.time.format.TextStyle/NARROW)
(def narrow-standalone java.time.format.TextStyle/NARROW_STANDALONE)
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (java.time.format.TextStyle/values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.TextStyle [^java.lang.String java-lang-String6278] (java.time.format.TextStyle/valueOf java-lang-String6278)) (^java.lang.Enum [^java.lang.Class java-lang-Class6279 ^java.lang.String java-lang-String6280] (java.time.format.TextStyle/valueOf java-lang-Class6279 java-lang-String6280)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Integer [^java.time.format.TextStyle this6281] (.ordinal this6281)))
(clojure.core/defn as-standalone {:arglists (quote (["java.time.format.TextStyle"]))} (^java.time.format.TextStyle [^java.time.format.TextStyle this6282] (.asStandalone this6282)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.String [^java.time.format.TextStyle this6283] (.toString this6283)))
(clojure.core/defn name {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.String [^java.time.format.TextStyle this6284] (.name this6284)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Class [^java.time.format.TextStyle this6285] (.getDeclaringClass this6285)))
(clojure.core/defn as-normal {:arglists (quote (["java.time.format.TextStyle"]))} (^java.time.format.TextStyle [^java.time.format.TextStyle this6286] (.asNormal this6286)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Integer [^java.time.format.TextStyle this6287] (.hashCode this6287)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.TextStyle" "java.lang.Enum"]))} (^java.lang.Integer [^java.time.format.TextStyle this6288 ^java.lang.Enum java-lang-Enum6289] (.compareTo this6288 java-lang-Enum6289)))
(clojure.core/defn is-standalone {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Boolean [^java.time.format.TextStyle this6290] (.isStandalone this6290)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.TextStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.TextStyle this6291 ^java.lang.Object java-lang-Object6292] (.equals this6291 java-lang-Object6292)))
