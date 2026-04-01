package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class fm extends vl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageDigest f7810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7812e;

    public fm(int i8) {
        int i9 = i8 >> 3;
        this.f7811d = (i8 & 7) > 0 ? i9 + 1 : i9;
        this.f7812e = i8;
    }

    @Override // com.google.android.gms.internal.ads.vl
    public final byte[] b(String str) {
        synchronized (this.f16336a) {
            MessageDigest messageDigestA = a();
            this.f7810c = messageDigestA;
            if (messageDigestA == null) {
                return new byte[0];
            }
            messageDigestA.reset();
            this.f7810c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.f7810c.digest();
            int length = bArrDigest.length;
            int i8 = this.f7811d;
            if (length > i8) {
                length = i8;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.f7812e & 7) > 0) {
                long j8 = 0;
                for (int i9 = 0; i9 < length; i9++) {
                    if (i9 > 0) {
                        j8 <<= 8;
                    }
                    j8 += (long) (bArr[i9] & 255);
                }
                long j9 = j8 >>> (8 - (this.f7812e & 7));
                int i10 = this.f7811d;
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        break;
                    }
                    bArr[i10] = (byte) (255 & j9);
                    j9 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
