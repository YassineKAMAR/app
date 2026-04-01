package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class m extends b3.a {
    public static final Parcelable.Creator<m> CREATOR = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f142i;

    public m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f134a = i8;
        this.f135b = i9;
        this.f136c = i10;
        this.f137d = j8;
        this.f138e = j9;
        this.f139f = str;
        this.f140g = str2;
        this.f141h = i11;
        this.f142i = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f134a);
        b3.c.k(parcel, 2, this.f135b);
        b3.c.k(parcel, 3, this.f136c);
        b3.c.n(parcel, 4, this.f137d);
        b3.c.n(parcel, 5, this.f138e);
        b3.c.q(parcel, 6, this.f139f, false);
        b3.c.q(parcel, 7, this.f140g, false);
        b3.c.k(parcel, 8, this.f141h);
        b3.c.k(parcel, 9, this.f142i);
        b3.c.b(parcel, iA);
    }
}
