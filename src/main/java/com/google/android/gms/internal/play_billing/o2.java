package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o2 extends w5 implements p3 {
    public o2() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.w5
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) x5.a(parcel, Bundle.CREATOR);
        x5.b(parcel);
        f(bundle);
        parcel2.writeNoException();
        return true;
    }
}
