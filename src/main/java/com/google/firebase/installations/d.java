package com.google.firebase.installations;

import s3.i;

/* JADX INFO: loaded from: classes.dex */
class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final i<String> f20858a;

    public d(i<String> iVar) {
        this.f20858a = iVar;
    }

    @Override // com.google.firebase.installations.e
    public boolean a(r4.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f20858a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.e
    public boolean b(Exception exc) {
        return false;
    }
}
