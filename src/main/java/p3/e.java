package p3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator<com.google.android.gms.measurement.internal.d0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.d0 createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        String strF = null;
        com.google.android.gms.measurement.internal.z zVar = null;
        String strF2 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 2) {
                strF = b3.b.f(parcel, iR);
            } else if (iL == 3) {
                zVar = (com.google.android.gms.measurement.internal.z) b3.b.e(parcel, iR, com.google.android.gms.measurement.internal.z.CREATOR);
            } else if (iL == 4) {
                strF2 = b3.b.f(parcel, iR);
            } else if (iL != 5) {
                b3.b.x(parcel, iR);
            } else {
                jU = b3.b.u(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new com.google.android.gms.measurement.internal.d0(strF, zVar, strF2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.d0[] newArray(int i8) {
        return new com.google.android.gms.measurement.internal.d0[i8];
    }
}
