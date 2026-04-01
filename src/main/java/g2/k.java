package g2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases_flutter.R;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        float fP = 0.0f;
        int iT = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 2:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 4:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 5:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 6:
                    fP = b3.b.p(parcel, iR);
                    break;
                case 7:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 8:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                case 9:
                    zM5 = b3.b.m(parcel, iR);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    zM6 = b3.b.m(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new j(zM, zM2, strF, zM3, fP, iT, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new j[i8];
    }
}
