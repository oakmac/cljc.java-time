(ns cljc.java-time.month (:refer-clojure :exclude [get range format min max next name resolve]) (:import [java.time Month]))
(def may (. java.time.Month -MAY))
(def december (. java.time.Month -DECEMBER))
(def june (. java.time.Month -JUNE))
(def september (. java.time.Month -SEPTEMBER))
(def february (. java.time.Month -FEBRUARY))
(def january (. java.time.Month -JANUARY))
(def november (. java.time.Month -NOVEMBER))
(def august (. java.time.Month -AUGUST))
(def july (. java.time.Month -JULY))
(def march (. java.time.Month -MARCH))
(def october (. java.time.Month -OCTOBER))
(def april (. java.time.Month -APRIL))
(clojure.core/defn range {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.Month this7032 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7033] (.range this7032 java-time-temporal-TemporalField7033)))
(clojure.core/defn values {:arglists (quote ([]))} (^"java.lang.Class" [] (. java.time.Month values)))
(clojure.core/defn value-of {:arglists (quote (["java.lang.String"] ["java.lang.Class" "java.lang.String"]))} (^java.time.Month [^java.lang.String java-lang-String7034] (. java.time.Month valueOf java-lang-String7034)) (^java.lang.Enum [^java.lang.Class java-lang-Class7035 ^java.lang.String java-lang-String7036] (. java.time.Month valueOf java-lang-Class7035 java-lang-String7036)))
(clojure.core/defn of {:arglists (quote (["int"]))} (^java.time.Month [^java.lang.Integer int7037] (. java.time.Month of int7037)))
(clojure.core/defn ordinal {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this7038] (.ordinal this7038)))
(clojure.core/defn first-month-of-quarter {:arglists (quote (["java.time.Month"]))} (^java.time.Month [^java.time.Month this7039] (.firstMonthOfQuarter this7039)))
(clojure.core/defn min-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this7040] (.minLength this7040)))
(clojure.core/defn plus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this7041 ^long long7042] (.plus this7041 long7042)))
(clojure.core/defn query {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.Month this7043 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery7044] (.query this7043 java-time-temporal-TemporalQuery7044)))
(clojure.core/defn to-string {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this7045] (.toString this7045)))
(clojure.core/defn first-day-of-year {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this7046 ^java.lang.Boolean boolean7047] (.firstDayOfYear this7046 boolean7047)))
(clojure.core/defn minus {:arglists (quote (["java.time.Month" "long"]))} (^java.time.Month [^java.time.Month this7048 ^long long7049] (.minus this7048 long7049)))
(clojure.core/defn get-display-name {:arglists (quote (["java.time.Month" "java.time.format.TextStyle" "java.util.Locale"]))} (^java.lang.String [^java.time.Month this7050 ^java.time.format.TextStyle java-time-format-TextStyle7051 ^java.util.Locale java-util-Locale7052] (.getDisplayName this7050 java-time-format-TextStyle7051 java-util-Locale7052)))
(clojure.core/defn get-value {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this7053] (.getValue this7053)))
(clojure.core/defn max-length {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this7054] (.maxLength this7054)))
(clojure.core/defn name {:arglists (quote (["java.time.Month"]))} (^java.lang.String [^java.time.Month this7055] (.name this7055)))
(clojure.core/defn get-long {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^long [^java.time.Month this7056 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7057] (.getLong this7056 java-time-temporal-TemporalField7057)))
(clojure.core/defn length {:arglists (quote (["java.time.Month" "boolean"]))} (^java.lang.Integer [^java.time.Month this7058 ^java.lang.Boolean boolean7059] (.length this7058 boolean7059)))
(clojure.core/defn get-declaring-class {:arglists (quote (["java.time.Month"]))} (^java.lang.Class [^java.time.Month this7060] (.getDeclaringClass this7060)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.Month [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor7061] (. java.time.Month from java-time-temporal-TemporalAccessor7061)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [^java.time.Month this7062 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7063] (.isSupported this7062 java-time-temporal-TemporalField7063)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Month"]))} (^java.lang.Integer [^java.time.Month this7064] (.hashCode this7064)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.Month" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.Month this7065 ^java.time.temporal.Temporal java-time-temporal-Temporal7066] (.adjustInto this7065 java-time-temporal-Temporal7066)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.Month" "java.lang.Object"] ["java.time.Month" "java.lang.Enum"]))} (^java.lang.Integer [this7067 G__7068] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__7068)) (clojure.core/let [G__7068 ^"java.lang.Object" G__7068] (.compareTo ^java.time.Month this7067 G__7068)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Enum") G__7068)) (clojure.core/let [G__7068 ^"java.lang.Enum" G__7068] (.compareTo ^java.time.Month this7067 G__7068)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get {:arglists (quote (["java.time.Month" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.Month this7069 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7070] (.get this7069 java-time-temporal-TemporalField7070)))
(clojure.core/defn equals {:arglists (quote (["java.time.Month" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.Month this7071 ^java.lang.Object java-lang-Object7072] (.equals this7071 java-lang-Object7072)))
