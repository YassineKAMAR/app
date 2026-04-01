package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class w0 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f19283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19284b;

    protected w0(IBinder iBinder, String str) {
        this.f19283a = iBinder;
        this.f19284b = str;
    }

    protected final void H0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f19283a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f19283a;
    }

    protected final Parcel k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19284b);
        return parcelObtain;
    }

    protected final Parcel v0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f19283a.transact(i8, parcel, parcelObtain, 0);
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
}
