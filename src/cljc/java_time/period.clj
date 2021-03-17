(ns cljc.java-time.period (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time Period]))
(def zero java.time.Period/ZERO)
(clojure.core/defn get-months {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this3036] (.getMonths this3036)))
(clojure.core/defn of-weeks {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int3037] (java.time.Period/ofWeeks int3037)))
(clojure.core/defn of-days {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int3038] (java.time.Period/ofDays int3038)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this3039] (.isNegative this3039)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"]))} (^java.time.Period [^java.lang.Integer int3040 ^java.lang.Integer int3041 ^java.lang.Integer int3042] (java.time.Period/of int3040 int3041 int3042)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Period"]))} (^java.lang.Boolean [^java.time.Period this3043] (.isZero this3043)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this3044 ^java.lang.Integer int3045] (.multipliedBy this3044 int3045)))
(clojure.core/defn get-units {:arglists (quote (["java.time.Period"]))} (^java.util.List [^java.time.Period this3046] (.getUnits this3046)))
(clojure.core/defn with-days {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this3047 ^java.lang.Integer int3048] (.withDays this3047 int3048)))
(clojure.core/defn plus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.Period this3049 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount3050] (.plus this3049 java-time-temporal-TemporalAmount3050)))
(clojure.core/defn of-months {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int3051] (java.time.Period/ofMonths int3051)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Period"]))} (^java.lang.String [^java.time.Period this3052] (.toString this3052)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this3053 ^long long3054] (.plusMonths this3053 long3054)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this3055 ^long long3056] (.minusMonths this3055 long3056)))
(clojure.core/defn minus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.Period this3057 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount3058] (.minus this3057 java-time-temporal-TemporalAmount3058)))
(clojure.core/defn add-to {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this3059 ^java.time.temporal.Temporal java-time-temporal-Temporal3060] (.addTo this3059 java-time-temporal-Temporal3060)))
(clojure.core/defn to-total-months {:arglists (quote (["java.time.Period"]))} (^long [^java.time.Period this3061] (.toTotalMonths this3061)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this3062 ^long long3063] (.plusDays this3062 long3063)))
(clojure.core/defn of-years {:arglists (quote (["int"]))} (^java.time.Period [^java.lang.Integer int3064] (java.time.Period/ofYears int3064)))
(clojure.core/defn get-days {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this3065] (.getDays this3065)))
(clojure.core/defn negated {:arglists (quote (["java.time.Period"]))} (^java.time.Period [^java.time.Period this3066] (.negated this3066)))
(clojure.core/defn get-years {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this3067] (.getYears this3067)))
(clojure.core/defn with-years {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this3068 ^java.lang.Integer int3069] (.withYears this3068 int3069)))
(clojure.core/defn normalized {:arglists (quote (["java.time.Period"]))} (^java.time.Period [^java.time.Period this3070] (.normalized this3070)))
(clojure.core/defn with-months {:arglists (quote (["java.time.Period" "int"]))} (^java.time.Period [^java.time.Period this3071 ^java.lang.Integer int3072] (.withMonths this3071 int3072)))
(clojure.core/defn between {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))} (^java.time.Period [^java.time.LocalDate java-time-LocalDate3073 ^java.time.LocalDate java-time-LocalDate3074] (java.time.Period/between java-time-LocalDate3073 java-time-LocalDate3074)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.time.Period [^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount3075] (java.time.Period/from java-time-temporal-TemporalAmount3075)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this3076 ^long long3077] (.minusYears this3076 long3077)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.Period"]))} (^java.time.chrono.IsoChronology [^java.time.Period this3078] (.getChronology this3078)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^java.time.Period [^java.lang.CharSequence java-lang-CharSequence3079] (java.time.Period/parse java-lang-CharSequence3079)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Period"]))} (^java.lang.Integer [^java.time.Period this3080] (.hashCode this3080)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Period this3081 ^java.time.temporal.Temporal java-time-temporal-Temporal3082] (.subtractFrom this3081 java-time-temporal-Temporal3082)))
(clojure.core/defn get {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Period this3083 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit3084] (.get this3083 java-time-temporal-TemporalUnit3084)))
(clojure.core/defn equals {:arglists (quote (["java.time.Period" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Period this3085 ^java.lang.Object java-lang-Object3086] (.equals this3085 java-lang-Object3086)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this3087 ^long long3088] (.plusYears this3087 long3088)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Period" "long"]))} (^java.time.Period [^java.time.Period this3089 ^long long3090] (.minusDays this3089 long3090)))
