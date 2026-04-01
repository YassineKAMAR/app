package x2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        IBinder iBinderS = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    strF = b3.b.f(parcel, iR);
                    break;
                case 2:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 4:
                    iBinderS = b3.b.s(parcel, iR);
                    break;
                case 5:
                    zM3 = b3.b.m(parcel, iR);
                    break;
                case 6:
                    zM4 = b3.b.m(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new a0(strF, zM, zM2, iBinderS, zM3, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new a0[i8];
    }
}
