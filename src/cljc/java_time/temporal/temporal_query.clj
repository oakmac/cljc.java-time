(ns cljc.java-time.temporal.temporal-query (:refer-clojure :exclude [get range format min max next name resolve]) (:import [java.time.temporal TemporalQuery]))
(clojure.core/defn query-from {:arglists (quote (["java.time.temporal.TemporalQuery" "java.time.temporal.TemporalAccessor"]))} (^java.lang.Object [^java.time.temporal.TemporalQuery this7509 ^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor7510] (.queryFrom this7509 java-time-temporal-TemporalAccessor7510)))
