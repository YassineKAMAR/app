package r3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int iY = b3.b.y(parcel);
        ArrayList<String> arrayListH = null;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = b3.b.r(parcel);
            int iL = b3.b.l(iR);
            if (iL == 1) {
                arrayListH = b3.b.h(parcel, iR);
            } else if (iL != 2) {
                b3.b.x(parcel, iR);
            } else {
                strF = b3.b.f(parcel, iR);
            }
        }
        b3.b.k(parcel, iY);
        return new h(arrayListH, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i8) {
        return new h[i8];
    }
}
