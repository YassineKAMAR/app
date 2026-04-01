package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends kk implements h1 {
    public g1() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            z2 z2Var = (z2) lk.a(parcel, z2.CREATOR);
            lk.c(parcel);
            F0(z2Var);
        } else if (i8 == 2) {
            n();
        } else if (i8 == 3) {
            l();
        } else if (i8 == 4) {
            m();
        } else {
            if (i8 != 5) {
                return false;
            }
            k();
        }
        parcel2.writeNoException();
        return true;
    }
}
