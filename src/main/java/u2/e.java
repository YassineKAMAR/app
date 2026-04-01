package u2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                strF = b3.b.f(parcel, iR);
            } else if (iL != 2) {
                b3.b.x(parcel, iR);
            } else {
                strF2 = b3.b.f(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new d(strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d[] newArray(int i8) {
        return new d[i8];
    }
}
