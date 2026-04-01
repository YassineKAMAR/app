package j3;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // j3.b
    protected final boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 != 1) {
            return false;
        }
        Y0((Status) c.a(parcel, Status.CREATOR), (u2.f) c.a(parcel, u2.f.CREATOR));
        return true;
    }
}
