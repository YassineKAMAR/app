package h2;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.n00;
import com.google.android.gms.internal.ads.y40;
import com.google.android.gms.internal.ads.z40;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 extends kk implements d1 {
    public c1() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceO0;
        switch (i8) {
            case 1:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                w4 w4Var = (w4) lk.a(parcel, w4.CREATOR);
                String string = parcel.readString();
                z40 z40VarO5 = y40.O5(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = O0(aVarV0, w4Var, string, z40VarO5, i10);
                break;
            case 2:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                w4 w4Var2 = (w4) lk.a(parcel, w4.CREATOR);
                String string2 = parcel.readString();
                z40 z40VarO52 = y40.O5(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = n1(aVarV02, w4Var2, string2, z40VarO52, i11);
                break;
            case 3:
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                z40 z40VarO53 = y40.O5(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = H2(aVarV03, string3, z40VarO53, i12);
                break;
            case 4:
            case 7:
                a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                parcel2.writeNoException();
                lk.f(parcel2, null);
                return true;
            case 5:
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                iInterfaceO0 = n3(aVarV04, aVarV05);
                break;
            case 6:
                g3.a aVarV06 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                z40 z40VarO54 = y40.O5(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = W4(aVarV06, z40VarO54, i13);
                break;
            case 8:
                g3.a aVarV07 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                iInterfaceO0 = j0(aVarV07);
                break;
            case 9:
                g3.a aVarV08 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = s0(aVarV08, i14);
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                g3.a aVarV09 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                w4 w4Var3 = (w4) lk.a(parcel, w4.CREATOR);
                String string4 = parcel.readString();
                int i15 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = c1(aVarV09, w4Var3, string4, i15);
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                g3.a aVarV010 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV011 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                g3.a aVarV012 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                iInterfaceO0 = z5(aVarV010, aVarV011, aVarV012);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                g3.a aVarV013 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                z40 z40VarO55 = y40.O5(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = g1(aVarV013, string5, z40VarO55, i16);
                break;
            case 13:
                g3.a aVarV014 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                w4 w4Var4 = (w4) lk.a(parcel, w4.CREATOR);
                String string6 = parcel.readString();
                z40 z40VarO56 = y40.O5(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = R2(aVarV014, w4Var4, string6, z40VarO56, i17);
                break;
            case 14:
                g3.a aVarV015 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                z40 z40VarO57 = y40.O5(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = f1(aVarV015, z40VarO57, i18);
                break;
            case 15:
                g3.a aVarV016 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                z40 z40VarO58 = y40.O5(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = F3(aVarV016, z40VarO58, i19);
                break;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                g3.a aVarV017 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                z40 z40VarO59 = y40.O5(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                n00 n00VarO5 = m00.O5(parcel.readStrongBinder());
                lk.c(parcel);
                iInterfaceO0 = e2(aVarV017, z40VarO59, i20, n00VarO5);
                break;
            case 17:
                g3.a aVarV018 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                z40 z40VarO510 = y40.O5(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                lk.c(parcel);
                iInterfaceO0 = Q0(aVarV018, z40VarO510, i21);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        lk.f(parcel2, iInterfaceO0);
        return true;
    }
}
