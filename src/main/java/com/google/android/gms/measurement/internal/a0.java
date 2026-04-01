package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f19768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f19769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f19770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f19771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f19772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f19773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f19774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Long f19775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Long f19776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Long f19777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Boolean f19778k;

    a0(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l8, Long l9, Long l10, Boolean bool) {
        a3.o.f(str);
        a3.o.f(str2);
        a3.o.a(j8 >= 0);
        a3.o.a(j9 >= 0);
        a3.o.a(j10 >= 0);
        a3.o.a(j12 >= 0);
        this.f19768a = str;
        this.f19769b = str2;
        this.f19770c = j8;
        this.f19771d = j9;
        this.f19772e = j10;
        this.f19773f = j11;
        this.f19774g = j12;
        this.f19775h = l8;
        this.f19776i = l9;
        this.f19777j = l10;
        this.f19778k = bool;
    }

    a0(String str, String str2, long j8, long j9, long j10, long j11, Long l8, Long l9, Long l10, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }

    final a0 a(long j8) {
        return new a0(this.f19768a, this.f19769b, this.f19770c, this.f19771d, this.f19772e, j8, this.f19774g, this.f19775h, this.f19776i, this.f19777j, this.f19778k);
    }

    final a0 b(long j8, long j9) {
        return new a0(this.f19768a, this.f19769b, this.f19770c, this.f19771d, this.f19772e, this.f19773f, j8, Long.valueOf(j9), this.f19776i, this.f19777j, this.f19778k);
    }

    final a0 c(Long l8, Long l9, Boolean bool) {
        return new a0(this.f19768a, this.f19769b, this.f19770c, this.f19771d, this.f19772e, this.f19773f, this.f19774g, this.f19775h, l8, l9, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
