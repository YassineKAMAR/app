package r3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        int iT = 0;
        Intent intent = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL != 3) {
                b3.b.x(parcel, iR);
            } else {
                intent = (Intent) b3.b.e(parcel, iR, Intent.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new b(iT, iT2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i8) {
        return new b[i8];
    }
}
