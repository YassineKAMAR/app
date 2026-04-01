package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g91 extends aa1 implements hy {
    public g91(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.hy
    public final synchronized void b(final String str, final String str2) {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.f91
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((a2.e) obj).w(str, str2);
            }
        });
    }
}
