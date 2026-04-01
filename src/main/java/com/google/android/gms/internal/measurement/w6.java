package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f19290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Uri f19291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f19292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f19293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f19294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f19295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f19297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final u3.c<Context, Boolean> f19298i;

    public w6(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private w6(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, u3.c<Context, Boolean> cVar) {
        this.f19290a = str;
        this.f19291b = uri;
        this.f19292c = str2;
        this.f19293d = str3;
        this.f19294e = z7;
        this.f19295f = z8;
        this.f19296g = z9;
        this.f19297h = z10;
        this.f19298i = cVar;
    }

    public final o6<Double> a(String str, double d8) {
        return o6.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final o6<Long> b(String str, long j8) {
        return o6.c(this, str, Long.valueOf(j8), true);
    }

    public final o6<String> c(String str, String str2) {
        return o6.d(this, str, str2, true);
    }

    public final o6<Boolean> d(String str, boolean z7) {
        return o6.a(this, str, Boolean.valueOf(z7), true);
    }

    public final w6 e() {
        return new w6(this.f19290a, this.f19291b, this.f19292c, this.f19293d, this.f19294e, this.f19295f, true, this.f19297h, this.f19298i);
    }

    public final w6 f() {
        if (!this.f19292c.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        u3.c<Context, Boolean> cVar = this.f19298i;
        if (cVar == null) {
            return new w6(this.f19290a, this.f19291b, this.f19292c, this.f19293d, true, this.f19295f, this.f19296g, this.f19297h, cVar);
        }
        throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
}
