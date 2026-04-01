package g3;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0110a extends l3.b implements a {
        public AbstractBinderC0110a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a v0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new d(iBinder);
        }
    }
}
