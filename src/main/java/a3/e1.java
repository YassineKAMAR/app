package a3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        q qVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            switch (b3.b.l(iR)) {
                case 1:
                    qVar = (q) b3.b.e(parcel, iR, q.CREATOR);
                    break;
                case 2:
                    zM = b3.b.m(parcel, iR);
                    break;
                case 3:
                    zM2 = b3.b.m(parcel, iR);
                    break;
                case 4:
                    iArrC = b3.b.c(parcel, iR);
                    break;
                case 5:
                    iT = b3.b.t(parcel, iR);
                    break;
                case 6:
                    iArrC2 = b3.b.c(parcel, iR);
                    break;
                default:
                    b3.b.x(parcel, iR);
                    break;
            }
        }
        b3.b.k(parcel, iY);
        return new e(qVar, zM, zM2, iArrC, iT, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new e[i8];
    }
}
