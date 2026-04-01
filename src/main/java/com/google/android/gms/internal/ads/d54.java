package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class d54 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f6583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f6584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f6585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6586h;

    public d54() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws c44 {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f6585g;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6583e;
            int i10 = nz2.f12300a;
            int i11 = randomAccessFile.read(bArr, i8, (int) Math.min(j8, i9));
            if (i11 > 0) {
                this.f6585g -= (long) i11;
                F(i11);
            }
            return i11;
        } catch (IOException e8) {
            throw new c44(e8, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws c44 {
        Uri uri = ut3Var.f15867a;
        this.f6584f = uri;
        d(ut3Var);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6583e = randomAccessFile;
            try {
                randomAccessFile.seek(ut3Var.f15872f);
                long length = ut3Var.f15873g;
                if (length == -1) {
                    length = this.f6583e.length() - ut3Var.f15872f;
                }
                this.f6585g = length;
                if (length < 0) {
                    throw new c44(null, null, 2008);
                }
                this.f6586h = true;
                e(ut3Var);
                return this.f6585g;
            } catch (IOException e8) {
                throw new c44(e8, 2000);
            }
        } catch (FileNotFoundException e9) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new c44(e9, (nz2.f12300a < 21 || !b34.b(e9.getCause())) ? 2005 : 2006);
            }
            throw new c44(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e9, 1004);
        } catch (SecurityException e10) {
            throw new c44(e10, 2006);
        } catch (RuntimeException e11) {
            throw new c44(e11, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f6584f;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f6584f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6583e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f6583e = null;
                if (this.f6586h) {
                    this.f6586h = false;
                    c();
                }
            } catch (IOException e8) {
                throw new c44(e8, 2000);
            }
        } catch (Throwable th) {
            this.f6583e = null;
            if (this.f6586h) {
                this.f6586h = false;
                c();
            }
            throw th;
        }
    }
}
