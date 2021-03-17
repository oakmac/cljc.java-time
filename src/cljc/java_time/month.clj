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
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this4866 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4867] (.range this4866 java-time-temporal-TemporalField4867)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (java.time.Month/values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String4868] (java.time.Month/valueOf java-lang-String4868)) (^java.lang.Enum [^java.lang.Class java-lang-Class4869 ^java.lang.String java-lang-String4870] (java.time.Month/valueOf java-lang-Class4869 java-lang-String4870)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int4871] (java.time.Month/of int4871)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4872] (.ordinal this4872)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this4873] (.firstMonthOfQuarter this4873)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4874] (.minLength this4874)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this4875 ^long long4876] (.plus this4875 long4876)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this4877 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery4878] (.query this4877 java-time-temporal-TemporalQuery4878)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this4879] (.toString this4879)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this4880 ^java.lang.Boolean boolean4881] (.firstDayOfYear this4880 boolean4881)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this4882 ^long long4883] (.minus this4882 long4883)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this4884 ^java.time.format.TextStyle java-time-format-TextStyle4885 ^java.util.Locale java-util-Locale4886] (.getDisplayName this4884 java-time-format-TextStyle4885 java-util-Locale4886)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4887] (.getValue this4887)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4888] (.maxLength this4888)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this4889] (.name this4889)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this4890 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4891] (.getLong this4890 java-time-temporal-TemporalField4891)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this4892 ^java.lang.Boolean boolean4893] (.length this4892 boolean4893)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this4894] (.getDeclaringClass this4894)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor4895] (java.time.Month/from java-time-temporal-TemporalAccessor4895)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this4896 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4897] (.isSupported this4896 java-time-temporal-TemporalField4897)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this4898] (.hashCode this4898)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this4899 ^java.time.temporal.Temporal java-time-temporal-Temporal4900] (.adjustInto this4899 java-time-temporal-Temporal4900)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [^java.time.Month this4901 ^java.lang.Enum java-lang-Enum4902] (.compareTo this4901 java-lang-Enum4902)))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this4903 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4904] (.get this4903 java-time-temporal-TemporalField4904)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this4905 ^java.lang.Object java-lang-Object4906] (.equals this4905 java-lang-Object4906)))
