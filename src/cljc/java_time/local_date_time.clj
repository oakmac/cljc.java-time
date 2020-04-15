(ns cljc.java-time.local-date-time (:refer-clojure :exclude [get range format min max next name resolve]) (:import [java.time LocalDateTime]))
(def max (. java.time.LocalDateTime -MAX))
(def min (. java.time.LocalDateTime -MIN))
(clojure.core/defn minus-minutes {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6284 ^long long6285] (.minusMinutes this6284 long6285)))
(clojure.core/defn truncated-to {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6286 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit6287] (.truncatedTo this6286 java-time-temporal-TemporalUnit6287)))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6288 ^long long6289] (.minusWeeks this6288 long6289)))
(clojure.core/defn to-instant {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^java.time.Instant [^java.time.LocalDateTime this6290 ^java.time.ZoneOffset java-time-ZoneOffset6291] (.toInstant this6290 java-time-ZoneOffset6291)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6292 ^long long6293] (.plusWeeks this6292 long6293)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalDateTime this6294 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6295] (.range this6294 java-time-temporal-TemporalField6295)))
(clojure.core/defn of-epoch-second {:arglists (quote (["long" "int" "java.time.ZoneOffset"]))} (^java.time.LocalDateTime [^long long6296 ^java.lang.Integer int6297 ^java.time.ZoneOffset java-time-ZoneOffset6298] (. java.time.LocalDateTime ofEpochSecond long6296 int6297 java-time-ZoneOffset6298)))
(clojure.core/defn get-hour {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6299] (.getHour this6299)))
(clojure.core/defn at-offset {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^java.time.OffsetDateTime [^java.time.LocalDateTime this6300 ^java.time.ZoneOffset java-time-ZoneOffset6301] (.atOffset this6300 java-time-ZoneOffset6301)))
(clojure.core/defn minus-hours {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6302 ^long long6303] (.minusHours this6302 long6303)))
(clojure.core/defn of {:arglists (quote (["int" "java.time.Month" "int" "int" "int"] ["int" "int" "int" "int" "int" "int" "int"] ["java.time.LocalDate" "java.time.LocalTime"] ["int" "int" "int" "int" "int" "int"] ["int" "int" "int" "int" "int"] ["int" "java.time.Month" "int" "int" "int" "int"] ["int" "java.time.Month" "int" "int" "int" "int" "int"]))} (^java.time.LocalDateTime [G__6305 G__6306 G__6307 G__6308 G__6309] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6305) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__6306) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6307) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6308) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6309)) (clojure.core/let [G__6305 (clojure.core/int G__6305) G__6306 ^"java.time.Month" G__6306 G__6307 (clojure.core/int G__6307) G__6308 (clojure.core/int G__6308) G__6309 (clojure.core/int G__6309)] (. java.time.LocalDateTime of G__6305 G__6306 G__6307 G__6308 G__6309)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6305) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6306) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6307) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6308) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6309)) (clojure.core/let [G__6305 (clojure.core/int G__6305) G__6306 (clojure.core/int G__6306) G__6307 (clojure.core/int G__6307) G__6308 (clojure.core/int G__6308) G__6309 (clojure.core/int G__6309)] (. java.time.LocalDateTime of G__6305 G__6306 G__6307 G__6308 G__6309)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.LocalDateTime [G__6311 G__6312 G__6313 G__6314 G__6315 G__6316 G__6317] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6311) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6312) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6313) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6314) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6315) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6316) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6317)) (clojure.core/let [G__6311 (clojure.core/int G__6311) G__6312 (clojure.core/int G__6312) G__6313 (clojure.core/int G__6313) G__6314 (clojure.core/int G__6314) G__6315 (clojure.core/int G__6315) G__6316 (clojure.core/int G__6316) G__6317 (clojure.core/int G__6317)] (. java.time.LocalDateTime of G__6311 G__6312 G__6313 G__6314 G__6315 G__6316 G__6317)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6311) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__6312) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6313) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6314) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6315) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6316) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6317)) (clojure.core/let [G__6311 (clojure.core/int G__6311) G__6312 ^"java.time.Month" G__6312 G__6313 (clojure.core/int G__6313) G__6314 (clojure.core/int G__6314) G__6315 (clojure.core/int G__6315) G__6316 (clojure.core/int G__6316) G__6317 (clojure.core/int G__6317)] (. java.time.LocalDateTime of G__6311 G__6312 G__6313 G__6314 G__6315 G__6316 G__6317)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.LocalDateTime [^java.time.LocalDate java-time-LocalDate6318 ^java.time.LocalTime java-time-LocalTime6319] (. java.time.LocalDateTime of java-time-LocalDate6318 java-time-LocalTime6319)) (^java.time.LocalDateTime [G__6321 G__6322 G__6323 G__6324 G__6325 G__6326] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6321) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6322) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6323) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6324) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6325) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6326)) (clojure.core/let [G__6321 (clojure.core/int G__6321) G__6322 (clojure.core/int G__6322) G__6323 (clojure.core/int G__6323) G__6324 (clojure.core/int G__6324) G__6325 (clojure.core/int G__6325) G__6326 (clojure.core/int G__6326)] (. java.time.LocalDateTime of G__6321 G__6322 G__6323 G__6324 G__6325 G__6326)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6321) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__6322) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6323) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6324) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6325) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__6326)) (clojure.core/let [G__6321 (clojure.core/int G__6321) G__6322 ^"java.time.Month" G__6322 G__6323 (clojure.core/int G__6323) G__6324 (clojure.core/int G__6324) G__6325 (clojure.core/int G__6325) G__6326 (clojure.core/int G__6326)] (. java.time.LocalDateTime of G__6321 G__6322 G__6323 G__6324 G__6325 G__6326)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-month {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6327 ^java.lang.Integer int6328] (.withMonth this6327 int6328)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Boolean [^java.time.LocalDateTime this6329 ^java.time.chrono.ChronoLocalDateTime java-time-chrono-ChronoLocalDateTime6330] (.isEqual this6329 java-time-chrono-ChronoLocalDateTime6330)))
(clojure.core/defn get-nano {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6331] (.getNano this6331)))
(clojure.core/defn get-year {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6332] (.getYear this6332)))
(clojure.core/defn minus-seconds {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6333 ^long long6334] (.minusSeconds this6333 long6334)))
(clojure.core/defn get-second {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6335] (.getSecond this6335)))
(clojure.core/defn plus-nanos {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6336 ^long long6337] (.plusNanos this6336 long6337)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6338] (.getDayOfYear this6338)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this6339 G__6340 G__6341] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6340) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6341)) (clojure.core/let [G__6340 (clojure.core/long G__6340) G__6341 ^"java.time.temporal.TemporalUnit" G__6341] (.plus ^java.time.LocalDateTime this6339 G__6340 G__6341)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6340) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6341)) (clojure.core/let [G__6340 (clojure.core/long G__6340) G__6341 ^"java.time.temporal.TemporalUnit" G__6341] (.plus ^java.time.LocalDateTime this6339 G__6340 G__6341)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6340) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6341)) (clojure.core/let [G__6340 (clojure.core/long G__6340) G__6341 ^"java.time.temporal.TemporalUnit" G__6341] (.plus ^java.time.LocalDateTime this6339 G__6340 G__6341)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this6342 G__6343] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__6343)) (clojure.core/let [G__6343 ^"java.time.temporal.TemporalAmount" G__6343] (.plus ^java.time.LocalDateTime this6342 G__6343)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__6343)) (clojure.core/let [G__6343 ^"java.time.temporal.TemporalAmount" G__6343] (.plus ^java.time.LocalDateTime this6342 G__6343)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__6343)) (clojure.core/let [G__6343 ^"java.time.temporal.TemporalAmount" G__6343] (.plus ^java.time.LocalDateTime this6342 G__6343)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn with-hour {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6344 ^java.lang.Integer int6345] (.withHour this6344 int6345)))
(clojure.core/defn with-minute {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6346 ^java.lang.Integer int6347] (.withMinute this6346 int6347)))
(clojure.core/defn plus-minutes {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6348 ^long long6349] (.plusMinutes this6348 long6349)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalDateTime this6350 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery6351] (.query this6350 java-time-temporal-TemporalQuery6351)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.DayOfWeek [^java.time.LocalDateTime this6352] (.getDayOfWeek this6352)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.String [^java.time.LocalDateTime this6353] (.toString this6353)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6354 ^long long6355] (.plusMonths this6354 long6355)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Boolean [^java.time.LocalDateTime this6356 ^java.time.chrono.ChronoLocalDateTime java-time-chrono-ChronoLocalDateTime6357] (.isBefore this6356 java-time-chrono-ChronoLocalDateTime6357)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6358 ^long long6359] (.minusMonths this6358 long6359)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"] ["java.time.LocalDateTime" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this6360 G__6361 G__6362] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6361) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6362)) (clojure.core/let [G__6361 (clojure.core/long G__6361) G__6362 ^"java.time.temporal.TemporalUnit" G__6362] (.minus ^java.time.LocalDateTime this6360 G__6361 G__6362)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6361) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6362)) (clojure.core/let [G__6361 (clojure.core/long G__6361) G__6362 ^"java.time.temporal.TemporalUnit" G__6362] (.minus ^java.time.LocalDateTime this6360 G__6361 G__6362)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6361) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6362)) (clojure.core/let [G__6361 (clojure.core/long G__6361) G__6362 ^"java.time.temporal.TemporalUnit" G__6362] (.minus ^java.time.LocalDateTime this6360 G__6361 G__6362)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this6363 G__6364] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__6364)) (clojure.core/let [G__6364 ^"java.time.temporal.TemporalAmount" G__6364] (.minus ^java.time.LocalDateTime this6363 G__6364)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__6364)) (clojure.core/let [G__6364 ^"java.time.temporal.TemporalAmount" G__6364] (.minus ^java.time.LocalDateTime this6363 G__6364)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__6364)) (clojure.core/let [G__6364 ^"java.time.temporal.TemporalAmount" G__6364] (.minus ^java.time.LocalDateTime this6363 G__6364)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn at-zone {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneId"] ["java.time.LocalDateTime" "java.time.ZoneId"]))} (^java.lang.Object [this6365 G__6366] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__6366)) (clojure.core/let [G__6366 ^"java.time.ZoneId" G__6366] (.atZone ^java.time.LocalDateTime this6365 G__6366)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__6366)) (clojure.core/let [G__6366 ^"java.time.ZoneId" G__6366] (.atZone ^java.time.LocalDateTime this6365 G__6366)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn plus-hours {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6367 ^long long6368] (.plusHours this6367 long6368)))
(clojure.core/defn plus-days {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6369 ^long long6370] (.plusDays this6369 long6370)))
(clojure.core/defn to-local-time {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.LocalTime [^java.time.LocalDateTime this6371] (.toLocalTime this6371)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalDateTime this6372 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6373] (.getLong this6372 java-time-temporal-TemporalField6373)))
(clojure.core/defn with-year {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6374 ^java.lang.Integer int6375] (.withYear this6374 int6375)))
(clojure.core/defn with-nano {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6376 ^java.lang.Integer int6377] (.withNano this6376 int6377)))
(clojure.core/defn to-epoch-second {:arglists (quote (["java.time.LocalDateTime" "java.time.ZoneOffset"]))} (^long [^java.time.LocalDateTime this6378 ^java.time.ZoneOffset java-time-ZoneOffset6379] (.toEpochSecond this6378 java-time-ZoneOffset6379)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"]))} (^long [^java.time.LocalDateTime this6380 ^java.time.temporal.Temporal java-time-temporal-Temporal6381 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit6382] (.until this6380 java-time-temporal-Temporal6381 java-time-temporal-TemporalUnit6382)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6383 ^java.lang.Integer int6384] (.withDayOfMonth this6383 int6384)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6385] (.getDayOfMonth this6385)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalDateTime [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor6386] (. java.time.LocalDateTime from java-time-temporal-TemporalAccessor6386)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Boolean [^java.time.LocalDateTime this6387 ^java.time.chrono.ChronoLocalDateTime java-time-chrono-ChronoLocalDateTime6388] (.isAfter this6387 java-time-chrono-ChronoLocalDateTime6388)))
(clojure.core/defn minus-nanos {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6389 ^long long6390] (.minusNanos this6389 long6390)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalUnit"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Boolean [this6391 G__6392] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__6392)) (clojure.core/let [G__6392 ^"java.time.temporal.TemporalUnit" G__6392] (.isSupported ^java.time.LocalDateTime this6391 G__6392)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__6392)) (clojure.core/let [G__6392 ^"java.time.temporal.TemporalField" G__6392] (.isSupported ^java.time.LocalDateTime this6391 G__6392)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6393 ^long long6394] (.minusYears this6393 long6394)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.chrono.Chronology [^java.time.LocalDateTime this6395] (.getChronology this6395)))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence"] ["java.lang.CharSequence" "java.time.format.DateTimeFormatter"]))} (^java.time.LocalDateTime [^java.lang.CharSequence java-lang-CharSequence6396] (. java.time.LocalDateTime parse java-lang-CharSequence6396)) (^java.time.LocalDateTime [^java.lang.CharSequence java-lang-CharSequence6397 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter6398] (. java.time.LocalDateTime parse java-lang-CharSequence6397 java-time-format-DateTimeFormatter6398)))
(clojure.core/defn with-second {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6399 ^java.lang.Integer int6400] (.withSecond this6399 int6400)))
(clojure.core/defn to-local-date {:arglists (quote (["java.time.LocalDateTime"] ["java.time.LocalDateTime"]))} (^java.lang.Object [this6401] (clojure.core/cond (clojure.core/and) (clojure.core/let [] (.toLocalDate ^java.time.LocalDateTime this6401)) (clojure.core/and) (clojure.core/let [] (.toLocalDate ^java.time.LocalDateTime this6401)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-minute {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6402] (.getMinute this6402)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6403] (.hashCode this6403)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalDateTime this6404 ^java.time.temporal.Temporal java-time-temporal-Temporal6405] (.adjustInto this6404 java-time-temporal-Temporal6405)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDateTime" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDateTime" "java.time.temporal.TemporalField" "long"]))} (^java.lang.Object [this6406 G__6407 G__6408] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__6407) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6408)) (clojure.core/let [G__6407 ^"java.time.temporal.TemporalField" G__6407 G__6408 (clojure.core/long G__6408)] (.with ^java.time.LocalDateTime this6406 G__6407 G__6408)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__6407) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6408)) (clojure.core/let [G__6407 ^"java.time.temporal.TemporalField" G__6407 G__6408 (clojure.core/long G__6408)] (.with ^java.time.LocalDateTime this6406 G__6407 G__6408)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__6407) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__6408)) (clojure.core/let [G__6407 ^"java.time.temporal.TemporalField" G__6407 G__6408 (clojure.core/long G__6408)] (.with ^java.time.LocalDateTime this6406 G__6407 G__6408)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.lang.Object [this6409 G__6410] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__6410)) (clojure.core/let [G__6410 ^"java.time.temporal.TemporalAdjuster" G__6410] (.with ^java.time.LocalDateTime this6409 G__6410)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__6410)) (clojure.core/let [G__6410 ^"java.time.temporal.TemporalAdjuster" G__6410] (.with ^java.time.LocalDateTime this6409 G__6410)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__6410)) (clojure.core/let [G__6410 ^"java.time.temporal.TemporalAdjuster" G__6410] (.with ^java.time.LocalDateTime this6409 G__6410)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.ZoneId"] ["java.time.Clock"]))} (^java.time.LocalDateTime [] (. java.time.LocalDateTime now)) (^java.time.LocalDateTime [G__6412] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__6412)) (clojure.core/let [G__6412 ^"java.time.ZoneId" G__6412] (. java.time.LocalDateTime now G__6412)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__6412)) (clojure.core/let [G__6412 ^"java.time.Clock" G__6412] (. java.time.LocalDateTime now G__6412)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.LocalDateTime"]))} (^java.lang.Integer [^java.time.LocalDateTime this6413] (.getMonthValue this6413)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.LocalDateTime" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6414 ^java.lang.Integer int6415] (.withDayOfYear this6414 int6415)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"] ["java.time.LocalDateTime" "java.time.chrono.ChronoLocalDateTime"]))} (^java.lang.Integer [this6416 G__6417] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__6417)) (clojure.core/let [G__6417 ^"java.lang.Object" G__6417] (.compareTo ^java.time.LocalDateTime this6416 G__6417)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDateTime") G__6417)) (clojure.core/let [G__6417 ^"java.time.chrono.ChronoLocalDateTime" G__6417] (.compareTo ^java.time.LocalDateTime this6416 G__6417)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn get-month {:arglists (quote (["java.time.LocalDateTime"]))} (^java.time.Month [^java.time.LocalDateTime this6418] (.getMonth this6418)))
(clojure.core/defn of-instant {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^java.time.LocalDateTime [^java.time.Instant java-time-Instant6419 ^java.time.ZoneId java-time-ZoneId6420] (. java.time.LocalDateTime ofInstant java-time-Instant6419 java-time-ZoneId6420)))
(clojure.core/defn plus-seconds {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6421 ^long long6422] (.plusSeconds this6421 long6422)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalDateTime" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalDateTime this6423 ^java.time.temporal.TemporalField java-time-temporal-TemporalField6424] (.get this6423 java-time-temporal-TemporalField6424)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalDateTime" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalDateTime this6425 ^java.lang.Object java-lang-Object6426] (.equals this6425 java-lang-Object6426)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalDateTime" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalDateTime this6427 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter6428] (.format this6427 java-time-format-DateTimeFormatter6428)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6429 ^long long6430] (.plusYears this6429 long6430)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.LocalDateTime" "long"]))} (^java.time.LocalDateTime [^java.time.LocalDateTime this6431 ^long long6432] (.minusDays this6431 long6432)))
