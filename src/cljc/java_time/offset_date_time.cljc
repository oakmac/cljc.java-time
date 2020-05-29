(ns cljc.java-time.offset-date-time (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [OffsetDateTime]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time OffsetDateTime])))
(def min #? (:clj java.time.OffsetDateTime/MIN :cljs (. java.time.OffsetDateTime -MIN)))
(def max #? (:clj java.time.OffsetDateTime/MAX :cljs (. java.time.OffsetDateTime -MAX)))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12830 ^long long12831] (.minusMinutes this12830 long12831)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12832 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit12833] (.truncatedTo this12832 java-time-temporal-TemporalUnit12833)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12834 ^long long12835] (.minusWeeks this12834 long12835)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.Instant [^java.time.OffsetDateTime this12836] (.toInstant this12836)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12837 ^long long12838] (.plusWeeks this12837 long12838)))
(clojure.core/defn range {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.OffsetDateTime this12839 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12840] (.range this12839 java-time-temporal-TemporalField12840)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12841] (jti/getter hour this12841)))
(clojure.core/defn at-zone-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this12842 ^java.time.ZoneId java-time-ZoneId12843] (.atZoneSameInstant this12842 java-time-ZoneId12843)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12844 ^long long12845] (.minusHours this12844 long12845)))
(clojure.core/defn of {:arglists (quote (["int" "int" "int" "int" "int" "int" "int" "java.time.ZoneOffset"] ["java.time.LocalDateTime" "java.time.ZoneOffset"] ["java.time.LocalDate" "java.time.LocalTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.lang.Integer int12846 ^java.lang.Integer int12847 ^java.lang.Integer int12848 ^java.lang.Integer int12849 ^java.lang.Integer int12850 ^java.lang.Integer int12851 ^java.lang.Integer int12852 ^java.time.ZoneOffset java-time-ZoneOffset12853] (. java.time.OffsetDateTime of int12846 int12847 int12848 int12849 int12850 int12851 int12852 java-time-ZoneOffset12853)) (^java.time.OffsetDateTime [^java.time.LocalDateTime java-time-LocalDateTime12854 ^java.time.ZoneOffset java-time-ZoneOffset12855] (. java.time.OffsetDateTime of java-time-LocalDateTime12854 java-time-ZoneOffset12855)) (^java.time.OffsetDateTime [^java.time.LocalDate java-time-LocalDate12856 ^java.time.LocalTime java-time-LocalTime12857 ^java.time.ZoneOffset java-time-ZoneOffset12858] (. java.time.OffsetDateTime of java-time-LocalDate12856 java-time-LocalTime12857 java-time-ZoneOffset12858)))
(clojure.core/defn with-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12859 ^java.lang.Integer int12860] (.withMonth this12859 int12860)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this12861 ^java.time.OffsetDateTime java-time-OffsetDateTime12862] (.isEqual this12861 java-time-OffsetDateTime12862)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12863] (jti/getter nano this12863)))
(clojure.core/defn to-offset-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.OffsetTime [^java.time.OffsetDateTime this12864] (.toOffsetTime this12864)))
(clojure.core/defn at-zone-similar-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneId"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this12865 ^java.time.ZoneId java-time-ZoneId12866] (.atZoneSimilarLocal this12865 java-time-ZoneId12866)))
(clojure.core/defn get-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12867] (jti/getter year this12867)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12868 ^long long12869] (.minusSeconds this12868 long12869)))
(clojure.core/defn get-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12870] (jti/getter second this12870)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12871 ^long long12872] (.plusNanos this12871 long12872)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12873] (jti/getter dayOfYear this12873)))
(clojure.core/defn plus {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this12874 G__12875] #? (:cljs (.plus ^java.time.OffsetDateTime this12874 G__12875) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12875)) (clojure.core/let [G__12875 ^"java.time.temporal.TemporalAmount" G__12875] (.plus ^java.time.OffsetDateTime this12874 G__12875)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12875)) (clojure.core/let [G__12875 ^"java.time.temporal.TemporalAmount" G__12875] (.plus ^java.time.OffsetDateTime this12874 G__12875)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this12876 G__12877 G__12878] #? (:cljs (.plus ^java.time.OffsetDateTime this12876 G__12877 G__12878) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12877) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12878)) (clojure.core/let [G__12877 (clojure.core/long G__12877) G__12878 ^"java.time.temporal.TemporalUnit" G__12878] (.plus ^java.time.OffsetDateTime this12876 G__12877 G__12878)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12877) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12878)) (clojure.core/let [G__12877 (clojure.core/long G__12877) G__12878 ^"java.time.temporal.TemporalUnit" G__12878] (.plus ^java.time.OffsetDateTime this12876 G__12877 G__12878)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn time-line-order {:arglists (quote ([]))} (^java.util.Comparator [] (. java.time.OffsetDateTime timeLineOrder)))
(clojure.core/defn with-hour {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12879 ^java.lang.Integer int12880] (.withHour this12879 int12880)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12881 ^java.lang.Integer int12882] (.withMinute this12881 int12882)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12883 ^long long12884] (.plusMinutes this12883 long12884)))
(clojure.core/defn query {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.OffsetDateTime this12885 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery12886] (.query this12885 java-time-temporal-TemporalQuery12886)))
(clojure.core/defn with-offset-same-instant {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12887 ^java.time.ZoneOffset java-time-ZoneOffset12888] (.withOffsetSameInstant this12887 java-time-ZoneOffset12888)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.DayOfWeek [^java.time.OffsetDateTime this12889] (jti/getter dayOfWeek this12889)))
(clojure.core/defn to-string {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.String [^java.time.OffsetDateTime this12890] (.toString this12890)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12891 ^long long12892] (.plusMonths this12891 long12892)))
(clojure.core/defn is-before {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this12893 ^java.time.OffsetDateTime java-time-OffsetDateTime12894] (.isBefore this12893 java-time-OffsetDateTime12894)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12895 ^long long12896] (.minusMonths this12895 long12896)))
(clojure.core/defn minus {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this12897 G__12898] #? (:cljs (.minus ^java.time.OffsetDateTime this12897 G__12898) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12898)) (clojure.core/let [G__12898 ^"java.time.temporal.TemporalAmount" G__12898] (.minus ^java.time.OffsetDateTime this12897 G__12898)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__12898)) (clojure.core/let [G__12898 ^"java.time.temporal.TemporalAmount" G__12898] (.minus ^java.time.OffsetDateTime this12897 G__12898)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this12899 G__12900 G__12901] #? (:cljs (.minus ^java.time.OffsetDateTime this12899 G__12900 G__12901) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12900) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12901)) (clojure.core/let [G__12900 (clojure.core/long G__12900) G__12901 ^"java.time.temporal.TemporalUnit" G__12901] (.minus ^java.time.OffsetDateTime this12899 G__12900 G__12901)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12900) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12901)) (clojure.core/let [G__12900 (clojure.core/long G__12900) G__12901 ^"java.time.temporal.TemporalUnit" G__12901] (.minus ^java.time.OffsetDateTime this12899 G__12900 G__12901)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12902 ^long long12903] (.plusHours this12902 long12903)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12904 ^long long12905] (.plusDays this12904 long12905)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalTime [^java.time.OffsetDateTime this12906] (.toLocalTime this12906)))
(clojure.core/defn get-long {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.OffsetDateTime this12907 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12908] (.getLong this12907 java-time-temporal-TemporalField12908)))
(clojure.core/defn get-offset {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.ZoneOffset [^java.time.OffsetDateTime this12909] (jti/getter offset this12909)))
(clojure.core/defn to-zoned-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.ZonedDateTime [^java.time.OffsetDateTime this12910] (.toZonedDateTime this12910)))
(clojure.core/defn with-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12911 ^java.lang.Integer int12912] (.withYear this12911 int12912)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12913 ^java.lang.Integer int12914] (.withNano this12913 int12914)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.OffsetDateTime"]))} (^long [^java.time.OffsetDateTime this12915] (.toEpochSecond this12915)))
(clojure.core/defn until {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.OffsetDateTime this12916 ^java.time.temporal.Temporal java-time-temporal-Temporal12917 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit12918] (.until this12916 java-time-temporal-Temporal12917 java-time-temporal-TemporalUnit12918)))
(clojure.core/defn with-offset-same-local {:arglists (quote (["java.time.OffsetDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12919 ^java.time.ZoneOffset java-time-ZoneOffset12920] (.withOffsetSameLocal this12919 java-time-ZoneOffset12920)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12921 ^java.lang.Integer int12922] (.withDayOfMonth this12921 int12922)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12923] (jti/getter dayOfMonth this12923)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.OffsetDateTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor12924] (. java.time.OffsetDateTime from java-time-temporal-TemporalAccessor12924)))
(clojure.core/defn is-after {:arglists (quote (["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this12925 ^java.time.OffsetDateTime java-time-OffsetDateTime12926] (.isAfter this12925 java-time-OffsetDateTime12926)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12927 ^long long12928] (.minusNanos this12927 long12928)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalUnit"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this12929 G__12930] #? (:cljs (.isSupported ^java.time.OffsetDateTime this12929 G__12930) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__12930)) (clojure.core/let [G__12930 ^"java.time.temporal.TemporalUnit" G__12930] (.isSupported ^java.time.OffsetDateTime this12929 G__12930)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12930)) (clojure.core/let [G__12930 ^"java.time.temporal.TemporalField" G__12930] (.isSupported ^java.time.OffsetDateTime this12929 G__12930)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12931 ^long long12932] (.minusYears this12931 long12932)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence12933 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter12934] (. java.time.OffsetDateTime parse java-lang-CharSequence12933 java-time-format-DateTimeFormatter12934)) (^java.time.OffsetDateTime [^java.lang.CharSequence java-lang-CharSequence12935] (. java.time.OffsetDateTime parse java-lang-CharSequence12935)))
(clojure.core/defn with-second {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12936 ^java.lang.Integer int12937] (.withSecond this12936 int12937)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalDate [^java.time.OffsetDateTime this12938] (.toLocalDate this12938)))
(clojure.core/defn get-minute {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12939] (jti/getter minute this12939)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12940] (.hashCode this12940)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.OffsetDateTime this12941 ^java.time.temporal.Temporal java-time-temporal-Temporal12942] (.adjustInto this12941 java-time-temporal-Temporal12942)))
(clojure.core/defn with {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.OffsetDateTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this12943 G__12944 G__12945] #? (:cljs (.with ^java.time.OffsetDateTime this12943 G__12944 G__12945) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12944) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12945)) (clojure.core/let [G__12944 ^"java.time.temporal.TemporalField" G__12944 G__12945 (clojure.core/long G__12945)] (.with ^java.time.OffsetDateTime this12943 G__12944 G__12945)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__12944) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__12945)) (clojure.core/let [G__12944 ^"java.time.temporal.TemporalField" G__12944 G__12945 (clojure.core/long G__12945)] (.with ^java.time.OffsetDateTime this12943 G__12944 G__12945)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this12946 G__12947] #? (:cljs (.with ^java.time.OffsetDateTime this12946 G__12947) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__12947)) (clojure.core/let [G__12947 ^"java.time.temporal.TemporalAdjuster" G__12947] (.with ^java.time.OffsetDateTime this12946 G__12947)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__12947)) (clojure.core/let [G__12947 ^"java.time.temporal.TemporalAdjuster" G__12947] (.with ^java.time.OffsetDateTime this12946 G__12947)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote (["java.time.Clock"] ["java.time.ZoneId"] []))} (^java.time.OffsetDateTime [G__12949] #? (:cljs (. java.time.OffsetDateTime now G__12949) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__12949)) (clojure.core/let [G__12949 ^"java.time.Clock" G__12949] (. java.time.OffsetDateTime now G__12949)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__12949)) (clojure.core/let [G__12949 ^"java.time.ZoneId" G__12949] (. java.time.OffsetDateTime now G__12949)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.OffsetDateTime [] (. java.time.OffsetDateTime now)))
(clojure.core/defn to-local-date-time {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.LocalDateTime [^java.time.OffsetDateTime this12950] (.toLocalDateTime this12950)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12951] (jti/getter monthValue this12951)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.OffsetDateTime" "int"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12952 ^java.lang.Integer int12953] (.withDayOfYear this12952 int12953)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"] ["java.time.OffsetDateTime" "java.time.OffsetDateTime"]))} (^java.lang.Integer [this12954 G__12955] #? (:cljs (.compareTo ^java.time.OffsetDateTime this12954 G__12955) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__12955)) (clojure.core/let [G__12955 ^"java.lang.Object" G__12955] (.compareTo ^java.time.OffsetDateTime this12954 G__12955)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetDateTime") G__12955)) (clojure.core/let [G__12955 ^"java.time.OffsetDateTime" G__12955] (.compareTo ^java.time.OffsetDateTime this12954 G__12955)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month {:arglists (quote (["java.time.OffsetDateTime"]))} (^java.time.Month [^java.time.OffsetDateTime this12956] (jti/getter month this12956)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.OffsetDateTime [^java.time.Instant java-time-Instant12957 ^java.time.ZoneId java-time-ZoneId12958] (. java.time.OffsetDateTime ofInstant java-time-Instant12957 java-time-ZoneId12958)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12959 ^long long12960] (.plusSeconds this12959 long12960)))
(clojure.core/defn get {:arglists (quote (["java.time.OffsetDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.OffsetDateTime this12961 ^java.time.temporal.TemporalField java-time-temporal-TemporalField12962] (.get this12961 java-time-temporal-TemporalField12962)))
(clojure.core/defn equals {:arglists (quote (["java.time.OffsetDateTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.OffsetDateTime this12963 ^java.lang.Object java-lang-Object12964] (.equals this12963 java-lang-Object12964)))
(clojure.core/defn format {:arglists (quote (["java.time.OffsetDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.OffsetDateTime this12965 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter12966] (.format this12965 java-time-format-DateTimeFormatter12966)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12967 ^long long12968] (.plusYears this12967 long12968)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.OffsetDateTime" "long"]))} (^java.time.OffsetDateTime [^java.time.OffsetDateTime this12969 ^long long12970] (.minusDays this12969 long12970)))
