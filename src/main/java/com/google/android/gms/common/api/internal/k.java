package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f4866a;

    k(l lVar) {
        this.f4866a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f4866a.f4867a;
        mVar.f4869b.c(mVar.f4869b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
