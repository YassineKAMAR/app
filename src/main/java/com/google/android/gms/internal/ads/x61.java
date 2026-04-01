package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x61 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x61 f17055e = new x61(null, new vf0[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final vf0 f17056f = new vf0(0).b(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f17057g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f17058h = Integer.toString(2, 36);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f17059i = Integer.toString(3, 36);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f17060j = Integer.toString(4, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final cf4 f17061k = new cf4() { // from class: com.google.android.gms.internal.ads.a
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vf0[] f17065d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17063b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17062a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17064c = 0;

    private x61(Object obj, vf0[] vf0VarArr, long j8, long j9, int i8) {
        this.f17065d = vf0VarArr;
    }

    public final vf0 a(int i8) {
        return i8 < 0 ? f17056f : this.f17065d[i8];
    }

    public final boolean b(int i8) {
        a(-1);
        cf4 cf4Var = vf0.f16138p;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x61.class == obj.getClass()) {
            x61 x61Var = (x61) obj;
            if (nz2.e(null, null) && Arrays.equals(this.f17065d, x61Var.f17065d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f17065d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
