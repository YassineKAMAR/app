package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15956a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f15957b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f15958c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f15959d = new ConcurrentHashMap();

    public final int a(String str) {
        Integer num = (Integer) this.f15957b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long b(String str) {
        Long l8 = (Long) this.f15959d.get(str);
        if (l8 == null) {
            return -1L;
        }
        return l8.longValue();
    }

    public final void c(String str) {
        synchronized (this.f15956a) {
            Integer num = (Integer) this.f15957b.get(str);
            this.f15957b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
        }
    }

    public final void d(String str, String str2, long j8) {
        Long l8 = (Long) this.f15958c.get(str2);
        if (l8 == null) {
            return;
        }
        this.f15958c.remove(str2);
        this.f15959d.put(str, Long.valueOf(j8 - l8.longValue()));
    }

    public final void e(String str, long j8) {
        this.f15958c.put(str, Long.valueOf(j8));
    }
}
