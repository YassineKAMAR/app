package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends b3.a {
    public static final Parcelable.Creator<h4> CREATOR = new i4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22189a;

    h4(String str) {
        this.f22189a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f22189a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 15, str, false);
        b3.c.b(parcel, iA);
    }
}
