package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class hb3 extends h93 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jb3 f8715c;

    hb3(jb3 jb3Var, int i8) {
        super(jb3Var.size(), i8);
        this.f8715c = jb3Var;
    }

    @Override // com.google.android.gms.internal.ads.h93
    protected final Object a(int i8) {
        return this.f8715c.get(i8);
    }
}
