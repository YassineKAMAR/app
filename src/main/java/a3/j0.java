package a3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable.Creator<i0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i0 createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                account = (Account) b3.b.e(parcel, iR, Account.CREATOR);
            } else if (iL == 3) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                googleSignInAccount = (GoogleSignInAccount) b3.b.e(parcel, iR, GoogleSignInAccount.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new i0(iT, account, iT2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i0[] newArray(int i8) {
        return new i0[i8];
    }
}
