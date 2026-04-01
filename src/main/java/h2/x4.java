package h2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        w4[] w4VarArr = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 4:
                    iT2 = b3.b.t(parcel, iR);
                    break;
                case 5:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 6:
                    iT3 = b3.b.t(parcel, iR);
                    break;
                case 7:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 8:
                    w4VarArr = (w4[]) b3.b.i(parcel, iR, w4.CREATOR);
                    break;
                case 9:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    zM5 = b3.b.m(parcel, iR);
                    break;
                case 13:
                    zM6 = b3.b.m(parcel, iR);
                    break;
                case 14:
                    zM7 = b3.b.m(parcel, iR);
                    break;
                case 15:
                    zM8 = b3.b.m(parcel, iR);
                    break;
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    zM9 = b3.b.m(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new w4(strF, iT, iT2, zM, iT3, iT4, w4VarArr, zM2, zM3, zM4, zM5, zM6, zM7, zM8, zM9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new w4[i8];
    }
}
