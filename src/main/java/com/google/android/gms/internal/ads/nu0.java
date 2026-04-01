package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nu0 implements wt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2.x1 f12263b = g2.t.q().h();

    public nu0(Context context) {
        this.f12262a = context;
    }

    @Override // com.google.android.gms.internal.ads.wt0
    public final void a(Map map) {
        if (map.isEmpty()) {
            return;
        }
        String str = (String) map.get("gad_idless");
        if (str != null) {
            j2.x1 x1Var = this.f12263b;
            boolean z7 = Boolean.parseBoolean(str);
            x1Var.v(z7);
            if (z7) {
                Context context = this.f12262a;
                if (((Boolean) h2.y.c().b(ns.f12073f6)).booleanValue()) {
                    context.deleteDatabase("OfflineUpload.db");
                }
                try {
                    i53 i53VarK = i53.k(context);
                    j53 j53VarJ = j53.j(context);
                    i53VarK.l();
                    i53VarK.m();
                    j53VarJ.k();
                    if (((Boolean) h2.y.c().b(ns.M2)).booleanValue()) {
                        j53VarJ.l();
                    }
                    if (((Boolean) h2.y.c().b(ns.N2)).booleanValue()) {
                        j53VarJ.m();
                    }
                } catch (IOException e8) {
                    g2.t.q().u(e8, "clearStorageOnIdlessMode");
                }
            }
        }
        map.remove("gad_idless");
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        g2.t.p().w(bundle);
    }
}
