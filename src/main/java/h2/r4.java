package h2;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.rg0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends b3.a {
    public static final Parcelable.Creator<r4> CREATOR = new t4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public final long f22253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f22254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public final int f22255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h4 f22261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Location f22262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f22263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f22264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bundle f22265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f22266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f22267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f22268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public final boolean f22269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f22270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f22271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f22272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f22273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f22274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f22275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f22276y;

    public r4(int i8, long j8, Bundle bundle, int i9, List list, boolean z7, int i10, boolean z8, String str, h4 h4Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z9, y0 y0Var, int i11, String str5, List list3, int i12, String str6, int i13) {
        this.f22252a = i8;
        this.f22253b = j8;
        this.f22254c = bundle == null ? new Bundle() : bundle;
        this.f22255d = i9;
        this.f22256e = list;
        this.f22257f = z7;
        this.f22258g = i10;
        this.f22259h = z8;
        this.f22260i = str;
        this.f22261j = h4Var;
        this.f22262k = location;
        this.f22263l = str2;
        this.f22264m = bundle2 == null ? new Bundle() : bundle2;
        this.f22265n = bundle3;
        this.f22266o = list2;
        this.f22267p = str3;
        this.f22268q = str4;
        this.f22269r = z9;
        this.f22270s = y0Var;
        this.f22271t = i11;
        this.f22272u = str5;
        this.f22273v = list3 == null ? new ArrayList() : list3;
        this.f22274w = i12;
        this.f22275x = str6;
        this.f22276y = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return this.f22252a == r4Var.f22252a && this.f22253b == r4Var.f22253b && rg0.a(this.f22254c, r4Var.f22254c) && this.f22255d == r4Var.f22255d && a3.n.a(this.f22256e, r4Var.f22256e) && this.f22257f == r4Var.f22257f && this.f22258g == r4Var.f22258g && this.f22259h == r4Var.f22259h && a3.n.a(this.f22260i, r4Var.f22260i) && a3.n.a(this.f22261j, r4Var.f22261j) && a3.n.a(this.f22262k, r4Var.f22262k) && a3.n.a(this.f22263l, r4Var.f22263l) && rg0.a(this.f22264m, r4Var.f22264m) && rg0.a(this.f22265n, r4Var.f22265n) && a3.n.a(this.f22266o, r4Var.f22266o) && a3.n.a(this.f22267p, r4Var.f22267p) && a3.n.a(this.f22268q, r4Var.f22268q) && this.f22269r == r4Var.f22269r && this.f22271t == r4Var.f22271t && a3.n.a(this.f22272u, r4Var.f22272u) && a3.n.a(this.f22273v, r4Var.f22273v) && this.f22274w == r4Var.f22274w && a3.n.a(this.f22275x, r4Var.f22275x) && this.f22276y == r4Var.f22276y;
    }

    public final int hashCode() {
        return a3.n.b(Integer.valueOf(this.f22252a), Long.valueOf(this.f22253b), this.f22254c, Integer.valueOf(this.f22255d), this.f22256e, Boolean.valueOf(this.f22257f), Integer.valueOf(this.f22258g), Boolean.valueOf(this.f22259h), this.f22260i, this.f22261j, this.f22262k, this.f22263l, this.f22264m, this.f22265n, this.f22266o, this.f22267p, this.f22268q, Boolean.valueOf(this.f22269r), Integer.valueOf(this.f22271t), this.f22272u, this.f22273v, Integer.valueOf(this.f22274w), this.f22275x, Integer.valueOf(this.f22276y));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f22252a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.n(parcel, 2, this.f22253b);
        b3.c.e(parcel, 3, this.f22254c, false);
        b3.c.k(parcel, 4, this.f22255d);
        b3.c.s(parcel, 5, this.f22256e, false);
        b3.c.c(parcel, 6, this.f22257f);
        b3.c.k(parcel, 7, this.f22258g);
        b3.c.c(parcel, 8, this.f22259h);
        b3.c.q(parcel, 9, this.f22260i, false);
        b3.c.p(parcel, 10, this.f22261j, i8, false);
        b3.c.p(parcel, 11, this.f22262k, i8, false);
        b3.c.q(parcel, 12, this.f22263l, false);
        b3.c.e(parcel, 13, this.f22264m, false);
        b3.c.e(parcel, 14, this.f22265n, false);
        b3.c.s(parcel, 15, this.f22266o, false);
        b3.c.q(parcel, 16, this.f22267p, false);
        b3.c.q(parcel, 17, this.f22268q, false);
        b3.c.c(parcel, 18, this.f22269r);
        b3.c.p(parcel, 19, this.f22270s, i8, false);
        b3.c.k(parcel, 20, this.f22271t);
        b3.c.q(parcel, 21, this.f22272u, false);
        b3.c.s(parcel, 22, this.f22273v, false);
        b3.c.k(parcel, 23, this.f22274w);
        b3.c.q(parcel, 24, this.f22275x, false);
        b3.c.k(parcel, 25, this.f22276y);
        b3.c.b(parcel, iA);
    }
}
