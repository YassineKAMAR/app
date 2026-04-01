package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ji3 implements po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f9641b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ut3 f9643d;

    protected ji3(boolean z7) {
        this.f9640a = z7;
    }

    protected final void F(int i8) {
        ut3 ut3Var = this.f9643d;
        int i9 = nz2.f12300a;
        for (int i10 = 0; i10 < this.f9642c; i10++) {
            ((g94) this.f9641b.get(i10)).j(this, ut3Var, this.f9640a, i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void a(g94 g94Var) {
        g94Var.getClass();
        if (this.f9641b.contains(g94Var)) {
            return;
        }
        this.f9641b.add(g94Var);
        this.f9642c++;
    }

    protected final void c() {
        ut3 ut3Var = this.f9643d;
        int i8 = nz2.f12300a;
        for (int i9 = 0; i9 < this.f9642c; i9++) {
            ((g94) this.f9641b.get(i9)).m(this, ut3Var, this.f9640a);
        }
        this.f9643d = null;
    }

    protected final void d(ut3 ut3Var) {
        for (int i8 = 0; i8 < this.f9642c; i8++) {
            ((g94) this.f9641b.get(i8)).i(this, ut3Var, this.f9640a);
        }
    }

    protected final void e(ut3 ut3Var) {
        this.f9643d = ut3Var;
        for (int i8 = 0; i8 < this.f9642c; i8++) {
            ((g94) this.f9641b.get(i8)).e(this, ut3Var, this.f9640a);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public /* synthetic */ Map m() {
        return Collections.emptyMap();
    }
}
