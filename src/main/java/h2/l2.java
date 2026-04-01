package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l2 extends kk implements m2 {
    public l2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static m2 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof m2 ? (m2) iInterfaceQueryLocalInterface : new k2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strQ;
        Parcelable parcelableN;
        switch (i8) {
            case 1:
                strQ = q();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 2:
                strQ = r();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            case 3:
                List listT = t();
                parcel2.writeNoException();
                parcel2.writeTypedList(listT);
                return true;
            case 4:
                parcelableN = n();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableN);
                return true;
            case 5:
                parcelableN = m();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableN);
                return true;
            case 6:
                strQ = o();
                parcel2.writeNoException();
                parcel2.writeString(strQ);
                return true;
            default:
                return false;
        }
    }
}
