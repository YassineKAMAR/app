package c2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.mx;
import com.google.android.gms.internal.ads.nx;
import h2.a1;
import h2.z0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class g extends b3.a {
    public static final Parcelable.Creator<g> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f3428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f3429c;

    g(boolean z7, IBinder iBinder, IBinder iBinder2) {
        this.f3427a = z7;
        this.f3428b = iBinder != null ? z0.O5(iBinder) : null;
        this.f3429c = iBinder2;
    }

    public final a1 g() {
        return this.f3428b;
    }

    public final nx i() {
        IBinder iBinder = this.f3429c;
        if (iBinder == null) {
            return null;
        }
        return mx.O5(iBinder);
    }

    public final boolean l() {
        return this.f3427a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.c(parcel, 1, this.f3427a);
        a1 a1Var = this.f3428b;
        b3.c.j(parcel, 2, a1Var == null ? null : a1Var.asBinder(), false);
        b3.c.j(parcel, 3, this.f3429c, false);
        b3.c.b(parcel, iA);
    }
}
