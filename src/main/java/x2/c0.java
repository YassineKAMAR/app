package x2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends b3.a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27250d;

    c0(boolean z7, String str, int i8, int i9) {
        this.f27247a = z7;
        this.f27248b = str;
        this.f27249c = k0.a(i8) - 1;
        this.f27250d = p.a(i9) - 1;
    }

    public final String g() {
        return this.f27248b;
    }

    public final boolean i() {
        return this.f27247a;
    }

    public final int n() {
        return p.a(this.f27250d);
    }

    public final int p() {
        return k0.a(this.f27249c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 1, this.f27247a);
        b3.c.q(parcel, 2, this.f27248b, false);
        b3.c.k(parcel, 3, this.f27249c);
        b3.c.k(parcel, 4, this.f27250d);
        b3.c.b(parcel, iA);
    }
}
