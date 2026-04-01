package r3;

import a3.i0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b3.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f25878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final i0 f25879b;

    j(int i8, i0 i0Var) {
        this.f25878a = i8;
        this.f25879b = i0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f25878a);
        b3.c.p(parcel, 2, this.f25879b, i8, false);
        b3.c.b(parcel, iA);
    }
}
