package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class jk implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f9665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9666b;

    protected jk(IBinder iBinder, String str) {
        this.f9665a = iBinder;
        this.f9666b = str;
    }

    protected final void H0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f9665a.transact(i8, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9665a;
    }

    protected final Parcel k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f9666b);
        return parcelObtain;
    }

    protected final void k3(int i8, Parcel parcel) {
        try {
            this.f9665a.transact(i8, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel v0(int i8, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f9665a.transact(i8, parcel, parcelObtain, 0);
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
