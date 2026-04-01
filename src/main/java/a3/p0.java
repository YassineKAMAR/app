package a3;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class p0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f154a;

    p0(IBinder iBinder) {
        this.f154a = iBinder;
    }

    @Override // a3.l
    public final void V3(k kVar, f fVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (fVar != null) {
                parcelObtain.writeInt(1);
                f1.a(fVar, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f154a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f154a;
    }
}
