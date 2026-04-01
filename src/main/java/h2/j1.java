package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.z40;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 extends kk implements k1 {
    public j1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static k1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            n3 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            lk.e(parcel2, liteSdkVersion);
        } else {
            if (i8 != 2) {
                return false;
            }
            z40 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            lk.f(parcel2, adapterCreator);
        }
        return true;
    }
}
