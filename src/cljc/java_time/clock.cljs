(ns cljc.java-time.clock (:refer-clojure :exclude [get range format min max next name resolve short]) (:require [cljc.java-time.extn.calendar-awareness] [java.time :refer [Clock]]))
(clojure.core/defn tick {:arglists (quote (["java.time.Clock" "java.time.Duration"]))} (^js/JSJoda.Clock [^js/JSJoda.Clock java-time-Clock5490 ^js/JSJoda.Duration java-time-Duration5491] (js-invoke java.time.Clock "tick" java-time-Clock5490 java-time-Duration5491)))
(clojure.core/defn offset {:arglists (quote (["java.time.Clock" "java.time.Duration"]))} (^js/JSJoda.Clock [^js/JSJoda.Clock java-time-Clock5492 ^js/JSJoda.Duration java-time-Duration5493] (js-invoke java.time.Clock "offset" java-time-Clock5492 java-time-Duration5493)))
(clojure.core/defn system-utc {:arglists (quote ([]))} (^js/JSJoda.Clock [] (js-invoke java.time.Clock "systemUTC")))
(clojure.core/defn system-default-zone {:arglists (quote ([]))} (^js/JSJoda.Clock [] (js-invoke java.time.Clock "systemDefaultZone")))
(clojure.core/defn fixed {:arglists (quote (["java.time.Instant" "java.time.ZoneId"]))} (^js/JSJoda.Clock [^js/JSJoda.Instant java-time-Instant5494 ^js/JSJoda.ZoneId java-time-ZoneId5495] (js-invoke java.time.Clock "fixed" java-time-Instant5494 java-time-ZoneId5495)))
(clojure.core/defn tick-minutes {:arglists (quote (["java.time.ZoneId"]))} (^js/JSJoda.Clock [^js/JSJoda.ZoneId java-time-ZoneId5496] (js-invoke java.time.Clock "tickMinutes" java-time-ZoneId5496)))
(clojure.core/defn tick-seconds {:arglists (quote (["java.time.ZoneId"]))} (^js/JSJoda.Clock [^js/JSJoda.ZoneId java-time-ZoneId5497] (js-invoke java.time.Clock "tickSeconds" java-time-ZoneId5497)))
(clojure.core/defn millis {:arglists (quote (["java.time.Clock"]))} (^long [^js/JSJoda.Clock this5498] (.millis this5498)))
(clojure.core/defn with-zone {:arglists (quote (["java.time.Clock" "java.time.ZoneId"]))} (^js/JSJoda.Clock [^js/JSJoda.Clock this5499 ^js/JSJoda.ZoneId java-time-ZoneId5500] (.withZone this5499 java-time-ZoneId5500)))
(clojure.core/defn get-zone {:arglists (quote (["java.time.Clock"]))} (^js/JSJoda.ZoneId [^js/JSJoda.Clock this5501] (.zone this5501)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.Clock"]))} (^int [^js/JSJoda.Clock this5502] (.hashCode this5502)))
(clojure.core/defn system {:arglists (quote (["java.time.ZoneId"]))} (^js/JSJoda.Clock [^js/JSJoda.ZoneId java-time-ZoneId5503] (js-invoke java.time.Clock "system" java-time-ZoneId5503)))
(clojure.core/defn instant {:arglists (quote (["java.time.Clock"]))} (^js/JSJoda.Instant [^js/JSJoda.Clock this5504] (.instant this5504)))
(clojure.core/defn equals {:arglists (quote (["java.time.Clock" "java.lang.Object"]))} (^boolean [^js/JSJoda.Clock this5505 ^java.lang.Object java-lang-Object5506] (.equals this5505 java-lang-Object5506)))
