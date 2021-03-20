(ns cljc.java-time.day-of-week (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time :refer [DayOfWeek]]))
(def saturday (goog.object/get java.time.DayOfWeek "SATURDAY"))
(def thursday (goog.object/get java.time.DayOfWeek "THURSDAY"))
(def friday (goog.object/get java.time.DayOfWeek "FRIDAY"))
(def wednesday (goog.object/get java.time.DayOfWeek "WEDNESDAY"))
(def sunday (goog.object/get java.time.DayOfWeek "SUNDAY"))
(def monday (goog.object/get java.time.DayOfWeek "MONDAY"))
(def tuesday (goog.object/get java.time.DayOfWeek "TUESDAY"))
(clojure.core/defn range {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^js/JSJoda.ValueRange [^js/JSJoda.DayOfWeek this4641 ^js/JSJoda.TemporalField java-time-temporal-TemporalField4642] (.range this4641 java-time-temporal-TemporalField4642)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (js-invoke java.time.DayOfWeek "values")))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^js/JSJoda.DayOfWeek [^java.lang.String java-lang-String4643] (js-invoke java.time.DayOfWeek "valueOf" java-lang-String4643)) (^java.lang.Enum [^java.lang.Class java-lang-Class4644 ^java.lang.String java-lang-String4645] (js-invoke java.time.DayOfWeek "valueOf" java-lang-Class4644 java-lang-String4645)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^js/JSJoda.DayOfWeek [^int int4646] (js-invoke java.time.DayOfWeek "of" int4646)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.DayOfWeek"]))} (^int [^js/JSJoda.DayOfWeek this4647] (.ordinal this4647)))
(clojure.core/defn plus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this4648 ^long long4649] (.plus this4648 long4649)))
(clojure.core/defn query {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^js/JSJoda.DayOfWeek this4650 ^js/JSJoda.TemporalQuery java-time-temporal-TemporalQuery4651] (.query this4650 java-time-temporal-TemporalQuery4651)))
(clojure.core/defn to-string {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^js/JSJoda.DayOfWeek this4652] (.toString this4652)))
(clojure.core/defn minus {:arglists (quote (["java.time.DayOfWeek" "long"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.DayOfWeek this4653 ^long long4654] (.minus this4653 long4654)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.DayOfWeek" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^js/JSJoda.DayOfWeek this4655 ^js/JSJoda.TextStyle java-time-format-TextStyle4656 ^java.util.Locale java-util-Locale4657] (.displayName this4655 java-time-format-TextStyle4656 java-util-Locale4657)))
(clojure.core/defn get-value {:arglists (quote (["java.time.DayOfWeek"]))} (^int [^js/JSJoda.DayOfWeek this4658] (.value this4658)))
(clojure.core/defn name {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.String [^js/JSJoda.DayOfWeek this4659] (.name this4659)))
(clojure.core/defn get-long {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^long [^js/JSJoda.DayOfWeek this4660 ^js/JSJoda.TemporalField java-time-temporal-TemporalField4661] (.getLong this4660 java-time-temporal-TemporalField4661)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.DayOfWeek"]))} (^java.lang.Class [^js/JSJoda.DayOfWeek this4662] (.declaringClass this4662)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^js/JSJoda.DayOfWeek [^js/JSJoda.TemporalAccessor java-time-temporal-TemporalAccessor4663] (js-invoke java.time.DayOfWeek "from" java-time-temporal-TemporalAccessor4663)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^boolean [^js/JSJoda.DayOfWeek this4664 ^js/JSJoda.TemporalField java-time-temporal-TemporalField4665] (.isSupported this4664 java-time-temporal-TemporalField4665)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.DayOfWeek"]))} (^int [^js/JSJoda.DayOfWeek this4666] (.hashCode this4666)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.Temporal"]))} (^js/JSJoda.Temporal [^js/JSJoda.DayOfWeek this4667 ^js/JSJoda.Temporal java-time-temporal-Temporal4668] (.adjustInto this4667 java-time-temporal-Temporal4668)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.DayOfWeek" "java.lang.Enum"]))} (^int [^js/JSJoda.DayOfWeek this4669 ^java.lang.Enum java-lang-Enum4670] (.compareTo this4669 java-lang-Enum4670)))
(clojure.core/defn get {:arglists (quote (["java.time.DayOfWeek" "java.time.temporal.TemporalField"]))} (^int [^js/JSJoda.DayOfWeek this4671 ^js/JSJoda.TemporalField java-time-temporal-TemporalField4672] (.get this4671 java-time-temporal-TemporalField4672)))
(clojure.core/defn equals {:arglists (quote (["java.time.DayOfWeek" "java.lang.Object"]))} (^boolean [^js/JSJoda.DayOfWeek this4673 ^java.lang.Object java-lang-Object4674] (.equals this4673 java-lang-Object4674)))
