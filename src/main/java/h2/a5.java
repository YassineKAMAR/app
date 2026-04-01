package h2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a5 extends b3.a {
    public static final Parcelable.Creator<a5> CREATOR = new b5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z2 f22158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f22159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22163h;

    public a5(String str, long j8, z2 z2Var, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f22156a = str;
        this.f22157b = j8;
        this.f22158c = z2Var;
        this.f22159d = bundle;
        this.f22160e = str2;
        this.f22161f = str3;
        this.f22162g = str4;
        this.f22163h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f22156a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.n(parcel, 2, this.f22157b);
        b3.c.p(parcel, 3, this.f22158c, i8, false);
        b3.c.e(parcel, 4, this.f22159d, false);
        b3.c.q(parcel, 5, this.f22160e, false);
        b3.c.q(parcel, 6, this.f22161f, false);
        b3.c.q(parcel, 7, this.f22162g, false);
        b3.c.q(parcel, 8, this.f22163h, false);
        b3.c.b(parcel, iA);
    }
}
