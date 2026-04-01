package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class vv extends kk implements wv {
    public vv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static wv O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof wv ? (wv) iInterfaceQueryLocalInterface : new uv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.kk
    protected final boolean N5(int i8, Parcel parcel, Parcel parcel2, int i9) {
        int iP;
        if (i8 == 1) {
            g3.a aVarN = n();
            parcel2.writeNoException();
            lk.f(parcel2, aVarN);
        } else if (i8 == 2) {
            Uri uriM = m();
            parcel2.writeNoException();
            lk.e(parcel2, uriM);
        } else if (i8 != 3) {
            if (i8 == 4) {
                iP = p();
            } else {
                if (i8 != 5) {
                    return false;
                }
                iP = l();
            }
            parcel2.writeNoException();
            parcel2.writeInt(iP);
        } else {
            double dK = k();
            parcel2.writeNoException();
            parcel2.writeDouble(dK);
        }
        return true;
    }
}
