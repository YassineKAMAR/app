package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final class p12 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dw2 f12701a;

    p12(q12 q12Var, dw2 dw2Var) {
        this.f12701a = dw2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qg0.d("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f12701a.a((SQLiteDatabase) obj);
        } catch (Exception e8) {
            qg0.d("Error executing function on offline buffered ping database: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
