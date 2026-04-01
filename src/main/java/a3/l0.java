package a3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable.Creator<k0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ k0 createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        IBinder iBinderS = null;
        x2.b bVar = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL == 2) {
                iBinderS = b3.b.s(parcel, iR);
            } else if (iL == 3) {
                bVar = (x2.b) b3.b.e(parcel, iR, x2.b.CREATOR);
            } else if (iL == 4) {
                zM = b3.b.m(parcel, iR);
            } else if (iL != 5) {
                b3.b.x(parcel, iR);
            } else {
                zM2 = b3.b.m(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new k0(iT, iBinderS, bVar, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k0[] newArray(int i8) {
        return new k0[i8];
    }
}
