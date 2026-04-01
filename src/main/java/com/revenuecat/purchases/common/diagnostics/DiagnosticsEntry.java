package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class DiagnosticsEntry implements com.revenuecat.purchases.utils.Event {
    public static final Companion Companion = new Companion(null);
    private static final String TYPE_KEY = "type";
    private static final int VERSION = 1;
    private static final String VERSION_KEY = "version";
    private final String diagnosticType;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public static final class Counter extends DiagnosticsEntry {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String NAME_KEY = "name";

        @Deprecated
        public static final String TAGS_KEY = "tags";

        @Deprecated
        public static final String VALUE_KEY = "value";
        private final DiagnosticsCounterName name;
        private final Map<String, String> tags;
        private final int value;

        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Counter(DiagnosticsCounterName name, Map<String, String> tags, int i8) {
            super("counter", null);
            q.f(name, "name");
            q.f(tags, "tags");
            this.name = name;
            this.tags = tags;
            this.value = i8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Counter copy$default(Counter counter, DiagnosticsCounterName diagnosticsCounterName, Map map, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                diagnosticsCounterName = counter.name;
            }
            if ((i9 & 2) != 0) {
                map = counter.tags;
            }
            if ((i9 & 4) != 0) {
                i8 = counter.value;
            }
            return counter.copy(diagnosticsCounterName, map, i8);
        }

        private final JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DiagnosticsEntry.VERSION_KEY, 1);
            jSONObject.put(DiagnosticsEntry.TYPE_KEY, getDiagnosticType());
            String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
            q.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject.put("name", lowerCase);
            jSONObject.put("tags", new JSONObject(this.tags));
            jSONObject.put("value", this.value);
            return jSONObject;
        }

        public final DiagnosticsCounterName component1() {
            return this.name;
        }

        public final Map<String, String> component2() {
            return this.tags;
        }

        public final int component3() {
            return this.value;
        }

        public final Counter copy(DiagnosticsCounterName name, Map<String, String> tags, int i8) {
            q.f(name, "name");
            q.f(tags, "tags");
            return new Counter(name, tags, i8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Counter)) {
                return false;
            }
            Counter counter = (Counter) obj;
            return this.name == counter.name && q.b(this.tags, counter.tags) && this.value == counter.value;
        }

        public final DiagnosticsCounterName getName() {
            return this.name;
        }

        public final Map<String, String> getTags() {
            return this.tags;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.tags.hashCode()) * 31) + this.value;
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            String string = toJSONObject().toString();
            q.e(string, "toJSONObject().toString()");
            return string;
        }
    }

    public static final class Event extends DiagnosticsEntry {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String NAME_KEY = "name";

        @Deprecated
        public static final String PROPERTIES_KEY = "properties";

        @Deprecated
        public static final String TIMESTAMP_KEY = "timestamp";
        private final DateProvider dateProvider;
        private final Date dateTime;
        private final DiagnosticsEventName name;
        private final Map<String, Object> properties;

        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(DiagnosticsEventName name, Map<String, ? extends Object> properties, DateProvider dateProvider, Date dateTime) {
            super("event", null);
            q.f(name, "name");
            q.f(properties, "properties");
            q.f(dateProvider, "dateProvider");
            q.f(dateTime, "dateTime");
            this.name = name;
            this.properties = properties;
            this.dateProvider = dateProvider;
            this.dateTime = dateTime;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Event(DiagnosticsEventName diagnosticsEventName, Map map, DateProvider dateProvider, Date date, int i8, j jVar) {
            dateProvider = (i8 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
            this(diagnosticsEventName, map, dateProvider, (i8 & 8) != 0 ? dateProvider.getNow() : date);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, DiagnosticsEventName diagnosticsEventName, Map map, DateProvider dateProvider, Date date, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                diagnosticsEventName = event.name;
            }
            if ((i8 & 2) != 0) {
                map = event.properties;
            }
            if ((i8 & 4) != 0) {
                dateProvider = event.dateProvider;
            }
            if ((i8 & 8) != 0) {
                date = event.dateTime;
            }
            return event.copy(diagnosticsEventName, map, dateProvider, date);
        }

        private final JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DiagnosticsEntry.VERSION_KEY, 1);
            jSONObject.put(DiagnosticsEntry.TYPE_KEY, getDiagnosticType());
            String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
            q.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject.put("name", lowerCase);
            jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
            jSONObject.put(TIMESTAMP_KEY, this.dateTime.getTime());
            return jSONObject;
        }

        public final DiagnosticsEventName component1() {
            return this.name;
        }

        public final Map<String, Object> component2() {
            return this.properties;
        }

        public final DateProvider component3() {
            return this.dateProvider;
        }

        public final Date component4() {
            return this.dateTime;
        }

        public final Event copy(DiagnosticsEventName name, Map<String, ? extends Object> properties, DateProvider dateProvider, Date dateTime) {
            q.f(name, "name");
            q.f(properties, "properties");
            q.f(dateProvider, "dateProvider");
            q.f(dateTime, "dateTime");
            return new Event(name, properties, dateProvider, dateTime);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return this.name == event.name && q.b(this.properties, event.properties) && q.b(this.dateProvider, event.dateProvider) && q.b(this.dateTime, event.dateTime);
        }

        public final DateProvider getDateProvider() {
            return this.dateProvider;
        }

        public final Date getDateTime() {
            return this.dateTime;
        }

        public final DiagnosticsEventName getName() {
            return this.name;
        }

        public final Map<String, Object> getProperties() {
            return this.properties;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.properties.hashCode()) * 31) + this.dateProvider.hashCode()) * 31) + this.dateTime.hashCode();
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            String string = toJSONObject().toString();
            q.e(string, "toJSONObject().toString()");
            return string;
        }
    }

    public static final class Histogram extends DiagnosticsEntry {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String NAME_KEY = "name";

        @Deprecated
        public static final String TAGS_KEY = "tags";

        @Deprecated
        public static final String VALUES_KEY = "values";
        private final String name;
        private final Map<String, String> tags;
        private final List<Double> values;

        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Histogram(String name, Map<String, String> tags, List<Double> values) {
            super("histogram", null);
            q.f(name, "name");
            q.f(tags, "tags");
            q.f(values, "values");
            this.name = name;
            this.tags = tags;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Histogram copy$default(Histogram histogram, String str, Map map, List list, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = histogram.name;
            }
            if ((i8 & 2) != 0) {
                map = histogram.tags;
            }
            if ((i8 & 4) != 0) {
                list = histogram.values;
            }
            return histogram.copy(str, map, list);
        }

        private final JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DiagnosticsEntry.VERSION_KEY, 1);
            jSONObject.put(DiagnosticsEntry.TYPE_KEY, getDiagnosticType());
            String lowerCase = this.name.toLowerCase(Locale.ROOT);
            q.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            jSONObject.put("name", lowerCase);
            jSONObject.put("tags", new JSONObject(this.tags));
            jSONObject.put(VALUES_KEY, new JSONArray((Collection) this.values));
            return jSONObject;
        }

        public final String component1() {
            return this.name;
        }

        public final Map<String, String> component2() {
            return this.tags;
        }

        public final List<Double> component3() {
            return this.values;
        }

        public final Histogram copy(String name, Map<String, String> tags, List<Double> values) {
            q.f(name, "name");
            q.f(tags, "tags");
            q.f(values, "values");
            return new Histogram(name, tags, values);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Histogram)) {
                return false;
            }
            Histogram histogram = (Histogram) obj;
            return q.b(this.name, histogram.name) && q.b(this.tags, histogram.tags) && q.b(this.values, histogram.values);
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, String> getTags() {
            return this.tags;
        }

        public final List<Double> getValues() {
            return this.values;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.tags.hashCode()) * 31) + this.values.hashCode();
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            String string = toJSONObject().toString();
            q.e(string, "toJSONObject().toString()");
            return string;
        }
    }

    private DiagnosticsEntry(String str) {
        this.diagnosticType = str;
    }

    public /* synthetic */ DiagnosticsEntry(String str, j jVar) {
        this(str);
    }

    public final String getDiagnosticType() {
        return this.diagnosticType;
    }
}
