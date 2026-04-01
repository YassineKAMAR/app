package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends v5 implements s5 {
    q5(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle C2(int i8, String str, String str2, String str3, String str4) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        parcelK0.writeString(null);
        Parcel parcelV0 = v0(3, parcelK0);
        Bundle bundle = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle E5(int i8, String str, String str2, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(9);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        x5.c(parcelK0, bundle);
        Parcel parcelV0 = v0(902, parcelK0);
        Bundle bundle2 = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final int P3(int i8, String str, String str2) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        Parcel parcelV0 = v0(1, parcelK0);
        int i9 = parcelV0.readInt();
        parcelV0.recycle();
        return i9;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final int V4(int i8, String str, String str2, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        x5.c(parcelK0, bundle);
        Parcel parcelV0 = v0(10, parcelK0);
        int i9 = parcelV0.readInt();
        parcelV0.recycle();
        return i9;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle W0(int i8, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        x5.c(parcelK0, bundle);
        x5.c(parcelK0, bundle2);
        Parcel parcelV0 = v0(901, parcelK0);
        Bundle bundle3 = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.s5
    public final void Y4(int i8, String str, Bundle bundle, u5 u5Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(12);
        parcelK0.writeString(str);
        x5.c(parcelK0, bundle);
        parcelK0.writeStrongBinder(u5Var);
        H0(1201, parcelK0);
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final int a1(int i8, String str, String str2) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        Parcel parcelV0 = v0(5, parcelK0);
        int i9 = parcelV0.readInt();
        parcelV0.recycle();
        return i9;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle a4(int i8, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        parcelK0.writeString(null);
        x5.c(parcelK0, bundle);
        Parcel parcelV0 = v0(8, parcelK0);
        Bundle bundle2 = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle e1(int i8, String str, String str2, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(9);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        x5.c(parcelK0, bundle);
        Parcel parcelV0 = v0(12, parcelK0);
        Bundle bundle2 = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle f5(int i8, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(i8);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        x5.c(parcelK0, bundle);
        Parcel parcelV0 = v0(11, parcelK0);
        Bundle bundle2 = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle q2(int i8, String str, String str2, String str3) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(3);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        Parcel parcelV0 = v0(4, parcelK0);
        Bundle bundle = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.s5
    public final void r1(int i8, String str, Bundle bundle, p3 p3Var) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(18);
        parcelK0.writeString(str);
        x5.c(parcelK0, bundle);
        parcelK0.writeStrongBinder(p3Var);
        H0(1301, parcelK0);
    }

    @Override // com.google.android.gms.internal.play_billing.s5
    public final Bundle t1(int i8, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelK0 = k0();
        parcelK0.writeInt(6);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        parcelK0.writeString(str3);
        x5.c(parcelK0, bundle);
        Parcel parcelV0 = v0(9, parcelK0);
        Bundle bundle2 = (Bundle) x5.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle2;
    }
}
