package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends kk implements c0 {
    public b0() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        k();
        parcel2.writeNoException();
        return true;
    }
}
