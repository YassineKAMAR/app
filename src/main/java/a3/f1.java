package a3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements Parcelable.Creator {
    static void a(f fVar, Parcel parcel, int i8) {
        int iA = b3.c.a(parcel);
        b3.c.k(parcel, 1, fVar.f81a);
        b3.c.k(parcel, 2, fVar.f82b);
        b3.c.k(parcel, 3, fVar.f83c);
        b3.c.q(parcel, 4, fVar.f84d, false);
        b3.c.j(parcel, 5, fVar.f85e, false);
        b3.c.t(parcel, 6, fVar.f86f, i8, false);
        b3.c.e(parcel, 7, fVar.f87g, false);
        b3.c.p(parcel, 8, fVar.f88h, i8, false);
        b3.c.t(parcel, 10, fVar.f89i, i8, false);
        b3.c.t(parcel, 11, fVar.f90j, i8, false);
        b3.c.c(parcel, 12, fVar.f91k);
        b3.c.k(parcel, 13, fVar.f92l);
        b3.c.c(parcel, 14, fVar.f93m);
        b3.c.q(parcel, 15, fVar.g(), false);
        b3.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Scope[] scopeArr = f.f79o;
        Bundle bundle = new Bundle();
        x2.d[] dVarArr = f.f80p;
        x2.d[] dVarArr2 = dVarArr;
        String strF = null;
        IBinder iBinderS = null;
        Account account = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        boolean zM = false;
        int iT4 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 2:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 3:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 4:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 5:
                    iBinderS = b3.b.s(parcel, iR);
                    break;
                case 6:
                    scopeArr = (Scope[]) b3.b.i(parcel, iR, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b3.b.a(parcel, iR);
                    break;
                case 8:
                    account = (Account) b3.b.e(parcel, iR, Account.CREATOR);
                    break;
                case 9:
                default:
                    b3.b.x(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    dVarArr = (x2.d[]) b3.b.i(parcel, iR, x2.d.CREATOR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    dVarArr2 = (x2.d[]) b3.b.i(parcel, iR, x2.d.CREATOR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 13:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 14:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 15:
                    strF2 = b3.b.f(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new f(iT, iT2, iT3, strF, iBinderS, scopeArr, bundle, account, dVarArr, dVarArr2, zM, iT4, zM2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new f[i8];
    }
}
