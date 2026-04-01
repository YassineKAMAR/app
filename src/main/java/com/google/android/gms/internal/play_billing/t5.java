package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class t5 extends w5 implements u5 {
    public t5() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
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
