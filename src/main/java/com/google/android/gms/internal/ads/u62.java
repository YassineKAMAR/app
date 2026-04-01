package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class u62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f15514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f15515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f15516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f15517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Integer f15518e;

    u62(String str, String str2, int i8, long j8, Integer num) {
        this.f15514a = str;
        this.f15515b = str2;
        this.f15516c = i8;
        this.f15517d = j8;
        this.f15518e = num;
    }

    public final String toString() {
        String str = this.f15514a + "." + this.f15516c + "." + this.f15517d;
        if (!TextUtils.isEmpty(this.f15515b)) {
            str = str + "." + this.f15515b;
        }
        if (!((Boolean) h2.y.c().b(ns.A1)).booleanValue() || this.f15518e == null || TextUtils.isEmpty(this.f15515b)) {
            return str;
        }
        return str + "." + this.f15518e;
    }
}
