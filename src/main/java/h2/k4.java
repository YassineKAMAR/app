package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k4 extends b3.a {
    public static final Parcelable.Creator<k4> CREATOR = new l4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22217c;

    public k4(z1.z zVar) {
        this(zVar.c(), zVar.b(), zVar.a());
    }

    public k4(boolean z7, boolean z8, boolean z9) {
        this.f22215a = z7;
        this.f22216b = z8;
        this.f22217c = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f22215a;
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 2, z7);
        b3.c.c(parcel, 3, this.f22216b);
        b3.c.c(parcel, 4, this.f22217c);
        b3.c.b(parcel, iA);
    }
}
