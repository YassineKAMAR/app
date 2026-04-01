package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends kk implements l0 {
    public k0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        String strM;
        if (i8 != 1) {
            if (i8 == 2) {
                strM = m();
            } else {
                if (i8 == 3) {
                    boolean zR = r();
                    parcel2.writeNoException();
                    int i10 = lk.f10749b;
                    parcel2.writeInt(zR ? 1 : 0);
                    return true;
                }
                if (i8 == 4) {
                    strM = n();
                } else {
                    if (i8 != 5) {
                        return false;
                    }
                    r4 r4Var = (r4) lk.a(parcel, r4.CREATOR);
                    int i11 = parcel.readInt();
                    lk.c(parcel);
                    o5(r4Var, i11);
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(strM);
            return true;
        }
        r4 r4Var2 = (r4) lk.a(parcel, r4.CREATOR);
        lk.c(parcel);
        k1(r4Var2);
        parcel2.writeNoException();
        return true;
    }
}
