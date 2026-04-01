package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f4126a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f4127b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f4128c = "com.amazon.venezia.command.ExceptionResult";

        /* JADX INFO: renamed from: com.amazon.d.a.g$a$a, reason: collision with other inner class name */
        private static class C0065a implements g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f4129a;

            C0065a(IBinder iBinder) {
                this.f4129a = iBinder;
            }

            @Override // com.amazon.d.a.g
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f4128c);
                    this.f4129a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4129a;
            }

            @Override // com.amazon.d.a.g
            public Map b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f4128c);
                    this.f4129a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String c() {
                return a.f4128c;
            }
        }

        public a() {
            attachInterface(this, f4128c);
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f4128c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g)) ? new C0065a(iBinder) : (g) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface(f4128c);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i8 != 2) {
                if (i8 != 1598968902) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                parcel2.writeString(f4128c);
                return true;
            }
            parcel.enforceInterface(f4128c);
            Map mapB = b();
            parcel2.writeNoException();
            parcel2.writeMap(mapB);
            return true;
        }
    }

    String a();

    Map b();
}
