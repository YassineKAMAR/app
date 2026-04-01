package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class kd extends r74 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Date f10019l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Date f10020m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f10021n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f10022o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f10023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f10024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b84 f10025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f10026s;

    public kd() {
        super("mvhd");
        this.f10023p = 1.0d;
        this.f10024q = 1.0f;
        this.f10025r = b84.f5644j;
    }

    @Override // com.google.android.gms.internal.ads.p74
    public final void d(ByteBuffer byteBuffer) {
        long jE;
        g(byteBuffer);
        if (f() == 1) {
            this.f10019l = w74.a(gd.f(byteBuffer));
            this.f10020m = w74.a(gd.f(byteBuffer));
            this.f10021n = gd.e(byteBuffer);
            jE = gd.f(byteBuffer);
        } else {
            this.f10019l = w74.a(gd.e(byteBuffer));
            this.f10020m = w74.a(gd.e(byteBuffer));
            this.f10021n = gd.e(byteBuffer);
            jE = gd.e(byteBuffer);
        }
        this.f10022o = jE;
        this.f10023p = gd.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f10024q = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        gd.d(byteBuffer);
        gd.e(byteBuffer);
        gd.e(byteBuffer);
        this.f10025r = new b84(gd.b(byteBuffer), gd.b(byteBuffer), gd.b(byteBuffer), gd.b(byteBuffer), gd.a(byteBuffer), gd.a(byteBuffer), gd.a(byteBuffer), gd.b(byteBuffer), gd.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f10026s = gd.e(byteBuffer);
    }

    public final long h() {
        return this.f10022o;
    }

    public final long i() {
        return this.f10021n;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f10019l + ";modificationTime=" + this.f10020m + ";timescale=" + this.f10021n + ";duration=" + this.f10022o + ";rate=" + this.f10023p + ";volume=" + this.f10024q + ";matrix=" + this.f10025r + ";nextTrackId=" + this.f10026s + "]";
    }
}
