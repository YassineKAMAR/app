package l3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f24379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24380b;

    protected a(IBinder iBinder, String str) {
        this.f24379a = iBinder;
        this.f24380b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24379a;
    }

    protected final Parcel k0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f24379a.transact(i8, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel v0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24380b);
        return parcelObtain;
    }
}
