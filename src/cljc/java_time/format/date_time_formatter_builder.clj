(ns cljc.java-time.format.date-time-formatter-builder (:refer-clojure :exclude [get range format min max next name resolve]) (:import [java.time.format DateTimeFormatterBuilder]))
(clojure.core/defn to-formatter {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"] ["java.time.format.DateTimeFormatterBuilder" "java.util.Locale"]))} (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this7620] (.toFormatter this7620)) (^java.time.format.DateTimeFormatter [^java.time.format.DateTimeFormatterBuilder this7621 ^java.util.Locale java-util-Locale7622] (.toFormatter this7621 java-util-Locale7622)))
(clojure.core/defn append-pattern {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7623 ^java.lang.String java-lang-String7624] (.appendPattern this7623 java-lang-String7624)))
(clojure.core/defn append-value {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.format.SignStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7625 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7626 ^java.lang.Integer int7627 ^java.lang.Integer int7628 ^java.time.format.SignStyle java-time-format-SignStyle7629] (.appendValue this7625 java-time-temporal-TemporalField7626 int7627 int7628 java-time-format-SignStyle7629)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7630 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7631 ^java.lang.Integer int7632] (.appendValue this7630 java-time-temporal-TemporalField7631 int7632)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7633 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7634] (.appendValue this7633 java-time-temporal-TemporalField7634)))
(clojure.core/defn append-instant {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"] ["java.time.format.DateTimeFormatterBuilder" "int"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7635] (.appendInstant this7635)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7636 ^java.lang.Integer int7637] (.appendInstant this7636 int7637)))
(clojure.core/defn append-literal {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "char"] ["java.time.format.DateTimeFormatterBuilder" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [this7638 G__7639] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Character") G__7639)) (clojure.core/let [G__7639 ^"java.lang.Character" G__7639] (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this7638 G__7639)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.String") G__7639)) (clojure.core/let [G__7639 ^"java.lang.String" G__7639] (.appendLiteral ^java.time.format.DateTimeFormatterBuilder this7638 G__7639)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn optional-start {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7640] (.optionalStart this7640)))
(clojure.core/defn append-fraction {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "boolean"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7641 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7642 ^java.lang.Integer int7643 ^java.lang.Integer int7644 ^java.lang.Boolean boolean7645] (.appendFraction this7641 java-time-temporal-TemporalField7642 int7643 int7644 boolean7645)))
(clojure.core/defn append-optional {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7646 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter7647] (.appendOptional this7646 java-time-format-DateTimeFormatter7647)))
(clojure.core/defn optional-end {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7648] (.optionalEnd this7648)))
(clojure.core/defn parse-lenient {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7649] (.parseLenient this7649)))
(clojure.core/defn pad-next {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "int" "char"] ["java.time.format.DateTimeFormatterBuilder" "int"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7650 ^java.lang.Integer int7651 ^java.lang.Character char7652] (.padNext this7650 int7651 char7652)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7653 ^java.lang.Integer int7654] (.padNext this7653 int7654)))
(clojure.core/defn append-chronology-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7655] (.appendChronologyId this7655)))
(clojure.core/defn append-zone-or-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7656] (.appendZoneOrOffsetId this7656)))
(clojure.core/defn parse-case-sensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7657] (.parseCaseSensitive this7657)))
(clojure.core/defn parse-strict {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7658] (.parseStrict this7658)))
(clojure.core/defn append-chronology-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7659 ^java.time.format.TextStyle java-time-format-TextStyle7660] (.appendChronologyText this7659 java-time-format-TextStyle7660)))
(clojure.core/defn append-offset-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7661] (.appendOffsetId this7661)))
(clojure.core/defn append-zone-region-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7662] (.appendZoneRegionId this7662)))
(clojure.core/defn parse-defaulting {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "long"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7663 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7664 ^long long7665] (.parseDefaulting this7663 java-time-temporal-TemporalField7664 long7665)))
(clojure.core/defn append-zone-id {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7666] (.appendZoneId this7666)))
(clojure.core/defn get-localized-date-time-pattern {:arglists (quote (["java.time.format.FormatStyle" "java.time.format.FormatStyle" "java.time.chrono.Chronology" "java.util.Locale"]))} (^java.lang.String [^java.time.format.FormatStyle java-time-format-FormatStyle7667 ^java.time.format.FormatStyle java-time-format-FormatStyle7668 ^java.time.chrono.Chronology java-time-chrono-Chronology7669 ^java.util.Locale java-util-Locale7670] (. java.time.format.DateTimeFormatterBuilder getLocalizedDateTimePattern java-time-format-FormatStyle7667 java-time-format-FormatStyle7668 java-time-chrono-Chronology7669 java-util-Locale7670)))
(clojure.core/defn parse-case-insensitive {:arglists (quote (["java.time.format.DateTimeFormatterBuilder"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7671] (.parseCaseInsensitive this7671)))
(clojure.core/defn append-localized-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7672 ^java.time.format.TextStyle java-time-format-TextStyle7673] (.appendLocalizedOffset this7672 java-time-format-TextStyle7673)))
(clojure.core/defn append {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.DateTimeFormatter"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7674 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter7675] (.append this7674 java-time-format-DateTimeFormatter7675)))
(clojure.core/defn append-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "java.util.Map"]))} (^java.time.format.DateTimeFormatterBuilder [this7676 G__7677 G__7678] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7677) (clojure.core/instance? (java.lang.Class/forName "java.time.format.TextStyle") G__7678)) (clojure.core/let [G__7677 ^"java.time.temporal.TemporalField" G__7677 G__7678 ^"java.time.format.TextStyle" G__7678] (.appendText ^java.time.format.DateTimeFormatterBuilder this7676 G__7677 G__7678)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7677) (clojure.core/instance? (java.lang.Class/forName "java.util.Map") G__7678)) (clojure.core/let [G__7677 ^"java.time.temporal.TemporalField" G__7677 G__7678 ^"java.util.Map" G__7678] (.appendText ^java.time.format.DateTimeFormatterBuilder this7676 G__7677 G__7678)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7679 ^java.time.temporal.TemporalField java-time-temporal-TemporalField7680] (.appendText this7679 java-time-temporal-TemporalField7680)))
(clojure.core/defn append-localized {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.FormatStyle" "java.time.format.FormatStyle"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7681 ^java.time.format.FormatStyle java-time-format-FormatStyle7682 ^java.time.format.FormatStyle java-time-format-FormatStyle7683] (.appendLocalized this7681 java-time-format-FormatStyle7682 java-time-format-FormatStyle7683)))
(clojure.core/defn append-offset {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.lang.String" "java.lang.String"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7684 ^java.lang.String java-lang-String7685 ^java.lang.String java-lang-String7686] (.appendOffset this7684 java-lang-String7685 java-lang-String7686)))
(clojure.core/defn append-value-reduced {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "int"] ["java.time.format.DateTimeFormatterBuilder" "java.time.temporal.TemporalField" "int" "int" "java.time.chrono.ChronoLocalDate"]))} (^java.time.format.DateTimeFormatterBuilder [this7687 G__7688 G__7689 G__7690 G__7691] (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7688) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__7689) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__7690) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__7691)) (clojure.core/let [G__7688 ^"java.time.temporal.TemporalField" G__7688 G__7689 (clojure.core/int G__7689) G__7690 (clojure.core/int G__7690) G__7691 (clojure.core/int G__7691)] (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this7687 G__7688 G__7689 G__7690 G__7691)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__7688) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__7689) (clojure.core/instance? (java.lang.Class/forName "java.lang.Number") G__7690) (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__7691)) (clojure.core/let [G__7688 ^"java.time.temporal.TemporalField" G__7688 G__7689 (clojure.core/int G__7689) G__7690 (clojure.core/int G__7690) G__7691 ^"java.time.chrono.ChronoLocalDate" G__7691] (.appendValueReduced ^java.time.format.DateTimeFormatterBuilder this7687 G__7688 G__7689 G__7690 G__7691)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args")))))
(clojure.core/defn append-zone-text {:arglists (quote (["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle"] ["java.time.format.DateTimeFormatterBuilder" "java.time.format.TextStyle" "java.util.Set"]))} (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7692 ^java.time.format.TextStyle java-time-format-TextStyle7693] (.appendZoneText this7692 java-time-format-TextStyle7693)) (^java.time.format.DateTimeFormatterBuilder [^java.time.format.DateTimeFormatterBuilder this7694 ^java.time.format.TextStyle java-time-format-TextStyle7695 ^java.util.Set java-util-Set7696] (.appendZoneText this7694 java-time-format-TextStyle7695 java-util-Set7696)))
