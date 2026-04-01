package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class dp4 implements iq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final u31 f6853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f6854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f6855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nb[] f6856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6857e;

    public dp4(u31 u31Var, int[] iArr, int i8) {
        int length = iArr.length;
        uu1.f(length > 0);
        u31Var.getClass();
        this.f6853a = u31Var;
        this.f6854b = length;
        this.f6856d = new nb[length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f6856d[i9] = u31Var.b(iArr[i9]);
        }
        Arrays.sort(this.f6856d, new Comparator() { // from class: com.google.android.gms.internal.ads.cp4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((nb) obj2).f11789h - ((nb) obj).f11789h;
            }
        });
        this.f6855c = new int[this.f6854b];
        for (int i10 = 0; i10 < this.f6854b; i10++) {
            this.f6855c[i10] = u31Var.a(this.f6856d[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final int b(int i8) {
        return this.f6855c[0];
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final int d(int i8) {
        for (int i9 = 0; i9 < this.f6854b; i9++) {
            if (this.f6855c[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dp4 dp4Var = (dp4) obj;
            if (this.f6853a.equals(dp4Var.f6853a) && Arrays.equals(this.f6855c, dp4Var.f6855c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final nb f(int i8) {
        return this.f6856d[i8];
    }

    public final int hashCode() {
        int i8 = this.f6857e;
        if (i8 != 0) {
            return i8;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f6853a) * 31) + Arrays.hashCode(this.f6855c);
        this.f6857e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final int l() {
        return this.f6855c.length;
    }

    @Override // com.google.android.gms.internal.ads.mq4
    public final u31 m() {
        return this.f6853a;
    }
}
