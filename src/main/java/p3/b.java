package p3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            if (b3.b.l(iR) != 1) {
                b3.b.x(parcel, iR);
            } else {
                bundleA = b3.b.a(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new c(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i8) {
        return new c[i8];
    }
}
