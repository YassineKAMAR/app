package x2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        int iT = 0;
        PendingIntent pendingIntent = null;
        String strF = null;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = b3.b.t(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) b3.b.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                strF = b3.b.f(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new b(iT, iT2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}
