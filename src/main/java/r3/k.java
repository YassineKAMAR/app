package r3;

import a3.i0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        int iT = 0;
        i0 i0Var = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL != 2) {
                b3.b.x(parcel, iR);
            } else {
                i0Var = (i0) b3.b.e(parcel, iR, i0.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new j(iT, i0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i8) {
        return new j[i8];
    }
}
