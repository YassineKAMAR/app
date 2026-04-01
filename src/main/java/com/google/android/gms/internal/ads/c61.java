package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c61 extends aa1 implements ey {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f6186b;

    c61(Set set) {
        super(set);
        this.f6186b = new Bundle();
    }

    public final synchronized Bundle A0() {
        return new Bundle(this.f6186b);
    }

    @Override // com.google.android.gms.internal.ads.ey
    public final synchronized void G(String str, Bundle bundle) {
        this.f6186b.putAll(bundle);
        z0(new z91() { // from class: com.google.android.gms.internal.ads.b61
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((r2.a) obj).h();
            }
        });
    }
}
