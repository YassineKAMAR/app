package r3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends k3.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // k3.b
    protected final boolean k3(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (i8) {
            case 3:
                break;
            case 4:
            case 6:
                break;
            case 5:
            default:
                return false;
            case 7:
                break;
            case 8:
                r2((l) k3.c.a(parcel, l.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
