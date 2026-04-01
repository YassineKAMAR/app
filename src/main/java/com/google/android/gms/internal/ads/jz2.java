package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class jz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f9846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vg0 f9847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ty2 f9848d;

    jz2(Context context, Executor executor, vg0 vg0Var, ty2 ty2Var) {
        this.f9845a = context;
        this.f9846b = executor;
        this.f9847c = vg0Var;
        this.f9848d = ty2Var;
    }

    final /* synthetic */ void a(String str) {
        this.f9847c.a(str);
    }

    final /* synthetic */ void b(String str, qy2 qy2Var) {
        ey2 ey2VarA = dy2.a(this.f9845a, 14);
        ey2VarA.o();
        ey2VarA.C0(this.f9847c.a(str));
        if (qy2Var == null) {
            this.f9848d.b(ey2VarA.u());
        } else {
            qy2Var.a(ey2VarA);
            qy2Var.g();
        }
    }

    public final void c(final String str, final qy2 qy2Var) {
        if (ty2.a() && ((Boolean) bu.f6042d.e()).booleanValue()) {
            this.f9846b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.iz2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9424a.b(str, qy2Var);
                }
            });
        } else {
            this.f9846b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hz2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9022a.a(str);
                }
            });
        }
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c((String) it.next(), null);
        }
    }
}
