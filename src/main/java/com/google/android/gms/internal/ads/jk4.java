package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class jk4 extends q94 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f9679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9680k;

    public jk4() {
        super(2, 0);
        this.f9680k = 32;
    }

    @Override // com.google.android.gms.internal.ads.q94, com.google.android.gms.internal.ads.j94
    public final void b() {
        super.b();
        this.f9679j = 0;
    }

    public final int m() {
        return this.f9679j;
    }

    public final long n() {
        return this.f9678i;
    }

    public final void o(int i8) {
        this.f9680k = i8;
    }

    public final boolean p(q94 q94Var) {
        ByteBuffer byteBuffer;
        uu1.d(!q94Var.d(1073741824));
        uu1.d(!q94Var.d(268435456));
        uu1.d(!q94Var.d(4));
        if (q()) {
            if (this.f9679j >= this.f9680k) {
                return false;
            }
            ByteBuffer byteBuffer2 = q94Var.f13362d;
            if (byteBuffer2 != null && (byteBuffer = this.f13362d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i8 = this.f9679j;
        this.f9679j = i8 + 1;
        if (i8 == 0) {
            this.f13364f = q94Var.f13364f;
            if (q94Var.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = q94Var.f13362d;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f13362d.put(byteBuffer3);
        }
        this.f9678i = q94Var.f13364f;
        return true;
    }

    public final boolean q() {
        return this.f9679j > 0;
    }
}
