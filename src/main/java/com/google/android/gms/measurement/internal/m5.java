package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.wg;
import com.google.android.gms.internal.measurement.zg;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class m5 implements zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ i5 f20256a;

    m5(i5 i5Var) {
        this.f20256a = i5Var;
    }

    @Override // com.google.android.gms.internal.measurement.zg
    public final void a(wg wgVar, String str, List<String> list, boolean z7, boolean z8) {
        p4 p4VarF;
        int i8 = o5.f20313a[wgVar.ordinal()];
        if (i8 == 1) {
            p4VarF = this.f20256a.t().F();
        } else if (i8 == 2) {
            n4 n4VarT = this.f20256a.t();
            p4VarF = z7 ? n4VarT.I() : !z8 ? n4VarT.H() : n4VarT.G();
        } else if (i8 != 3) {
            p4VarF = i8 != 4 ? this.f20256a.t().J() : this.f20256a.t().K();
        } else {
            n4 n4VarT2 = this.f20256a.t();
            p4VarF = z7 ? n4VarT2.N() : !z8 ? n4VarT2.M() : n4VarT2.L();
        }
        int size = list.size();
        if (size == 1) {
            p4VarF.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            p4VarF.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            p4VarF.a(str);
        } else {
            p4VarF.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
