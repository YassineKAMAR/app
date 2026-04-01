package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 2) {
                zM = b3.b.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = b3.b.m(parcel, iR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                zM3 = b3.b.m(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new k4(zM, zM2, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new k4[i8];
    }
}
