package h2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.kk;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends kk implements r1 {
    public static r1 O5(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof r1 ? (r1) iInterfaceQueryLocalInterface : new p1(iBinder);
    }
}
