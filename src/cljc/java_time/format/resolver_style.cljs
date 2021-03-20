(ns cljc.java-time.format.resolver-style (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.format :refer [ResolverStyle]]))
(def smart (goog.object/get java.time.format.ResolverStyle "SMART"))
(def strict (goog.object/get java.time.format.ResolverStyle "STRICT"))
(def lenient (goog.object/get java.time.format.ResolverStyle "LENIENT"))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.format.ResolverStyle "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.ResolverStyle [^java.lang.String java-lang-String6207] (js-invoke java.time.format.ResolverStyle "valueOf" java-lang-String6207)) (^java.lang.Enum [^java.lang.Class java-lang-Class6208 ^java.lang.String java-lang-String6209] (js-invoke java.time.format.ResolverStyle "valueOf" java-lang-Class6208 java-lang-String6209)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.format.ResolverStyle"]))} (^int [^js/JSJoda.ResolverStyle this6210] (.ordinal this6210)))
(clojure.core/defn to-string {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.String [^js/JSJoda.ResolverStyle this6211] (.toString this6211)))
(clojure.core/defn name {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.String [^js/JSJoda.ResolverStyle this6212] (.name this6212)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.format.ResolverStyle"]))} (^java.lang.Class [^js/JSJoda.ResolverStyle this6213] (.declaringClass this6213)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.format.ResolverStyle"]))} (^int [^js/JSJoda.ResolverStyle this6214] (.hashCode this6214)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Enum"]))} (^int [^js/JSJoda.ResolverStyle this6215 ^java.lang.Enum java-lang-Enum6216] (.compareTo this6215 java-lang-Enum6216)))
(clojure.core/defn equals {:arglists (quote (["java.time.format.ResolverStyle" "java.lang.Object"]))} (^boolean [^js/JSJoda.ResolverStyle this6217 ^java.lang.Object java-lang-Object6218] (.equals this6217 java-lang-Object6218)))
