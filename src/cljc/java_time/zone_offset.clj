(ns cljc.java-time.zone-offset (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time ZoneOffset]))
(def max java.time.ZoneOffset/MAX)
(def min java.time.ZoneOffset/MIN)
(def utc java.time.ZoneOffset/UTC)
(clojure.core/defn get-available-zone-ids {:arglists (quote ([]))} (^java.util.Set [] (java.time.ZoneOffset/getAvailableZoneIds)))
(clojure.core/defn range {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.ZoneOffset this5507 ^java.time.temporal.TemporalField java-time-temporal-TemporalField5508] (.range this5507 java-time-temporal-TemporalField5508)))
(clojure.core/defn of-total-seconds {:arglists (quote (["int"]))} (^java.time.ZoneOffset [^java.lang.Integer int5509] (java.time.ZoneOffset/ofTotalSeconds int5509)))
(clojure.core/defn of {:arglists (quote (["java.lang.String"] ["java.lang.String"] ["java.lang.String" "java.util.Map"]))} (^java.lang.Object [G__5511] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.String G__5511)) (clojure.core/let [G__5511 ^"java.lang.String" G__5511] (java.time.ZoneOffset/of G__5511)) (clojure.core/and (clojure.core/instance? java.lang.String G__5511)) (clojure.core/let [G__5511 ^"java.lang.String" G__5511] (java.time.ZoneOffset/of G__5511)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.ZoneId [^java.lang.String java-lang-String5512 ^java.util.Map java-util-Map5513] (java.time.ZoneOffset/of java-lang-String5512 java-util-Map5513)))
(clojure.core/defn of-offset {:arglists (quote (["java.lang.String" "java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.lang.String java-lang-String5514 ^java.time.ZoneOffset java-time-ZoneOffset5515] (java.time.ZoneOffset/ofOffset java-lang-String5514 java-time-ZoneOffset5515)))
(clojure.core/defn query {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.ZoneOffset this5516 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery5517] (.query this5516 java-time-temporal-TemporalQuery5517)))
(clojure.core/defn to-string {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.String [^java.time.ZoneOffset this5518] (.toString this5518)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.ZoneOffset" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.ZoneOffset this5519 ^java.time.format.TextStyle java-time-format-TextStyle5520 ^java.util.Locale java-util-Locale5521] (.getDisplayName this5519 java-time-format-TextStyle5520 java-util-Locale5521)))
(clojure.core/defn get-long {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^long [^java.time.ZoneOffset this5522 ^java.time.temporal.TemporalField java-time-temporal-TemporalField5523] (.getLong this5522 java-time-temporal-TemporalField5523)))
(clojure.core/defn get-rules {:arglists (quote (["java.time.ZoneOffset"]))} (^java.time.zone.ZoneRules [^java.time.ZoneOffset this5524] (.getRules this5524)))
(clojure.core/defn of-hours {:arglists (quote (["int"]))} (^java.time.ZoneOffset [^java.lang.Integer int5525] (java.time.ZoneOffset/ofHours int5525)))
(clojure.core/defn get-id {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.String [^java.time.ZoneOffset this5526] (.getId this5526)))
(clojure.core/defn normalized {:arglists (quote (["java.time.ZoneOffset"]))} (^java.time.ZoneId [^java.time.ZoneOffset this5527] (.normalized this5527)))
(clojure.core/defn system-default {:arglists (quote ([]))} (^java.time.ZoneId [] (java.time.ZoneOffset/systemDefault)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"] ["java.time.temporal.TemporalAccessor"]))} (^java.lang.Object [G__5529] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalAccessor G__5529)) (clojure.core/let [G__5529 ^"java.time.temporal.TemporalAccessor" G__5529] (java.time.ZoneOffset/from G__5529)) (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalAccessor G__5529)) (clojure.core/let [G__5529 ^"java.time.temporal.TemporalAccessor" G__5529] (java.time.ZoneOffset/from G__5529)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn of-hours-minutes-seconds {:arglists (quote (["int" "int" "int"]))} (^java.time.ZoneOffset [^java.lang.Integer int5530 ^java.lang.Integer int5531 ^java.lang.Integer int5532] (java.time.ZoneOffset/ofHoursMinutesSeconds int5530 int5531 int5532)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.ZoneOffset this5533 ^java.time.temporal.TemporalField java-time-temporal-TemporalField5534] (.isSupported this5533 java-time-temporal-TemporalField5534)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.Integer [^java.time.ZoneOffset this5535] (.hashCode this5535)))
(clojure.core/defn get-total-seconds {:arglists (quote (["java.time.ZoneOffset"]))} (^java.lang.Integer [^java.time.ZoneOffset this5536] (.getTotalSeconds this5536)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.ZoneOffset this5537 ^java.time.temporal.Temporal java-time-temporal-Temporal5538] (.adjustInto this5537 java-time-temporal-Temporal5538)))
(clojure.core/defn of-hours-minutes {:arglists (quote (["int" "int"]))} (^java.time.ZoneOffset [^java.lang.Integer int5539 ^java.lang.Integer int5540] (java.time.ZoneOffset/ofHoursMinutes int5539 int5540)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.ZoneOffset" "java.time.ZoneOffset"]))} (^java.lang.Integer [^java.time.ZoneOffset this5541 ^java.time.ZoneOffset java-time-ZoneOffset5542] (.compareTo this5541 java-time-ZoneOffset5542)))
(clojure.core/defn get {:arglists (quote (["java.time.ZoneOffset" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.ZoneOffset this5543 ^java.time.temporal.TemporalField java-time-temporal-TemporalField5544] (.get this5543 java-time-temporal-TemporalField5544)))
(clojure.core/defn equals {:arglists (quote (["java.time.ZoneOffset" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.ZoneOffset this5545 ^java.lang.Object java-lang-Object5546] (.equals this5545 java-lang-Object5546)))
