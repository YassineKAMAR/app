package com.amazon.d.c.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.amazon.d.c.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0069a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f4156a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f4157b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f4158c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f4159d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f4160e = "com.amazon.venezia.service.verify.IApplicationVerificationService";

        /* JADX INFO: renamed from: com.amazon.d.c.a.a$a$a, reason: collision with other inner class name */
        private static class C0070a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f4161a;

            C0070a(IBinder iBinder) {
                this.f4161a = iBinder;
            }

            @Override // com.amazon.d.c.a.a
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0069a.f4160e);
                    this.f4161a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.c.a.a
            public String a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0069a.f4160e);
                    parcelObtain.writeString(str);
                    this.f4161a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.c.a.a
            public void a(String str, boolean z7, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0069a.f4160e);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z7 ? 1 : 0);
                    parcelObtain.writeString(str2);
                    this.f4161a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4161a;
            }

            @Override // com.amazon.d.c.a.a
            public String b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0069a.f4160e);
                    this.f4161a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String c() {
                return AbstractBinderC0069a.f4160e;
            }
        }

        public AbstractBinderC0069a() {
            attachInterface(this, f4160e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f4160e);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0070a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface(f4160e);
                a(parcel.readString(), parcel.readInt() != 0, parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i8 == 2) {
                parcel.enforceInterface(f4160e);
                String strA = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i8 == 3) {
                parcel.enforceInterface(f4160e);
                String strA2 = a();
                parcel2.writeNoException();
                parcel2.writeString(strA2);
                return true;
            }
            if (i8 != 4) {
                if (i8 != 1598968902) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                parcel2.writeString(f4160e);
                return true;
            }
            parcel.enforceInterface(f4160e);
            String strB = b();
            parcel2.writeNoException();
            parcel2.writeString(strB);
            return true;
        }
    }

    String a();

    String a(String str);

    void a(String str, boolean z7, String str2);

    String b();
}
