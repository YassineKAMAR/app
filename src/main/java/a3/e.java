package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e extends b3.a {
    public static final Parcelable.Creator<e> CREATOR = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f72a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f74c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f75d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f76e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f77f;

    public e(q qVar, boolean z7, boolean z8, int[] iArr, int i8, int[] iArr2) {
        this.f72a = qVar;
        this.f73b = z7;
        this.f74c = z8;
        this.f75d = iArr;
        this.f76e = i8;
        this.f77f = iArr2;
    }

    public int g() {
        return this.f76e;
    }

    public int[] i() {
        return this.f75d;
    }

    public int[] n() {
        return this.f77f;
    }

    public boolean p() {
        return this.f73b;
    }

    public boolean u() {
        return this.f74c;
    }

    public final q v() {
        return this.f72a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.p(parcel, 1, this.f72a, i8, false);
        b3.c.c(parcel, 2, p());
        b3.c.c(parcel, 3, u());
        b3.c.l(parcel, 4, i(), false);
        b3.c.k(parcel, 5, g());
        b3.c.l(parcel, 6, n(), false);
        b3.c.b(parcel, iA);
    }
}
