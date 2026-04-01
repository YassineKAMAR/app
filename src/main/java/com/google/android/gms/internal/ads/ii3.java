package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ii3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f9225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dx3 f9226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final nh3 f9229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9230h;

    ii3(Object obj, Object obj2, byte[] bArr, int i8, dx3 dx3Var, int i9, String str, nh3 nh3Var) {
        this.f9223a = obj;
        this.f9224b = obj2;
        this.f9225c = Arrays.copyOf(bArr, bArr.length);
        this.f9230h = i8;
        this.f9226d = dx3Var;
        this.f9227e = i9;
        this.f9228f = str;
        this.f9229g = nh3Var;
    }

    public final int a() {
        return this.f9227e;
    }

    public final nh3 b() {
        return this.f9229g;
    }

    public final dx3 c() {
        return this.f9226d;
    }

    public final Object d() {
        return this.f9223a;
    }

    public final Object e() {
        return this.f9224b;
    }

    public final String f() {
        return this.f9228f;
    }

    public final byte[] g() {
        byte[] bArr = this.f9225c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int h() {
        return this.f9230h;
    }
}
