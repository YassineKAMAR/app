package c2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.mx;
import com.google.android.gms.internal.ads.nx;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b3.a {
    public static final Parcelable.Creator<a> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder f3410b;

    a(boolean z7, IBinder iBinder) {
        this.f3409a = z7;
        this.f3410b = iBinder;
    }

    public boolean g() {
        return this.f3409a;
    }

    public final nx i() {
        IBinder iBinder = this.f3410b;
        if (iBinder == null) {
            return null;
        }
        return mx.O5(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 1, g());
        b3.c.j(parcel, 2, this.f3410b, false);
        b3.c.b(parcel, iA);
    }
}
