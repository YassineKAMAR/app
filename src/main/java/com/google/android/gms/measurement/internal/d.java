package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b3.a {
    public static final Parcelable.Creator<d> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hb f19879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f19883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f19884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f19885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d0 f19887k;

    d(d dVar) {
        a3.o.j(dVar);
        this.f19877a = dVar.f19877a;
        this.f19878b = dVar.f19878b;
        this.f19879c = dVar.f19879c;
        this.f19880d = dVar.f19880d;
        this.f19881e = dVar.f19881e;
        this.f19882f = dVar.f19882f;
        this.f19883g = dVar.f19883g;
        this.f19884h = dVar.f19884h;
        this.f19885i = dVar.f19885i;
        this.f19886j = dVar.f19886j;
        this.f19887k = dVar.f19887k;
    }

    d(String str, String str2, hb hbVar, long j8, boolean z7, String str3, d0 d0Var, long j9, d0 d0Var2, long j10, d0 d0Var3) {
        this.f19877a = str;
        this.f19878b = str2;
        this.f19879c = hbVar;
        this.f19880d = j8;
        this.f19881e = z7;
        this.f19882f = str3;
        this.f19883g = d0Var;
        this.f19884h = j9;
        this.f19885i = d0Var2;
        this.f19886j = j10;
        this.f19887k = d0Var3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, this.f19877a, false);
        b3.c.q(parcel, 3, this.f19878b, false);
        b3.c.p(parcel, 4, this.f19879c, i8, false);
        b3.c.n(parcel, 5, this.f19880d);
        b3.c.c(parcel, 6, this.f19881e);
        b3.c.q(parcel, 7, this.f19882f, false);
        b3.c.p(parcel, 8, this.f19883g, i8, false);
        b3.c.n(parcel, 9, this.f19884h);
        b3.c.p(parcel, 10, this.f19885i, i8, false);
        b3.c.n(parcel, 11, this.f19886j);
        b3.c.p(parcel, 12, this.f19887k, i8, false);
        b3.c.b(parcel, iA);
    }
}
