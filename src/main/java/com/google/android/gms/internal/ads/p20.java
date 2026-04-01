package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p20 implements h20, f20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fm0 f12706a;

    /* JADX WARN: Multi-variable type inference failed */
    public p20(Context context, wg0 wg0Var, gh ghVar, g2.a aVar) throws qm0 {
        g2.t.B();
        fm0 fm0VarA = rm0.a(context, vn0.a(), "", false, false, null, null, wg0Var, null, null, null, vn.a(), null, null, null);
        this.f12706a = fm0VarA;
        ((View) fm0VarA).setWillNotDraw(true);
    }

    private static final void C(Runnable runnable) {
        h2.v.b();
        if (jg0.y()) {
            runnable.run();
        } else {
            j2.k2.f23991k.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final void D(String str, qz qzVar) {
        this.f12706a.f1(str, new o20(this, qzVar));
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void O(final String str) {
        C(new Runnable() { // from class: com.google.android.gms.internal.ads.m20
            @Override // java.lang.Runnable
            public final void run() {
                this.f11129a.k(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final /* synthetic */ void U(String str, Map map) {
        e20.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final void a(final String str) {
        C(new Runnable() { // from class: com.google.android.gms.internal.ads.l20
            @Override // java.lang.Runnable
            public final void run() {
                this.f10427a.j(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final /* synthetic */ void b(String str, String str2) {
        e20.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void d0(String str) {
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        C(new Runnable() { // from class: com.google.android.gms.internal.ads.n20
            @Override // java.lang.Runnable
            public final void run() {
                this.f11621a.u(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.d20
    public final /* synthetic */ void e(String str, JSONObject jSONObject) {
        e20.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void e0(final v20 v20Var) {
        this.f12706a.H().F(new sn0() { // from class: com.google.android.gms.internal.ads.k20
            @Override // com.google.android.gms.internal.ads.sn0
            public final void j() {
                long jA = g2.t.b().a();
                v20 v20Var2 = v20Var;
                final long j8 = v20Var2.f15968c;
                final ArrayList arrayList = v20Var2.f15967b;
                arrayList.add(Long.valueOf(jA - j8));
                j2.v1.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                e53 e53Var = j2.k2.f23991k;
                final n30 n30Var = v20Var2.f15966a;
                final m30 m30Var = v20Var2.f15969d;
                final h20 h20Var = v20Var2.f15970e;
                e53Var.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.r20
                    @Override // java.lang.Runnable
                    public final void run() {
                        n30Var.i(m30Var, h20Var, arrayList, j8);
                    }
                }, ((Integer) h2.y.c().b(ns.f12039c)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void g0(final String str) {
        C(new Runnable() { // from class: com.google.android.gms.internal.ads.j20
            @Override // java.lang.Runnable
            public final void run() {
                this.f9448a.p(str);
            }
        });
    }

    final /* synthetic */ void j(String str) {
        this.f12706a.a(str);
    }

    final /* synthetic */ void k(String str) {
        this.f12706a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void l() {
        this.f12706a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.o30
    public final void m(String str, final qz qzVar) {
        this.f12706a.b1(str, new e3.n() { // from class: com.google.android.gms.internal.ads.i20
            @Override // e3.n
            public final boolean apply(Object obj) {
                qz qzVar2 = (qz) obj;
                if (qzVar2 instanceof o20) {
                    return ((o20) qzVar2).f12347a.equals(qzVar);
                }
                return false;
            }
        });
    }

    final /* synthetic */ void p(String str) {
        this.f12706a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final boolean r() {
        return this.f12706a.i();
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final p30 t() {
        return new p30(this);
    }

    final /* synthetic */ void u(String str) {
        this.f12706a.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.q20
    public final /* synthetic */ void x0(String str, JSONObject jSONObject) {
        e20.d(this, str, jSONObject);
    }
}
