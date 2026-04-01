package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends b3.a {
    public static final Parcelable.Creator<z2> CREATOR = new a4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z2 f22386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f22387e;

    public z2(int i8, String str, String str2, z2 z2Var, IBinder iBinder) {
        this.f22383a = i8;
        this.f22384b = str;
        this.f22385c = str2;
        this.f22386d = z2Var;
        this.f22387e = iBinder;
    }

    public final z1.a g() {
        z1.a aVar;
        z2 z2Var = this.f22386d;
        if (z2Var == null) {
            aVar = null;
        } else {
            String str = z2Var.f22385c;
            aVar = new z1.a(z2Var.f22383a, z2Var.f22384b, str);
        }
        return new z1.a(this.f22383a, this.f22384b, this.f22385c, aVar);
    }

    public final z1.n i() {
        z1.a aVar;
        z2 z2Var = this.f22386d;
        m2 k2Var = null;
        if (z2Var == null) {
            aVar = null;
        } else {
            aVar = new z1.a(z2Var.f22383a, z2Var.f22384b, z2Var.f22385c);
        }
        int i8 = this.f22383a;
        String str = this.f22384b;
        String str2 = this.f22385c;
        IBinder iBinder = this.f22387e;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            k2Var = iInterfaceQueryLocalInterface instanceof m2 ? (m2) iInterfaceQueryLocalInterface : new k2(iBinder);
        }
        return new z1.n(i8, str, str2, aVar, z1.w.f(k2Var));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f22383a;
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, i9);
        b3.c.q(parcel, 2, this.f22384b, false);
        b3.c.q(parcel, 3, this.f22385c, false);
        b3.c.p(parcel, 4, this.f22386d, i8, false);
        b3.c.j(parcel, 5, this.f22387e, false);
        b3.c.b(parcel, iA);
    }
}
