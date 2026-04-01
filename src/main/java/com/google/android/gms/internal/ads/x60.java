package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class x60 extends kk implements y60 {
    public x60() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static y60 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof y60 ? (y60) iInterfaceQueryLocalInterface : new w60(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.b70] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.v60] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.s60] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.v60] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.s60] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.x60, com.google.android.gms.internal.ads.y60] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.os.Parcel] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.m60] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.m60] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.google.android.gms.internal.ads.j60] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.p60] */
    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        m70 m70VarN;
        ?? T0;
        Object z60Var = null;
        if (i8 != 1) {
            if (i8 == 2) {
                m70VarN = n();
            } else {
                if (i8 != 3) {
                    if (i8 != 5) {
                        if (i8 == 10) {
                            a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                        } else if (i8 != 11) {
                            switch (i8) {
                                case 13:
                                    String string = parcel.readString();
                                    String string2 = parcel.readString();
                                    h2.r4 r4Var = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV0 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder = parcel.readStrongBinder();
                                    if (strongBinder != null) {
                                        Object objQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        z60Var = objQueryLocalInterface instanceof m60 ? (m60) objQueryLocalInterface : new k60(strongBinder);
                                    }
                                    ?? r52 = z60Var;
                                    g50 g50VarO5 = f50.O5(parcel.readStrongBinder());
                                    h2.w4 w4Var = (h2.w4) lk.a(parcel, h2.w4.CREATOR);
                                    lk.c(parcel);
                                    Z4(string, string2, r4Var, aVarV0, r52, g50VarO5, w4Var);
                                    break;
                                case 14:
                                    String string3 = parcel.readString();
                                    String string4 = parcel.readString();
                                    h2.r4 r4Var2 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV02 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder2 = parcel.readStrongBinder();
                                    if (strongBinder2 != null) {
                                        Object objQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                        z60Var = objQueryLocalInterface2 instanceof p60 ? (p60) objQueryLocalInterface2 : new n60(strongBinder2);
                                    }
                                    ?? r72 = z60Var;
                                    g50 g50VarO52 = f50.O5(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    s2(string3, string4, r4Var2, aVarV02, r72, g50VarO52);
                                    break;
                                case 15:
                                    g3.a aVarV03 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    T0 = t0(aVarV03);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(T0);
                                    break;
                                case com.amazon.c.a.a.c.f4052g /* 16 */:
                                    String string5 = parcel.readString();
                                    String string6 = parcel.readString();
                                    h2.r4 r4Var3 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV04 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder3 = parcel.readStrongBinder();
                                    if (strongBinder3 != null) {
                                        Object objQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        z60Var = objQueryLocalInterface3 instanceof v60 ? (v60) objQueryLocalInterface3 : new t60(strongBinder3);
                                    }
                                    ?? r11 = z60Var;
                                    g50 g50VarO53 = f50.O5(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    l3(string5, string6, r4Var3, aVarV04, r11, g50VarO53);
                                    break;
                                case 17:
                                    g3.a aVarV05 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    T0 = l2(aVarV05);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(T0);
                                    break;
                                case 18:
                                    String string7 = parcel.readString();
                                    String string8 = parcel.readString();
                                    h2.r4 r4Var4 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV06 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder4 = parcel.readStrongBinder();
                                    if (strongBinder4 != null) {
                                        Object objQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        z60Var = objQueryLocalInterface4 instanceof s60 ? (s60) objQueryLocalInterface4 : new q60(strongBinder4);
                                    }
                                    ?? r112 = z60Var;
                                    g50 g50VarO54 = f50.O5(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    U1(string7, string8, r4Var4, aVarV06, r112, g50VarO54);
                                    break;
                                case 19:
                                    String string9 = parcel.readString();
                                    lk.c(parcel);
                                    j5(string9);
                                    break;
                                case 20:
                                    String string10 = parcel.readString();
                                    String string11 = parcel.readString();
                                    h2.r4 r4Var5 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV07 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder5 = parcel.readStrongBinder();
                                    if (strongBinder5 != null) {
                                        Object objQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                        z60Var = objQueryLocalInterface5 instanceof v60 ? (v60) objQueryLocalInterface5 : new t60(strongBinder5);
                                    }
                                    ?? r113 = z60Var;
                                    g50 g50VarO55 = f50.O5(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    T2(string10, string11, r4Var5, aVarV07, r113, g50VarO55);
                                    break;
                                case 21:
                                    String string12 = parcel.readString();
                                    String string13 = parcel.readString();
                                    h2.r4 r4Var6 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV08 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder6 = parcel.readStrongBinder();
                                    if (strongBinder6 != null) {
                                        Object objQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                        z60Var = objQueryLocalInterface6 instanceof m60 ? (m60) objQueryLocalInterface6 : new k60(strongBinder6);
                                    }
                                    ?? r53 = z60Var;
                                    g50 g50VarO56 = f50.O5(parcel.readStrongBinder());
                                    h2.w4 w4Var2 = (h2.w4) lk.a(parcel, h2.w4.CREATOR);
                                    lk.c(parcel);
                                    Y3(string12, string13, r4Var6, aVarV08, r53, g50VarO56, w4Var2);
                                    break;
                                case 22:
                                    String string14 = parcel.readString();
                                    String string15 = parcel.readString();
                                    h2.r4 r4Var7 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV09 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder7 = parcel.readStrongBinder();
                                    if (strongBinder7 != null) {
                                        Object objQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                        z60Var = objQueryLocalInterface7 instanceof s60 ? (s60) objQueryLocalInterface7 : new q60(strongBinder7);
                                    }
                                    ?? r114 = z60Var;
                                    g50 g50VarO57 = f50.O5(parcel.readStrongBinder());
                                    lv lvVar = (lv) lk.a(parcel, lv.CREATOR);
                                    lk.c(parcel);
                                    F2(string14, string15, r4Var7, aVarV09, r114, g50VarO57, lvVar);
                                    break;
                                case 23:
                                    String string16 = parcel.readString();
                                    String string17 = parcel.readString();
                                    h2.r4 r4Var8 = (h2.r4) lk.a(parcel, h2.r4.CREATOR);
                                    g3.a aVarV010 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    IBinder strongBinder8 = parcel.readStrongBinder();
                                    if (strongBinder8 != null) {
                                        Object objQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                        z60Var = objQueryLocalInterface8 instanceof j60 ? (j60) objQueryLocalInterface8 : new h60(strongBinder8);
                                    }
                                    ?? r73 = z60Var;
                                    g50 g50VarO58 = f50.O5(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    E1(string16, string17, r4Var8, aVarV010, r73, g50VarO58);
                                    break;
                                case 24:
                                    g3.a aVarV011 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
                                    lk.c(parcel);
                                    T0 = a0(aVarV011);
                                    parcel2.writeNoException();
                                    parcel2.writeInt(T0);
                                    break;
                                default:
                                    return false;
                            }
                        } else {
                            parcel.createStringArray();
                        }
                        lk.c(parcel);
                    } else {
                        h2.p2 p2VarM = m();
                        parcel2.writeNoException();
                        lk.f(parcel2, p2VarM);
                    }
                    return true;
                }
                m70VarN = q();
            }
            parcel2.writeNoException();
            lk.e(parcel2, m70VarN);
            return true;
        }
        g3.a aVarV012 = a.AbstractBinderC0110a.v0(parcel.readStrongBinder());
        String string18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) lk.a(parcel, creator);
        Bundle bundle2 = (Bundle) lk.a(parcel, creator);
        h2.w4 w4Var3 = (h2.w4) lk.a(parcel, h2.w4.CREATOR);
        IBinder strongBinder9 = parcel.readStrongBinder();
        if (strongBinder9 != null) {
            Object objQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            z60Var = objQueryLocalInterface9 instanceof b70 ? (b70) objQueryLocalInterface9 : new z60(strongBinder9);
        }
        ?? r115 = z60Var;
        lk.c(parcel);
        x1(aVarV012, string18, bundle, bundle2, w4Var3, r115);
        parcel2.writeNoException();
        return true;
    }
}
