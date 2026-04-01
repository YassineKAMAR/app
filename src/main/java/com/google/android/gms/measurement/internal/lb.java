package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lb extends b3.a {
    public static final Parcelable.Creator<lb> CREATOR = new mb();
    public final int A;
    public final String B;
    public final int C;
    public final long D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f20219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f20220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    private final long f20221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f20222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f20223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f20225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f20226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f20227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f20228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<String> f20229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f20230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f20231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f20232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f20233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f20234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f20235z;

    lb(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z7, boolean z8, String str6, long j11, long j12, int i8, boolean z9, boolean z10, String str7, Boolean bool, long j13, List<String> list, String str8, String str9, String str10, String str11, boolean z11, long j14, int i9, String str12, int i10, long j15) {
        a3.o.f(str);
        this.f20210a = str;
        this.f20211b = TextUtils.isEmpty(str2) ? null : str2;
        this.f20212c = str3;
        this.f20219j = j8;
        this.f20213d = str4;
        this.f20214e = j9;
        this.f20215f = j10;
        this.f20216g = str5;
        this.f20217h = z7;
        this.f20218i = z8;
        this.f20220k = str6;
        this.f20221l = j11;
        this.f20222m = j12;
        this.f20223n = i8;
        this.f20224o = z9;
        this.f20225p = z10;
        this.f20226q = str7;
        this.f20227r = bool;
        this.f20228s = j13;
        this.f20229t = list;
        this.f20230u = null;
        this.f20231v = str9;
        this.f20232w = str10;
        this.f20233x = str11;
        this.f20234y = z11;
        this.f20235z = j14;
        this.A = i9;
        this.B = str12;
        this.C = i10;
        this.D = j15;
    }

    lb(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z7, boolean z8, long j10, String str6, long j11, long j12, int i8, boolean z9, boolean z10, String str7, Boolean bool, long j13, List<String> list, String str8, String str9, String str10, String str11, boolean z11, long j14, int i9, String str12, int i10, long j15) {
        this.f20210a = str;
        this.f20211b = str2;
        this.f20212c = str3;
        this.f20219j = j10;
        this.f20213d = str4;
        this.f20214e = j8;
        this.f20215f = j9;
        this.f20216g = str5;
        this.f20217h = z7;
        this.f20218i = z8;
        this.f20220k = str6;
        this.f20221l = j11;
        this.f20222m = j12;
        this.f20223n = i8;
        this.f20224o = z9;
        this.f20225p = z10;
        this.f20226q = str7;
        this.f20227r = bool;
        this.f20228s = j13;
        this.f20229t = list;
        this.f20230u = str8;
        this.f20231v = str9;
        this.f20232w = str10;
        this.f20233x = str11;
        this.f20234y = z11;
        this.f20235z = j14;
        this.A = i9;
        this.B = str12;
        this.C = i10;
        this.D = j15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, this.f20210a, false);
        b3.c.q(parcel, 3, this.f20211b, false);
        b3.c.q(parcel, 4, this.f20212c, false);
        b3.c.q(parcel, 5, this.f20213d, false);
        b3.c.n(parcel, 6, this.f20214e);
        b3.c.n(parcel, 7, this.f20215f);
        b3.c.q(parcel, 8, this.f20216g, false);
        b3.c.c(parcel, 9, this.f20217h);
        b3.c.c(parcel, 10, this.f20218i);
        b3.c.n(parcel, 11, this.f20219j);
        b3.c.q(parcel, 12, this.f20220k, false);
        b3.c.n(parcel, 13, this.f20221l);
        b3.c.n(parcel, 14, this.f20222m);
        b3.c.k(parcel, 15, this.f20223n);
        b3.c.c(parcel, 16, this.f20224o);
        b3.c.c(parcel, 18, this.f20225p);
        b3.c.q(parcel, 19, this.f20226q, false);
        b3.c.d(parcel, 21, this.f20227r, false);
        b3.c.n(parcel, 22, this.f20228s);
        b3.c.s(parcel, 23, this.f20229t, false);
        b3.c.q(parcel, 24, this.f20230u, false);
        b3.c.q(parcel, 25, this.f20231v, false);
        b3.c.q(parcel, 26, this.f20232w, false);
        b3.c.q(parcel, 27, this.f20233x, false);
        b3.c.c(parcel, 28, this.f20234y);
        b3.c.n(parcel, 29, this.f20235z);
        b3.c.k(parcel, 30, this.A);
        b3.c.q(parcel, 31, this.B, false);
        b3.c.k(parcel, 32, this.C);
        b3.c.n(parcel, 34, this.D);
        b3.c.b(parcel, iA);
    }
}
