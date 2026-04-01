package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dc1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f6670e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f6671f = Integer.toString(1, 36);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f6672g = Integer.toString(3, 36);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f6673h = Integer.toString(4, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final cf4 f6674i = new cf4() { // from class: com.google.android.gms.internal.ads.cb1
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u31 f6676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f6677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean[] f6678d;

    public dc1(u31 u31Var, boolean z7, int[] iArr, boolean[] zArr) {
        int i8 = u31Var.f15465a;
        this.f6675a = 1;
        this.f6676b = u31Var;
        this.f6677c = (int[]) iArr.clone();
        this.f6678d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f6676b.f15467c;
    }

    public final nb b(int i8) {
        return this.f6676b.b(0);
    }

    public final boolean c() {
        for (boolean z7 : this.f6678d) {
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i8) {
        return this.f6678d[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dc1.class == obj.getClass()) {
            dc1 dc1Var = (dc1) obj;
            if (this.f6676b.equals(dc1Var.f6676b) && Arrays.equals(this.f6677c, dc1Var.f6677c) && Arrays.equals(this.f6678d, dc1Var.f6678d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f6676b.hashCode() * 961) + Arrays.hashCode(this.f6677c)) * 31) + Arrays.hashCode(this.f6678d);
    }
}
