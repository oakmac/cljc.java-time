(ns cljc.java-time.duration (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time Duration]))
(def zero java.time.Duration/ZERO)
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5040 ^long long5041] (.minusMinutes this5040 long5041)))
(clojure.core/defn to-nanos {:arglists (quote (["java.time.Duration"]))} (^long [^java.time.Duration this5042] (.toNanos this5042)))
(clojure.core/defn minus-millis {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5043 ^long long5044] (.minusMillis this5043 long5044)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5045 ^long long5046] (.minusHours this5045 long5046)))
(clojure.core/defn of-days {:arglists (quote (["long"]))} (^java.time.Duration [^long long5047] (java.time.Duration/ofDays long5047)))
(clojure.core/defn is-negative {:arglists (quote (["java.time.Duration"]))} (^java.lang.Boolean [^java.time.Duration this5048] (.isNegative this5048)))
(clojure.core/defn of {:arglists (quote (["long" "java.time.temporal.TemporalUnit"]))} (^java.time.Duration [^long long5049 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit5050] (java.time.Duration/of long5049 java-time-temporal-TemporalUnit5050)))
(clojure.core/defn is-zero {:arglists (quote (["java.time.Duration"]))} (^java.lang.Boolean [^java.time.Duration this5051] (.isZero this5051)))
(clojure.core/defn multiplied-by {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5052 ^long long5053] (.multipliedBy this5052 long5053)))
(clojure.core/defn with-nanos {:arglists (quote (["java.time.Duration" "int"]))} (^java.time.Duration [^java.time.Duration this5054 ^java.lang.Integer int5055] (.withNanos this5054 int5055)))
(clojure.core/defn get-units {:arglists (quote (["java.time.Duration"]))} (^java.util.List [^java.time.Duration this5056] (.getUnits this5056)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.Duration"]))} (^java.lang.Integer [^java.time.Duration this5057] (.getNano this5057)))
(clojure.core/defn plus-millis {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5058 ^long long5059] (.plusMillis this5058 long5059)))
(clojure.core/defn to-minutes {:arglists (quote (["java.time.Duration"]))} (^long [^java.time.Duration this5060] (.toMinutes this5060)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5061 ^long long5062] (.minusSeconds this5061 long5062)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5063 ^long long5064] (.plusNanos this5063 long5064)))
(clojure.core/defn plus {:arglists (quote (["java.time.Duration" "java.time.Duration"] ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))} (^java.time.Duration [^java.time.Duration this5065 ^java.time.Duration java-time-Duration5066] (.plus this5065 java-time-Duration5066)) (^java.time.Duration [^java.time.Duration this5067 ^long long5068 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit5069] (.plus this5067 long5068 java-time-temporal-TemporalUnit5069)))
(clojure.core/defn divided-by {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5070 ^long long5071] (.dividedBy this5070 long5071)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5072 ^long long5073] (.plusMinutes this5072 long5073)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Duration"]))} (^java.lang.String [^java.time.Duration this5074] (.toString this5074)))
(clojure.core/defn minus {:arglists (quote (["java.time.Duration" "java.time.Duration"] ["java.time.Duration" "long" "java.time.temporal.TemporalUnit"]))} (^java.time.Duration [^java.time.Duration this5075 ^java.time.Duration java-time-Duration5076] (.minus this5075 java-time-Duration5076)) (^java.time.Duration [^java.time.Duration this5077 ^long long5078 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit5079] (.minus this5077 long5078 java-time-temporal-TemporalUnit5079)))
(clojure.core/defn add-to {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Duration this5080 ^java.time.temporal.Temporal java-time-temporal-Temporal5081] (.addTo this5080 java-time-temporal-Temporal5081)))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5082 ^long long5083] (.plusHours this5082 long5083)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5084 ^long long5085] (.plusDays this5084 long5085)))
(clojure.core/defn of-hours {:arglists (quote (["long"]))} (^java.time.Duration [^long long5086] (java.time.Duration/ofHours long5086)))
(clojure.core/defn to-millis {:arglists (quote (["java.time.Duration"]))} (^long [^java.time.Duration this5087] (.toMillis this5087)))
(clojure.core/defn to-hours {:arglists (quote (["java.time.Duration"]))} (^long [^java.time.Duration this5088] (.toHours this5088)))
(clojure.core/defn of-nanos {:arglists (quote (["long"]))} (^java.time.Duration [^long long5089] (java.time.Duration/ofNanos long5089)))
(clojure.core/defn of-millis {:arglists (quote (["long"]))} (^java.time.Duration [^long long5090] (java.time.Duration/ofMillis long5090)))
(clojure.core/defn negated {:arglists (quote (["java.time.Duration"]))} (^java.time.Duration [^java.time.Duration this5091] (.negated this5091)))
(clojure.core/defn abs {:arglists (quote (["java.time.Duration"]))} (^java.time.Duration [^java.time.Duration this5092] (.abs this5092)))
(clojure.core/defn between {:arglists (quote (["java.time.temporal.Temporal" "java.time.temporal.Temporal"]))} (^java.time.Duration [^java.time.temporal.Temporal java-time-temporal-Temporal5093 ^java.time.temporal.Temporal java-time-temporal-Temporal5094] (java.time.Duration/between java-time-temporal-Temporal5093 java-time-temporal-Temporal5094)))
(clojure.core/defn get-seconds {:arglists (quote (["java.time.Duration"]))} (^long [^java.time.Duration this5095] (.getSeconds this5095)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAmount"]))} (^java.time.Duration [^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount5096] (java.time.Duration/from java-time-temporal-TemporalAmount5096)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5097 ^long long5098] (.minusNanos this5097 long5098)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"]))} (^java.time.Duration [^java.lang.CharSequence java-lang-CharSequence5099] (java.time.Duration/parse java-lang-CharSequence5099)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Duration"]))} (^java.lang.Integer [^java.time.Duration this5100] (.hashCode this5100)))
(clojure.core/defn with-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5101 ^long long5102] (.withSeconds this5101 long5102)))
(clojure.core/defn of-minutes {:arglists (quote (["long"]))} (^java.time.Duration [^long long5103] (java.time.Duration/ofMinutes long5103)))
(clojure.core/defn subtract-from {:arglists (quote (["java.time.Duration" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Duration this5104 ^java.time.temporal.Temporal java-time-temporal-Temporal5105] (.subtractFrom this5104 java-time-temporal-Temporal5105)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Duration" "java.time.Duration"]))} (^java.lang.Integer [^java.time.Duration this5106 ^java.time.Duration java-time-Duration5107] (.compareTo this5106 java-time-Duration5107)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5108 ^long long5109] (.plusSeconds this5108 long5109)))
(clojure.core/defn get {:arglists (quote (["java.time.Duration" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.Duration this5110 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit5111] (.get this5110 java-time-temporal-TemporalUnit5111)))
(clojure.core/defn equals {:arglists (quote (["java.time.Duration" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Duration this5112 ^java.lang.Object java-lang-Object5113] (.equals this5112 java-lang-Object5113)))
(clojure.core/defn of-seconds {:arglists (quote (["long"] ["long" "long"]))} (^java.time.Duration [^long long5114] (java.time.Duration/ofSeconds long5114)) (^java.time.Duration [^long long5115 ^long long5116] (java.time.Duration/ofSeconds long5115 long5116)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.Duration" "long"]))} (^java.time.Duration [^java.time.Duration this5117 ^long long5118] (.minusDays this5117 long5118)))
(clojure.core/defn to-days {:arglists (quote (["java.time.Duration"]))} (^long [^java.time.Duration this5119] (.toDays this5119)))
