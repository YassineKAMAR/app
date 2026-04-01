package a3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends l3.b implements n0 {
    public q1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static n0 v0(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new p1(iBinder);
    }

    @Override // l3.b
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            g3.a aVarP = p();
            parcel2.writeNoException();
            l3.c.d(parcel2, aVarP);
        } else {
            if (i8 != 2) {
                return false;
            }
            int iL = l();
            parcel2.writeNoException();
            parcel2.writeInt(iL);
        }
        return true;
    }
}
