package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ac1 extends aa1 implements tk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f5194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f5195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wr2 f5196d;

    public ac1(Context context, Set set, wr2 wr2Var) {
        super(set);
        this.f5194b = new WeakHashMap(1);
        this.f5195c = context;
        this.f5196d = wr2Var;
    }

    public final synchronized void A0(View view) {
        uk ukVar = (uk) this.f5194b.get(view);
        if (ukVar == null) {
            uk ukVar2 = new uk(this.f5195c, view);
            ukVar2.c(this);
            this.f5194b.put(view, ukVar2);
            ukVar = ukVar2;
        }
        if (this.f5196d.Z) {
            if (((Boolean) h2.y.c().b(ns.f12131m1)).booleanValue()) {
                ukVar.g(((Long) h2.y.c().b(ns.f12122l1)).longValue());
                return;
            }
        }
        ukVar.f();
    }

    public final synchronized void B0(View view) {
        if (this.f5194b.containsKey(view)) {
            ((uk) this.f5194b.get(view)).e(this);
            this.f5194b.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final synchronized void b0(final sk skVar) {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.zb1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((tk) obj).b0(skVar);
            }
        });
    }
}
