package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class ml3 extends ji3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f11378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f11379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f11380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f11381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f11382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11383j;

    public ml3(Context context) {
        super(false);
        this.f11378e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws lk3 {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.f11382i;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new lk3(e8, 2000);
            }
        }
        FileInputStream fileInputStream = this.f11381h;
        int i10 = nz2.f12300a;
        int i11 = fileInputStream.read(bArr, i8, i9);
        if (i11 == -1) {
            return -1;
        }
        long j9 = this.f11382i;
        if (j9 != -1) {
            this.f11382i = j9 - ((long) i11);
        }
        F(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws lk3 {
        int i8;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uriNormalizeScheme = ut3Var.f15867a.normalizeScheme();
                this.f11379f = uriNormalizeScheme;
                d(ut3Var);
                if ("content".equals(uriNormalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.f11378e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.f11378e.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f11380g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i8 = 2000;
                    try {
                        throw new lk3(new IOException("Could not open file descriptor for: " + String.valueOf(uriNormalizeScheme)), 2000);
                    } catch (IOException e8) {
                        e = e8;
                        if (true == (e instanceof FileNotFoundException)) {
                            i8 = 2005;
                        }
                        throw new lk3(e, i8);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f11381h = fileInputStream;
                if (length != -1 && ut3Var.f15872f > length) {
                    throw new lk3(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(ut3Var.f15872f + startOffset) - startOffset;
                if (jSkip != ut3Var.f15872f) {
                    throw new lk3(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f11382i = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.f11382i = jPosition;
                        if (jPosition < 0) {
                            throw new lk3(null, 2008);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.f11382i = jPosition;
                    if (jPosition < 0) {
                        throw new lk3(null, 2008);
                    }
                }
                long jMin = ut3Var.f15873g;
                if (jMin != -1) {
                    if (jPosition != -1) {
                        jMin = Math.min(jPosition, jMin);
                    }
                    this.f11382i = jMin;
                }
                this.f11383j = true;
                e(ut3Var);
                long j8 = ut3Var.f15873g;
                return j8 != -1 ? j8 : this.f11382i;
            } catch (IOException e9) {
                e = e9;
                i8 = 2000;
            }
        } catch (lk3 e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f11379f;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f11379f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f11381h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f11381h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f11380g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e8) {
                        throw new lk3(e8, 2000);
                    }
                } finally {
                    this.f11380g = null;
                    if (this.f11383j) {
                        this.f11383j = false;
                        c();
                    }
                }
            } catch (Throwable th) {
                this.f11381h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f11380g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f11380g = null;
                        if (this.f11383j) {
                            this.f11383j = false;
                            c();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.f11380g = null;
                        if (this.f11383j) {
                            this.f11383j = false;
                            c();
                        }
                        throw th2;
                    }
                } catch (IOException e9) {
                    throw new lk3(e9, 2000);
                }
            }
        } catch (IOException e10) {
            throw new lk3(e10, 2000);
        }
    }
}
