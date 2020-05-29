(ns cljc.java-time.format.text-style (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time.format :refer [TextStyle]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time.format TextStyle])))
(def short #? (:clj java.time.format.TextStyle/SHORT :cljs (. java.time.format.TextStyle -SHORT)))
(def full-standalone #? (:clj java.time.format.TextStyle/FULL_STANDALONE :cljs (. java.time.format.TextStyle -FULL_STANDALONE)))
(def full #? (:clj java.time.format.TextStyle/FULL :cljs (. java.time.format.TextStyle -FULL)))
(def short-standalone #? (:clj java.time.format.TextStyle/SHORT_STANDALONE :cljs (. java.time.format.TextStyle -SHORT_STANDALONE)))
(def narrow #? (:clj java.time.format.TextStyle/NARROW :cljs (. java.time.format.TextStyle -NARROW)))
(def narrow-standalone #? (:clj java.time.format.TextStyle/NARROW_STANDALONE :cljs (. java.time.format.TextStyle -NARROW_STANDALONE)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.format.TextStyle values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.format.TextStyle [^java.lang.String java-lang-String13822] (. java.time.format.TextStyle valueOf java-lang-String13822)) (^java.lang.Enum [^java.lang.Class java-lang-Class13823 ^java.lang.String java-lang-String13824] (. java.time.format.TextStyle valueOf java-lang-Class13823 java-lang-String13824)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Integer [^java.time.format.TextStyle this13825] (.ordinal this13825)))
(clojure.core/defn as-standalone {:arglists (quote (["java.time.format.TextStyle"]))} (^java.time.format.TextStyle [^java.time.format.TextStyle this13826] (.asStandalone this13826)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.String [^java.time.format.TextStyle this13827] (.toString this13827)))
(clojure.core/defn name {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.String [^java.time.format.TextStyle this13828] (.name this13828)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Class [^java.time.format.TextStyle this13829] (jti/getter declaringClass this13829)))
(clojure.core/defn as-normal {:arglists (quote (["java.time.format.TextStyle"]))} (^java.time.format.TextStyle [^java.time.format.TextStyle this13830] (.asNormal this13830)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Integer [^java.time.format.TextStyle this13831] (.hashCode this13831)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.TextStyle" "java.lang.Object"] ["java.time.format.TextStyle" "java.lang.Enum"]))} (^java.lang.Integer [this13832 G__13833] #? (:cljs (.compareTo ^java.time.format.TextStyle this13832 G__13833) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__13833)) (clojure.core/let [G__13833 ^"java.lang.Object" G__13833] (.compareTo ^java.time.format.TextStyle this13832 G__13833)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__13833)) (clojure.core/let [G__13833 ^"java.lang.Enum" G__13833] (.compareTo ^java.time.format.TextStyle this13832 G__13833)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn is-standalone {:arglists (quote (["java.time.format.TextStyle"]))} (^java.lang.Boolean [^java.time.format.TextStyle this13834] (.isStandalone this13834)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.TextStyle" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.format.TextStyle this13835 ^java.lang.Object java-lang-Object13836] (.equals this13835 java-lang-Object13836)))
