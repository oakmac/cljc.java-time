(ns cljc.java-time.month (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time Month]))
(def may java.time.Month/MAY)
(def december java.time.Month/DECEMBER)
(def june java.time.Month/JUNE)
(def september java.time.Month/SEPTEMBER)
(def february java.time.Month/FEBRUARY)
(def january java.time.Month/JANUARY)
(def november java.time.Month/NOVEMBER)
(def august java.time.Month/AUGUST)
(def july java.time.Month/JULY)
(def march java.time.Month/MARCH)
(def october java.time.Month/OCTOBER)
(def april java.time.Month/APRIL)
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this4865 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4866] (.range this4865 java-time-temporal-TemporalField4866)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (java.time.Month/values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String4867] (java.time.Month/valueOf java-lang-String4867)) (^java.lang.Enum [^java.lang.Class java-lang-Class4868 ^java.lang.String java-lang-String4869] (java.time.Month/valueOf java-lang-Class4868 java-lang-String4869)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int4870] (java.time.Month/of int4870)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4871] (.ordinal this4871)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this4872] (.firstMonthOfQuarter this4872)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4873] (.minLength this4873)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this4874 ^long long4875] (.plus this4874 long4875)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this4876 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery4877] (.query this4876 java-time-temporal-TemporalQuery4877)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this4878] (.toString this4878)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this4879 ^java.lang.Boolean boolean4880] (.firstDayOfYear this4879 boolean4880)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this4881 ^long long4882] (.minus this4881 long4882)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this4883 ^java.time.format.TextStyle java-time-format-TextStyle4884 ^java.util.Locale java-util-Locale4885] (.getDisplayName this4883 java-time-format-TextStyle4884 java-util-Locale4885)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4886] (.getValue this4886)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4887] (.maxLength this4887)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this4888] (.name this4888)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this4889 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4890] (.getLong this4889 java-time-temporal-TemporalField4890)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this4891 ^java.lang.Boolean boolean4892] (.length this4891 boolean4892)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this4893] (.getDeclaringClass this4893)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor4894] (java.time.Month/from java-time-temporal-TemporalAccessor4894)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this4895 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4896] (.isSupported this4895 java-time-temporal-TemporalField4896)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4897] (.hashCode this4897)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this4898 ^java.time.temporal.Temporal java-time-temporal-Temporal4899] (.adjustInto this4898 java-time-temporal-Temporal4899)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [^java.time.Month this4900 ^java.lang.Enum java-lang-Enum4901] (.compareTo this4900 java-lang-Enum4901)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this4902 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4903] (.get this4902 java-time-temporal-TemporalField4903)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this4904 ^java.lang.Object java-lang-Object4905] (.equals this4904 java-lang-Object4905)))
