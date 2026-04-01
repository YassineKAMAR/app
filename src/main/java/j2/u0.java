package j2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends kk implements v0 {
    public u0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 == 1) {
            g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            lk.c(parcel);
            boolean zZzf = zzf(aVarV0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else {
            if (i8 != 2) {
                return false;
            }
            g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
            lk.c(parcel);
            zze(aVarV02);
            parcel2.writeNoException();
        }
        return true;
    }
}
