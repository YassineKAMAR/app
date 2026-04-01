package j2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.b93;
import com.google.android.gms.internal.ads.vt2;
import h2.z2;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends b3.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23948b;

    d0(String str, int i8) {
        this.f23947a = str == null ? "" : str;
        this.f23948b = i8;
    }

    public static d0 i(Throwable th) {
        z2 z2VarA = vt2.a(th);
        return new d0(b93.d(th.getMessage()) ? z2VarA.f22384b : th.getMessage(), z2VarA.f22383a);
    }

    public final c0 g() {
        return new c0(this.f23947a, this.f23948b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f23947a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 1, str, false);
        b3.c.k(parcel, 2, this.f23948b);
        b3.c.b(parcel, iA);
    }
}
