package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f24200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24201b;

    protected a(IBinder iBinder, String str) {
        this.f24200a = iBinder;
        this.f24201b = str;
    }

    protected final void H0(int i8, Parcel parcel) {
        try {
            this.f24200a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24200a;
    }

    protected final Parcel k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24201b);
        return parcelObtain;
    }

    protected final void v0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f24200a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
