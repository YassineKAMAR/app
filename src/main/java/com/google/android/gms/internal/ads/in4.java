package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
final class in4 implements rm4, qm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm4[] f9299a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qm4 f9303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private to4 f9304f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final em4 f9307i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f9301c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f9302d = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private no4 f9306h = new dm4(new no4[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f9300b = new IdentityHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private rm4[] f9305g = new rm4[0];

    public in4(em4 em4Var, long[] jArr, rm4... rm4VarArr) {
        this.f9307i = em4Var;
        this.f9299a = rm4VarArr;
        for (int i8 = 0; i8 < rm4VarArr.length; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                this.f9299a[i8] = new gn4(rm4VarArr[i8], j8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final void a(long j8) {
        this.f9306h.a(j8);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long b(long j8) {
        long jB = this.f9305g[0].b(j8);
        int i8 = 1;
        while (true) {
            rm4[] rm4VarArr = this.f9305g;
            if (i8 >= rm4VarArr.length) {
                return jB;
            }
            if (rm4VarArr[i8].b(jB) != jB) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean c(sc4 sc4Var) {
        if (this.f9301c.isEmpty()) {
            return this.f9306h.c(sc4Var);
        }
        int size = this.f9301c.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((rm4) this.f9301c.get(i8)).c(sc4Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qm4
    public final void d(rm4 rm4Var) {
        this.f9301c.remove(rm4Var);
        if (!this.f9301c.isEmpty()) {
            return;
        }
        int i8 = 0;
        for (rm4 rm4Var2 : this.f9299a) {
            i8 += rm4Var2.o().f15203a;
        }
        u31[] u31VarArr = new u31[i8];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            rm4[] rm4VarArr = this.f9299a;
            if (i9 >= rm4VarArr.length) {
                this.f9304f = new to4(u31VarArr);
                qm4 qm4Var = this.f9303e;
                qm4Var.getClass();
                qm4Var.d(this);
                return;
            }
            to4 to4VarO = rm4VarArr[i9].o();
            int i11 = to4VarO.f15203a;
            int i12 = 0;
            while (i12 < i11) {
                u31 u31VarB = to4VarO.b(i12);
                u31 u31VarC = u31VarB.c(i9 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + u31VarB.f15466b);
                this.f9302d.put(u31VarC, u31VarB);
                u31VarArr[i10] = u31VarC;
                i12++;
                i10++;
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.mo4
    public final /* bridge */ /* synthetic */ void e(no4 no4Var) {
        qm4 qm4Var = this.f9303e;
        qm4Var.getClass();
        qm4Var.e(this);
    }

    public final rm4 f(int i8) {
        rm4 rm4Var = this.f9299a[i8];
        return rm4Var instanceof gn4 ? ((gn4) rm4Var).f8432a : rm4Var;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long g(iq4[] iq4VarArr, boolean[] zArr, lo4[] lo4VarArr, boolean[] zArr2, long j8) {
        int length;
        int length2 = iq4VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i8 = 0;
        while (true) {
            length = iq4VarArr.length;
            if (i8 >= length) {
                break;
            }
            lo4 lo4Var = lo4VarArr[i8];
            Integer num = lo4Var != null ? (Integer) this.f9300b.get(lo4Var) : null;
            iArr[i8] = num == null ? -1 : num.intValue();
            iq4 iq4Var = iq4VarArr[i8];
            if (iq4Var != null) {
                String str = iq4Var.m().f15466b;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        this.f9300b.clear();
        lo4[] lo4VarArr2 = new lo4[length];
        lo4[] lo4VarArr3 = new lo4[length];
        iq4[] iq4VarArr2 = new iq4[length];
        ArrayList arrayList = new ArrayList(this.f9299a.length);
        long j9 = j8;
        int i9 = 0;
        while (i9 < this.f9299a.length) {
            for (int i10 = 0; i10 < iq4VarArr.length; i10++) {
                lo4VarArr3[i10] = iArr[i10] == i9 ? lo4VarArr[i10] : null;
                if (iArr2[i10] == i9) {
                    iq4 iq4Var2 = iq4VarArr[i10];
                    iq4Var2.getClass();
                    u31 u31Var = (u31) this.f9302d.get(iq4Var2.m());
                    u31Var.getClass();
                    iq4VarArr2[i10] = new fn4(iq4Var2, u31Var);
                } else {
                    iq4VarArr2[i10] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            iq4[] iq4VarArr3 = iq4VarArr2;
            lo4[] lo4VarArr4 = lo4VarArr3;
            long jG = this.f9299a[i9].g(iq4VarArr2, zArr, lo4VarArr3, zArr2, j9);
            if (i9 == 0) {
                j9 = jG;
            } else if (jG != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i11 = 0; i11 < iq4VarArr.length; i11++) {
                if (iArr2[i11] == i9) {
                    lo4 lo4Var2 = lo4VarArr4[i11];
                    lo4Var2.getClass();
                    lo4VarArr2[i11] = lo4Var2;
                    this.f9300b.put(lo4Var2, Integer.valueOf(i9));
                    z7 = true;
                } else if (iArr[i11] == i9) {
                    uu1.f(lo4VarArr4[i11] == null);
                }
            }
            if (z7) {
                arrayList2.add(this.f9299a[i9]);
            }
            i9++;
            arrayList = arrayList2;
            iq4VarArr2 = iq4VarArr3;
            lo4VarArr3 = lo4VarArr4;
        }
        System.arraycopy(lo4VarArr2, 0, lo4VarArr, 0, length);
        rm4[] rm4VarArr = (rm4[]) arrayList.toArray(new rm4[0]);
        this.f9305g = rm4VarArr;
        this.f9306h = new dm4(rm4VarArr);
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void h(long j8, boolean z7) {
        for (rm4 rm4Var : this.f9305g) {
            rm4Var.h(j8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void i(qm4 qm4Var, long j8) {
        this.f9303e = qm4Var;
        Collections.addAll(this.f9301c, this.f9299a);
        int i8 = 0;
        while (true) {
            rm4[] rm4VarArr = this.f9299a;
            if (i8 >= rm4VarArr.length) {
                return;
            }
            rm4VarArr[i8].i(this, j8);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long k() {
        return this.f9306h.k();
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final long l() {
        return this.f9306h.l();
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final to4 o() {
        to4 to4Var = this.f9304f;
        to4Var.getClass();
        return to4Var;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long p() {
        long j8 = -9223372036854775807L;
        for (rm4 rm4Var : this.f9305g) {
            long jP = rm4Var.p();
            if (jP == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && rm4Var.b(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (rm4 rm4Var2 : this.f9305g) {
                    if (rm4Var2 == rm4Var) {
                        break;
                    }
                    if (rm4Var2.b(jP) != jP) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j8 = jP;
            } else if (jP != j8) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final long q(long j8, wd4 wd4Var) {
        rm4[] rm4VarArr = this.f9305g;
        return (rm4VarArr.length > 0 ? rm4VarArr[0] : this.f9299a[0]).q(j8, wd4Var);
    }

    @Override // com.google.android.gms.internal.ads.rm4
    public final void s() {
        int i8 = 0;
        while (true) {
            rm4[] rm4VarArr = this.f9299a;
            if (i8 >= rm4VarArr.length) {
                return;
            }
            rm4VarArr[i8].s();
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.rm4, com.google.android.gms.internal.ads.no4
    public final boolean y() {
        return this.f9306h.y();
    }
}
