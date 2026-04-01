package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ge;

/* JADX INFO: loaded from: classes.dex */
final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.y3 f19806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ pb f19807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(pb pbVar, String str, int i8, com.google.android.gms.internal.measurement.y3 y3Var) {
        super(str, i8);
        this.f19807h = pbVar;
        this.f19806g = y3Var;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final int a() {
        return this.f19806g.m();
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.c
    final boolean j() {
        return true;
    }

    final boolean k(Long l8, Long l9, com.google.android.gms.internal.measurement.f5 f5Var, boolean z7) {
        p4 p4VarL;
        String strG;
        String str;
        Boolean boolG;
        boolean z8 = ge.a() && this.f19807h.a().D(this.f19846a, e0.f19938h0);
        boolean zL = this.f19806g.L();
        boolean zM = this.f19806g.M();
        boolean zN = this.f19806g.N();
        boolean z9 = zL || zM || zN;
        Boolean boolD = null;
        boolD = null;
        if (z7 && !z9) {
            this.f19807h.t().K().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f19847b), this.f19806g.O() ? Integer.valueOf(this.f19806g.m()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.w3 w3VarH = this.f19806g.H();
        boolean zM2 = w3VarH.M();
        if (f5Var.c0()) {
            if (w3VarH.O()) {
                boolG = c.c(f5Var.T(), w3VarH.J());
                boolD = c.d(boolG, zM2);
            } else {
                p4VarL = this.f19807h.t().L();
                strG = this.f19807h.c().g(f5Var.Y());
                str = "No number filter for long property. property";
                p4VarL.b(str, strG);
            }
        } else if (!f5Var.a0()) {
            if (f5Var.e0()) {
                if (w3VarH.Q()) {
                    boolG = c.g(f5Var.Z(), w3VarH.K(), this.f19807h.t());
                } else if (!w3VarH.O()) {
                    p4VarL = this.f19807h.t().L();
                    strG = this.f19807h.c().g(f5Var.Y());
                    str = "No string or number filter defined. property";
                } else if (db.f0(f5Var.Z())) {
                    boolG = c.e(f5Var.Z(), w3VarH.J());
                } else {
                    this.f19807h.t().L().c("Invalid user property value for Numeric number filter. property, value", this.f19807h.c().g(f5Var.Y()), f5Var.Z());
                }
                boolD = c.d(boolG, zM2);
            } else {
                p4VarL = this.f19807h.t().L();
                strG = this.f19807h.c().g(f5Var.Y());
                str = "User property has no value, property";
            }
            p4VarL.b(str, strG);
        } else if (w3VarH.O()) {
            boolG = c.b(f5Var.F(), w3VarH.J());
            boolD = c.d(boolG, zM2);
        } else {
            p4VarL = this.f19807h.t().L();
            strG = this.f19807h.c().g(f5Var.Y());
            str = "No number filter for double property. property";
            p4VarL.b(str, strG);
        }
        this.f19807h.t().K().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f19848c = Boolean.TRUE;
        if (zN && !boolD.booleanValue()) {
            return true;
        }
        if (!z7 || this.f19806g.L()) {
            this.f19849d = boolD;
        }
        if (boolD.booleanValue() && z9 && f5Var.d0()) {
            long jV = f5Var.V();
            if (l8 != null) {
                jV = l8.longValue();
            }
            if (z8 && this.f19806g.L() && !this.f19806g.M() && l9 != null) {
                jV = l9.longValue();
            }
            if (this.f19806g.M()) {
                this.f19851f = Long.valueOf(jV);
            } else {
                this.f19850e = Long.valueOf(jV);
            }
        }
        return true;
    }
}
