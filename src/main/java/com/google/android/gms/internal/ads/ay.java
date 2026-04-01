package com.google.android.gms.internal.ads;

import c2.f;

/* JADX INFO: loaded from: classes.dex */
public final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.b f5520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f5521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c2.f f5522c;

    public ay(f.b bVar, f.a aVar) {
        this.f5520a = bVar;
        this.f5521b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized c2.f f(pw pwVar) {
        c2.f fVar = this.f5522c;
        if (fVar != null) {
            return fVar;
        }
        qw qwVar = new qw(pwVar);
        this.f5522c = qwVar;
        return qwVar;
    }

    public final zw d() {
        wx wxVar = null;
        if (this.f5521b == null) {
            return null;
        }
        return new xx(this, wxVar);
    }

    public final cx e() {
        return new zx(this, null);
    }
}
