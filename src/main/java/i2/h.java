package i2;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Intent intent = null;
        IBinder iBinderS = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 2:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 3:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 4:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 5:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case 6:
                    strF5 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    strF6 = b3.b.f(parcel, iR);
                    break;
                case 8:
                    strF7 = b3.b.f(parcel, iR);
                    break;
                case 9:
                    intent = (Intent) b3.b.e(parcel, iR, Intent.CREATOR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    iBinderS = b3.b.s(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    zM = b3.b.m(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new i(strF, strF2, strF3, strF4, strF5, strF6, strF7, intent, iBinderS, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new i[i8];
    }
}
