package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tp4 extends a91 {
    private static final String A0;
    private static final String B0;
    private static final String C0;
    private static final String D0;
    private static final String E0;
    private static final String F0;
    private static final String G0;
    private static final String H0;
    private static final String I0;
    private static final String J0;
    private static final String K0;
    private static final String L0;
    private static final String M0;
    private static final String N0;
    private static final String O0;
    private static final String P0;
    public static final cf4 Q0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final tp4 f15219w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Deprecated
    public static final tp4 f15220x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f15221y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f15222z0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final boolean f15223h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final boolean f15224i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final boolean f15225j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f15226k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f15227l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f15228m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final boolean f15229n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f15230o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f15231p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f15232q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f15233r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f15234s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f15235t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final SparseArray f15236u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final SparseBooleanArray f15237v0;

    static {
        tp4 tp4Var = new tp4(new rp4());
        f15219w0 = tp4Var;
        f15220x0 = tp4Var;
        f15221y0 = Integer.toString(1000, 36);
        f15222z0 = Integer.toString(1001, 36);
        A0 = Integer.toString(1002, 36);
        B0 = Integer.toString(1003, 36);
        C0 = Integer.toString(1004, 36);
        D0 = Integer.toString(1005, 36);
        E0 = Integer.toString(1006, 36);
        F0 = Integer.toString(1007, 36);
        G0 = Integer.toString(1008, 36);
        H0 = Integer.toString(1009, 36);
        I0 = Integer.toString(1010, 36);
        J0 = Integer.toString(1011, 36);
        K0 = Integer.toString(1012, 36);
        L0 = Integer.toString(1013, 36);
        M0 = Integer.toString(1014, 36);
        N0 = Integer.toString(1015, 36);
        O0 = Integer.toString(1016, 36);
        P0 = Integer.toString(1017, 36);
        Q0 = new cf4() { // from class: com.google.android.gms.internal.ads.pp4
        };
    }

    private tp4(rp4 rp4Var) {
        super(rp4Var);
        this.f15223h0 = rp4Var.f14275q;
        this.f15224i0 = false;
        this.f15225j0 = rp4Var.f14276r;
        this.f15226k0 = false;
        this.f15227l0 = rp4Var.f14277s;
        this.f15228m0 = false;
        this.f15229n0 = false;
        this.f15230o0 = false;
        this.f15231p0 = false;
        this.f15232q0 = rp4Var.f14278t;
        this.f15233r0 = rp4Var.f14279u;
        this.f15234s0 = false;
        this.f15235t0 = rp4Var.f14280v;
        this.f15236u0 = rp4Var.f14281w;
        this.f15237v0 = rp4Var.f14282x;
    }

    public static tp4 d(Context context) {
        return new tp4(new rp4(context));
    }

    public final rp4 c() {
        return new rp4(this, null);
    }

    @Deprecated
    public final vp4 e(int i8, to4 to4Var) {
        Map map = (Map) this.f15236u0.get(i8);
        if (map != null) {
            return (vp4) map.get(to4Var);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.a91
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tp4.class == obj.getClass()) {
            tp4 tp4Var = (tp4) obj;
            if (super.equals(tp4Var) && this.f15223h0 == tp4Var.f15223h0 && this.f15225j0 == tp4Var.f15225j0 && this.f15227l0 == tp4Var.f15227l0 && this.f15232q0 == tp4Var.f15232q0 && this.f15233r0 == tp4Var.f15233r0 && this.f15235t0 == tp4Var.f15235t0) {
                SparseBooleanArray sparseBooleanArray = this.f15237v0;
                SparseBooleanArray sparseBooleanArray2 = tp4Var.f15237v0;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            SparseArray sparseArray = this.f15236u0;
                            SparseArray sparseArray2 = tp4Var.f15236u0;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i9 = 0; i9 < size2; i9++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i9));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i9);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                to4 to4Var = (to4) entry.getKey();
                                                if (!map2.containsKey(to4Var) || !nz2.e(entry.getValue(), map2.get(to4Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i8)) < 0) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i8) {
        return this.f15237v0.get(i8);
    }

    @Deprecated
    public final boolean g(int i8, to4 to4Var) {
        Map map = (Map) this.f15236u0.get(i8);
        return map != null && map.containsKey(to4Var);
    }

    @Override // com.google.android.gms.internal.ads.a91
    public final int hashCode() {
        return (((((((((((((super.hashCode() + 31) * 31) + (this.f15223h0 ? 1 : 0)) * 961) + (this.f15225j0 ? 1 : 0)) * 961) + (this.f15227l0 ? 1 : 0)) * 28629151) + (this.f15232q0 ? 1 : 0)) * 31) + (this.f15233r0 ? 1 : 0)) * 961) + (this.f15235t0 ? 1 : 0)) * 31;
    }
}
