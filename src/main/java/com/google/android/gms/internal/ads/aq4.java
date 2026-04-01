package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class aq4 extends cq4 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f5377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f5378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f5380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f5381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f5382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f5383m;

    /* JADX WARN: Multi-variable type inference failed */
    public aq4(int i8, u31 u31Var, int i9, tp4 tp4Var, int i10, String str) {
        int iK;
        super(i8, u31Var, i9);
        int i11 = 0;
        this.f5376f = gq4.s(i10, false);
        int i12 = this.f6448d.f11785d;
        int i13 = tp4Var.f5119v;
        this.f5377g = 1 == (i12 & 1);
        this.f5378h = (i12 & 2) != 0;
        jb3 jb3VarA = tp4Var.f5117t.isEmpty() ? jb3.A("") : tp4Var.f5117t;
        int i14 = 0;
        while (true) {
            if (i14 >= jb3VarA.size()) {
                i14 = Integer.MAX_VALUE;
                iK = 0;
                break;
            } else {
                iK = gq4.k(this.f6448d, (String) jb3VarA.get(i14), false);
                if (iK > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f5379i = i14;
        this.f5380j = iK;
        int i15 = this.f6448d.f11786e;
        int iBitCount = Integer.bitCount(0);
        this.f5381k = iBitCount;
        int i16 = this.f6448d.f11786e;
        this.f5383m = false;
        int iK2 = gq4.k(this.f6448d, str, gq4.o(str) == null);
        this.f5382l = iK2;
        boolean z7 = iK > 0 || (tp4Var.f5117t.isEmpty() && iBitCount > 0) || this.f5377g || (this.f5378h && iK2 > 0);
        if (gq4.s(i10, tp4Var.f15233r0) && z7) {
            i11 = 1;
        }
        this.f5375e = i11;
    }

    @Override // com.google.android.gms.internal.ads.cq4
    public final int a() {
        return this.f5375e;
    }

    @Override // com.google.android.gms.internal.ads.cq4
    public final /* bridge */ /* synthetic */ boolean c(cq4 cq4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aq4 aq4Var) {
        ya3 ya3VarB = ya3.i().d(this.f5376f, aq4Var.f5376f).c(Integer.valueOf(this.f5379i), Integer.valueOf(aq4Var.f5379i), tc3.c().a()).b(this.f5380j, aq4Var.f5380j).b(this.f5381k, aq4Var.f5381k).d(this.f5377g, aq4Var.f5377g).c(Boolean.valueOf(this.f5378h), Boolean.valueOf(aq4Var.f5378h), this.f5380j == 0 ? tc3.c() : tc3.c().a()).b(this.f5382l, aq4Var.f5382l);
        if (this.f5381k == 0) {
            ya3VarB = ya3VarB.e(false, false);
        }
        return ya3VarB.a();
    }
}
