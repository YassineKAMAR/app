package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import d2.a;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f5004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g23 f5005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i23 f5006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z23 f5007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z23 f5008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s3.h f5009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s3.h f5010h;

    a33(Context context, Executor executor, g23 g23Var, i23 i23Var, x23 x23Var, y23 y23Var) {
        this.f5003a = context;
        this.f5004b = executor;
        this.f5005c = g23Var;
        this.f5006d = i23Var;
        this.f5007e = x23Var;
        this.f5008f = y23Var;
    }

    public static a33 e(Context context, Executor executor, g23 g23Var, i23 i23Var) {
        final a33 a33Var = new a33(context, executor, g23Var, i23Var, new x23(), new y23());
        a33Var.f5009g = a33Var.f5006d.d() ? a33Var.h(new Callable() { // from class: com.google.android.gms.internal.ads.u23
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15455a.c();
            }
        }) : s3.k.e(a33Var.f5007e.j());
        a33Var.f5010h = a33Var.h(new Callable() { // from class: com.google.android.gms.internal.ads.v23
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15972a.d();
            }
        });
        return a33Var;
    }

    private static ze g(s3.h hVar, ze zeVar) {
        return !hVar.m() ? zeVar : (ze) hVar.j();
    }

    private final s3.h h(Callable callable) {
        return s3.k.c(this.f5004b, callable).d(this.f5004b, new s3.e() { // from class: com.google.android.gms.internal.ads.w23
            @Override // s3.e
            public final void d(Exception exc) {
                this.f16598a.f(exc);
            }
        });
    }

    public final ze a() {
        return g(this.f5009g, this.f5007e.j());
    }

    public final ze b() {
        return g(this.f5010h, this.f5008f.j());
    }

    final /* synthetic */ ze c() {
        ce ceVarM0 = ze.m0();
        a.C0100a c0100aA = d2.a.a(this.f5003a);
        String strA = c0100aA.a();
        if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(strA);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            strA = Base64.encodeToString(bArr, 11);
        }
        if (strA != null) {
            ceVarM0.t0(strA);
            ceVarM0.s0(c0100aA.b());
            ceVarM0.W(6);
        }
        return (ze) ceVarM0.q();
    }

    final /* synthetic */ ze d() throws PackageManager.NameNotFoundException {
        Context context = this.f5003a;
        return o23.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f5005c.c(2025, -1L, exc);
    }
}
