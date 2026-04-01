package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class np4 extends cq4 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f11978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f11979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final tp4 f11980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f11981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f11982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f11983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f11984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f11986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f11987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f11988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f11989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f11990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f11991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f11992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f11993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f11994v;

    /* JADX WARN: Multi-variable type inference failed */
    public np4(int i8, u31 u31Var, int i9, tp4 tp4Var, int i10, boolean z7, m83 m83Var) {
        int i11;
        int iK;
        int iK2;
        boolean z8;
        super(i8, u31Var, i9);
        this.f11980h = tp4Var;
        this.f11979g = gq4.o(this.f6448d.f11784c);
        int i12 = 0;
        this.f11981i = gq4.s(i10, false);
        int i13 = 0;
        while (true) {
            i11 = Integer.MAX_VALUE;
            if (i13 >= tp4Var.f5111n.size()) {
                i13 = Integer.MAX_VALUE;
                iK = 0;
                break;
            } else {
                iK = gq4.k(this.f6448d, (String) tp4Var.f5111n.get(i13), false);
                if (iK > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f11983k = i13;
        this.f11982j = iK;
        int i14 = this.f6448d.f11786e;
        this.f11984l = Integer.bitCount(0);
        nb nbVar = this.f6448d;
        int i15 = nbVar.f11786e;
        this.f11985m = true;
        this.f11988p = 1 == (nbVar.f11785d & 1);
        this.f11989q = nbVar.f11806y;
        this.f11990r = nbVar.f11807z;
        this.f11991s = nbVar.f11789h;
        this.f11978f = m83Var.a(nbVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = nz2.f12300a >= 24 ? configuration.getLocales().toLanguageTags().split(com.amazon.a.a.o.b.f.f3942a, -1) : new String[]{nz2.L(configuration.locale)};
        for (int i16 = 0; i16 < strArrSplit.length; i16++) {
            strArrSplit[i16] = nz2.b(strArrSplit[i16]);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= strArrSplit.length) {
                i17 = Integer.MAX_VALUE;
                iK2 = 0;
                break;
            } else {
                iK2 = gq4.k(this.f6448d, strArrSplit[i17], false);
                if (iK2 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f11986n = i17;
        this.f11987o = iK2;
        int i18 = 0;
        while (true) {
            if (i18 >= tp4Var.f5115r.size()) {
                break;
            }
            String str = this.f6448d.f11793l;
            if (str != null && str.equals(tp4Var.f5115r.get(i18))) {
                i11 = i18;
                break;
            }
            i18++;
        }
        this.f11992t = i11;
        this.f11993u = (i10 & 384) == 128;
        this.f11994v = (i10 & 64) == 64;
        tp4 tp4Var2 = this.f11980h;
        if (gq4.s(i10, tp4Var2.f15233r0) && ((z8 = this.f11978f) || tp4Var2.f15227l0)) {
            i12 = (!gq4.s(i10, false) || !z8 || this.f6448d.f11789h == -1 || (!tp4Var2.f15235t0 && z7)) ? 1 : 2;
        }
        this.f11977e = i12;
    }

    @Override // com.google.android.gms.internal.ads.cq4
    public final int a() {
        return this.f11977e;
    }

    @Override // com.google.android.gms.internal.ads.cq4
    public final /* bridge */ /* synthetic */ boolean c(cq4 cq4Var) {
        String str;
        np4 np4Var = (np4) cq4Var;
        boolean z7 = this.f11980h.f15230o0;
        nb nbVar = this.f6448d;
        int i8 = nbVar.f11806y;
        if (i8 == -1) {
            return false;
        }
        nb nbVar2 = np4Var.f6448d;
        if (i8 != nbVar2.f11806y || (str = nbVar.f11793l) == null || !TextUtils.equals(str, nbVar2.f11793l)) {
            return false;
        }
        boolean z8 = this.f11980h.f15229n0;
        int i9 = this.f6448d.f11807z;
        return i9 != -1 && i9 == np4Var.f6448d.f11807z && this.f11993u == np4Var.f11993u && this.f11994v == np4Var.f11994v;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(np4 np4Var) {
        tc3 tc3VarA = (this.f11978f && this.f11981i) ? gq4.f8455k : gq4.f8455k.a();
        ya3 ya3VarC = ya3.i().d(this.f11981i, np4Var.f11981i).c(Integer.valueOf(this.f11983k), Integer.valueOf(np4Var.f11983k), tc3.c().a()).b(this.f11982j, np4Var.f11982j).b(this.f11984l, np4Var.f11984l).d(this.f11988p, np4Var.f11988p).d(true, true).c(Integer.valueOf(this.f11986n), Integer.valueOf(np4Var.f11986n), tc3.c().a()).b(this.f11987o, np4Var.f11987o).d(this.f11978f, np4Var.f11978f).c(Integer.valueOf(this.f11992t), Integer.valueOf(np4Var.f11992t), tc3.c().a());
        Integer numValueOf = Integer.valueOf(this.f11991s);
        Integer numValueOf2 = Integer.valueOf(np4Var.f11991s);
        boolean z7 = this.f11980h.f5121x;
        ya3 ya3VarC2 = ya3VarC.c(numValueOf, numValueOf2, gq4.f8456l).d(this.f11993u, np4Var.f11993u).d(this.f11994v, np4Var.f11994v).c(Integer.valueOf(this.f11989q), Integer.valueOf(np4Var.f11989q), tc3VarA).c(Integer.valueOf(this.f11990r), Integer.valueOf(np4Var.f11990r), tc3VarA);
        Integer numValueOf3 = Integer.valueOf(this.f11991s);
        Integer numValueOf4 = Integer.valueOf(np4Var.f11991s);
        if (!nz2.e(this.f11979g, np4Var.f11979g)) {
            tc3VarA = gq4.f8456l;
        }
        return ya3VarC2.c(numValueOf3, numValueOf4, tc3VarA).a();
    }
}
