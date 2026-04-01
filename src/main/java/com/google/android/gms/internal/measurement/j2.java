package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.g2;

/* JADX INFO: loaded from: classes.dex */
final class j2 extends g2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f18823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f18824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ Context f18825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f18826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ g2 f18827i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j2(g2 g2Var, String str, String str2, Context context, Bundle bundle) {
        super(g2Var);
        this.f18827i = g2Var;
        this.f18823e = str;
        this.f18824f = str2;
        this.f18825g = context;
        this.f18826h = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.g2.a
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f18827i.K(this.f18823e, this.f18824f)) {
                String str4 = this.f18824f;
                str2 = this.f18823e;
                str3 = str4;
                str = this.f18827i.f18715a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            a3.o.j(this.f18825g);
            g2 g2Var = this.f18827i;
            g2Var.f18723i = g2Var.d(this.f18825g, true);
            if (this.f18827i.f18723i == null) {
                Log.w(this.f18827i.f18715a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f18825g, ModuleDescriptor.MODULE_ID);
            ((v1) a3.o.j(this.f18827i.f18723i)).initialize(g3.b.k3(this.f18825g), new e2(82001L, Math.max(iA, r0), DynamiteModule.c(this.f18825g, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f18826h, p3.p.a(this.f18825g)), this.f18724a);
        } catch (Exception e8) {
            this.f18827i.s(e8, true, false);
        }
    }
}
