package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class pg0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f12857c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f12858d = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f12861g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f12856b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e3.e f12859e = e3.h.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f12860f = new HashSet(Arrays.asList(new String[0]));

    public pg0(String str) {
        this.f12862a = !k() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    static /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        r(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(e3.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void b(int i8, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i8);
        jsonWriter.endObject();
        r(jsonWriter, map);
        jsonWriter.endObject();
    }

    public static void i() {
        synchronized (f12856b) {
            f12857c = false;
            f12858d = false;
            qg0.g("Ad debug logging enablement is out of date.");
        }
    }

    public static void j(boolean z7) {
        synchronized (f12856b) {
            f12857c = true;
            f12858d = z7;
        }
    }

    public static boolean k() {
        boolean z7;
        synchronized (f12856b) {
            z7 = false;
            if (f12857c && f12858d) {
                z7 = true;
            }
        }
        return z7;
    }

    public static boolean l() {
        boolean z7;
        synchronized (f12856b) {
            z7 = f12857c;
        }
        return z7;
    }

    private static synchronized void m(String str) {
        qg0.f("GMA Debug BEGIN");
        int i8 = 0;
        while (i8 < str.length()) {
            int i9 = i8 + 4000;
            qg0.f("GMA Debug CONTENT ".concat(String.valueOf(str.substring(i8, Math.min(i9, str.length())))));
            i8 = i9;
        }
        qg0.f("GMA Debug FINISH");
    }

    private final void n(String str, og0 og0Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(DiagnosticsEntry.Event.TIMESTAMP_KEY).value(f12859e.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f12862a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            og0Var.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e8) {
            qg0.e("unable to log", e8);
        }
        m(stringWriter.toString());
    }

    private final void o(final String str) {
        n("onNetworkRequestError", new og0() { // from class: com.google.android.gms.internal.ads.mg0
            @Override // com.google.android.gms.internal.ads.og0
            public final void a(JsonWriter jsonWriter) throws IOException {
                int i8 = pg0.f12861g;
                jsonWriter.name("params").beginObject();
                String str2 = str;
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private final void p(final String str, final String str2, final Map map, final byte[] bArr) {
        n("onNetworkRequest", new og0() { // from class: com.google.android.gms.internal.ads.kg0
            @Override // com.google.android.gms.internal.ads.og0
            public final void a(JsonWriter jsonWriter) throws IOException {
                pg0.a(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void q(final Map map, final int i8) {
        n("onNetworkResponse", new og0() { // from class: com.google.android.gms.internal.ads.ng0
            @Override // com.google.android.gms.internal.ads.og0
            public final void a(JsonWriter jsonWriter) throws IOException {
                pg0.b(i8, map, jsonWriter);
            }
        });
    }

    private static void r(JsonWriter jsonWriter, Map map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f12860f.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        qg0.d("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (k()) {
            p(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void d(String str, String str2, Map map, byte[] bArr) {
        if (k()) {
            p(str, "GET", map, bArr);
        }
    }

    public final void e(HttpURLConnection httpURLConnection, int i8) {
        if (k()) {
            String responseMessage = null;
            q(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i8);
            if (i8 < 200 || i8 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e8) {
                    qg0.g("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e8.getMessage())));
                }
                o(responseMessage);
            }
        }
    }

    public final void f(Map map, int i8) {
        if (k()) {
            q(map, i8);
            if (i8 < 200 || i8 >= 300) {
                o(null);
            }
        }
    }

    public final void g(String str) {
        if (k() && str != null) {
            h(str.getBytes());
        }
    }

    public final void h(final byte[] bArr) {
        n("onNetworkResponseBody", new og0() { // from class: com.google.android.gms.internal.ads.lg0
            @Override // com.google.android.gms.internal.ads.og0
            public final void a(JsonWriter jsonWriter) throws IOException {
                String str;
                int i8 = pg0.f12861g;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                String strA = e3.c.a(bArr2);
                if (length >= 10000) {
                    strA = jg0.i(strA);
                    str = strA != null ? "bodydigest" : "body";
                    jsonWriter.name("bodylength").value(length);
                    jsonWriter.endObject();
                }
                jsonWriter.name(str).value(strA);
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
