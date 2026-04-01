package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 extends kk implements f2 {
    public e2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static f2 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new d2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            y4 y4Var = (y4) lk.a(parcel, y4.CREATOR);
            lk.c(parcel);
            p4(y4Var);
            parcel2.writeNoException();
        } else {
            if (i8 != 2) {
                return false;
            }
            boolean zN = n();
            parcel2.writeNoException();
            int i10 = lk.f10749b;
            parcel2.writeInt(zN ? 1 : 0);
        }
        return true;
    }
}
