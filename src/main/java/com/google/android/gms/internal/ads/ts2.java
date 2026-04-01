package com.google.android.gms.internal.ads;

import android.os.Bundle;
import c2.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ts2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2.k4 f15299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10 f15300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final va2 f15301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2.r4 f15302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h2.w4 f15303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f15304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f15305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f15306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lv f15307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h2.c5 f15308j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f15309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2.a f15310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2.g f15311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h2.a1 f15312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final gs2 f15313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f15314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f15315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h2.e1 f15316r;

    /* synthetic */ ts2(rs2 rs2Var, ss2 ss2Var) {
        this.f15303e = rs2Var.f14301b;
        this.f15304f = rs2Var.f14302c;
        this.f15316r = rs2Var.f14318s;
        int i8 = rs2Var.f14300a.f22252a;
        long j8 = rs2Var.f14300a.f22253b;
        Bundle bundle = rs2Var.f14300a.f22254c;
        int i9 = rs2Var.f14300a.f22255d;
        List list = rs2Var.f14300a.f22256e;
        boolean z7 = rs2Var.f14300a.f22257f;
        int i10 = rs2Var.f14300a.f22258g;
        boolean z8 = true;
        if (!rs2Var.f14300a.f22259h && !rs2Var.f14304e) {
            z8 = false;
        }
        this.f15302d = new h2.r4(i8, j8, bundle, i9, list, z7, i10, z8, rs2Var.f14300a.f22260i, rs2Var.f14300a.f22261j, rs2Var.f14300a.f22262k, rs2Var.f14300a.f22263l, rs2Var.f14300a.f22264m, rs2Var.f14300a.f22265n, rs2Var.f14300a.f22266o, rs2Var.f14300a.f22267p, rs2Var.f14300a.f22268q, rs2Var.f14300a.f22269r, rs2Var.f14300a.f22270s, rs2Var.f14300a.f22271t, rs2Var.f14300a.f22272u, rs2Var.f14300a.f22273v, j2.k2.A(rs2Var.f14300a.f22274w), rs2Var.f14300a.f22275x, rs2Var.f14300a.f22276y);
        this.f15299a = rs2Var.f14303d != null ? rs2Var.f14303d : rs2Var.f14307h != null ? rs2Var.f14307h.f11060f : null;
        this.f15305g = rs2Var.f14305f;
        this.f15306h = rs2Var.f14306g;
        this.f15307i = rs2Var.f14305f == null ? null : rs2Var.f14307h == null ? new lv(new e.a().a()) : rs2Var.f14307h;
        this.f15308j = rs2Var.f14308i;
        this.f15309k = rs2Var.f14312m;
        this.f15310l = rs2Var.f14309j;
        this.f15311m = rs2Var.f14310k;
        this.f15312n = rs2Var.f14311l;
        this.f15300b = rs2Var.f14313n;
        this.f15313o = new gs2(rs2Var.f14314o, null);
        this.f15314p = rs2Var.f14315p;
        this.f15301c = rs2Var.f14316q;
        this.f15315q = rs2Var.f14317r;
    }

    public final nx a() {
        c2.g gVar = this.f15311m;
        if (gVar == null && this.f15310l == null) {
            return null;
        }
        return gVar != null ? gVar.i() : this.f15310l.i();
    }

    public final boolean b() {
        return this.f15304f.matches((String) h2.y.c().b(ns.T2));
    }
}
