package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.l10;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.y40;
import com.google.android.gms.internal.ads.z40;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends kk implements n1 {
    public m1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        z1 w1Var;
        switch (i8) {
            case 1:
                s();
                break;
            case 2:
                float f8 = parcel.readFloat();
                lk.c(parcel);
                p3(f8);
                break;
            case 3:
                String string = parcel.readString();
                lk.c(parcel);
                H4(string);
                break;
            case 4:
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                I5(zG);
                break;
            case 5:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                lk.c(parcel);
                K4(aVarV0, string2);
                break;
            case 6:
                String string3 = parcel.readString();
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                Y2(string3, aVarV02);
                break;
            case 7:
                float fM = m();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case 8:
                boolean zA = A();
                parcel2.writeNoException();
                int i10 = lk.f10749b;
                parcel2.writeInt(zA ? 1 : 0);
                return true;
            case 9:
                String strN = n();
                parcel2.writeNoException();
                parcel2.writeString(strN);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                String string4 = parcel.readString();
                lk.c(parcel);
                d0(string4);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                z40 z40VarO5 = y40.O5(parcel.readStrongBinder());
                lk.c(parcel);
                G3(z40VarO5);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                m10 m10VarO5 = l10.O5(parcel.readStrongBinder());
                lk.c(parcel);
                C1(m10VarO5);
                break;
            case 13:
                List listQ = q();
                parcel2.writeNoException();
                parcel2.writeTypedList(listQ);
                return true;
            case 14:
                f4 f4Var = (f4) lk.a(parcel, f4.CREATOR);
                lk.c(parcel);
                m1(f4Var);
                break;
            case 15:
                r();
                break;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    w1Var = iInterfaceQueryLocalInterface instanceof z1 ? (z1) iInterfaceQueryLocalInterface : new w1(strongBinder);
                }
                lk.c(parcel);
                h3(w1Var);
                break;
            case 17:
                boolean zG2 = lk.g(parcel);
                lk.c(parcel);
                n0(zG2);
                break;
            case 18:
                String string5 = parcel.readString();
                lk.c(parcel);
                M0(string5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
