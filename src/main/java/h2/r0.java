package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.a90;
import com.google.android.gms.internal.ads.c90;
import com.google.android.gms.internal.ads.d90;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.mt;
import com.google.android.gms.internal.ads.nt;
import com.google.android.gms.internal.ads.qm;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.ub0;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.z80;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends kk implements s0 {
    public r0() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceV;
        Parcelable parcelableQ;
        String strC;
        int i10;
        boolean zP5;
        f0 d0Var = null;
        h1 f1Var = null;
        i0 g0Var = null;
        f2 d2Var = null;
        w0 u0Var = null;
        e1 e1Var = null;
        c0 a0Var = null;
        a1 x0Var = null;
        switch (i8) {
            case 1:
                iInterfaceV = v();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 2:
                D();
                parcel2.writeNoException();
                return true;
            case 3:
                zP5 = p5();
                parcel2.writeNoException();
                int i11 = lk.f10749b;
                i10 = zP5;
                parcel2.writeInt(i10);
                return true;
            case 4:
                r4 r4Var = (r4) lk.a(parcel, r4.CREATOR);
                lk.c(parcel);
                boolean zV2 = v2(r4Var);
                parcel2.writeNoException();
                i10 = zV2;
                parcel2.writeInt(i10);
                return true;
            case 5:
                W();
                parcel2.writeNoException();
                return true;
            case 6:
                f0();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    d0Var = iInterfaceQueryLocalInterface instanceof f0 ? (f0) iInterfaceQueryLocalInterface : new d0(strongBinder);
                }
                lk.c(parcel);
                S1(d0Var);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    x0Var = iInterfaceQueryLocalInterface2 instanceof a1 ? (a1) iInterfaceQueryLocalInterface2 : new x0(strongBinder2);
                }
                lk.c(parcel);
                I2(x0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                l0();
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                R();
                parcel2.writeNoException();
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                parcelableQ = q();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableQ);
                return true;
            case 13:
                w4 w4Var = (w4) lk.a(parcel, w4.CREATOR);
                lk.c(parcel);
                a5(w4Var);
                parcel2.writeNoException();
                return true;
            case 14:
                a90 a90VarO5 = z80.O5(parcel.readStrongBinder());
                lk.c(parcel);
                S3(a90VarO5);
                parcel2.writeNoException();
                return true;
            case 15:
                d90 d90VarO5 = c90.O5(parcel.readStrongBinder());
                String string = parcel.readString();
                lk.c(parcel);
                K5(d90VarO5, string);
                parcel2.writeNoException();
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                strC = C();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 19:
                nt ntVarO5 = mt.O5(parcel.readStrongBinder());
                lk.c(parcel);
                t2(ntVarO5);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    a0Var = iInterfaceQueryLocalInterface3 instanceof c0 ? (c0) iInterfaceQueryLocalInterface3 : new a0(strongBinder3);
                }
                lk.c(parcel);
                g4(a0Var);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    e1Var = iInterfaceQueryLocalInterface4 instanceof e1 ? (e1) iInterfaceQueryLocalInterface4 : new e1(strongBinder4);
                }
                lk.c(parcel);
                W1(e1Var);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                H5(zG);
                parcel2.writeNoException();
                return true;
            case 23:
                zP5 = E0();
                parcel2.writeNoException();
                int i112 = lk.f10749b;
                i10 = zP5;
                parcel2.writeInt(i10);
                return true;
            case 24:
                vb0 vb0VarO5 = ub0.O5(parcel.readStrongBinder());
                lk.c(parcel);
                O1(vb0VarO5);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                lk.c(parcel);
                h2(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceV = u();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 29:
                k4 k4Var = (k4) lk.a(parcel, k4.CREATOR);
                lk.c(parcel);
                P1(k4Var);
                parcel2.writeNoException();
                return true;
            case 30:
                t2 t2Var = (t2) lk.a(parcel, t2.CREATOR);
                lk.c(parcel);
                O3(t2Var);
                parcel2.writeNoException();
                return true;
            case 31:
                strC = B();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case com.amazon.c.a.a.c.f4053h /* 32 */:
                iInterfaceV = t();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 33:
                iInterfaceV = r();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 34:
                boolean zG2 = lk.g(parcel);
                lk.c(parcel);
                I4(zG2);
                parcel2.writeNoException();
                return true;
            case 35:
                strC = G();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    u0Var = iInterfaceQueryLocalInterface5 instanceof w0 ? (w0) iInterfaceQueryLocalInterface5 : new u0(strongBinder5);
                }
                lk.c(parcel);
                d1(u0Var);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelableQ = p();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableQ);
                return true;
            case 38:
                String string3 = parcel.readString();
                lk.c(parcel);
                R0(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                c5 c5Var = (c5) lk.a(parcel, c5.CREATOR);
                lk.c(parcel);
                c5(c5Var);
                parcel2.writeNoException();
                return true;
            case 40:
                rm rmVarO5 = qm.O5(parcel.readStrongBinder());
                lk.c(parcel);
                a2(rmVarO5);
                parcel2.writeNoException();
                return true;
            case 41:
                iInterfaceV = s();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    d2Var = iInterfaceQueryLocalInterface6 instanceof f2 ? (f2) iInterfaceQueryLocalInterface6 : new d2(strongBinder6);
                }
                lk.c(parcel);
                m4(d2Var);
                parcel2.writeNoException();
                return true;
            case 43:
                r4 r4Var2 = (r4) lk.a(parcel, r4.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    g0Var = iInterfaceQueryLocalInterface7 instanceof i0 ? (i0) iInterfaceQueryLocalInterface7 : new g0(strongBinder7);
                }
                lk.c(parcel);
                T3(r4Var2, g0Var);
                parcel2.writeNoException();
                return true;
            case 44:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                s4(aVarV0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    f1Var = iInterfaceQueryLocalInterface8 instanceof h1 ? (h1) iInterfaceQueryLocalInterface8 : new f1(strongBinder8);
                }
                lk.c(parcel);
                r4(f1Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
