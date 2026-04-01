package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ae0 implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f5225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5227d;

    public ae0(Context context, String str) {
        this.f5224a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5226c = str;
        this.f5227d = false;
        this.f5225b = new Object();
    }

    public final String a() {
        return this.f5226c;
    }

    public final void b(boolean z7) {
        if (g2.t.p().z(this.f5224a)) {
            synchronized (this.f5225b) {
                if (this.f5227d == z7) {
                    return;
                }
                this.f5227d = z7;
                if (TextUtils.isEmpty(this.f5226c)) {
                    return;
                }
                if (this.f5227d) {
                    g2.t.p().m(this.f5224a, this.f5226c);
                } else {
                    g2.t.p().n(this.f5224a, this.f5226c);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tk
    public final void b0(sk skVar) {
        b(skVar.f14729j);
    }
}
