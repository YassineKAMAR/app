package a3;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends b3.a {
    public static final Parcelable.Creator<i0> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Account f110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f112d;

    i0(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f109a = i8;
        this.f110b = account;
        this.f111c = i9;
        this.f112d = googleSignInAccount;
    }

    public i0(Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i8, googleSignInAccount);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, this.f109a);
        b3.c.p(parcel, 2, this.f110b, i8, false);
        b3.c.k(parcel, 3, this.f111c);
        b3.c.p(parcel, 4, this.f112d, i8, false);
        b3.c.b(parcel, iA);
    }
}
