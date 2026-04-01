package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iT2 = 0;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                zM = b3.b.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = b3.b.m(parcel, iR);
            } else if (iL == 4) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL != 5) {
                b3.b.x(parcel, iR);
            } else {
                iT3 = b3.b.t(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new q(iT, zM, zM2, iT2, iT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new q[i8];
    }
}
