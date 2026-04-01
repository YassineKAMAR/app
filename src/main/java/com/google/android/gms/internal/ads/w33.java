package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ik f16612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f16613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f16614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f16615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f16616e;

    public w33(ik ikVar, File file, File file2, File file3) {
        this.f16612a = ikVar;
        this.f16613b = file;
        this.f16614c = file3;
        this.f16615d = file2;
    }

    public final ik a() {
        return this.f16612a;
    }

    public final File b() {
        return this.f16614c;
    }

    public final File c() {
        return this.f16613b;
    }

    public final boolean d(long j8) {
        return this.f16612a.N() - (System.currentTimeMillis() / 1000) < 3600;
    }

    public final byte[] e() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrA;
        ArrayList arrayList;
        int iMin;
        FileInputStream fileInputStream2 = null;
        if (this.f16616e == null) {
            try {
                fileInputStream = new FileInputStream(this.f16615d);
            } catch (IOException unused) {
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                arrayList = new ArrayList();
                iMin = 256;
            } catch (IOException unused2) {
                e3.k.a(fileInputStream);
                bArrA = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                e3.k.a(fileInputStream2);
                throw th;
            }
            while (true) {
                byte[] bArr = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    int i9 = fileInputStream.read(bArr, i8, iMin - i8);
                    if (i9 == -1) {
                        break;
                    }
                    i8 += i9;
                }
                rz3 rz3VarL = i8 == 0 ? null : rz3.L(bArr, 0, i8);
                if (rz3VarL == null) {
                    break;
                }
                arrayList.add(rz3VarL);
                iMin = Math.min(iMin + iMin, 8192);
                this.f16616e = bArrA;
            }
            bArrA = rz3.K(arrayList).a();
            e3.k.a(fileInputStream);
            this.f16616e = bArrA;
        }
        byte[] bArr2 = this.f16616e;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }
}
