package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h2 extends kk implements i2 {
    public h2() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        String string = parcel.readString();
        g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
        g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
        lk.c(parcel);
        h4(string, aVarV0, aVarV02);
        parcel2.writeNoException();
        return true;
    }
}
