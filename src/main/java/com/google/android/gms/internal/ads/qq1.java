package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class qq1 implements nn1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f13718c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f13719d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ll1 f13720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ll1 f13721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ll1 f13722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ll1 f13723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private pp1 f13725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ByteBuffer f13726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ShortBuffer f13727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f13728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f13729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f13730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f13731p;

    public qq1() {
        ll1 ll1Var = ll1.f10770e;
        this.f13720e = ll1Var;
        this.f13721f = ll1Var;
        this.f13722g = ll1Var;
        this.f13723h = ll1Var;
        ByteBuffer byteBuffer = nn1.f11925a;
        this.f13726k = byteBuffer;
        this.f13727l = byteBuffer.asShortBuffer();
        this.f13728m = byteBuffer;
        this.f13717b = -1;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final ll1 a(ll1 ll1Var) throws mm1 {
        if (ll1Var.f10773c != 2) {
            throw new mm1("Unhandled input format:", ll1Var);
        }
        int i8 = this.f13717b;
        if (i8 == -1) {
            i8 = ll1Var.f10771a;
        }
        this.f13720e = ll1Var;
        ll1 ll1Var2 = new ll1(i8, ll1Var.f10772b, 2);
        this.f13721f = ll1Var2;
        this.f13724i = true;
        return ll1Var2;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            pp1 pp1Var = this.f13725j;
            pp1Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f13729n += (long) iRemaining;
            pp1Var.f(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    public final long c(long j8) {
        long j9 = this.f13730o;
        if (j9 < 1024) {
            return (long) (((double) this.f13718c) * j8);
        }
        long j10 = this.f13729n;
        pp1 pp1Var = this.f13725j;
        pp1Var.getClass();
        long jB = j10 - ((long) pp1Var.b());
        int i8 = this.f13723h.f10771a;
        int i9 = this.f13722g.f10771a;
        return i8 == i9 ? nz2.D(j8, jB, j9) : nz2.D(j8, jB * ((long) i8), j9 * ((long) i9));
    }

    public final void d(float f8) {
        if (this.f13719d != f8) {
            this.f13719d = f8;
            this.f13724i = true;
        }
    }

    public final void e(float f8) {
        if (this.f13718c != f8) {
            this.f13718c = f8;
            this.f13724i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final ByteBuffer k() {
        int iA;
        pp1 pp1Var = this.f13725j;
        if (pp1Var != null && (iA = pp1Var.a()) > 0) {
            if (this.f13726k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.f13726k = byteBufferOrder;
                this.f13727l = byteBufferOrder.asShortBuffer();
            } else {
                this.f13726k.clear();
                this.f13727l.clear();
            }
            pp1Var.d(this.f13727l);
            this.f13730o += (long) iA;
            this.f13726k.limit(iA);
            this.f13728m = this.f13726k;
        }
        ByteBuffer byteBuffer = this.f13728m;
        this.f13728m = nn1.f11925a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void l() {
        if (q()) {
            ll1 ll1Var = this.f13720e;
            this.f13722g = ll1Var;
            ll1 ll1Var2 = this.f13721f;
            this.f13723h = ll1Var2;
            if (this.f13724i) {
                this.f13725j = new pp1(ll1Var.f10771a, ll1Var.f10772b, this.f13718c, this.f13719d, ll1Var2.f10771a);
            } else {
                pp1 pp1Var = this.f13725j;
                if (pp1Var != null) {
                    pp1Var.c();
                }
            }
        }
        this.f13728m = nn1.f11925a;
        this.f13729n = 0L;
        this.f13730o = 0L;
        this.f13731p = false;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void n() {
        this.f13718c = 1.0f;
        this.f13719d = 1.0f;
        ll1 ll1Var = ll1.f10770e;
        this.f13720e = ll1Var;
        this.f13721f = ll1Var;
        this.f13722g = ll1Var;
        this.f13723h = ll1Var;
        ByteBuffer byteBuffer = nn1.f11925a;
        this.f13726k = byteBuffer;
        this.f13727l = byteBuffer.asShortBuffer();
        this.f13728m = byteBuffer;
        this.f13717b = -1;
        this.f13724i = false;
        this.f13725j = null;
        this.f13729n = 0L;
        this.f13730o = 0L;
        this.f13731p = false;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean o() {
        pp1 pp1Var;
        return this.f13731p && ((pp1Var = this.f13725j) == null || pp1Var.a() == 0);
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void p() {
        pp1 pp1Var = this.f13725j;
        if (pp1Var != null) {
            pp1Var.e();
        }
        this.f13731p = true;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final boolean q() {
        if (this.f13721f.f10771a != -1) {
            return Math.abs(this.f13718c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f13719d + (-1.0f)) >= 1.0E-4f || this.f13721f.f10771a != this.f13720e.f10771a;
        }
        return false;
    }
}
