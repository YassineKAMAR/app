package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9420a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f9421b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9422c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9423d = -1;

    public static iz1 a(Reader reader) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(reader);
                HashMap map = new HashMap();
                long jNextLong = -1;
                String strNextString = "";
                jsonReader.beginObject();
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if ("response".equals(strNextName)) {
                        iNextInt = jsonReader.nextInt();
                    } else if ("body".equals(strNextName)) {
                        strNextString = jsonReader.nextString();
                    } else if ("latency".equals(strNextName)) {
                        jNextLong = jsonReader.nextLong();
                    } else if ("headers".equals(strNextName)) {
                        map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), j2.y0.d(jsonReader));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                iz1 iz1Var = new iz1();
                iz1Var.f9420a = iNextInt;
                if (strNextString != null) {
                    iz1Var.f9422c = strNextString;
                }
                iz1Var.f9423d = jNextLong;
                iz1Var.f9421b = map;
                return iz1Var;
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e8) {
                throw new bs2("Unable to parse Response", e8);
            }
        } finally {
            e3.k.a(reader);
        }
    }
}
