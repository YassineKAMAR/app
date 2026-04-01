package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends b3.a {
    public static final Parcelable.Creator<t2> CREATOR = new u2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22301a;

    public t2(int i8) {
        this.f22301a = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f22301a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 2, i9);
        b3.c.b(parcel, iA);
    }
}
