package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f14109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ui f14110c = new ui();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final cq f14111d = new cq(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f14112e = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jb3 f14113f = jb3.z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ft f14114g = new ft();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y00 f14115h = y00.f17528c;

    public final rg a(String str) {
        this.f14108a = str;
        return this;
    }

    public final rg b(Uri uri) {
        this.f14109b = uri;
        return this;
    }

    public final c50 c() {
        fy fyVar;
        Uri uri = this.f14109b;
        if (uri != null) {
            fyVar = new fy(uri, null, null, null, this.f14112e, null, this.f14113f, null, -9223372036854775807L, null);
        } else {
            fyVar = null;
        }
        String str = this.f14108a;
        if (str == null) {
            str = "";
        }
        return new c50(str, new zm(this.f14110c, null), fyVar, new iv(this.f14114g), ra0.f14003y, this.f14115h, null);
    }
}
