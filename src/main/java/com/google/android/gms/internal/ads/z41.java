package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z41 extends aa1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f18001b;

    public z41(Set set) {
        super(set);
        this.f18001b = false;
    }

    public final synchronized void j() {
        if (this.f18001b) {
            return;
        }
        z0(new z91() { // from class: com.google.android.gms.internal.ads.y41
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((b51) obj).z();
            }
        });
        this.f18001b = true;
    }
}
