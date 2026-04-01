package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wc2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f16683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xn1 f16684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final js1 f16685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yc2 f16686d;

    public wc2(lg3 lg3Var, xn1 xn1Var, js1 js1Var, yc2 yc2Var) {
        this.f16683a = lg3Var;
        this.f16684b = xn1Var;
        this.f16685c = js1Var;
        this.f16686d = yc2Var;
    }

    final /* synthetic */ xc2 a() {
        List<String> listAsList = Arrays.asList(((String) h2.y.c().b(ns.f12158p1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                qt2 qt2VarC = this.f16684b.c(str, new JSONObject());
                qt2VarC.c();
                boolean zT = this.f16685c.t();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) h2.y.c().b(ns.Ga)).booleanValue() || zT) {
                    try {
                        m70 m70VarK = qt2VarC.k();
                        if (m70VarK != null) {
                            bundle2.putString("sdk_version", m70VarK.toString());
                        }
                    } catch (ys2 unused) {
                    }
                }
                try {
                    m70 m70VarJ = qt2VarC.j();
                    if (m70VarJ != null) {
                        bundle2.putString("adapter_version", m70VarJ.toString());
                    }
                } catch (ys2 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (ys2 unused3) {
            }
        }
        xc2 xc2Var = new xc2(bundle);
        if (((Boolean) h2.y.c().b(ns.Ga)).booleanValue()) {
            this.f16686d.b(xc2Var);
        }
        return xc2Var;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        fs fsVar = ns.Ga;
        if (((Boolean) h2.y.c().b(fsVar)).booleanValue() && this.f16686d.a() != null) {
            xc2 xc2VarA = this.f16686d.a();
            xc2VarA.getClass();
            return zf3.h(xc2VarA);
        }
        if (b93.d((String) h2.y.c().b(ns.f12158p1)) || (!((Boolean) h2.y.c().b(fsVar)).booleanValue() && (this.f16686d.d() || !this.f16685c.t()))) {
            return zf3.h(new xc2(new Bundle()));
        }
        this.f16686d.c(true);
        return this.f16683a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.vc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16102a.a();
            }
        });
    }
}
