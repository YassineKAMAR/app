package p3;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.measurement.internal.hb;
import com.google.android.gms.measurement.internal.lb;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends z0 implements i {
    public h() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.z0
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        Collection collectionE5;
        switch (i8) {
            case 1:
                com.google.android.gms.measurement.internal.d0 d0Var = (com.google.android.gms.measurement.internal.d0) y0.a(parcel, com.google.android.gms.measurement.internal.d0.CREATOR);
                lb lbVar = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                k2(d0Var, lbVar);
                parcel2.writeNoException();
                return true;
            case 2:
                hb hbVar = (hb) y0.a(parcel, hb.CREATOR);
                lb lbVar2 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                y5(hbVar, lbVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                lb lbVar3 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                N2(lbVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.d0 d0Var2 = (com.google.android.gms.measurement.internal.d0) y0.a(parcel, com.google.android.gms.measurement.internal.d0.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                y0.f(parcel);
                P4(d0Var2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                lb lbVar4 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                w1(lbVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                lb lbVar5 = (lb) y0.a(parcel, lb.CREATOR);
                boolean zH = y0.h(parcel);
                y0.f(parcel);
                collectionE5 = e5(lbVar5, zH);
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionE5);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.d0 d0Var3 = (com.google.android.gms.measurement.internal.d0) y0.a(parcel, com.google.android.gms.measurement.internal.d0.CREATOR);
                String string3 = parcel.readString();
                y0.f(parcel);
                byte[] bArrL2 = L2(d0Var3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrL2);
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                long j8 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                y0.f(parcel);
                J2(j8, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                lb lbVar6 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                String strY1 = Y1(lbVar6);
                parcel2.writeNoException();
                parcel2.writeString(strY1);
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                com.google.android.gms.measurement.internal.d dVar = (com.google.android.gms.measurement.internal.d) y0.a(parcel, com.google.android.gms.measurement.internal.d.CREATOR);
                lb lbVar7 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                x5(dVar, lbVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.measurement.internal.d dVar2 = (com.google.android.gms.measurement.internal.d) y0.a(parcel, com.google.android.gms.measurement.internal.d.CREATOR);
                y0.f(parcel);
                H3(dVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH2 = y0.h(parcel);
                lb lbVar8 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                collectionE5 = B4(string7, string8, zH2, lbVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionE5);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zH3 = y0.h(parcel);
                y0.f(parcel);
                collectionE5 = o1(string9, string10, string11, zH3);
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionE5);
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                lb lbVar9 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                collectionE5 = K0(string12, string13, lbVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionE5);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                y0.f(parcel);
                collectionE5 = P2(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionE5);
                return true;
            case 18:
                lb lbVar10 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                S0(lbVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) y0.a(parcel, Bundle.CREATOR);
                lb lbVar11 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                v1(bundle, lbVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                lb lbVar12 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                u1(lbVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                lb lbVar13 = (lb) y0.a(parcel, lb.CREATOR);
                y0.f(parcel);
                c cVarE4 = e4(lbVar13);
                parcel2.writeNoException();
                y0.g(parcel2, cVarE4);
                return true;
            case 24:
                lb lbVar14 = (lb) y0.a(parcel, lb.CREATOR);
                Bundle bundle2 = (Bundle) y0.a(parcel, Bundle.CREATOR);
                y0.f(parcel);
                collectionE5 = T4(lbVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(collectionE5);
                return true;
        }
    }
}
