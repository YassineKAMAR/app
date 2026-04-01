package u2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b3.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26713b;

    public f(String str, int i8) {
        this.f26712a = str;
        this.f26713b = i8;
    }

    public final int g() {
        return this.f26713b;
    }

    public final String i() {
        return this.f26712a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, this.f26712a, false);
        b3.c.k(parcel, 2, this.f26713b);
        b3.c.b(parcel, iA);
    }
}
