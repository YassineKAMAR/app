package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ej implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii f7351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce f7352b;

    public ej(ii iiVar, ce ceVar) {
        this.f7351a = iiVar;
        this.f7352b = ceVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.f7351a.l() != null) {
            this.f7351a.l().get();
        }
        ze zeVarC = this.f7351a.c();
        if (zeVarC == null) {
            return null;
        }
        try {
            synchronized (this.f7352b) {
                ce ceVar = this.f7352b;
                byte[] bArrG = zeVarC.g();
                ceVar.p(bArrG, 0, bArrG.length, m04.a());
            }
            return null;
        } catch (m14 | NullPointerException unused) {
            return null;
        }
    }
}
