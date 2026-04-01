package a3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Bundle bundleA = null;
        x2.d[] dVarArr = null;
        e eVar = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                bundleA = b3.b.a(parcel, iR);
            } else if (iL == 2) {
                dVarArr = (x2.d[]) b3.b.i(parcel, iR, x2.d.CREATOR);
            } else if (iL == 3) {
                iT = b3.b.t(parcel, iR);
            } else if (iL != 4) {
                b3.b.x(parcel, iR);
            } else {
                eVar = (e) b3.b.e(parcel, iR, e.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new c1(bundleA, dVarArr, iT, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new c1[i8];
    }
}
