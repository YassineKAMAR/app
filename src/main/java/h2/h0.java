package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends kk implements i0 {
    public h0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            l();
        } else {
            if (i8 != 2) {
                return false;
            }
            z2 z2Var = (z2) lk.a(parcel, z2.CREATOR);
            lk.c(parcel);
            z0(z2Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
