package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
final class ju2 implements iu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f9811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pu2 f9812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lu2 f9813c = new lu2();

    public ju2(pu2 pu2Var) {
        this.f9811a = new ConcurrentHashMap(pu2Var.f13144f);
        this.f9812b = pu2Var;
    }

    private final void e() {
        Parcelable.Creator<pu2> creator = pu2.CREATOR;
        if (((Boolean) h2.y.c().b(ns.f12154o6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9812b.f13142d);
            sb.append(" PoolCollection");
            sb.append(this.f9813c.b());
            int i8 = 0;
            for (Map.Entry entry : this.f9811a.entrySet()) {
                i8++;
                sb.append(i8);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((su2) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i9 = 0; i9 < ((gu2) entry.getValue()).b(); i9++) {
                    sb.append("[O]");
                }
                for (int iB = ((gu2) entry.getValue()).b(); iB < this.f9812b.f13144f; iB++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((gu2) entry.getValue()).g());
                sb.append("\n");
            }
            while (i8 < this.f9812b.f13143e) {
                i8++;
                sb.append(i8);
                sb.append(".\n");
            }
            qg0.b(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.iu2
    public final synchronized boolean a(su2 su2Var) {
        gu2 gu2Var = (gu2) this.f9811a.get(su2Var);
        if (gu2Var != null) {
            return gu2Var.b() < this.f9812b.f13144f;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.iu2
    @Deprecated
    public final su2 b(h2.r4 r4Var, String str, h2.c5 c5Var) {
        return new tu2(r4Var, str, new cb0(this.f9812b.f13140b).a().f6647k, this.f9812b.f13146h, c5Var);
    }

    @Override // com.google.android.gms.internal.ads.iu2
    public final synchronized ru2 c(su2 su2Var) {
        ru2 ru2VarE;
        gu2 gu2Var = (gu2) this.f9811a.get(su2Var);
        if (gu2Var != null) {
            ru2VarE = gu2Var.e();
            if (ru2VarE == null) {
                this.f9813c.e();
            }
            fv2 fv2VarF = gu2Var.f();
            if (ru2VarE != null) {
                ko koVarM = qo.M();
                io ioVarM = jo.M();
                ioVarM.x(2);
                mo moVarM = no.M();
                moVarM.u(fv2VarF.f8085a);
                moVarM.v(fv2VarF.f8086b);
                ioVarM.u(moVarM);
                koVarM.u(ioVarM);
                ru2VarE.f14345a.k().c().V((qo) koVarM.q());
            }
            e();
        } else {
            this.f9813c.f();
            e();
            ru2VarE = null;
        }
        return ru2VarE;
    }

    @Override // com.google.android.gms.internal.ads.iu2
    public final synchronized boolean d(su2 su2Var, ru2 ru2Var) {
        boolean zH;
        ConcurrentHashMap concurrentHashMap;
        gu2 gu2Var = (gu2) this.f9811a.get(su2Var);
        ru2Var.f14348d = g2.t.b().a();
        if (gu2Var == null) {
            pu2 pu2Var = this.f9812b;
            gu2 gu2Var2 = new gu2(pu2Var.f13144f, pu2Var.f13145g * 1000);
            if (this.f9811a.size() == this.f9812b.f13143e) {
                int i8 = this.f9812b.f13151m;
                int i9 = i8 - 1;
                su2 su2Var2 = null;
                if (i8 == 0) {
                    throw null;
                }
                long jC = Long.MAX_VALUE;
                if (i9 == 0) {
                    for (Map.Entry entry : this.f9811a.entrySet()) {
                        if (((gu2) entry.getValue()).c() < jC) {
                            jC = ((gu2) entry.getValue()).c();
                            su2Var2 = (su2) entry.getKey();
                        }
                    }
                    if (su2Var2 != null) {
                        concurrentHashMap = this.f9811a;
                        concurrentHashMap.remove(su2Var2);
                    }
                    this.f9813c.g();
                } else if (i9 != 1) {
                    if (i9 == 2) {
                        int iA = Integer.MAX_VALUE;
                        for (Map.Entry entry2 : this.f9811a.entrySet()) {
                            if (((gu2) entry2.getValue()).a() < iA) {
                                iA = ((gu2) entry2.getValue()).a();
                                su2Var2 = (su2) entry2.getKey();
                            }
                        }
                        if (su2Var2 != null) {
                            concurrentHashMap = this.f9811a;
                            concurrentHashMap.remove(su2Var2);
                        }
                    }
                    this.f9813c.g();
                } else {
                    for (Map.Entry entry3 : this.f9811a.entrySet()) {
                        if (((gu2) entry3.getValue()).d() < jC) {
                            jC = ((gu2) entry3.getValue()).d();
                            su2Var2 = (su2) entry3.getKey();
                        }
                    }
                    if (su2Var2 != null) {
                        concurrentHashMap = this.f9811a;
                        concurrentHashMap.remove(su2Var2);
                    }
                    this.f9813c.g();
                }
            }
            this.f9811a.put(su2Var, gu2Var2);
            this.f9813c.d();
            gu2Var = gu2Var2;
        }
        zH = gu2Var.h(ru2Var);
        this.f9813c.c();
        ku2 ku2VarA = this.f9813c.a();
        fv2 fv2VarF = gu2Var.f();
        ko koVarM = qo.M();
        io ioVarM = jo.M();
        ioVarM.x(2);
        oo ooVarM = po.M();
        ooVarM.u(ku2VarA.f10358a);
        ooVarM.v(ku2VarA.f10359b);
        ooVarM.w(fv2VarF.f8086b);
        ioVarM.w(ooVarM);
        koVarM.u(ioVarM);
        ru2Var.f14345a.k().c().R((qo) koVarM.q());
        e();
        return zH;
    }

    @Override // com.google.android.gms.internal.ads.iu2
    public final pu2 j() {
        return this.f9812b;
    }
}
