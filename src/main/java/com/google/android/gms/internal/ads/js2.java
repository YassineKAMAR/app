package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class js2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as2 f9793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9794c;

    js2(JsonReader jsonReader) throws IOException {
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        as2 as2Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        listEmptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            listEmptyList.add(new wr2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        as2Var = new as2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectH = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectH = j2.y0.h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList.add(new is2(strNextString, jSONObjectH));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f9794c = arrayList;
        this.f9792a = listEmptyList;
        this.f9793b = as2Var == null ? new as2(new JsonReader(new StringReader("{}"))) : as2Var;
    }

    public static js2 a(Reader reader) {
        try {
            try {
                return new js2(new JsonReader(reader));
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e8) {
                throw new bs2("unable to parse ServerResponse", e8);
            }
        } finally {
            e3.k.a(reader);
        }
    }
}
