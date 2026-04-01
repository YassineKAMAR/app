package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class q74 extends t74 implements hd {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    id f13325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final String f13326j = "moov";

    public q74(String str) {
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void a(u74 u74Var, ByteBuffer byteBuffer, long j8, ed edVar) {
        u74Var.k();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f14995b = u74Var;
        this.f14997d = u74Var.k();
        u74Var.b(u74Var.k() + j8);
        this.f14998e = u74Var.k();
        this.f14994a = edVar;
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void c(id idVar) {
        this.f13325i = idVar;
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final String j() {
        return this.f13326j;
    }
}
