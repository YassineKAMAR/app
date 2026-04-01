package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class r74 extends p74 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f13969k;

    protected r74(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.f12784c) {
            e();
        }
        return this.f13969k;
    }

    protected final long g(ByteBuffer byteBuffer) {
        this.f13969k = gd.c(byteBuffer.get());
        gd.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
