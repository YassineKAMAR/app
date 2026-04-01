package com.amazon.d.a;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: com.amazon.d.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0058a extends Binder implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f4093a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f4094b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f4095c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f4096d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f4097e = "com.amazon.venezia.command.Choice";

        /* JADX INFO: renamed from: com.amazon.d.a.a$a$a, reason: collision with other inner class name */
        private static class C0059a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f4098a;

            C0059a(IBinder iBinder) {
                this.f4098a = iBinder;
            }

            @Override // com.amazon.d.a.a
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0058a.f4097e);
                    this.f4098a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.a
            public void a(b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0058a.f4097e);
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f4098a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4098a;
            }

            @Override // com.amazon.d.a.a
            public Intent b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0058a.f4097e);
                    this.f4098a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.a
            public Map c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(AbstractBinderC0058a.f4097e);
                    this.f4098a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String d() {
                return AbstractBinderC0058a.f4097e;
            }
        }

        public AbstractBinderC0058a() {
            attachInterface(this, f4097e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f4097e);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0059a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface(f4097e);
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i8 == 2) {
                parcel.enforceInterface(f4097e);
                Intent intentB = b();
                parcel2.writeNoException();
                if (intentB != null) {
                    parcel2.writeInt(1);
                    intentB.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i8 == 3) {
                parcel.enforceInterface(f4097e);
                a(b.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i8 != 4) {
                if (i8 != 1598968902) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                }
                parcel2.writeString(f4097e);
                return true;
            }
            parcel.enforceInterface(f4097e);
            Map mapC = c();
            parcel2.writeNoException();
            parcel2.writeMap(mapC);
            return true;
        }
    }

    String a();

    void a(b bVar);

    Intent b();

    Map c();
}
