package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        String strF2 = null;
        long jU = 0;
        long jU2 = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = -1;
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
                    jU = b3.b.u(parcel, iR);
                    break;
                case 5:
                    jU2 = b3.b.u(parcel, iR);
                    break;
                case 6:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 7:
                    strF2 = b3.b.f(parcel, iR);
                    break;
                case 8:
                    iT4 = b3.b.t(parcel, iR);
                    break;
                case 9:
                    iT5 = b3.b.t(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new m(iT, iT2, iT3, jU, jU2, strF, strF2, iT4, iT5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i8) {
        return new m[i8];
    }
}
