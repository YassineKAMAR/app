package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class km4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicLong f10170d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ut3 f10171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f10172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10173c;

    public km4(long j8, ut3 ut3Var, Uri uri, Map map, long j9, long j10, long j11) {
        this.f10171a = ut3Var;
        this.f10172b = uri;
        this.f10173c = map;
    }

    public static long a() {
        return f10170d.getAndIncrement();
    }
}
