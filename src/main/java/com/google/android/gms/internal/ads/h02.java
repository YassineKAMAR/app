package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final class h02 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ dw2 f8585a;

    h02(i02 i02Var, dw2 dw2Var) {
        this.f8585a = dw2Var;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        qg0.d("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.f8585a.a((SQLiteDatabase) obj);
        } catch (Exception e8) {
            qg0.d("Error executing function on offline signal database: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
