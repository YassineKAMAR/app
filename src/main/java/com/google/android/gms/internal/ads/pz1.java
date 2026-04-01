package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class pz1 implements e91, h2.a, b51, k41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kt2 f13227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ks2 f13228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wr2 f13229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q12 f13230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f13231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f13232g = ((Boolean) h2.y.c().b(ns.N6)).booleanValue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mx2 f13233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f13234i;

    public pz1(Context context, kt2 kt2Var, ks2 ks2Var, wr2 wr2Var, q12 q12Var, mx2 mx2Var, String str) {
        this.f13226a = context;
        this.f13227b = kt2Var;
        this.f13228c = ks2Var;
        this.f13229d = wr2Var;
        this.f13230e = q12Var;
        this.f13233h = mx2Var;
        this.f13234i = str;
    }

    private final lx2 a(String str) {
        lx2 lx2VarB = lx2.b(str);
        lx2VarB.h(this.f13228c, null);
        lx2VarB.f(this.f13229d);
        lx2VarB.a(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID, this.f13234i);
        if (!this.f13229d.f16907v.isEmpty()) {
            lx2VarB.a("ancn", (String) this.f13229d.f16907v.get(0));
        }
        if (this.f13229d.f16886k0) {
            lx2VarB.a("device_connectivity", true != g2.t.q().x(this.f13226a) ? "offline" : "online");
            lx2VarB.a("event_timestamp", String.valueOf(g2.t.b().a()));
            lx2VarB.a("offline_ad", "1");
        }
        return lx2VarB;
    }

    private final void b(lx2 lx2Var) {
        if (!this.f13229d.f16886k0) {
            this.f13233h.a(lx2Var);
            return;
        }
        this.f13230e.h(new s12(g2.t.b().a(), this.f13228c.f10323b.f9793b.f5462b, this.f13233h.b(lx2Var), 2));
    }

    private final boolean e() {
        if (this.f13231f == null) {
            synchronized (this) {
                if (this.f13231f == null) {
                    String str = (String) h2.y.c().b(ns.f12176r1);
                    g2.t.r();
                    String strQ = j2.k2.Q(this.f13226a);
                    boolean zMatches = false;
                    if (str != null && strQ != null) {
                        try {
                            zMatches = Pattern.matches(str, strQ);
                        } catch (RuntimeException e8) {
                            g2.t.q().u(e8, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f13231f = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f13231f.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void K(je1 je1Var) {
        if (this.f13232g) {
            lx2 lx2VarA = a("ifts");
            lx2VarA.a("reason", "exception");
            if (!TextUtils.isEmpty(je1Var.getMessage())) {
                lx2VarA.a("msg", je1Var.getMessage());
            }
            this.f13233h.a(lx2VarA);
        }
    }

    @Override // h2.a
    public final void Z() {
        if (this.f13229d.f16886k0) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void k() {
        if (this.f13232g) {
            mx2 mx2Var = this.f13233h;
            lx2 lx2VarA = a("ifts");
            lx2VarA.a("reason", "blocked");
            mx2Var.a(lx2VarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final void r() {
        if (e()) {
            this.f13233h.a(a("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.e91
    public final void t() {
        if (e()) {
            this.f13233h.a(a("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.k41
    public final void w(h2.z2 z2Var) {
        h2.z2 z2Var2;
        if (this.f13232g) {
            int i8 = z2Var.f22383a;
            String str = z2Var.f22384b;
            if (z2Var.f22385c.equals("com.google.android.gms.ads") && (z2Var2 = z2Var.f22386d) != null && !z2Var2.f22385c.equals("com.google.android.gms.ads")) {
                h2.z2 z2Var3 = z2Var.f22386d;
                i8 = z2Var3.f22383a;
                str = z2Var3.f22384b;
            }
            String strA = this.f13227b.a(str);
            lx2 lx2VarA = a("ifts");
            lx2VarA.a("reason", "adapter");
            if (i8 >= 0) {
                lx2VarA.a("arec", String.valueOf(i8));
            }
            if (strA != null) {
                lx2VarA.a("areec", strA);
            }
            this.f13233h.a(lx2VarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.b51
    public final void z() {
        if (e() || this.f13229d.f16886k0) {
            b(a("impression"));
        }
    }
}
