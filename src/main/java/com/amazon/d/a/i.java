package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.f;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.j;

/* JADX INFO: loaded from: classes.dex */
public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f4139a = "com.amazon.venezia.command.ResultCallback";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f4140b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f4141c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f4142d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f4143e = 4;

        /* JADX INFO: renamed from: com.amazon.d.a.i$a$a, reason: collision with other inner class name */
        private static class C0067a implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f4144a;

            C0067a(IBinder iBinder) {
                this.f4144a = iBinder;
            }

            public String a() {
                return a.f4139a;
            }

            @Override // com.amazon.d.a.i
            public void a(f fVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f4139a);
                    parcelObtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f4144a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.i
            public void a(g gVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f4139a);
                    parcelObtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f4144a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.i
            public void a(h hVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f4139a);
                    parcelObtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f4144a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.i
            public void a(j jVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f4139a);
                    parcelObtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f4144a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4144a;
            }
        }

        public a() {
            attachInterface(this, f4139a);
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f4139a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i)) ? new C0067a(iBinder) : (i) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1) {
                parcel.enforceInterface(f4139a);
                a(j.a.a(parcel.readStrongBinder()));
            } else if (i8 == 2) {
                parcel.enforceInterface(f4139a);
                a(h.a.a(parcel.readStrongBinder()));
            } else if (i8 == 3) {
                parcel.enforceInterface(f4139a);
                a(f.a.a(parcel.readStrongBinder()));
            } else {
                if (i8 != 4) {
                    if (i8 != 1598968902) {
                        return super.onTransact(i8, parcel, parcel2, i9);
                    }
                    parcel2.writeString(f4139a);
                    return true;
                }
                parcel.enforceInterface(f4139a);
                a(g.a.a(parcel.readStrongBinder()));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void a(j jVar);
}
