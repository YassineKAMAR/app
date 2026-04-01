package a3;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends l3.a implements i {
    o1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // a3.i
    public final Account k() {
        Parcel parcelK0 = k0(2, v0());
        Account account = (Account) l3.c.a(parcelK0, Account.CREATOR);
        parcelK0.recycle();
        return account;
    }
}
