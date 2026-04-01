package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ot2 f17370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final un1 f17371b;

    xn1(ot2 ot2Var, un1 un1Var) {
        this.f17370a = ot2Var;
        this.f17371b = un1Var;
    }

    final z40 a() throws RemoteException {
        z40 z40VarB = this.f17370a.b();
        if (z40VarB != null) {
            return z40VarB;
        }
        qg0.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final y60 b(String str) {
        y60 y60VarE = a().e(str);
        this.f17371b.e(str, y60VarE);
        return y60VarE;
    }

    public final qt2 c(String str, JSONObject jSONObject) {
        d50 d50VarC;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                d50VarC = new a60(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                d50VarC = new a60(new zzbrn());
            } else {
                z40 z40VarA = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        d50VarC = z40VarA.b(string) ? z40VarA.c("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : z40VarA.h(string) ? z40VarA.c(string) : z40VarA.c("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e8) {
                        qg0.e("Invalid custom event.", e8);
                        d50VarC = z40VarA.c(str);
                    }
                } else {
                    d50VarC = z40VarA.c(str);
                }
            }
            qt2 qt2Var = new qt2(d50VarC);
            this.f17371b.d(str, qt2Var);
            return qt2Var;
        } catch (Throwable th) {
            if (((Boolean) h2.y.c().b(ns.c9)).booleanValue()) {
                this.f17371b.d(str, null);
            }
            throw new ys2(th);
        }
    }

    public final boolean d() {
        return this.f17370a.b() != null;
    }
}
