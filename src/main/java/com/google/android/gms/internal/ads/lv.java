package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import o2.b;

/* JADX INFO: loaded from: classes.dex */
public final class lv extends b3.a {
    public static final Parcelable.Creator<lv> CREATOR = new mv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h2.k4 f11060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f11064j;

    public lv(int i8, boolean z7, int i9, boolean z8, int i10, h2.k4 k4Var, boolean z9, int i11, int i12, boolean z10) {
        this.f11055a = i8;
        this.f11056b = z7;
        this.f11057c = i9;
        this.f11058d = z8;
        this.f11059e = i10;
        this.f11060f = k4Var;
        this.f11061g = z9;
        this.f11062h = i11;
        this.f11064j = z10;
        this.f11063i = i12;
    }

    @Deprecated
    public lv(c2.e eVar) {
        this(4, eVar.f(), eVar.b(), eVar.e(), eVar.a(), eVar.d() != null ? new h2.k4(eVar.d()) : null, eVar.g(), eVar.c(), 0, false);
    }

    public static o2.b g(lv lvVar) {
        b.a aVar = new b.a();
        if (lvVar == null) {
            return aVar.a();
        }
        int i8 = lvVar.f11055a;
        if (i8 == 2) {
            aVar.c(lvVar.f11059e);
        } else {
            if (i8 != 3) {
                if (i8 == 4) {
                    aVar.e(lvVar.f11061g);
                    aVar.d(lvVar.f11062h);
                    aVar.b(lvVar.f11063i, lvVar.f11064j);
                }
            }
            h2.k4 k4Var = lvVar.f11060f;
            if (k4Var != null) {
                aVar.h(new z1.z(k4Var));
            }
            aVar.c(lvVar.f11059e);
        }
        aVar.g(lvVar.f11056b);
        aVar.f(lvVar.f11058d);
        return aVar.a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f11055a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.c(parcel, 2, this.f11056b);
        b3.c.k(parcel, 3, this.f11057c);
        b3.c.c(parcel, 4, this.f11058d);
        b3.c.k(parcel, 5, this.f11059e);
        b3.c.p(parcel, 6, this.f11060f, i8, false);
        b3.c.c(parcel, 7, this.f11061g);
        b3.c.k(parcel, 8, this.f11062h);
        b3.c.k(parcel, 9, this.f11063i);
        b3.c.c(parcel, 10, this.f11064j);
        b3.c.b(parcel, iA);
    }
}
