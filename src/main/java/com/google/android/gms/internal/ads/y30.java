package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f17574a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v30 f17575b = new x30();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t30 f17576c = new t30() { // from class: com.google.android.gms.internal.ads.w30
        @Override // com.google.android.gms.internal.ads.t30
        public final Object a(JSONObject jSONObject) {
            return y30.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f17574a));
    }
}
