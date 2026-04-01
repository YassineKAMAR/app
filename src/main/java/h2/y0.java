package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends b3.a {
    public static final Parcelable.Creator<y0> CREATOR = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22375b;

    public y0(String str, String str2) {
        this.f22374a = str;
        this.f22375b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f22374a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.q(parcel, 2, this.f22375b, false);
        b3.c.b(parcel, iA);
    }
}
