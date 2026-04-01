package com.google.android.gms.internal.ads;

import f2.a;

/* JADX INFO: loaded from: classes.dex */
public final class n10 implements f2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.EnumC0105a f11592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11594c;

    public n10(a.EnumC0105a enumC0105a, String str, int i8) {
        this.f11592a = enumC0105a;
        this.f11593b = str;
        this.f11594c = i8;
    }

    @Override // f2.a
    public final a.EnumC0105a a() {
        return this.f11592a;
    }

    @Override // f2.a
    public final int b() {
        return this.f11594c;
    }

    @Override // f2.a
    public final String getDescription() {
        return this.f11593b;
    }
}
