package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ty2 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f15386k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Object f15387l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f15388m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f15389n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wg0 f15391b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final un1 f15395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f15396g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kz1 f15398i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kb0 f15399j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yy2 f15392c = bz2.N();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15393d = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15397h = false;

    public ty2(Context context, wg0 wg0Var, un1 un1Var, kz1 kz1Var, kb0 kb0Var) {
        this.f15390a = context;
        this.f15391b = wg0Var;
        this.f15395f = un1Var;
        this.f15398i = kz1Var;
        this.f15399j = kb0Var;
        this.f15396g = ((Boolean) h2.y.c().b(ns.B8)).booleanValue() ? j2.k2.E() : jb3.z();
    }

    public static boolean a() {
        boolean zBooleanValue;
        Boolean boolValueOf;
        synchronized (f15386k) {
            if (f15389n == null) {
                if (((Boolean) bu.f6040b.e()).booleanValue()) {
                    boolValueOf = Boolean.valueOf(Math.random() < ((Double) bu.f6039a.e()).doubleValue());
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                f15389n = boolValueOf;
            }
            zBooleanValue = f15389n.booleanValue();
        }
        return zBooleanValue;
    }

    public final void b(final iy2 iy2Var) {
        eh0.f7322a.d(new Runnable() { // from class: com.google.android.gms.internal.ads.sy2
            @Override // java.lang.Runnable
            public final void run() {
                this.f14862a.c(iy2Var);
            }
        });
    }

    final /* synthetic */ void c(iy2 iy2Var) {
        synchronized (f15388m) {
            if (!this.f15397h) {
                this.f15397h = true;
                if (a()) {
                    g2.t.r();
                    this.f15393d = j2.k2.Q(this.f15390a);
                    this.f15394e = x2.f.f().a(this.f15390a);
                    int iIntValue = ((Integer) h2.y.c().b(ns.w8)).intValue();
                    if (((Boolean) h2.y.c().b(ns.Oa)).booleanValue()) {
                        long j8 = iIntValue;
                        eh0.f7325d.scheduleWithFixedDelay(this, j8, j8, TimeUnit.MILLISECONDS);
                    } else {
                        long j9 = iIntValue;
                        eh0.f7325d.scheduleAtFixedRate(this, j9, j9, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
        if (a() && iy2Var != null) {
            synchronized (f15387l) {
                if (this.f15392c.u() >= ((Integer) h2.y.c().b(ns.x8)).intValue()) {
                    return;
                }
                vy2 vy2VarM = wy2.M();
                vy2VarM.N(iy2Var.l());
                vy2VarM.J(iy2Var.k());
                vy2VarM.A(iy2Var.b());
                vy2VarM.P(3);
                vy2VarM.G(this.f15391b.f16723a);
                vy2VarM.v(this.f15393d);
                vy2VarM.E(Build.VERSION.RELEASE);
                vy2VarM.K(Build.VERSION.SDK_INT);
                vy2VarM.O(iy2Var.n());
                vy2VarM.D(iy2Var.a());
                vy2VarM.y(this.f15394e);
                vy2VarM.M(iy2Var.m());
                vy2VarM.w(iy2Var.d());
                vy2VarM.z(iy2Var.f());
                vy2VarM.B(iy2Var.g());
                vy2VarM.C(this.f15395f.c(iy2Var.g()));
                vy2VarM.F(iy2Var.h());
                vy2VarM.x(iy2Var.e());
                vy2VarM.L(iy2Var.j());
                vy2VarM.H(iy2Var.i());
                vy2VarM.I(iy2Var.c());
                if (((Boolean) h2.y.c().b(ns.B8)).booleanValue()) {
                    vy2VarM.u(this.f15396g);
                }
                yy2 yy2Var = this.f15392c;
                zy2 zy2VarM = az2.M();
                zy2VarM.u(vy2VarM);
                yy2Var.v(zy2VarM);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrG;
        if (a()) {
            Object obj = f15387l;
            synchronized (obj) {
                if (this.f15392c.u() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        bArrG = ((bz2) this.f15392c.q()).g();
                        this.f15392c.w();
                    }
                    new jz1(this.f15390a, this.f15391b.f16723a, this.f15399j, Binder.getCallingUid()).a(new hz1((String) h2.y.c().b(ns.v8), 60000, new HashMap(), bArrG, "application/x-protobuf", false));
                } catch (Exception e8) {
                    if ((e8 instanceof gu1) && ((gu1) e8).a() == 3) {
                        return;
                    }
                    g2.t.q().t(e8, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }
}
