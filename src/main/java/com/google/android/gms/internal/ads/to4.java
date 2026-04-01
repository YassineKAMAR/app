package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class to4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final to4 f15200d = new to4(new u31[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f15201e = Integer.toString(0, 36);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cf4 f15202f = new cf4() { // from class: com.google.android.gms.internal.ads.so4
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jb3 f15204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15205c;

    /* JADX WARN: Multi-variable type inference failed */
    public to4(u31... u31VarArr) {
        this.f15204b = jb3.y(u31VarArr);
        this.f15203a = u31VarArr.length;
        int i8 = 0;
        while (i8 < this.f15204b.size()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < this.f15204b.size(); i10++) {
                if (((u31) this.f15204b.get(i8)).equals(this.f15204b.get(i10))) {
                    pf2.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i8 = i9;
        }
    }

    public final int a(u31 u31Var) {
        int iIndexOf = this.f15204b.indexOf(u31Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u31 b(int i8) {
        return (u31) this.f15204b.get(i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && to4.class == obj.getClass()) {
            to4 to4Var = (to4) obj;
            if (this.f15203a == to4Var.f15203a && this.f15204b.equals(to4Var.f15204b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f15205c;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = this.f15204b.hashCode();
        this.f15205c = iHashCode;
        return iHashCode;
    }
}
