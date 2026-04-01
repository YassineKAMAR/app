package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class mp1 implements e91, h2.a, b51, k41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f11431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kt2 f11432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final eq1 f11433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ks2 f11434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wr2 f11435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q12 f11436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f11437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f11438h = ((Boolean) h2.y.c().b(ns.N6)).booleanValue();

    public mp1(Context context, kt2 kt2Var, eq1 eq1Var, ks2 ks2Var, wr2 wr2Var, q12 q12Var) {
        this.f11431a = context;
        this.f11432b = kt2Var;
        this.f11433c = eq1Var;
        this.f11434d = ks2Var;
        this.f11435e = wr2Var;
        this.f11436f = q12Var;
    }

    private final dq1 a(String str) {
        dq1 dq1VarA = this.f11433c.a();
        dq1VarA.e(this.f11434d.f10323b.f9793b);
        dq1VarA.d(this.f11435e);
        dq1VarA.b("action", str);
        if (!this.f11435e.f16907v.isEmpty()) {
            dq1VarA.b("ancn", (String) this.f11435e.f16907v.get(0));
        }
        if (this.f11435e.f16886k0) {
            dq1VarA.b("device_connectivity", true != g2.t.q().x(this.f11431a) ? "offline" : "online");
            dq1VarA.b("event_timestamp", String.valueOf(g2.t.b().a()));
            dq1VarA.b("offline_ad", "1");
        }
        if (((Boolean) h2.y.c().b(ns.W6)).booleanValue()) {
            boolean z7 = p2.y.e(this.f11434d.f10322a.f8947a) != 1;
            dq1VarA.b("scar", String.valueOf(z7));
            if (z7) {
                h2.r4 r4Var = this.f11434d.f10322a.f8947a.f15302d;
                dq1VarA.c("ragent", r4Var.f22267p);
                dq1VarA.c("rtype", p2.y.a(p2.y.b(r4Var)));
            }
        }
        return dq1VarA;
    }

    private final void b(dq1 dq1Var) {
        if (!this.f11435e.f16886k0) {
            dq1Var.g();
            return;
        }
        this.f11436f.h(new s12(g2.t.b().a(), this.f11434d.f10323b.f9793b.f5462b, dq1Var.f(), 2));
    }

    private final boolean e() {
        if (this.f11437g == null) {
            synchronized (this) {
                if (this.f11437g == null) {
                    String str = (String) h2.y.c().b(ns.f12176r1);
                    g2.t.r();
                    String strQ = j2.k2.Q(this.f11431a);
                    boolean zMatches = false;
                    if (str != null && strQ != null) {
                        try {
                            zMatches = Pattern.matches(str, strQ);
                        } catch (RuntimeException e8) {
                            g2.t.q().u(e8, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f11437g = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f11437g.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void K(je1 je1Var) {
        if (this.f11438h) {
            dq1 dq1VarA = a("ifts");
            dq1VarA.b("reason", "exception");
            if (!TextUtils.isEmpty(je1Var.getMessage())) {
                dq1VarA.b("msg", je1Var.getMessage());
            }
            dq1VarA.g();
        }
    }

    @Override // h2.a
    public final void Z() {
        if (this.f11435e.f16886k0) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void k() {
        if (this.f11438h) {
            dq1 dq1VarA = a("ifts");
            dq1VarA.b("reason", "blocked");
            dq1VarA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final void r() {
        if (e()) {
            a("adapter_shown").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final void t() {
        if (e()) {
            a("adapter_impression").g();
        }
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void w(h2.z2 z2Var) {
        h2.z2 z2Var2;
        if (this.f11438h) {
            dq1 dq1VarA = a("ifts");
            dq1VarA.b("reason", "adapter");
            int i8 = z2Var.f22383a;
            String str = z2Var.f22384b;
            if (z2Var.f22385c.equals("com.google.android.gms.ads") && (z2Var2 = z2Var.f22386d) != null && !z2Var2.f22385c.equals("com.google.android.gms.ads")) {
                h2.z2 z2Var3 = z2Var.f22386d;
                i8 = z2Var3.f22383a;
                str = z2Var3.f22384b;
            }
            if (i8 >= 0) {
                dq1VarA.b("arec", String.valueOf(i8));
            }
            String strA = this.f11432b.a(str);
            if (strA != null) {
                dq1VarA.b("areec", strA);
            }
            dq1VarA.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        if (e() || this.f11435e.f16886k0) {
            b(a("impression"));
        }
    }
}
