package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jb1 extends aa1 implements lb1 {
    public jb1(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void a(String str) {
        final String str2 = "MalformedJson";
        z0(new z91(str2) { // from class: com.google.android.gms.internal.ads.db1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f6654a = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((lb1) obj).a(this.f6654a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void b(final String str, final String str2) {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.gb1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((lb1) obj).b(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void e(final String str) {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.fb1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((lb1) obj).e(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void h(final String str) {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.hb1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((lb1) obj).h(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void m() {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.ib1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((lb1) obj).m();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.lb1
    public final void n() {
        z0(new z91() { // from class: com.google.android.gms.internal.ads.eb1
            @Override // com.google.android.gms.internal.ads.z91
            public final void a(Object obj) {
                ((lb1) obj).n();
            }
        });
    }
}
