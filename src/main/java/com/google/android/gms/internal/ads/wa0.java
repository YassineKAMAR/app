package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends b3.a {
    public static final Parcelable.Creator<wa0> CREATOR = new xa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ParcelFileDescriptor f16668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Parcelable f16669b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16670c = true;

    public wa0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f16668a = parcelFileDescriptor;
    }

    public final b3.d g(Parcelable.Creator creator) {
        if (this.f16670c) {
            if (this.f16668a == null) {
                qg0.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f16668a));
            try {
                try {
                    int i8 = dataInputStream.readInt();
                    byte[] bArr = new byte[i8];
                    dataInputStream.readFully(bArr, 0, i8);
                    e3.k.a(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i8);
                        parcelObtain.setDataPosition(0);
                        this.f16669b = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.f16670c = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e8) {
                    qg0.e("Could not read from parcel file descriptor", e8);
                    e3.k.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                e3.k.a(dataInputStream);
                throw th2;
            }
        }
        return (b3.d) this.f16669b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f16668a == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.f16669b.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        eh0.f7322a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.va0
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Parcelable.Creator<wa0> creator = wa0.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            e3.k.a(dataOutputStream2);
                                        } catch (IOException e8) {
                                            e = e8;
                                            dataOutputStream = dataOutputStream2;
                                            qg0.e("Error transporting the ad response", e);
                                            g2.t.q().u(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                e3.k.a(outputStream);
                                            } else {
                                                e3.k.a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                e3.k.a(outputStream);
                                            } else {
                                                e3.k.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e9) {
                                    e = e9;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e8) {
                        e = e8;
                        qg0.e("Error transporting the ad response", e);
                        g2.t.q().u(e, "LargeParcelTeleporter.pipeData.2");
                        e3.k.a(autoCloseOutputStream);
                    }
                } catch (IOException e9) {
                    e = e9;
                    autoCloseOutputStream = null;
                }
                this.f16668a = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iA = b3.c.a(parcel);
        b3.c.p(parcel, 2, this.f16668a, i8, false);
        b3.c.b(parcel, iA);
    }
}
