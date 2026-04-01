package u2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                strF = b3.b.f(parcel, iR);
            } else if (iL != 2) {
                b3.b.x(parcel, iR);
            } else {
                iT = b3.b.t(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new f(strF, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i8) {
        return new f[i8];
    }
}
