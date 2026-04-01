package c2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                zM = b3.b.m(parcel, iR);
            } else if (iL == 2) {
                iBinderS = b3.b.s(parcel, iR);
            } else if (iL != 3) {
                b3.b.x(parcel, iR);
            } else {
                iBinderS2 = b3.b.s(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new g(zM, iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new g[i8];
    }
}
