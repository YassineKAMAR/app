package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class pu2 extends b3.a {
    public static final Parcelable.Creator<pu2> CREATOR = new qu2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mu2[] f13139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mu2 f13142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13146h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13147i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f13148j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f13149k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f13150l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13151m;

    public pu2(int i8, int i9, int i10, int i11, String str, int i12, int i13) {
        mu2[] mu2VarArrValues = mu2.values();
        this.f13139a = mu2VarArrValues;
        int[] iArrA = nu2.a();
        this.f13149k = iArrA;
        int[] iArrA2 = ou2.a();
        this.f13150l = iArrA2;
        this.f13140b = null;
        this.f13141c = i8;
        this.f13142d = mu2VarArrValues[i8];
        this.f13143e = i9;
        this.f13144f = i10;
        this.f13145g = i11;
        this.f13146h = str;
        this.f13147i = i12;
        this.f13151m = iArrA[i12];
        this.f13148j = i13;
        int i14 = iArrA2[i13];
    }

    private pu2(Context context, mu2 mu2Var, int i8, int i9, int i10, String str, String str2, String str3) {
        this.f13139a = mu2.values();
        this.f13149k = nu2.a();
        this.f13150l = ou2.a();
        this.f13140b = context;
        this.f13141c = mu2Var.ordinal();
        this.f13142d = mu2Var;
        this.f13143e = i8;
        this.f13144f = i9;
        this.f13145g = i10;
        this.f13146h = str;
        int i11 = 2;
        if ("oldest".equals(str2)) {
            i11 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i11 = 3;
        }
        this.f13151m = i11;
        this.f13147i = i11 - 1;
        "onAdClosed".equals(str3);
        this.f13148j = 0;
    }

    public static pu2 g(mu2 mu2Var, Context context) {
        if (mu2Var == mu2.Rewarded) {
            return new pu2(context, mu2Var, ((Integer) h2.y.c().b(ns.f12163p6)).intValue(), ((Integer) h2.y.c().b(ns.f12215v6)).intValue(), ((Integer) h2.y.c().b(ns.f12231x6)).intValue(), (String) h2.y.c().b(ns.f12247z6), (String) h2.y.c().b(ns.f12181r6), (String) h2.y.c().b(ns.f12199t6));
        }
        if (mu2Var == mu2.Interstitial) {
            return new pu2(context, mu2Var, ((Integer) h2.y.c().b(ns.f12172q6)).intValue(), ((Integer) h2.y.c().b(ns.f12223w6)).intValue(), ((Integer) h2.y.c().b(ns.f12239y6)).intValue(), (String) h2.y.c().b(ns.A6), (String) h2.y.c().b(ns.f12190s6), (String) h2.y.c().b(ns.f12207u6));
        }
        if (mu2Var != mu2.AppOpen) {
            return null;
        }
        return new pu2(context, mu2Var, ((Integer) h2.y.c().b(ns.D6)).intValue(), ((Integer) h2.y.c().b(ns.F6)).intValue(), ((Integer) h2.y.c().b(ns.G6)).intValue(), (String) h2.y.c().b(ns.B6), (String) h2.y.c().b(ns.C6), (String) h2.y.c().b(ns.E6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f13141c;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.k(parcel, 2, this.f13143e);
        b3.c.k(parcel, 3, this.f13144f);
        b3.c.k(parcel, 4, this.f13145g);
        b3.c.q(parcel, 5, this.f13146h, false);
        b3.c.k(parcel, 6, this.f13147i);
        b3.c.k(parcel, 7, this.f13148j);
        b3.c.b(parcel, iA);
    }
}
