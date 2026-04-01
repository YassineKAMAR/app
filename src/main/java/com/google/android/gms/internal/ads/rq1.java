package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f14283a;

    public rq1(e3.e eVar) {
        this.f14283a = eVar;
    }

    public final void a(List list, String str, String str2, Object... objArr) {
        if (((Boolean) mu.f11540a.e()).booleanValue()) {
            long jA = this.f14283a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name(DiagnosticsEntry.Event.TIMESTAMP_KEY).value(jA);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    Object obj = objArr[i8];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e8) {
                qg0.e("unable to log", e8);
            }
            qg0.f("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}
