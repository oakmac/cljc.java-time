(ns cljc.java-time.format.date-time-formatter-builder (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time.format DateTimeFormatterBuilder]))
(clojure.core/defn to-formatter {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"] ["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this6041 ^java.util.Locale java-util-Locale6042] (.toFormatter this6041 java-util-Locale6042)) (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this6043] (.toFormatter this6043)))
(clojure.core/defn append-pattern {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6044 ^java.lang.String java-lang-String6045] (.appendPattern this6044 java-lang-String6045)))
(clojure.core/defn append-value {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.format.SignStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6046 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6047 ^java.lang.Integer int6048 ^java.lang.Integer int6049 ^java.time.format.SignStyle java-time-format-SignStyle6050] (.appendValue this6046 java-time-temporal-TemporalField6047 int6048 int6049 java-time-format-SignStyle6050)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6051 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6052 ^java.lang.Integer int6053] (.appendValue this6051 java-time-temporal-TemporalField6052 int6053)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6054 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6055] (.appendValue this6054 java-time-temporal-TemporalField6055)))
(clojure.core/defn append-instant {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int"] ["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6056 ^java.lang.Integer int6057] (.appendInstant this6056 int6057)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6058] (.appendInstant this6058)))
(clojure.core/defn append-literal {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"] ["java.time.format.DateTimeFormatterBuilder" "char"]))} (^java.time.format.DateTimeFormatterBuilder [this6059 G__6060] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.lang.String G__6060)) (clojure.core/let [G__6060 ^"java.lang.String" G__6060] (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this6059 G__6060)) (clojure.core/and (clojure.core/instance? java.lang.Character G__6060)) (clojure.core/let [G__6060 ^"java.lang.Character" G__6060] (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this6059 G__6060)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn optional-start {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6061] (.optionalStart this6061)))
(clojure.core/defn append-fraction {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "boolean"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6062 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6063 ^java.lang.Integer int6064 ^java.lang.Integer int6065 ^java.lang.Boolean boolean6066] (.appendFraction this6062 java-time-temporal-TemporalField6063 int6064 int6065 boolean6066)))
(clojure.core/defn append-optional {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6067 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter6068] (.appendOptional this6067 java-time-format-DateTimeFormatter6068)))
(clojure.core/defn optional-end {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6069] (.optionalEnd this6069)))
(clojure.core/defn parse-lenient {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6070] (.parseLenient this6070)))
(clojure.core/defn pad-next {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int" "char"] ["java.time.format.DateTimeFormatterBuilder" "int"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6071 ^java.lang.Integer int6072 ^java.lang.Character char6073] (.padNext this6071 int6072 char6073)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6074 ^java.lang.Integer int6075] (.padNext this6074 int6075)))
(clojure.core/defn append-chronology-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6076] (.appendChronologyId this6076)))
(clojure.core/defn append-zone-or-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6077] (.appendZoneOrOffsetId this6077)))
(clojure.core/defn parse-case-sensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6078] (.parseCaseSensitive this6078)))
(clojure.core/defn parse-strict {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6079] (.parseStrict this6079)))
(clojure.core/defn append-chronology-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6080 ^java.time.format.TextStyle java-time-format-TextStyle6081] (.appendChronologyText this6080 java-time-format-TextStyle6081)))
(clojure.core/defn append-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6082] (.appendOffsetId this6082)))
(clojure.core/defn append-zone-region-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6083] (.appendZoneRegionId this6083)))
(clojure.core/defn parse-defaulting {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6084 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6085 ^long long6086] (.parseDefaulting this6084 java-time-temporal-TemporalField6085 long6086)))
(clojure.core/defn append-zone-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6087] (.appendZoneId this6087)))
(clojure.core/defn get-localized-date-time-pattern {:arglists (quote (["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology" "java.util.Locale"]))} (^java.lang.String [^java.time.format.FormatStyle java-time-format-FormatStyle6088 ^java.time.format.FormatStyle java-time-format-FormatStyle6089 ^java.time.chrono.Chronology java-time-chrono-Chronology6090 ^java.util.Locale java-util-Locale6091] (java.time.format.DateTimeFormatterBuilder/getLocalizedDateTimePattern java-time-format-FormatStyle6088 java-time-format-FormatStyle6089 java-time-chrono-Chronology6090 java-util-Locale6091)))
(clojure.core/defn parse-case-insensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6092] (.parseCaseInsensitive this6092)))
(clojure.core/defn append-localized-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6093 ^java.time.format.TextStyle java-time-format-TextStyle6094] (.appendLocalizedOffset this6093 java-time-format-TextStyle6094)))
(clojure.core/defn append {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6095 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter6096] (.append this6095 java-time-format-DateTimeFormatter6096)))
(clojure.core/defn append-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]))} (^java.time.format.DateTimeFormatterBuilder [this6097 G__6098 G__6099] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField G__6098) (clojure.core/instance? java.time.format.TextStyle G__6099)) (clojure.core/let [G__6098 ^"java.time.temporal.TemporalField" G__6098 G__6099 ^"java.time.format.TextStyle" G__6099] (.appendText ^java.time.format.DateTimeFormatterBuilder this6097 G__6098 G__6099)) (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField G__6098) (clojure.core/instance? java.util.Map G__6099)) (clojure.core/let [G__6098 ^"java.time.temporal.TemporalField" G__6098 G__6099 ^"java.util.Map" G__6099] (.appendText ^java.time.format.DateTimeFormatterBuilder this6097 G__6098 G__6099)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6100 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6101] (.appendText this6100 java-time-temporal-TemporalField6101)))
(clojure.core/defn append-localized {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle" "java.time.format.FormatStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6102 ^java.time.format.FormatStyle java-time-format-FormatStyle6103 ^java.time.format.FormatStyle java-time-format-FormatStyle6104] (.appendLocalized this6102 java-time-format-FormatStyle6103 java-time-format-FormatStyle6104)))
(clojure.core/defn append-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6105 ^java.lang.String java-lang-String6106 ^java.lang.String java-lang-String6107] (.appendOffset this6105 java-lang-String6106 java-lang-String6107)))
(clojure.core/defn append-value-reduced {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.chrono.ChronoLocalDate"]))} (^java.time.format.DateTimeFormatterBuilder [this6108 G__6109 G__6110 G__6111 G__6112] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField G__6109) (clojure.core/instance? java.lang.Number G__6110) (clojure.core/instance? java.lang.Number G__6111) (clojure.core/instance? java.lang.Number G__6112)) (clojure.core/let [G__6109 ^"java.time.temporal.TemporalField" G__6109 G__6110 (clojure.core/int G__6110) G__6111 (clojure.core/int G__6111) G__6112 (clojure.core/int G__6112)] (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this6108 G__6109 G__6110 G__6111 G__6112)) (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField G__6109) (clojure.core/instance? java.lang.Number G__6110) (clojure.core/instance? java.lang.Number G__6111) (clojure.core/instance? java.time.chrono.ChronoLocalDate G__6112)) (clojure.core/let [G__6109 ^"java.time.temporal.TemporalField" G__6109 G__6110 (clojure.core/int G__6110) G__6111 (clojure.core/int G__6111) G__6112 ^"java.time.chrono.ChronoLocalDate" G__6112] (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this6108 G__6109 G__6110 G__6111 G__6112)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn append-zone-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"] ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6113 ^java.time.format.TextStyle java-time-format-TextStyle6114 ^java.util.Set java-util-Set6115] (.appendZoneText this6113 java-time-format-TextStyle6114 java-util-Set6115)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this6116 ^java.time.format.TextStyle java-time-format-TextStyle6117] (.appendZoneText this6116 java-time-format-TextStyle6117)))
