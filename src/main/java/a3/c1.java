package a3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends b3.a {
    public static final Parcelable.Creator<c1> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bundle f53a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    x2.d[] f54b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f55c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f56d;

    public c1() {
    }

    c1(Bundle bundle, x2.d[] dVarArr, int i8, e eVar) {
        this.f53a = bundle;
        this.f54b = dVarArr;
        this.f55c = i8;
        this.f56d = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.e(parcel, 1, this.f53a, false);
        b3.c.t(parcel, 2, this.f54b, i8, false);
        b3.c.k(parcel, 3, this.f55c);
        b3.c.p(parcel, 4, this.f56d, i8, false);
        b3.c.b(parcel, iA);
    }
}
