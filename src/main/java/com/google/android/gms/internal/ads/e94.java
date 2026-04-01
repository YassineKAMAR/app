package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e94 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f7202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f7203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f7204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f7205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputStream f7206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f7207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7208k;

    public e94(Context context) {
        super(false);
        this.f7202e = context.getResources();
        this.f7203f = context.getPackageName();
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws d94 {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f7207j;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new d94(null, e8, 2000);
            }
        }
        InputStream inputStream = this.f7206i;
        int i10 = nz2.f12300a;
        int i11 = inputStream.read(bArr, i8, i9);
        if (i11 == -1) {
            if (this.f7207j == -1) {
                return -1;
            }
            throw new d94("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j9 = this.f7207j;
        if (j9 != -1) {
            this.f7207j = j9 - ((long) i11);
        }
        F(i11);
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.po3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(com.google.android.gms.internal.ads.ut3 r18) throws com.google.android.gms.internal.ads.d94 {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e94.b(com.google.android.gms.internal.ads.ut3):long");
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f7204g;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f7204g = null;
        try {
            try {
                InputStream inputStream = this.f7206i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f7206i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7205h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e8) {
                        throw new d94(null, e8, 2000);
                    }
                } finally {
                    this.f7205h = null;
                    if (this.f7208k) {
                        this.f7208k = false;
                        c();
                    }
                }
            } catch (Throwable th) {
                this.f7206i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f7205h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f7205h = null;
                        if (this.f7208k) {
                            this.f7208k = false;
                            c();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.f7205h = null;
                        if (this.f7208k) {
                            this.f7208k = false;
                            c();
                        }
                        throw th2;
                    }
                } catch (IOException e9) {
                    throw new d94(null, e9, 2000);
                }
            }
        } catch (IOException e10) {
            throw new d94(null, e10, 2000);
        }
    }
}
