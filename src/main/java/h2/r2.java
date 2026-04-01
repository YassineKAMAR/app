package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class r2 extends kk implements s2 {
    public r2() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            r();
        } else if (i8 == 2) {
            o();
        } else if (i8 == 3) {
            q();
        } else if (i8 == 4) {
            m();
        } else {
            if (i8 != 5) {
                return false;
            }
            boolean zG = lk.g(parcel);
            lk.c(parcel);
            C0(zG);
        }
        parcel2.writeNoException();
        return true;
    }
}
