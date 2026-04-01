package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends b3.a {
    public static final Parcelable.Creator<f4> CREATOR = new g4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22184b;

    public f4(int i8, int i9) {
        this.f22183a = i8;
        this.f22184b = i9;
    }

    public f4(z1.v vVar) {
        this.f22183a = vVar.c();
        this.f22184b = vVar.d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f22183a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.k(parcel, 2, this.f22184b);
        b3.c.b(parcel, iA);
    }
}
