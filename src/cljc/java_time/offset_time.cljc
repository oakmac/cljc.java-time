(ns cljc.java-time.offset-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time OffsetTime])))
(def min #? (:clj java.time.OffsetTime/MIN :cljs (. java.time.OffsetTime -MIN)))
(def max #? (:clj java.time.OffsetTime/MAX :cljs (. java.time.OffsetTime -MAX)))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12665 ^long long12666] (.minusMinutes this12665 long12666)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12667 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit12668] (.truncatedTo this12667 java-time-temporal-TemporalUnit12668)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.OffsetTime this12669 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12670] (.range this12669 java-time-temporal-TemporalField12670)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this12671] (jti/getter hour this12671)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12672 ^long long12673] (.minusHours this12672 long12673)))
(clojure.core/defn of {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"] ["int" "int" "int" "int" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.LocalTime java-time-LocalTime12674 ^java.time.ZoneOffset java-time-ZoneOffset12675] (. java.time.OffsetTime of java-time-LocalTime12674 java-time-ZoneOffset12675)) (^java.time.OffsetTime [^java.lang.Integer int12676 ^java.lang.Integer int12677 ^java.lang.Integer int12678 ^java.lang.Integer int12679 ^java.time.ZoneOffset java-time-ZoneOffset12680] (. java.time.OffsetTime of int12676 int12677 int12678 int12679 java-time-ZoneOffset12680)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this12681 ^java.time.OffsetTime java-time-OffsetTime12682] (.isEqual this12681 java-time-OffsetTime12682)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this12683] (jti/getter nano this12683)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12684 ^long long12685] (.minusSeconds this12684 long12685)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this12686] (jti/getter second this12686)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12687 ^long long12688] (.plusNanos this12687 long12688)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this12689 G__12690] #? (:cljs (.plus ^java.time.OffsetTime this12689 G__12690) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12690)) (clojure.core/let [G__12690 ^"java.time.temporal.TemporalAmount" G__12690] (.plus ^java.time.OffsetTime this12689 G__12690)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12690)) (clojure.core/let [G__12690 ^"java.time.temporal.TemporalAmount" G__12690] (.plus ^java.time.OffsetTime this12689 G__12690)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this12691 G__12692 G__12693] #? (:cljs (.plus ^java.time.OffsetTime this12691 G__12692 G__12693) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12692) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12693)) (clojure.core/let [G__12692 (clojure.core/long G__12692) G__12693 ^"java.time.temporal.TemporalUnit" G__12693] (.plus ^java.time.OffsetTime this12691 G__12692 G__12693)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12692) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12693)) (clojure.core/let [G__12692 (clojure.core/long G__12692) G__12693 ^"java.time.temporal.TemporalUnit" G__12693] (.plus ^java.time.OffsetTime this12691 G__12692 G__12693)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12694 ^java.lang.Integer int12695] (.withHour this12694 int12695)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12696 ^java.lang.Integer int12697] (.withMinute this12696 int12697)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12698 ^long long12699] (.plusMinutes this12698 long12699)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.OffsetTime this12700 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery12701] (.query this12700 java-time-temporal-TemporalQuery12701)))
(clojure.core/defn at-date {:arglists (quote (["java.time.OffsetTime" "java.time.LocalDate"]))} (^java.time.OffsetDateTime [^java.time.OffsetTime this12702 ^java.time.LocalDate java-time-LocalDate12703] (.atDate this12702 java-time-LocalDate12703)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12704 ^java.time.ZoneOffset java-time-ZoneOffset12705] (.withOffsetSameInstant this12704 java-time-ZoneOffset12705)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.String [^java.time.OffsetTime this12706] (.toString this12706)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this12707 ^java.time.OffsetTime java-time-OffsetTime12708] (.isBefore this12707 java-time-OffsetTime12708)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetTime" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this12709 G__12710] #? (:cljs (.minus ^java.time.OffsetTime this12709 G__12710) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12710)) (clojure.core/let [G__12710 ^"java.time.temporal.TemporalAmount" G__12710] (.minus ^java.time.OffsetTime this12709 G__12710)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12710)) (clojure.core/let [G__12710 ^"java.time.temporal.TemporalAmount" G__12710] (.minus ^java.time.OffsetTime this12709 G__12710)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this12711 G__12712 G__12713] #? (:cljs (.minus ^java.time.OffsetTime this12711 G__12712 G__12713) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12712) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12713)) (clojure.core/let [G__12712 (clojure.core/long G__12712) G__12713 ^"java.time.temporal.TemporalUnit" G__12713] (.minus ^java.time.OffsetTime this12711 G__12712 G__12713)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12712) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12713)) (clojure.core/let [G__12712 (clojure.core/long G__12712) G__12713 ^"java.time.temporal.TemporalUnit" G__12713] (.minus ^java.time.OffsetTime this12711 G__12712 G__12713)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12714 ^long long12715] (.plusHours this12714 long12715)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetTime"]))} (^java.time.LocalTime [^java.time.OffsetTime this12716] (.toLocalTime this12716)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.OffsetTime this12717 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12718] (.getLong this12717 java-time-temporal-TemporalField12718)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetTime"]))} (^java.time.ZoneOffset [^java.time.OffsetTime this12719] (jti/getter offset this12719)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12720 ^java.lang.Integer int12721] (.withNano this12720 int12721)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.OffsetTime this12722 ^java.time.temporal.Temporal java-time-temporal-Temporal12723 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit12724] (.until this12722 java-time-temporal-Temporal12723 java-time-temporal-TemporalUnit12724)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12725 ^java.time.ZoneOffset java-time-ZoneOffset12726] (.withOffsetSameLocal this12725 java-time-ZoneOffset12726)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.OffsetTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor12727] (. java.time.OffsetTime from java-time-temporal-TemporalAccessor12727)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"]))} (^java.lang.Boolean [^java.time.OffsetTime this12728 ^java.time.OffsetTime java-time-OffsetTime12729] (.isAfter this12728 java-time-OffsetTime12729)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12730 ^long long12731] (.minusNanos this12730 long12731)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"] ["java.time.OffsetTime" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this12732 G__12733] #? (:cljs (.isSupported ^java.time.OffsetTime this12732 G__12733) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12733)) (clojure.core/let [G__12733 ^"java.time.temporal.TemporalField" G__12733] (.isSupported ^java.time.OffsetTime this12732 G__12733)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12733)) (clojure.core/let [G__12733 ^"java.time.temporal.TemporalUnit" G__12733] (.isSupported ^java.time.OffsetTime this12732 G__12733)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.OffsetTime [^java.lang.CharSequence java-lang-CharSequence12734 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter12735] (. java.time.OffsetTime parse java-lang-CharSequence12734 java-time-format-DateTimeFormatter12735)) (^java.time.OffsetTime [^java.lang.CharSequence java-lang-CharSequence12736] (. java.time.OffsetTime parse java-lang-CharSequence12736)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetTime" "int"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12737 ^java.lang.Integer int12738] (.withSecond this12737 int12738)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this12739] (jti/getter minute this12739)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetTime"]))} (^java.lang.Integer [^java.time.OffsetTime this12740] (.hashCode this12740)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.OffsetTime this12741 ^java.time.temporal.Temporal java-time-temporal-Temporal12742] (.adjustInto this12741 java-time-temporal-Temporal12742)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetTime" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this12743 G__12744 G__12745] #? (:cljs (.with ^java.time.OffsetTime this12743 G__12744 G__12745) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12744) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12745)) (clojure.core/let [G__12744 ^"java.time.temporal.TemporalField" G__12744 G__12745 (clojure.core/long G__12745)] (.with ^java.time.OffsetTime this12743 G__12744 G__12745)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12744) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12745)) (clojure.core/let [G__12744 ^"java.time.temporal.TemporalField" G__12744 G__12745 (clojure.core/long G__12745)] (.with ^java.time.OffsetTime this12743 G__12744 G__12745)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this12746 G__12747] #? (:cljs (.with ^java.time.OffsetTime this12746 G__12747) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__12747)) (clojure.core/let [G__12747 ^"java.time.temporal.TemporalAdjuster" G__12747] (.with ^java.time.OffsetTime this12746 G__12747)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__12747)) (clojure.core/let [G__12747 ^"java.time.temporal.TemporalAdjuster" G__12747] (.with ^java.time.OffsetTime this12746 G__12747)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote (["java.time.ZoneId"] [] ["java.time.Clock"]))} (^java.time.OffsetTime [G__12749] #? (:cljs (. java.time.OffsetTime now G__12749) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__12749)) (clojure.core/let [G__12749 ^"java.time.ZoneId" G__12749] (. java.time.OffsetTime now G__12749)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__12749)) (clojure.core/let [G__12749 ^"java.time.Clock" G__12749] (. java.time.OffsetTime now G__12749)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.OffsetTime [] (. java.time.OffsetTime now)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetTime" "java.time.OffsetTime"] ["java.time.OffsetTime" "java.lang.Object"]))} (^java.lang.Integer [this12750 G__12751] #? (:cljs (.compareTo ^java.time.OffsetTime this12750 G__12751) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetTime") G__12751)) (clojure.core/let [G__12751 ^"java.time.OffsetTime" G__12751] (.compareTo ^java.time.OffsetTime this12750 G__12751)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__12751)) (clojure.core/let [G__12751 ^"java.lang.Object" G__12751] (.compareTo ^java.time.OffsetTime this12750 G__12751)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.OffsetTime [^java.time.Instant java-time-Instant12752 ^java.time.ZoneId java-time-ZoneId12753] (. java.time.OffsetTime ofInstant java-time-Instant12752 java-time-ZoneId12753)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetTime" "long"]))} (^java.time.OffsetTime [^java.time.OffsetTime this12754 ^long long12755] (.plusSeconds this12754 long12755)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.OffsetTime this12756 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12757] (.get this12756 java-time-temporal-TemporalField12757)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.OffsetTime this12758 ^java.lang.Object java-lang-Object12759] (.equals this12758 java-lang-Object12759)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.OffsetTime this12760 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter12761] (.format this12760 java-time-format-DateTimeFormatter12761)))
