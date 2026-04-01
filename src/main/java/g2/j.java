package g2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b3.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f21971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21975i;

    j(boolean z7, boolean z8, String str, boolean z9, float f8, int i8, boolean z10, boolean z11, boolean z12) {
        this.f21967a = z7;
        this.f21968b = z8;
        this.f21969c = str;
        this.f21970d = z9;
        this.f21971e = f8;
        this.f21972f = i8;
        this.f21973g = z10;
        this.f21974h = z11;
        this.f21975i = z12;
    }

    public j(boolean z7, boolean z8, boolean z9, float f8, int i8, boolean z10, boolean z11, boolean z12) {
        this(z7, z8, null, z9, f8, -1, z10, z11, z12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f21967a;
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 2, z7);
        b3.c.c(parcel, 3, this.f21968b);
        b3.c.q(parcel, 4, this.f21969c, false);
        b3.c.c(parcel, 5, this.f21970d);
        b3.c.h(parcel, 6, this.f21971e);
        b3.c.k(parcel, 7, this.f21972f);
        b3.c.c(parcel, 8, this.f21973g);
        b3.c.c(parcel, 9, this.f21974h);
        b3.c.c(parcel, 10, this.f21975i);
        b3.c.b(parcel, iA);
    }
}
