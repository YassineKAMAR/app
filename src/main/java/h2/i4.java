package h2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            if (b3.b.l(iR) != 15) {
                b3.b.x(parcel, iR);
            } else {
                strF = b3.b.f(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new h4(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new h4[i8];
    }
}
