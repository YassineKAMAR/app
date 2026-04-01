package a3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator<s> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ s createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        int iT = 0;
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                iT = b3.b.t(parcel, iR);
            } else if (iL != 2) {
                b3.b.x(parcel, iR);
            } else {
                arrayListJ = b3.b.j(parcel, iR, m.CREATOR);
            }
        }
        b3.b.k(parcel, iY);
        return new s(iT, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s[] newArray(int i8) {
        return new s[i8];
    }
}
