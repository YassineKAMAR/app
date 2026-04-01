package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ld extends p74 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ByteBuffer f10616k;

    public ld(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.p74
    public final void d(ByteBuffer byteBuffer) {
        this.f10616k = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
