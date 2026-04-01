package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class sr3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f14802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f14803b = Collections.emptyMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14805d;

    public final sr3 a(int i8) {
        this.f14805d = 6;
        return this;
    }

    public final sr3 b(Map map) {
        this.f14803b = map;
        return this;
    }

    public final sr3 c(long j8) {
        this.f14804c = j8;
        return this;
    }

    public final sr3 d(Uri uri) {
        this.f14802a = uri;
        return this;
    }

    public final ut3 e() {
        if (this.f14802a != null) {
            return new ut3(this.f14802a, this.f14803b, this.f14804c, this.f14805d);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
