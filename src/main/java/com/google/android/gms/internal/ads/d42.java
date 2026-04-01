package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d42 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hy0 f6570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f6571c;

    public d42(Context context, hy0 hy0Var, Executor executor) {
        this.f6569a = context;
        this.f6570b = hy0Var;
        this.f6571c = executor;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        h2.w4 w4Var;
        h2.w4 w4Var2 = ks2Var.f10322a.f8947a.f15303e;
        if (w4Var2.f22364n) {
            w4Var = new h2.w4(this.f6569a, z1.b0.d(w4Var2.f22355e, w4Var2.f22352b));
        } else {
            w4Var = (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && wr2Var.f16882i0) ? new h2.w4(this.f6569a, z1.b0.e(w4Var2.f22355e, w4Var2.f22352b)) : xs2.a(this.f6569a, wr2Var.f16908w);
        }
        h2.w4 w4Var3 = w4Var;
        if (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && wr2Var.f16882i0) {
            Object obj = a32Var.f5001b;
            ((qt2) obj).s(this.f6569a, w4Var3, ks2Var.f10322a.f8947a.f15302d, wr2Var.f16909x.toString(), j2.y0.l(wr2Var.f16905u), (g50) a32Var.f5002c);
            return;
        }
        Object obj2 = a32Var.f5001b;
        ((qt2) obj2).r(this.f6569a, w4Var3, ks2Var.f10322a.f8947a.f15302d, wr2Var.f16909x.toString(), j2.y0.l(wr2Var.f16905u), (g50) a32Var.f5002c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, final wr2 wr2Var, a32 a32Var) throws ys2 {
        final View viewF;
        if (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && wr2Var.f16882i0) {
            j50 j50VarH = ((qt2) a32Var.f5001b).h();
            if (j50VarH == null) {
                qg0.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new ys2(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewF = (View) g3.b.H0(j50VarH.m());
                boolean zN = j50VarH.n();
                if (viewF == null) {
                    throw new ys2(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zN) {
                    try {
                        viewF = (View) zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.b42
                            @Override // com.google.android.gms.internal.ads.gf3
                            public final x3.d a(Object obj) {
                                return this.f5598a.c(viewF, wr2Var, obj);
                            }
                        }, eh0.f7326e).get();
                    } catch (InterruptedException | ExecutionException e8) {
                        throw new ys2(e8);
                    }
                }
            } catch (RemoteException e9) {
                throw new ys2(e9);
            }
        } else {
            viewF = ((qt2) a32Var.f5001b).f();
        }
        hy0 hy0Var = this.f6570b;
        d01 d01Var = new d01(ks2Var, wr2Var, a32Var.f5000a);
        final qt2 qt2Var = (qt2) a32Var.f5001b;
        kx0 kx0VarA = hy0Var.a(d01Var, new rx0(viewF, null, new lz0() { // from class: com.google.android.gms.internal.ads.c42
            @Override // com.google.android.gms.internal.ads.lz0
            public final h2.p2 j() {
                return qt2Var.g();
            }
        }, (xr2) wr2Var.f16908w.get(0)));
        kx0VarA.i().A0(viewF);
        kx0VarA.c().w0(new xu0((qt2) a32Var.f5001b), this.f6571c);
        ((v42) a32Var.f5002c).P5(kx0VarA.g());
        return kx0VarA.h();
    }

    final /* synthetic */ x3.d c(View view, wr2 wr2Var, Object obj) {
        return zf3.h(zy0.a(this.f6569a, view, wr2Var));
    }
}
