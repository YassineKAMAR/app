package u2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b3.a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26711b;

    public d(String str, String str2) {
        this.f26710a = str;
        this.f26711b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, this.f26710a, false);
        b3.c.q(parcel, 2, this.f26711b, false);
        b3.c.b(parcel, iA);
    }
}
