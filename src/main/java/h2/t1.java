package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;

/* JADX INFO: loaded from: classes.dex */
public abstract class t1 extends kk implements u1 {
    public t1() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static u1 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof u1 ? (u1) iInterfaceQueryLocalInterface : new s1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strM;
        if (i8 == 1) {
            strM = m();
        } else {
            if (i8 != 2) {
                return false;
            }
            strM = n();
        }
        parcel2.writeNoException();
        parcel2.writeString(strM);
        return true;
    }
}
