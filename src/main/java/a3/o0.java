package a3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends l3.b implements k {
    public o0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // l3.b
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            int i10 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) l3.c.a(parcel, Bundle.CREATOR);
            l3.c.b(parcel);
            j3(i10, strongBinder, bundle);
        } else if (i8 == 2) {
            int i11 = parcel.readInt();
            Bundle bundle2 = (Bundle) l3.c.a(parcel, Bundle.CREATOR);
            l3.c.b(parcel);
            b2(i11, bundle2);
        } else {
            if (i8 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            c1 c1Var = (c1) l3.c.a(parcel, c1.CREATOR);
            l3.c.b(parcel);
            D4(i12, strongBinder2, c1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
