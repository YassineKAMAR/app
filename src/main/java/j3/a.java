package j3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f24090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24091b = "com.google.android.gms.appset.internal.IAppSetService";

    protected a(IBinder iBinder, String str) {
        this.f24090a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24090a;
    }

    protected final Parcel k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24091b);
        return parcelObtain;
    }

    protected final void v0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f24090a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
