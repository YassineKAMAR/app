package com.google.android.gms.internal.ads;

import java.util.Set;
import z1.y;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends aa1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17168b;

    protected xc1(Set set) {
        super(set);
    }

    public final synchronized void A0() {
        z0(vc1.f16101a);
        this.f17168b = true;
    }

    public final void j() {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.uc1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((y.a) obj).a();
            }
        });
    }

    public final void k() {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.tc1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((y.a) obj).c();
            }
        });
    }

    public final synchronized void l() {
        if (!this.f17168b) {
            z0(vc1.f16101a);
            this.f17168b = true;
        }
        z0(new z91() { // from class: com.google.android.gms.internal.ads.wc1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((y.a) obj).d();
            }
        });
    }
}
