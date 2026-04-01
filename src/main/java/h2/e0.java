package h2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends kk implements f0 {
    public e0() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 1:
                p();
                break;
            case 2:
                int i10 = parcel.readInt();
                lk.c(parcel);
                g(i10);
                break;
            case 3:
                break;
            case 4:
                r();
                break;
            case 5:
                t();
                break;
            case 6:
                l();
                break;
            case 7:
                q();
                break;
            case 8:
                z2 z2Var = (z2) lk.a(parcel, z2.CREATOR);
                lk.c(parcel);
                a(z2Var);
                break;
            case 9:
                s();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
