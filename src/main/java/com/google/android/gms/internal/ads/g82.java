package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g82 implements z22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m92 f8258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xn1 f8259b;

    g82(m92 m92Var, xn1 xn1Var) {
        this.f8258a = m92Var;
        this.f8259b = xn1Var;
    }

    @Override // com.google.android.gms.internal.ads.z22
    public final a32 a(String str, JSONObject jSONObject) {
        y60 y60VarB;
        if (((Boolean) h2.y.c().b(ns.C1)).booleanValue()) {
            try {
                y60VarB = this.f8259b.b(str);
            } catch (RemoteException e8) {
                qg0.e("Coundn't create RTB adapter: ", e8);
                y60VarB = null;
            }
        } else {
            y60VarB = this.f8258a.a(str);
        }
        if (y60VarB == null) {
            return null;
        }
        return new a32(y60VarB, new v42(), str);
    }
}
