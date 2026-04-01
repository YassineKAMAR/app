package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends b3.a {
    public static final Parcelable.Creator<c5> CREATOR = new d5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22171a;

    public c5(int i8) {
        this.f22171a = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f22171a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 2, i9);
        b3.c.b(parcel, iA);
    }
}
