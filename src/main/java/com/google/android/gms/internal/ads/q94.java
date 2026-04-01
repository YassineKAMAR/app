package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class q94 extends j94 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nb f13360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n94 f13361c = new n94();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f13362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f13365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13366h;

    static {
        c60.b("media3.decoder");
    }

    public q94(int i8, int i9) {
        this.f13366h = i8;
    }

    private final ByteBuffer l(int i8) {
        int i9 = this.f13366h;
        if (i9 == 1) {
            return ByteBuffer.allocate(i8);
        }
        if (i9 == 2) {
            return ByteBuffer.allocateDirect(i8);
        }
        ByteBuffer byteBuffer = this.f13362d;
        throw new p94(byteBuffer == null ? 0 : byteBuffer.capacity(), i8);
    }

    @Override // com.google.android.gms.internal.ads.j94
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f13362d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f13365g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13363e = false;
    }

    public final void i(int i8) {
        ByteBuffer byteBuffer = this.f13362d;
        if (byteBuffer == null) {
            this.f13362d = l(i8);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i9 = i8 + iPosition;
        if (iCapacity >= i9) {
            this.f13362d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferL = l(i9);
        byteBufferL.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferL.put(byteBuffer);
        }
        this.f13362d = byteBufferL;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f13362d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f13365g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }
}
