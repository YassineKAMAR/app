package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class uy1 extends ia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f15925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nz1 f15926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final tt0 f15927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f15928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ty2 f15929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kb0 f15930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kz1 f15931h;

    public uy1(Context context, lg3 lg3Var, kb0 kb0Var, tt0 tt0Var, nz1 nz1Var, ArrayDeque arrayDeque, kz1 kz1Var, ty2 ty2Var) {
        ns.a(context);
        this.f15924a = context;
        this.f15925b = lg3Var;
        this.f15930g = kb0Var;
        this.f15926c = nz1Var;
        this.f15927d = tt0Var;
        this.f15928e = arrayDeque;
        this.f15931h = kz1Var;
        this.f15929f = ty2Var;
    }

    private final synchronized ry1 T5(String str) {
        Iterator it = this.f15928e.iterator();
        while (it.hasNext()) {
            ry1 ry1Var = (ry1) it.next();
            if (ry1Var.f14377c.equals(str)) {
                it.remove();
                return ry1Var;
            }
        }
        return null;
    }

    private static x3.d U5(x3.d dVar, bx2 bx2Var, c40 c40Var, qy2 qy2Var, ey2 ey2Var) {
        r30 r30VarA = c40Var.a("AFMA_getAdDictionary", y30.f17575b, new t30() { // from class: com.google.android.gms.internal.ads.ny1
            @Override // com.google.android.gms.internal.ads.t30
            public final Object a(JSONObject jSONObject) {
                return new bb0(jSONObject);
            }
        });
        py2.d(dVar, ey2Var);
        fw2 fw2VarA = bx2Var.b(vw2.BUILD_URL, dVar).f(r30VarA).a();
        py2.c(fw2VarA, qy2Var, ey2Var);
        return fw2VarA;
    }

    private static x3.d V5(ya0 ya0Var, bx2 bx2Var, final nj2 nj2Var) {
        gf3 gf3Var = new gf3() { // from class: com.google.android.gms.internal.ads.hy1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return nj2Var.b().a(h2.v.b().l((Bundle) obj));
            }
        };
        return bx2Var.b(vw2.GMS_SIGNALS, zf3.h(ya0Var.f17708a)).f(gf3Var).e(new dw2() { // from class: com.google.android.gms.internal.ads.iy1
            @Override // com.google.android.gms.internal.ads.dw2
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                j2.v1.k("Ad request signals:");
                j2.v1.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final synchronized void W5(ry1 ry1Var) {
        w();
        this.f15928e.addLast(ry1Var);
    }

    private final void X5(x3.d dVar, ua0 ua0Var) {
        zf3.r(zf3.n(dVar, new gf3() { // from class: com.google.android.gms.internal.ads.fy1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return zf3.h(ut2.a((InputStream) obj));
            }
        }, eh0.f7322a), new qy1(this, ua0Var), eh0.f7327f);
    }

    private final synchronized void w() {
        int iIntValue = ((Long) qu.f13766c.e()).intValue();
        while (this.f15928e.size() >= iIntValue) {
            this.f15928e.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void M3(ya0 ya0Var, ua0 ua0Var) {
        X5(O5(ya0Var, Binder.getCallingUid()), ua0Var);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void N4(ya0 ya0Var, ua0 ua0Var) {
        x3.d dVarP5 = P5(ya0Var, Binder.getCallingUid());
        X5(dVarP5, ua0Var);
        if (((Boolean) ju.f9805c.e()).booleanValue()) {
            nz1 nz1Var = this.f15926c;
            nz1Var.getClass();
            dVarP5.c(new my1(nz1Var), this.f15925b);
        }
    }

    public final x3.d O5(final ya0 ya0Var, int i8) {
        if (!((Boolean) qu.f13764a.e()).booleanValue()) {
            return zf3.g(new Exception("Split request is disabled."));
        }
        pu2 pu2Var = ya0Var.f17716i;
        if (pu2Var == null) {
            return zf3.g(new Exception("Pool configuration missing from request."));
        }
        if (pu2Var.f13143e == 0 || pu2Var.f13144f == 0) {
            return zf3.g(new Exception("Caching is disabled."));
        }
        c40 c40VarB = g2.t.h().b(this.f15924a, wg0.g(), this.f15929f);
        nj2 nj2VarA = this.f15927d.a(ya0Var, i8);
        bx2 bx2VarC = nj2VarA.c();
        final x3.d dVarV5 = V5(ya0Var, bx2VarC, nj2VarA);
        qy2 qy2VarD = nj2VarA.d();
        final ey2 ey2VarA = dy2.a(this.f15924a, 9);
        final x3.d dVarU5 = U5(dVarV5, bx2VarC, c40VarB, qy2VarD, ey2VarA);
        return bx2VarC.a(vw2.GET_URL_AND_CACHE_KEY, dVarV5, dVarU5).a(new Callable() { // from class: com.google.android.gms.internal.ads.ly1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f11087a.S5(dVarU5, dVarV5, ya0Var, ey2VarA);
            }
        }).a();
    }

    public final x3.d P5(ya0 ya0Var, int i8) {
        String str;
        iw2 iw2VarA;
        Callable callable;
        c40 c40VarB = g2.t.h().b(this.f15924a, wg0.g(), this.f15929f);
        nj2 nj2VarA = this.f15927d.a(ya0Var, i8);
        r30 r30VarA = c40VarB.a("google.afma.response.normalize", ty1.f15382d, y30.f17576c);
        ry1 ry1VarT5 = null;
        if (((Boolean) qu.f13764a.e()).booleanValue()) {
            ry1VarT5 = T5(ya0Var.f17715h);
            if (ry1VarT5 == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                j2.v1.k(str);
            }
        } else {
            String str2 = ya0Var.f17717j;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                j2.v1.k(str);
            }
        }
        ey2 ey2VarA = ry1VarT5 == null ? dy2.a(this.f15924a, 9) : ry1VarT5.f14379e;
        qy2 qy2VarD = nj2VarA.d();
        qy2VarD.d(ya0Var.f17708a.getStringArrayList("ad_types"));
        mz1 mz1Var = new mz1(ya0Var.f17714g, qy2VarD, ey2VarA);
        jz1 jz1Var = new jz1(this.f15924a, ya0Var.f17709b.f16723a, this.f15930g, i8);
        bx2 bx2VarC = nj2VarA.c();
        ey2 ey2VarA2 = dy2.a(this.f15924a, 11);
        if (ry1VarT5 == null) {
            final x3.d dVarV5 = V5(ya0Var, bx2VarC, nj2VarA);
            final x3.d dVarU5 = U5(dVarV5, bx2VarC, c40VarB, qy2VarD, ey2VarA);
            ey2 ey2VarA3 = dy2.a(this.f15924a, 10);
            final fw2 fw2VarA = bx2VarC.a(vw2.HTTP, dVarU5, dVarV5).a(new Callable() { // from class: com.google.android.gms.internal.ads.jy1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new lz1((JSONObject) dVarV5.get(), (bb0) dVarU5.get());
                }
            }).e(mz1Var).e(new ky2(ey2VarA3)).e(jz1Var).a();
            py2.a(fw2VarA, qy2VarD, ey2VarA3);
            py2.d(fw2VarA, ey2VarA2);
            iw2VarA = bx2VarC.a(vw2.PRE_PROCESS, dVarV5, dVarU5, fw2VarA);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.ky1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new ty1((iz1) fw2VarA.get(), (JSONObject) dVarV5.get(), (bb0) dVarU5.get());
                }
            };
        } else {
            lz1 lz1Var = new lz1(ry1VarT5.f14376b, ry1VarT5.f14375a);
            ey2 ey2VarA4 = dy2.a(this.f15924a, 10);
            final fw2 fw2VarA2 = bx2VarC.b(vw2.HTTP, zf3.h(lz1Var)).e(mz1Var).e(new ky2(ey2VarA4)).e(jz1Var).a();
            py2.a(fw2VarA2, qy2VarD, ey2VarA4);
            final x3.d dVarH = zf3.h(ry1VarT5);
            py2.d(fw2VarA2, ey2VarA2);
            iw2VarA = bx2VarC.a(vw2.PRE_PROCESS, fw2VarA2, dVarH);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.gy1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    iz1 iz1Var = (iz1) fw2VarA2.get();
                    x3.d dVar = dVarH;
                    return new ty1(iz1Var, ((ry1) dVar.get()).f14376b, ((ry1) dVar.get()).f14375a);
                }
            };
        }
        fw2 fw2VarA3 = iw2VarA.a(callable).f(r30VarA).a();
        py2.a(fw2VarA3, qy2VarD, ey2VarA2);
        return fw2VarA3;
    }

    public final x3.d Q5(ya0 ya0Var, int i8) {
        c40 c40VarB = g2.t.h().b(this.f15924a, wg0.g(), this.f15929f);
        if (!((Boolean) vu.f16475a.e()).booleanValue()) {
            return zf3.g(new Exception("Signal collection disabled."));
        }
        nj2 nj2VarA = this.f15927d.a(ya0Var, i8);
        final ri2 ri2VarA = nj2VarA.a();
        r30 r30VarA = c40VarB.a("google.afma.request.getSignals", y30.f17575b, y30.f17576c);
        ey2 ey2VarA = dy2.a(this.f15924a, 22);
        fw2 fw2VarA = nj2VarA.c().b(vw2.GET_SIGNALS, zf3.h(ya0Var.f17708a)).e(new ky2(ey2VarA)).f(new gf3() { // from class: com.google.android.gms.internal.ads.oy1
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) throws JSONException {
                return ri2VarA.a(h2.v.b().l((Bundle) obj));
            }
        }).b(vw2.JS_SIGNALS).f(r30VarA).a();
        qy2 qy2VarD = nj2VarA.d();
        qy2VarD.d(ya0Var.f17708a.getStringArrayList("ad_types"));
        py2.b(fw2VarA, qy2VarD, ey2VarA);
        if (((Boolean) ju.f9807e.e()).booleanValue()) {
            nz1 nz1Var = this.f15926c;
            nz1Var.getClass();
            fw2VarA.c(new my1(nz1Var), this.f15925b);
        }
        return fw2VarA;
    }

    public final x3.d R5(String str) {
        if (((Boolean) qu.f13764a.e()).booleanValue()) {
            return T5(str) == null ? zf3.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zf3.h(new py1(this));
        }
        return zf3.g(new Exception("Split request is disabled."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream S5(x3.d dVar, x3.d dVar2, ya0 ya0Var, ey2 ey2Var) {
        String strC = ((bb0) dVar.get()).c();
        W5(new ry1((bb0) dVar.get(), (JSONObject) dVar2.get(), ya0Var.f17715h, strC, ey2Var));
        return new ByteArrayInputStream(strC.getBytes(x73.f17098c));
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void m5(ya0 ya0Var, ua0 ua0Var) {
        X5(Q5(ya0Var, Binder.getCallingUid()), ua0Var);
    }

    @Override // com.google.android.gms.internal.ads.ja0
    public final void u3(String str, ua0 ua0Var) {
        X5(R5(str), ua0Var);
    }
}
