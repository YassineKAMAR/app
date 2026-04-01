package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r50 implements l2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f13935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f13937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f13938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f13939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f13940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f13941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13942h;

    public r50(Date date, int i8, Set set, Location location, boolean z7, int i9, boolean z8, int i10, String str) {
        this.f13935a = date;
        this.f13936b = i8;
        this.f13937c = set;
        this.f13939e = location;
        this.f13938d = z7;
        this.f13940f = i9;
        this.f13941g = z8;
        this.f13942h = str;
    }

    @Override // l2.e
    public final int b() {
        return this.f13940f;
    }

    @Override // l2.e
    @Deprecated
    public final boolean d() {
        return this.f13941g;
    }

    @Override // l2.e
    @Deprecated
    public final Date e() {
        return this.f13935a;
    }

    @Override // l2.e
    public final boolean f() {
        return this.f13938d;
    }

    @Override // l2.e
    public final Set<String> g() {
        return this.f13937c;
    }

    @Override // l2.e
    @Deprecated
    public final int i() {
        return this.f13936b;
    }
}
