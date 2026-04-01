package r3;

import a3.k0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b3.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f25880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x2.b f25881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k0 f25882c;

    l(int i8, x2.b bVar, k0 k0Var) {
        this.f25880a = i8;
        this.f25881b = bVar;
        this.f25882c = k0Var;
    }

    public final x2.b g() {
        return this.f25881b;
    }

    public final k0 i() {
        return this.f25882c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f25880a);
        b3.c.p(parcel, 2, this.f25881b, i8, false);
        b3.c.p(parcel, 3, this.f25882c, i8, false);
        b3.c.b(parcel, iA);
    }
}
