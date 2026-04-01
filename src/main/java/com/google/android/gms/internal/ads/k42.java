package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class k42 implements e32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hy0 f9942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f9943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j50 f9944d;

    public k42(Context context, hy0 hy0Var) {
        this.f9941a = context;
        this.f9942b = hy0Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final void a(ks2 ks2Var, wr2 wr2Var, a32 a32Var) throws ys2 {
        try {
            ((y60) a32Var.f5001b).j5(wr2Var.f16868b0);
            i42 i42Var = null;
            if (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && wr2Var.f16882i0) {
                ((y60) a32Var.f5001b).Y3(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f9941a), new j42(this, a32Var, i42Var), (g50) a32Var.f5002c, ks2Var.f10322a.f8947a.f15303e);
            } else {
                ((y60) a32Var.f5001b).Z4(wr2Var.W, wr2Var.f16909x.toString(), ks2Var.f10322a.f8947a.f15302d, g3.b.k3(this.f9941a), new j42(this, a32Var, i42Var), (g50) a32Var.f5002c, ks2Var.f10322a.f8947a.f15303e);
            }
        } catch (RemoteException e8) {
            throw new ys2(e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ Object b(ks2 ks2Var, final wr2 wr2Var, final a32 a32Var) throws ys2 {
        final View view;
        if (((Boolean) h2.y.c().b(ns.D7)).booleanValue() && wr2Var.f16882i0) {
            try {
                view = (View) g3.b.H0(this.f9944d.m());
                boolean zN = this.f9944d.n();
                if (view == null) {
                    throw new ys2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zN) {
                    try {
                        view = (View) zf3.n(zf3.h(null), new gf3() { // from class: com.google.android.gms.internal.ads.h42
                            @Override // com.google.android.gms.internal.ads.gf3
                            public final x3.d a(Object obj) {
                                return this.f8625a.c(view, wr2Var, obj);
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
            view = this.f9943c;
        }
        kx0 kx0VarA = this.f9942b.a(new d01(ks2Var, wr2Var, a32Var.f5000a), new rx0(view, null, new lz0() { // from class: com.google.android.gms.internal.ads.g42
            @Override // com.google.android.gms.internal.ads.lz0
            public final h2.p2 j() throws ys2 {
                try {
                    return ((y60) a32Var.f5001b).m();
                } catch (RemoteException e10) {
                    throw new ys2(e10);
                }
            }
        }, (xr2) wr2Var.f16908w.get(0)));
        kx0VarA.i().A0(view);
        ((v42) a32Var.f5002c).P5(kx0VarA.f());
        return kx0VarA.h();
    }

    final /* synthetic */ x3.d c(View view, wr2 wr2Var, Object obj) {
        return zf3.h(zy0.a(this.f9941a, view, wr2Var));
    }
}
