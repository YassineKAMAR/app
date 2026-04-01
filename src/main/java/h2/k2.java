package h2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.lk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends jk implements m2 {
    k2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // h2.m2
    public final Bundle m() {
        Parcel parcelV0 = v0(5, k0());
        Bundle bundle = (Bundle) lk.a(parcelV0, Bundle.CREATOR);
        parcelV0.recycle();
        return bundle;
    }

    @Override // h2.m2
    public final a5 n() {
        Parcel parcelV0 = v0(4, k0());
        a5 a5Var = (a5) lk.a(parcelV0, a5.CREATOR);
        parcelV0.recycle();
        return a5Var;
    }

    @Override // h2.m2
    public final String o() {
        Parcel parcelV0 = v0(6, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // h2.m2
    public final String q() {
        Parcel parcelV0 = v0(1, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // h2.m2
    public final String r() {
        Parcel parcelV0 = v0(2, k0());
        String string = parcelV0.readString();
        parcelV0.recycle();
        return string;
    }

    @Override // h2.m2
    public final List t() {
        Parcel parcelV0 = v0(3, k0());
        ArrayList arrayListCreateTypedArrayList = parcelV0.createTypedArrayList(a5.CREATOR);
        parcelV0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
