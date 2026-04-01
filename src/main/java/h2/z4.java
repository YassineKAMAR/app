package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class z4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        long jU = 0;
        String strF = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL == 3) {
                strF = b3.b.f(parcel, iR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                jU = b3.b.u(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new y4(iT, iT2, strF, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new y4[i8];
    }
}
