package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public class z0 extends Binder implements IInterface {
    protected z0(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean k0(int i8, Parcel parcel, Parcel parcel2, int i9) {
        throw null;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) throws RemoteException {
        boolean zOnTransact;
        if (i8 > 16777215) {
            zOnTransact = super.onTransact(i8, parcel, parcel2, i9);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return k0(i8, parcel, parcel2, i9);
    }
}
