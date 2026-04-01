package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f16484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bw1 f16485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c84 f16486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ty2 f16487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f16488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wg0 f16489f;

    public vw1(lg3 lg3Var, bw1 bw1Var, c84 c84Var, ty2 ty2Var, Context context, wg0 wg0Var) {
        this.f16484a = lg3Var;
        this.f16485b = bw1Var;
        this.f16486c = c84Var;
        this.f16487d = ty2Var;
        this.f16488e = context;
        this.f16489f = wg0Var;
    }

    private final x3.d h(final ya0 ya0Var, uw1 uw1Var, final uw1 uw1Var2, final gf3 gf3Var) {
        x3.d dVarF;
        String str = ya0Var.f17711d;
        g2.t.r();
        if (j2.k2.b(str)) {
            dVarF = zf3.g(new kw1(1));
        } else {
            dVarF = zf3.f(uw1Var.a(ya0Var), ExecutionException.class, new gf3() { // from class: com.google.android.gms.internal.ads.tw1
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return zf3.g(cause);
                }
            }, this.f16484a);
        }
        return zf3.f(zf3.n(qf3.C(dVarF), gf3Var, this.f16484a), kw1.class, new gf3() { // from class: com.google.android.gms.internal.ads.sw1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f14841a.c(uw1Var2, ya0Var, gf3Var, (kw1) obj);
            }
        }, this.f16484a);
    }

    public final x3.d a(final ya0 ya0Var) {
        gf3 gf3Var = new gf3() { // from class: com.google.android.gms.internal.ads.pw1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                String str = new String(nd3.a((InputStream) obj), x73.f17098c);
                ya0 ya0Var2 = ya0Var;
                ya0Var2.f17717j = str;
                return zf3.h(ya0Var2);
            }
        };
        final bw1 bw1Var = this.f16485b;
        return h(ya0Var, new uw1() { // from class: com.google.android.gms.internal.ads.qw1
            @Override // com.google.android.gms.internal.ads.uw1
            public final x3.d a(ya0 ya0Var2) {
                return bw1Var.b(ya0Var2);
            }
        }, new uw1() { // from class: com.google.android.gms.internal.ads.rw1
            @Override // com.google.android.gms.internal.ads.uw1
            public final x3.d a(ya0 ya0Var2) {
                return this.f14358a.d(ya0Var2);
            }
        }, gf3Var);
    }

    public final x3.d b(JSONObject jSONObject) {
        return zf3.n(qf3.C(zf3.h(jSONObject)), g2.t.h().a(this.f16488e, this.f16489f, this.f16487d).a("AFMA_getAdDictionary", y30.f17575b, new t30() { // from class: com.google.android.gms.internal.ads.lw1
            @Override // com.google.android.gms.internal.ads.t30
            public final Object a(JSONObject jSONObject2) {
                return new bb0(jSONObject2);
            }
        }), this.f16484a);
    }

    final /* synthetic */ x3.d c(uw1 uw1Var, ya0 ya0Var, gf3 gf3Var, kw1 kw1Var) {
        return zf3.n(uw1Var.a(ya0Var), gf3Var, this.f16484a);
    }

    final /* synthetic */ x3.d d(ya0 ya0Var) {
        return ((uy1) this.f16486c.k()).O5(ya0Var, Binder.getCallingUid());
    }

    final /* synthetic */ x3.d e(ya0 ya0Var) {
        return this.f16485b.c(ya0Var.f17715h);
    }

    final /* synthetic */ x3.d f(ya0 ya0Var) {
        return ((uy1) this.f16486c.k()).R5(ya0Var.f17715h);
    }

    public final x3.d g(ya0 ya0Var) {
        return h(ya0Var, new uw1() { // from class: com.google.android.gms.internal.ads.nw1
            @Override // com.google.android.gms.internal.ads.uw1
            public final x3.d a(ya0 ya0Var2) {
                return this.f12267a.e(ya0Var2);
            }
        }, new uw1() { // from class: com.google.android.gms.internal.ads.ow1
            @Override // com.google.android.gms.internal.ads.uw1
            public final x3.d a(ya0 ya0Var2) {
                return this.f12653a.f(ya0Var2);
            }
        }, new gf3() { // from class: com.google.android.gms.internal.ads.mw1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(null);
            }
        });
    }
}
