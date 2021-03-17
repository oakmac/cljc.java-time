(ns cljc.java-time.local-time (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness]) (:import [java.time LocalTime]))
(def max java.time.LocalTime/MAX)
(def noon java.time.LocalTime/NOON)
(def midnight java.time.LocalTime/MIDNIGHT)
(def min java.time.LocalTime/MIN)
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4676 ^long long4677] (.minusMinutes this4676 long4677)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"]))} (^java.time.LocalTime [^java.time.LocalTime this4678 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit4679] (.truncatedTo this4678 java-time-temporal-TemporalUnit4679)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalTime this4680 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4681] (.range this4680 java-time-temporal-TemporalField4681)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4682] (.getHour this4682)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetTime [^java.time.LocalTime this4683 ^java.time.ZoneOffset java-time-ZoneOffset4684] (.atOffset this4683 java-time-ZoneOffset4684)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4685 ^long long4686] (.minusHours this4685 long4686)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int" "int"] ["int" "int"] ["int" "int" "int"]))} (^java.time.LocalTime [^java.lang.Integer int4687 ^java.lang.Integer int4688 ^java.lang.Integer int4689 ^java.lang.Integer int4690] (java.time.LocalTime/of int4687 int4688 int4689 int4690)) (^java.time.LocalTime [^java.lang.Integer int4691 ^java.lang.Integer int4692] (java.time.LocalTime/of int4691 int4692)) (^java.time.LocalTime [^java.lang.Integer int4693 ^java.lang.Integer int4694 ^java.lang.Integer int4695] (java.time.LocalTime/of int4693 int4694 int4695)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4696] (.getNano this4696)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4697 ^long long4698] (.minusSeconds this4697 long4698)))
(clojure.core/defn get-second {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4699] (.getSecond this4699)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4700 ^long long4701] (.plusNanos this4700 long4701)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"]))} (^java.time.LocalTime [^java.time.LocalTime this4702 ^long long4703 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit4704] (.plus this4702 long4703 java-time-temporal-TemporalUnit4704)) (^java.time.LocalTime [^java.time.LocalTime this4705 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount4706] (.plus this4705 java-time-temporal-TemporalAmount4706)))
(clojure.core/defn with-hour {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4707 ^java.lang.Integer int4708] (.withHour this4707 int4708)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4709 ^java.lang.Integer int4710] (.withMinute this4709 int4710)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4711 ^long long4712] (.plusMinutes this4711 long4712)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalTime this4713 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery4714] (.query this4713 java-time-temporal-TemporalQuery4714)))
(clojure.core/defn at-date {:arglists (quote (["java.time.LocalTime" "java.time.LocalDate"]))} (^java.time.LocalDateTime [^java.time.LocalTime this4715 ^java.time.LocalDate java-time-LocalDate4716] (.atDate this4715 java-time-LocalDate4716)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.String [^java.time.LocalTime this4717] (.toString this4717)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this4718 ^java.time.LocalTime java-time-LocalTime4719] (.isBefore this4718 java-time-LocalTime4719)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalAmount"]))} (^java.time.LocalTime [^java.time.LocalTime this4720 ^long long4721 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit4722] (.minus this4720 long4721 java-time-temporal-TemporalUnit4722)) (^java.time.LocalTime [^java.time.LocalTime this4723 ^java.time.temporal.TemporalAmount java-time-temporal-TemporalAmount4724] (.minus this4723 java-time-temporal-TemporalAmount4724)))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4725 ^long long4726] (.plusHours this4725 long4726)))
(clojure.core/defn to-second-of-day {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4727] (.toSecondOfDay this4727)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalTime this4728 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4729] (.getLong this4728 java-time-temporal-TemporalField4729)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4730 ^java.lang.Integer int4731] (.withNano this4730 int4731)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.LocalTime this4732 ^java.time.temporal.Temporal java-time-temporal-Temporal4733 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit4734] (.until this4732 java-time-temporal-Temporal4733 java-time-temporal-TemporalUnit4734)))
(clojure.core/defn of-nano-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long4735] (java.time.LocalTime/ofNanoOfDay long4735)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor4736] (java.time.LocalTime/from java-time-temporal-TemporalAccessor4736)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Boolean [^java.time.LocalTime this4737 ^java.time.LocalTime java-time-LocalTime4738] (.isAfter this4737 java-time-LocalTime4738)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4739 ^long long4740] (.minusNanos this4739 long4740)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalUnit"] ["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this4741 G__4742] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalUnit G__4742)) (clojure.core/let [G__4742 ^"java.time.temporal.TemporalUnit" G__4742] (.isSupported ^java.time.LocalTime this4741 G__4742)) (clojure.core/and (clojure.core/instance? java.time.temporal.TemporalField G__4742)) (clojure.core/let [G__4742 ^"java.time.temporal.TemporalField" G__4742] (.isSupported ^java.time.LocalTime this4741 G__4742)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence4743] (java.time.LocalTime/parse java-lang-CharSequence4743)) (^java.time.LocalTime [^java.lang.CharSequence java-lang-CharSequence4744 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter4745] (java.time.LocalTime/parse java-lang-CharSequence4744 java-time-format-DateTimeFormatter4745)))
(clojure.core/defn with-second {:arglists (quote (["java.time.LocalTime" "int"]))} (^java.time.LocalTime [^java.time.LocalTime this4746 ^java.lang.Integer int4747] (.withSecond this4746 int4747)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4748] (.getMinute this4748)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4749] (.hashCode this4749)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalTime this4750 ^java.time.temporal.Temporal java-time-temporal-Temporal4751] (.adjustInto this4750 java-time-temporal-Temporal4751)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalTime" "java.time.temporal.TemporalAdjuster"]))} (^java.time.LocalTime [^java.time.LocalTime this4752 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4753 ^long long4754] (.with this4752 java-time-temporal-TemporalField4753 long4754)) (^java.time.LocalTime [^java.time.LocalTime this4755 ^java.time.temporal.TemporalAdjuster java-time-temporal-TemporalAdjuster4756] (.with this4755 java-time-temporal-TemporalAdjuster4756)))
(clojure.core/defn now {:arglists (quote ([] ["java.time.ZoneId"] ["java.time.Clock"]))} (^java.time.LocalTime [] (java.time.LocalTime/now)) (^java.time.LocalTime [G__4758] (clojure.core/cond (clojure.core/and (clojure.core/instance? java.time.ZoneId G__4758)) (clojure.core/let [G__4758 ^"java.time.ZoneId" G__4758] (java.time.LocalTime/now G__4758)) (clojure.core/and (clojure.core/instance? java.time.Clock G__4758)) (clojure.core/let [G__4758 ^"java.time.Clock" G__4758] (java.time.LocalTime/now G__4758)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalTime" "java.time.LocalTime"]))} (^java.lang.Integer [^java.time.LocalTime this4759 ^java.time.LocalTime java-time-LocalTime4760] (.compareTo this4759 java-time-LocalTime4760)))
(clojure.core/defn to-nano-of-day {:arglists (quote (["java.time.LocalTime"]))} (^long [^java.time.LocalTime this4761] (.toNanoOfDay this4761)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.LocalTime" "long"]))} (^java.time.LocalTime [^java.time.LocalTime this4762 ^long long4763] (.plusSeconds this4762 long4763)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalTime this4764 ^java.time.temporal.TemporalField java-time-temporal-TemporalField4765] (.get this4764 java-time-temporal-TemporalField4765)))
(clojure.core/defn of-second-of-day {:arglists (quote (["long"]))} (^java.time.LocalTime [^long long4766] (java.time.LocalTime/ofSecondOfDay long4766)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalTime this4767 ^java.lang.Object java-lang-Object4768] (.equals this4767 java-lang-Object4768)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalTime this4769 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter4770] (.format this4769 java-time-format-DateTimeFormatter4770)))
