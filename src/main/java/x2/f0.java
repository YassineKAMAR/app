package x2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        IBinder iBinderS = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 2) {
                iBinderS = b3.b.s(parcel, iR);
            } else if (iL == 3) {
                zM = b3.b.m(parcel, iR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                zM2 = b3.b.m(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new e0(strF, iBinderS, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new e0[i8];
    }
}
