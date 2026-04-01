package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import g3.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b50 extends kk implements d50 {
    public b50() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        IInterface iInterfaceV;
        Parcelable parcelableM;
        g50 e50Var = null;
        switch (i8) {
            case 1:
                g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.w4 w4Var = (h2.w4) lk.a(parcel, h2.w4.CREATOR);
                h2.r4 r4Var = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface instanceof g50 ? (g50) iInterfaceQueryLocalInterface : new e50(strongBinder);
                }
                g50 g50Var = e50Var;
                lk.c(parcel);
                F5(aVarV0, w4Var, r4Var, string, g50Var);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterfaceV = v();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 3:
                g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var2 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface2 instanceof g50 ? (g50) iInterfaceQueryLocalInterface2 : new e50(strongBinder2);
                }
                lk.c(parcel);
                b1(aVarV02, r4Var2, string2, e50Var);
                parcel2.writeNoException();
                return true;
            case 4:
                Q();
                parcel2.writeNoException();
                return true;
            case 5:
                w();
                parcel2.writeNoException();
                return true;
            case 6:
                g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.w4 w4Var2 = (h2.w4) lk.a(parcel, h2.w4.CREATOR);
                h2.r4 r4Var3 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface3 instanceof g50 ? (g50) iInterfaceQueryLocalInterface3 : new e50(strongBinder3);
                }
                g50 g50Var2 = e50Var;
                lk.c(parcel);
                E2(aVarV03, w4Var2, r4Var3, string3, string4, g50Var2);
                parcel2.writeNoException();
                return true;
            case 7:
                g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var4 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface4 instanceof g50 ? (g50) iInterfaceQueryLocalInterface4 : new e50(strongBinder4);
                }
                g50 g50Var3 = e50Var;
                lk.c(parcel);
                z4(aVarV04, r4Var4, string5, string6, g50Var3);
                parcel2.writeNoException();
                return true;
            case 8:
                N();
                parcel2.writeNoException();
                return true;
            case 9:
                T();
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var5 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string7 = parcel.readString();
                ac0 ac0VarO5 = zb0.O5(parcel.readStrongBinder());
                String string8 = parcel.readString();
                lk.c(parcel);
                K2(aVarV05, r4Var5, string7, ac0VarO5, string8);
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                h2.r4 r4Var6 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string9 = parcel.readString();
                lk.c(parcel);
                R1(r4Var6, string9);
                parcel2.writeNoException();
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                L();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zH = H();
                parcel2.writeNoException();
                int i10 = lk.f10749b;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 14:
                g3.a aVarV06 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var7 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface5 instanceof g50 ? (g50) iInterfaceQueryLocalInterface5 : new e50(strongBinder5);
                }
                g50 g50Var4 = e50Var;
                lv lvVar = (lv) lk.a(parcel, lv.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                lk.c(parcel);
                V2(aVarV06, r4Var7, string10, string11, g50Var4, lvVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                parcel2.writeNoException();
                lk.f(parcel2, null);
                return true;
            case 17:
                parcelableM = m();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableM);
                return true;
            case 18:
                parcelableM = n();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableM);
                return true;
            case 19:
                parcelableM = q();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableM);
                return true;
            case 20:
                h2.r4 r4Var8 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                lk.c(parcel);
                X0(r4Var8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                g3.a aVarV07 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                L5(aVarV07);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i11 = lk.f10749b;
                parcel2.writeInt(0);
                return true;
            case 23:
                g3.a aVarV08 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                ac0 ac0VarO52 = zb0.O5(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                lk.c(parcel);
                a3(aVarV08, ac0VarO52, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                iInterfaceV = r();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 25:
                boolean zG = lk.g(parcel);
                lk.c(parcel);
                i4(zG);
                parcel2.writeNoException();
                return true;
            case 26:
                iInterfaceV = o();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 27:
                iInterfaceV = s();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 28:
                g3.a aVarV09 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var9 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface6 instanceof g50 ? (g50) iInterfaceQueryLocalInterface6 : new e50(strongBinder6);
                }
                lk.c(parcel);
                m3(aVarV09, r4Var9, string14, e50Var);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                g3.a aVarV010 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                P0(aVarV010);
                parcel2.writeNoException();
                return true;
            case 31:
                g3.a aVarV011 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                j10 j10VarO5 = i10.O5(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(p10.CREATOR);
                lk.c(parcel);
                M1(aVarV011, j10VarO5, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case com.amazon.c.a.a.c.f4053h /* 32 */:
                g3.a aVarV012 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var10 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface7 instanceof g50 ? (g50) iInterfaceQueryLocalInterface7 : new e50(strongBinder7);
                }
                lk.c(parcel);
                f2(aVarV012, r4Var10, string15, e50Var);
                parcel2.writeNoException();
                return true;
            case 33:
                parcelableM = u();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableM);
                return true;
            case 34:
                parcelableM = x();
                parcel2.writeNoException();
                lk.e(parcel2, parcelableM);
                return true;
            case 35:
                g3.a aVarV013 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.w4 w4Var3 = (h2.w4) lk.a(parcel, h2.w4.CREATOR);
                h2.r4 r4Var11 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface8 instanceof g50 ? (g50) iInterfaceQueryLocalInterface8 : new e50(strongBinder8);
                }
                g50 g50Var5 = e50Var;
                lk.c(parcel);
                p2(aVarV013, w4Var3, r4Var11, string16, string17, g50Var5);
                parcel2.writeNoException();
                return true;
            case 36:
                iInterfaceV = t();
                parcel2.writeNoException();
                lk.f(parcel2, iInterfaceV);
                return true;
            case 37:
                g3.a aVarV014 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                A1(aVarV014);
                parcel2.writeNoException();
                return true;
            case 38:
                g3.a aVarV015 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                h2.r4 r4Var12 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    e50Var = iInterfaceQueryLocalInterface9 instanceof g50 ? (g50) iInterfaceQueryLocalInterface9 : new e50(strongBinder9);
                }
                lk.c(parcel);
                A3(aVarV015, r4Var12, string18, e50Var);
                parcel2.writeNoException();
                return true;
            case 39:
                g3.a aVarV016 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                lk.c(parcel);
                c3(aVarV016);
                parcel2.writeNoException();
                return true;
        }
    }
}
