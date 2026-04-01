package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class o2 extends kk implements p2 {
    public o2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static p2 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof p2 ? (p2) iInterfaceQueryLocalInterface : new n2(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        float fQ;
        s2 q2Var;
        int i10;
        boolean z7;
        switch (i8) {
            case 1:
                u();
                parcel2.writeNoException();
                return true;
            case 2:
                s();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                n0(zG);
                parcel2.writeNoException();
                return true;
            case 4:
                z7 = z();
                parcel2.writeNoException();
                int i11 = lk.f10749b;
                i10 = z7;
                parcel2.writeInt(i10);
                return true;
            case 5:
                int iO = o();
                parcel2.writeNoException();
                i10 = iO;
                parcel2.writeInt(i10);
                return true;
            case 6:
                fQ = q();
                parcel2.writeNoException();
                parcel2.writeFloat(fQ);
                return true;
            case 7:
                fQ = n();
                parcel2.writeNoException();
                parcel2.writeFloat(fQ);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    q2Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    q2Var = iInterfaceQueryLocalInterface instanceof s2 ? (s2) iInterfaceQueryLocalInterface : new q2(strongBinder);
                }
                lk.c(parcel);
                x4(q2Var);
                parcel2.writeNoException();
                return true;
            case 9:
                fQ = m();
                parcel2.writeNoException();
                parcel2.writeFloat(fQ);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                z7 = y();
                parcel2.writeNoException();
                int i112 = lk.f10749b;
                i10 = z7;
                parcel2.writeInt(i10);
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                s2 s2VarR = r();
                parcel2.writeNoException();
                lk.f(parcel2, s2VarR);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                z7 = w();
                parcel2.writeNoException();
                int i1122 = lk.f10749b;
                i10 = z7;
                parcel2.writeInt(i10);
                return true;
            case 13:
                v();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
