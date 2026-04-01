package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ih3 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f9196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f9197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f9198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9200i;

    public ih3(Context context) {
        super(false);
        this.f9196e = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws hg3 {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f9199h;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new hg3(e8, 2000);
            }
        }
        InputStream inputStream = this.f9198g;
        int i10 = nz2.f12300a;
        int i11 = inputStream.read(bArr, i8, i9);
        if (i11 == -1) {
            return -1;
        }
        long j9 = this.f9199h;
        if (j9 != -1) {
            this.f9199h = j9 - ((long) i11);
        }
        F(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws hg3 {
        try {
            Uri uri = ut3Var.f15867a;
            this.f9197f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            d(ut3Var);
            InputStream inputStreamOpen = this.f9196e.open(path, 1);
            this.f9198g = inputStreamOpen;
            if (inputStreamOpen.skip(ut3Var.f15872f) < ut3Var.f15872f) {
                throw new hg3(null, 2008);
            }
            long j8 = ut3Var.f15873g;
            if (j8 != -1) {
                this.f9199h = j8;
            } else {
                long jAvailable = this.f9198g.available();
                this.f9199h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f9199h = -1L;
                }
            }
            this.f9200i = true;
            e(ut3Var);
            return this.f9199h;
        } catch (hg3 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new hg3(e9, true != (e9 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f9197f;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f9197f = null;
        try {
            try {
                InputStream inputStream = this.f9198g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9198g = null;
                if (this.f9200i) {
                    this.f9200i = false;
                    c();
                }
            } catch (IOException e8) {
                throw new hg3(e8, 2000);
            }
        } catch (Throwable th) {
            this.f9198g = null;
            if (this.f9200i) {
                this.f9200i = false;
                c();
            }
            throw th;
        }
    }
}
