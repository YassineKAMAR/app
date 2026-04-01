package a3;

import a3.i;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends b3.a {
    public static final Parcelable.Creator<k0> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final IBinder f121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x2.b f122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f124e;

    k0(int i8, IBinder iBinder, x2.b bVar, boolean z7, boolean z8) {
        this.f120a = i8;
        this.f121b = iBinder;
        this.f122c = bVar;
        this.f123d = z7;
        this.f124e = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f122c.equals(k0Var.f122c) && n.a(i(), k0Var.i());
    }

    public final x2.b g() {
        return this.f122c;
    }

    public final i i() {
        IBinder iBinder = this.f121b;
        if (iBinder == null) {
            return null;
        }
        return i.a.v0(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f120a);
        b3.c.j(parcel, 2, this.f121b, false);
        b3.c.p(parcel, 3, this.f122c, i8, false);
        b3.c.c(parcel, 4, this.f123d);
        b3.c.c(parcel, 5, this.f124e);
        b3.c.b(parcel, iA);
    }
}
