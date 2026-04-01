package r3;

import a3.k0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        x2.b bVar = null;
        k0 k0Var = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                bVar = (x2.b) b3.b.e(parcel, iR, x2.b.CREATOR);
            } else if (iL != 3) {
                b3.b.x(parcel, iR);
            } else {
                k0Var = (k0) b3.b.e(parcel, iR, k0.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new l(iT, bVar, k0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i8) {
        return new l[i8];
    }
}
