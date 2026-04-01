package h2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        z2 z2Var = null;
        Bundle bundleA = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 2:
                    jU = b3.b.u(parcel, iR);
                    break;
                case 3:
                    z2Var = (z2) b3.b.e(parcel, iR, z2.CREATOR);
                    break;
                case 4:
                    bundleA = b3.b.a(parcel, iR);
                    break;
                case 5:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 6:
                    strF3 = b3.b.f(parcel, iR);
                    break;
                case 7:
                    strF4 = b3.b.f(parcel, iR);
                    break;
                case 8:
                    strF5 = b3.b.f(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new a5(strF, jU, z2Var, bundleA, strF2, strF3, strF4, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a5[i8];
    }
}
