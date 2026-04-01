package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class q extends b3.a {
    public static final Parcelable.Creator<q> CREATOR = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f159e;

    public q(int i8, boolean z7, boolean z8, int i9, int i10) {
        this.f155a = i8;
        this.f156b = z7;
        this.f157c = z8;
        this.f158d = i9;
        this.f159e = i10;
    }

    public int g() {
        return this.f158d;
    }

    public int i() {
        return this.f159e;
    }

    public boolean n() {
        return this.f156b;
    }

    public boolean p() {
        return this.f157c;
    }

    public int u() {
        return this.f155a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, u());
        b3.c.c(parcel, 2, n());
        b3.c.c(parcel, 3, p());
        b3.c.k(parcel, 4, g());
        b3.c.k(parcel, 5, i());
        b3.c.b(parcel, iA);
    }
}
