package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class fz1 extends ma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ek2 f8125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ck2 f8126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nz1 f8127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lg3 f8128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kz1 f8129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kb0 f8130g;

    fz1(Context context, ek2 ek2Var, ck2 ck2Var, kz1 kz1Var, nz1 nz1Var, lg3 lg3Var, kb0 kb0Var) {
        this.f8124a = context;
        this.f8125b = ek2Var;
        this.f8126c = ck2Var;
        this.f8129f = kz1Var;
        this.f8127d = nz1Var;
        this.f8128e = lg3Var;
        this.f8130g = kb0Var;
    }

    private final void P5(x3.d dVar, qa0 qa0Var) {
        zf3.r(zf3.n(qf3.C(dVar), new gf3() { // from class: com.google.android.gms.internal.ads.cz1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(ut2.a((InputStream) obj));
            }
        }, eh0.f7322a), new ez1(this, qa0Var), eh0.f7327f);
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void H1(fa0 fa0Var, qa0 qa0Var) {
        P5(O5(fa0Var, Binder.getCallingUid()), qa0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x3.d O5(com.google.android.gms.internal.ads.fa0 r9, int r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz1.O5(com.google.android.gms.internal.ads.fa0, int):x3.d");
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void t3(ba0 ba0Var, qa0 qa0Var) {
        sj2 sj2Var = new sj2(ba0Var, Binder.getCallingUid());
        ek2 ek2Var = this.f8125b;
        ek2Var.a(sj2Var);
        final fk2 fk2VarK = ek2Var.k();
        bx2 bx2VarB = fk2VarK.b();
        fw2 fw2VarA = bx2VarB.b(vw2.GMS_SIGNALS, zf3.i()).f(new gf3() { // from class: com.google.android.gms.internal.ads.bz1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return fk2VarK.a().a(new JSONObject());
            }
        }).e(new dw2() { // from class: com.google.android.gms.internal.ads.az1
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                j2.v1.k("GMS AdRequest Signals: ");
                j2.v1.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).f(new gf3() { // from class: com.google.android.gms.internal.ads.yy1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).a();
        P5(fw2VarA, qa0Var);
        if (((Boolean) ju.f9806d.e()).booleanValue()) {
            final nz1 nz1Var = this.f8127d;
            nz1Var.getClass();
            fw2VarA.c(new Runnable() { // from class: com.google.android.gms.internal.ads.dz1
                @Override // java.lang.Runnable
                public final void run() {
                    nz1Var.b();
                }
            }, this.f8128e);
        }
    }
}
