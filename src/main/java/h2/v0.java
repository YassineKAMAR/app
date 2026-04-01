package h2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.kk;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends kk implements w0 {
    public static w0 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof w0 ? (w0) iInterfaceQueryLocalInterface : new u0(iBinder);
    }
}
