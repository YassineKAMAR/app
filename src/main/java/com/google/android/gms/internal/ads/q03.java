package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q03 implements j03 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static q03 f13237f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f13238a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f03 f13239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d03 f13240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private e03 f13241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i03 f13242e;

    public q03(f03 f03Var, d03 d03Var) {
        this.f13239b = f03Var;
        this.f13240c = d03Var;
    }

    public static q03 c() {
        if (f13237f == null) {
            f13237f = new q03(new f03(), new d03());
        }
        return f13237f;
    }

    public final float a() {
        return this.f13238a;
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final void b(boolean z7) {
        if (z7) {
            s13.d().i();
        } else {
            s13.d().h();
        }
    }

    public final void d(Context context) {
        this.f13241d = new e03(new Handler(), context, new c03(), this);
    }

    public final void e(float f8) {
        this.f13238a = f8;
        if (this.f13242e == null) {
            this.f13242e = i03.a();
        }
        Iterator it = this.f13242e.b().iterator();
        while (it.hasNext()) {
            ((uz2) it.next()).g().i(f8);
        }
    }

    public final void f() {
        h03.i().e(this);
        h03.i().f();
        s13.d().i();
        this.f13241d.a();
    }

    public final void g() {
        s13.d().j();
        h03.i().g();
        this.f13241d.b();
    }
}
