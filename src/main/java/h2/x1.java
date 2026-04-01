package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class x1 extends kk implements z1 {
    public x1() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        z2 z2Var = (z2) lk.a(parcel, z2.CREATOR);
        lk.c(parcel);
        Z0(z2Var);
        parcel2.writeNoException();
        return true;
    }
}
