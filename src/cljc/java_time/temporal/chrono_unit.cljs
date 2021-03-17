(ns cljc.java-time.temporal.chrono-unit (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time.temporal :refer [ChronoUnit]]))
(def millis (goog.object/get java.time.temporal.ChronoUnit "MILLIS"))
(def minutes (goog.object/get java.time.temporal.ChronoUnit "MINUTES"))
(def micros (goog.object/get java.time.temporal.ChronoUnit "MICROS"))
(def half-days (goog.object/get java.time.temporal.ChronoUnit "HALF_DAYS"))
(def millennia (goog.object/get java.time.temporal.ChronoUnit "MILLENNIA"))
(def years (goog.object/get java.time.temporal.ChronoUnit "YEARS"))
(def decades (goog.object/get java.time.temporal.ChronoUnit "DECADES"))
(def days (goog.object/get java.time.temporal.ChronoUnit "DAYS"))
(def centuries (goog.object/get java.time.temporal.ChronoUnit "CENTURIES"))
(def weeks (goog.object/get java.time.temporal.ChronoUnit "WEEKS"))
(def hours (goog.object/get java.time.temporal.ChronoUnit "HOURS"))
(def eras (goog.object/get java.time.temporal.ChronoUnit "ERAS"))
(def seconds (goog.object/get java.time.temporal.ChronoUnit "SECONDS"))
(def months (goog.object/get java.time.temporal.ChronoUnit "MONTHS"))
(def nanos (goog.object/get java.time.temporal.ChronoUnit "NANOS"))
(def forever (goog.object/get java.time.temporal.ChronoUnit "FOREVER"))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.temporal.ChronoUnit "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.ChronoUnit [^java.lang.String java-lang-String5700] (js-invoke java.time.temporal.ChronoUnit "valueOf" java-lang-String5700)) (^java.lang.Enum [^java.lang.Class java-lang-Class5701 ^java.lang.String java-lang-String5702] (js-invoke java.time.temporal.ChronoUnit "valueOf" java-lang-Class5701 java-lang-String5702)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^int [^js/JSJoda.ChronoUnit this5703] (.ordinal this5703)))
(clojure.core/defn is-duration-estimated {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^boolean [^js/JSJoda.ChronoUnit this5704] (.isDurationEstimated this5704)))
(clojure.core/defn to-string {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.String [^js/JSJoda.ChronoUnit this5705] (.toString this5705)))
(clojure.core/defn is-date-based {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^boolean [^js/JSJoda.ChronoUnit this5706] (.isDateBased this5706)))
(clojure.core/defn add-to {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "long"]))} (^js/JSJoda.Temporal [^js/JSJoda.ChronoUnit this5707 ^js/JSJoda.Temporal java-time-temporal-Temporal5708 ^long long5709] (.addTo this5707 java-time-temporal-Temporal5708 long5709)))
(clojure.core/defn name {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.String [^js/JSJoda.ChronoUnit this5710] (.name this5710)))
(clojure.core/defn is-supported-by {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal"]))} (^boolean [^js/JSJoda.ChronoUnit this5711 ^js/JSJoda.Temporal java-time-temporal-Temporal5712] (.isSupportedBy this5711 java-time-temporal-Temporal5712)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^java.lang.Class [^js/JSJoda.ChronoUnit this5713] (.declaringClass this5713)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.ChronoUnit" "java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^long [^js/JSJoda.ChronoUnit this5714 ^js/JSJoda.Temporal java-time-temporal-Temporal5715 ^js/JSJoda.Temporal java-time-temporal-Temporal5716] (.between this5714 java-time-temporal-Temporal5715 java-time-temporal-Temporal5716)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^int [^js/JSJoda.ChronoUnit this5717] (.hashCode this5717)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Enum"]))} (^int [^js/JSJoda.ChronoUnit this5718 ^java.lang.Enum java-lang-Enum5719] (.compareTo this5718 java-lang-Enum5719)))
(clojure.core/defn get-duration {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^js/JSJoda.Duration [^js/JSJoda.ChronoUnit this5720] (.duration this5720)))
(clojure.core/defn equals {:arglists (quote (["java.time.temporal.ChronoUnit" "java.lang.Object"]))} (^boolean [^js/JSJoda.ChronoUnit this5721 ^java.lang.Object java-lang-Object5722] (.equals this5721 java-lang-Object5722)))
(clojure.core/defn is-time-based {:arglists (quote (["java.time.temporal.ChronoUnit"]))} (^boolean [^js/JSJoda.ChronoUnit this5723] (.isTimeBased this5723)))
