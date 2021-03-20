(ns cljc.java-time.period (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time :refer [Period]]))
(def zero (goog.object/get java.time.Period "ZERO"))
(clojure.core/defn get-months {:arglists (quote (["java.time.Period"]))} (^int [^js/JSJoda.Period this3090] (.months this3090)))
(clojure.core/defn of-weeks {:arglists (quote (["int"]))} (^js/JSJoda.Period [^int int3091] (js-invoke java.time.Period "ofWeeks" int3091)))
(clojure.core/defn of-days {:arglists (quote (["int"]))} (^js/JSJoda.Period [^int int3092] (js-invoke java.time.Period "ofDays" int3092)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Period"]))} (^boolean [^js/JSJoda.Period this3093] (.isNegative this3093)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"]))} (^js/JSJoda.Period [^int int3094 ^int int3095 ^int int3096] (js-invoke java.time.Period "of" int3094 int3095 int3096)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Period"]))} (^boolean [^js/JSJoda.Period this3097] (.isZero this3097)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Period" "int"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3098 ^int int3099] (.multipliedBy this3098 int3099)))
(clojure.core/defn get-units {:arglists (quote (["java.time.Period"]))} (^java.util.List [^js/JSJoda.Period this3100] (.units this3100)))
(clojure.core/defn with-days {:arglists (quote (["java.time.Period" "int"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3101 ^int int3102] (.withDays this3101 int3102)))
(clojure.core/defn plus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3103 ^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount3104] (.plus this3103 java-time-temporal-TemporalAmount3104)))
(clojure.core/defn of-months {:arglists (quote (["int"]))} (^js/JSJoda.Period [^int int3105] (js-invoke java.time.Period "ofMonths" int3105)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Period"]))} (^java.lang.String [^js/JSJoda.Period this3106] (.toString this3106)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.Period" "long"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3107 ^long long3108] (.plusMonths this3107 long3108)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.Period" "long"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3109 ^long long3110] (.minusMonths this3109 long3110)))
(clojure.core/defn minus {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalAmount"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3111 ^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount3112] (.minus this3111 java-time-temporal-TemporalAmount3112)))
(clojure.core/defn add-to {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Period this3113 ^js/JSJoda.Temporal java-time-temporal-Temporal3114] (.addTo this3113 java-time-temporal-Temporal3114)))
(clojure.core/defn to-total-months {:arglists (quote (["java.time.Period"]))} (^long [^js/JSJoda.Period this3115] (.toTotalMonths this3115)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Period" "long"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3116 ^long long3117] (.plusDays this3116 long3117)))
(clojure.core/defn of-years {:arglists (quote (["int"]))} (^js/JSJoda.Period [^int int3118] (js-invoke java.time.Period "ofYears" int3118)))
(clojure.core/defn get-days {:arglists (quote (["java.time.Period"]))} (^int [^js/JSJoda.Period this3119] (.days this3119)))
(clojure.core/defn negated {:arglists (quote (["java.time.Period"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3120] (.negated this3120)))
(clojure.core/defn get-years {:arglists (quote (["java.time.Period"]))} (^int [^js/JSJoda.Period this3121] (.years this3121)))
(clojure.core/defn with-years {:arglists (quote (["java.time.Period" "int"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3122 ^int int3123] (.withYears this3122 int3123)))
(clojure.core/defn normalized {:arglists (quote (["java.time.Period"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3124] (.normalized this3124)))
(clojure.core/defn with-months {:arglists (quote (["java.time.Period" "int"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3125 ^int int3126] (.withMonths this3125 int3126)))
(clojure.core/defn between {:arglists (quote (["java.time.LocalDate" "java.time.LocalDate"]))} (^js/JSJoda.Period [^js/JSJoda.LocalDate java-time-LocalDate3127 ^js/JSJoda.LocalDate java-time-LocalDate3128] (js-invoke java.time.Period "between" java-time-LocalDate3127 java-time-LocalDate3128)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^js/JSJoda.Period [^js/JSJoda.TemporalAmount java-time-temporal-TemporalAmount3129] (js-invoke java.time.Period "from" java-time-temporal-TemporalAmount3129)))
(clojure.core/defn minus-years {:arglists (quote (["java.time.Period" "long"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3130 ^long long3131] (.minusYears this3130 long3131)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.Period"]))} (^js/JSJoda.IsoChronology [^js/JSJoda.Period this3132] (.chronology this3132)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^js/JSJoda.Period [^java.lang.CharSequence java-lang-CharSequence3133] (js-invoke java.time.Period "parse" java-lang-CharSequence3133)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Period"]))} (^int [^js/JSJoda.Period this3134] (.hashCode this3134)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Period" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.Period this3135 ^js/JSJoda.Temporal java-time-temporal-Temporal3136] (.subtractFrom this3135 java-time-temporal-Temporal3136)))
(clojure.core/defn get {:arglists (quote (["java.time.Period" "java.time.temporal.TemporalUnit"]))} (^long [^js/JSJoda.Period this3137 ^js/JSJoda.TemporalUnit java-time-temporal-TemporalUnit3138] (.get this3137 java-time-temporal-TemporalUnit3138)))
(clojure.core/defn equals {:arglists (quote (["java.time.Period" "java.lang.Object"]))} (^boolean [^js/JSJoda.Period this3139 ^java.lang.Object java-lang-Object3140] (.equals this3139 java-lang-Object3140)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.Period" "long"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3141 ^long long3142] (.plusYears this3141 long3142)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Period" "long"]))} (^js/JSJoda.Period [^js/JSJoda.Period this3143 ^long long3144] (.minusDays this3143 long3144)))
