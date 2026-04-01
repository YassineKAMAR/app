package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.a20;
import com.google.android.gms.internal.ads.b20;
import com.google.android.gms.internal.ads.bx;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.lv;
import com.google.android.gms.internal.ads.r10;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.tw;
import com.google.android.gms.internal.ads.vw;
import com.google.android.gms.internal.ads.ww;
import com.google.android.gms.internal.ads.yw;
import com.google.android.gms.internal.ads.zw;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends kk implements o0 {
    public n0() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        f0 d0Var = null;
        e1 e1Var = null;
        switch (i8) {
            case 1:
                l0 l0VarM = m();
                parcel2.writeNoException();
                lk.f(parcel2, l0VarM);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    d0Var = iInterfaceQueryLocalInterface instanceof f0 ? (f0) iInterfaceQueryLocalInterface : new d0(strongBinder);
                }
                lk.c(parcel);
                y3(d0Var);
                break;
            case 3:
                tw twVarO5 = sw.O5(parcel.readStrongBinder());
                lk.c(parcel);
                r5(twVarO5);
                break;
            case 4:
                ww wwVarO5 = vw.O5(parcel.readStrongBinder());
                lk.c(parcel);
                D2(wwVarO5);
                break;
            case 5:
                String string = parcel.readString();
                cx cxVarO5 = bx.O5(parcel.readStrongBinder());
                zw zwVarO5 = yw.O5(parcel.readStrongBinder());
                lk.c(parcel);
                f4(string, cxVarO5, zwVarO5);
                break;
            case 6:
                lv lvVar = (lv) lk.a(parcel, lv.CREATOR);
                lk.c(parcel);
                j4(lvVar);
                break;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    e1Var = iInterfaceQueryLocalInterface2 instanceof e1 ? (e1) iInterfaceQueryLocalInterface2 : new e1(strongBinder2);
                }
                lk.c(parcel);
                s3(e1Var);
                break;
            case 8:
                gx gxVarO5 = fx.O5(parcel.readStrongBinder());
                w4 w4Var = (w4) lk.a(parcel, w4.CREATOR);
                lk.c(parcel);
                u4(gxVarO5, w4Var);
                break;
            case 9:
                c2.g gVar = (c2.g) lk.a(parcel, c2.g.CREATOR);
                lk.c(parcel);
                i1(gVar);
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                kx kxVarO5 = jx.O5(parcel.readStrongBinder());
                lk.c(parcel);
                M5(kxVarO5);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
            default:
                return false;
            case 13:
                r10 r10Var = (r10) lk.a(parcel, r10.CREATOR);
                lk.c(parcel);
                D1(r10Var);
                break;
            case 14:
                b20 b20VarO5 = a20.O5(parcel.readStrongBinder());
                lk.c(parcel);
                L0(b20VarO5);
                break;
            case 15:
                c2.a aVar = (c2.a) lk.a(parcel, c2.a.CREATOR);
                lk.c(parcel);
                o3(aVar);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
