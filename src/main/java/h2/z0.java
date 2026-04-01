package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends kk implements a1 {
    public z0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static a1 O5(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof a1 ? (a1) iInterfaceQueryLocalInterface : new x0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        lk.c(parcel);
        B0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
