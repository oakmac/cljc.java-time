(ns cljc.java-time.local-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time LocalTime])))
(def max #? (:clj java.time.LocalTime/MAX :cljs (. java.time.LocalTime -MAX)))
(def noon #? (:clj java.time.LocalTime/NOON :cljs (. java.time.LocalTime -NOON)))
(def midnight #? (:clj java.time.LocalTime/MIDNIGHT :cljs (. java.time.LocalTime -MIDNIGHT)))
(def min #? (:clj java.time.LocalTime/MIN :cljs (. java.time.LocalTime -MIN)))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13021 ^long long13022] (.minusMinutes this13021 long13022)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))} (^java.time.LocalTime [^java.time.LocalTime this13023 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit13024] (.truncatedTo this13023 java-time-temporal-TemporalUnit13024)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalTime this13025 ^java.time.temporal.TemporalField java-time-temporal-TemporalField13026] (.range this13025 java-time-temporal-TemporalField13026)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this13027] (jti/getter hour this13027)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.LocalTime this13028 ^java.time.ZoneOffset java-time-ZoneOffset13029] (.atOffset this13028 java-time-ZoneOffset13029)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13030 ^long long13031] (.minusHours this13030 long13031)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int"] ["int" "int" "int" "int"] ["int" "int"]))} (^java.time.LocalTime [^java.lang.Integer int13032 ^java.lang.Integer int13033 ^java.lang.Integer int13034] (. java.time.LocalTime of int13032 int13033 int13034)) (^java.time.LocalTime [^java.lang.Integer int13035 ^java.lang.Integer int13036 ^java.lang.Integer int13037 ^java.lang.Integer int13038] (. java.time.LocalTime of int13035 int13036 int13037 int13038)) (^java.time.LocalTime [^java.lang.Integer int13039 ^java.lang.Integer int13040] (. java.time.LocalTime of int13039 int13040)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this13041] (jti/getter nano this13041)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13042 ^long long13043] (.minusSeconds this13042 long13043)))
(clojure.core/defn get-second {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this13044] (jti/getter second this13044)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13045 ^long long13046] (.plusNanos this13045 long13046)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this13047 G__13048] #? (:cljs (.plus ^java.time.LocalTime this13047 G__13048) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13048)) (clojure.core/let [G__13048 ^"java.time.temporal.TemporalAmount" G__13048] (.plus ^java.time.LocalTime this13047 G__13048)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13048)) (clojure.core/let [G__13048 ^"java.time.temporal.TemporalAmount" G__13048] (.plus ^java.time.LocalTime this13047 G__13048)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this13049 G__13050 G__13051] #? (:cljs (.plus ^java.time.LocalTime this13049 G__13050 G__13051) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13050) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13051)) (clojure.core/let [G__13050 (clojure.core/long G__13050) G__13051 ^"java.time.temporal.TemporalUnit" G__13051] (.plus ^java.time.LocalTime this13049 G__13050 G__13051)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13050) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13051)) (clojure.core/let [G__13050 (clojure.core/long G__13050) G__13051 ^"java.time.temporal.TemporalUnit" G__13051] (.plus ^java.time.LocalTime this13049 G__13050 G__13051)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this13052 ^java.lang.Integer int13053] (.withHour this13052 int13053)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this13054 ^java.lang.Integer int13055] (.withMinute this13054 int13055)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13056 ^long long13057] (.plusMinutes this13056 long13057)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalTime this13058 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery13059] (.query this13058 java-time-temporal-TemporalQuery13059)))
(clojure.core/defn at-date {:arglists (quote (["java.time.LocalTime" "java.time.LocalDate"]))} (^java.time.LocalDateTime [^java.time.LocalTime this13060 ^java.time.LocalDate java-time-LocalDate13061] (.atDate this13060 java-time-LocalDate13061)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.String [^java.time.LocalTime this13062] (.toString this13062)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this13063 ^java.time.LocalTime java-time-LocalTime13064] (.isBefore this13063 java-time-LocalTime13064)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this13065 G__13066] #? (:cljs (.minus ^java.time.LocalTime this13065 G__13066) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13066)) (clojure.core/let [G__13066 ^"java.time.temporal.TemporalAmount" G__13066] (.minus ^java.time.LocalTime this13065 G__13066)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__13066)) (clojure.core/let [G__13066 ^"java.time.temporal.TemporalAmount" G__13066] (.minus ^java.time.LocalTime this13065 G__13066)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this13067 G__13068 G__13069] #? (:cljs (.minus ^java.time.LocalTime this13067 G__13068 G__13069) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13068) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13069)) (clojure.core/let [G__13068 (clojure.core/long G__13068) G__13069 ^"java.time.temporal.TemporalUnit" G__13069] (.minus ^java.time.LocalTime this13067 G__13068 G__13069)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13068) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13069)) (clojure.core/let [G__13068 (clojure.core/long G__13068) G__13069 ^"java.time.temporal.TemporalUnit" G__13069] (.minus ^java.time.LocalTime this13067 G__13068 G__13069)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13070 ^long long13071] (.plusHours this13070 long13071)))
(clojure.core/defn to-second-of-day {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this13072] (.toSecondOfDay this13072)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalTime this13073 ^java.time.temporal.TemporalField java-time-temporal-TemporalField13074] (.getLong this13073 java-time-temporal-TemporalField13074)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this13075 ^java.lang.Integer int13076] (.withNano this13075 int13076)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.LocalTime this13077 ^java.time.temporal.Temporal java-time-temporal-Temporal13078 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit13079] (.until this13077 java-time-temporal-Temporal13078 java-time-temporal-TemporalUnit13079)))
(clojure.core/defn of-nano-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long13080] (. java.time.LocalTime ofNanoOfDay long13080)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor13081] (. java.time.LocalTime from java-time-temporal-TemporalAccessor13081)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this13082 ^java.time.LocalTime java-time-LocalTime13083] (.isAfter this13082 java-time-LocalTime13083)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13084 ^long long13085] (.minusNanos this13084 long13085)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"] ["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this13086 G__13087] #? (:cljs (.isSupported ^java.time.LocalTime this13086 G__13087) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__13087)) (clojure.core/let [G__13087 ^"java.time.temporal.TemporalField" G__13087] (.isSupported ^java.time.LocalTime this13086 G__13087)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__13087)) (clojure.core/let [G__13087 ^"java.time.temporal.TemporalUnit" G__13087] (.isSupported ^java.time.LocalTime this13086 G__13087)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence13088] (. java.time.LocalTime parse java-lang-CharSequence13088)) (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence13089 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter13090] (. java.time.LocalTime parse java-lang-CharSequence13089 java-time-format-DateTimeFormatter13090)))
(clojure.core/defn with-second {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this13091 ^java.lang.Integer int13092] (.withSecond this13091 int13092)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this13093] (jti/getter minute this13093)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this13094] (.hashCode this13094)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalTime this13095 ^java.time.temporal.Temporal java-time-temporal-Temporal13096] (.adjustInto this13095 java-time-temporal-Temporal13096)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this13097 G__13098 G__13099] #? (:cljs (.with ^java.time.LocalTime this13097 G__13098 G__13099) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__13098) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13099)) (clojure.core/let [G__13098 ^"java.time.temporal.TemporalField" G__13098 G__13099 (clojure.core/long G__13099)] (.with ^java.time.LocalTime this13097 G__13098 G__13099)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__13098) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__13099)) (clojure.core/let [G__13098 ^"java.time.temporal.TemporalField" G__13098 G__13099 (clojure.core/long G__13099)] (.with ^java.time.LocalTime this13097 G__13098 G__13099)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this13100 G__13101] #? (:cljs (.with ^java.time.LocalTime this13100 G__13101) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__13101)) (clojure.core/let [G__13101 ^"java.time.temporal.TemporalAdjuster" G__13101] (.with ^java.time.LocalTime this13100 G__13101)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__13101)) (clojure.core/let [G__13101 ^"java.time.temporal.TemporalAdjuster" G__13101] (.with ^java.time.LocalTime this13100 G__13101)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))} (^java.time.LocalTime [] (. java.time.LocalTime now)) (^java.time.LocalTime [G__13103] #? (:cljs (. java.time.LocalTime now G__13103) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__13103)) (clojure.core/let [G__13103 ^"java.time.Clock" G__13103] (. java.time.LocalTime now G__13103)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__13103)) (clojure.core/let [G__13103 ^"java.time.ZoneId" G__13103] (. java.time.LocalTime now G__13103)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"] ["java.time.LocalTime" "java.lang.Object"]))} (^java.lang.Integer [this13104 G__13105] #? (:cljs (.compareTo ^java.time.LocalTime this13104 G__13105) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__13105)) (clojure.core/let [G__13105 ^"java.time.LocalTime" G__13105] (.compareTo ^java.time.LocalTime this13104 G__13105)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__13105)) (clojure.core/let [G__13105 ^"java.lang.Object" G__13105] (.compareTo ^java.time.LocalTime this13104 G__13105)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn to-nano-of-day {:arglists (quote (["java.time.LocalTime"]))} (^long [^java.time.LocalTime this13106] (.toNanoOfDay this13106)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this13107 ^long long13108] (.plusSeconds this13107 long13108)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalTime this13109 ^java.time.temporal.TemporalField java-time-temporal-TemporalField13110] (.get this13109 java-time-temporal-TemporalField13110)))
(clojure.core/defn of-second-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long13111] (. java.time.LocalTime ofSecondOfDay long13111)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalTime this13112 ^java.lang.Object java-lang-Object13113] (.equals this13112 java-lang-Object13113)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalTime this13114 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter13115] (.format this13114 java-time-format-DateTimeFormatter13115)))
