package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            if (b3.b.l(iR) != 2) {
                b3.b.x(parcel, iR);
            } else {
                iT = b3.b.t(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new c5(iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new c5[i8];
    }
}
