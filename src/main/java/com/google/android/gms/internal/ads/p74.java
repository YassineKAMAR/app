package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class p74 implements hd {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a84 f12781j = a84.b(p74.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f12782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private id f12783b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f12786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f12787f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    u74 f12789h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f12788g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ByteBuffer f12790i = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f12785d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f12784c = true;

    protected p74(String str) {
        this.f12782a = str;
    }

    private final synchronized void b() {
        if (this.f12785d) {
            return;
        }
        try {
            a84 a84Var = f12781j;
            String str = this.f12782a;
            a84Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.f12786e = this.f12789h.e(this.f12787f, this.f12788g);
            this.f12785d = true;
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void a(u74 u74Var, ByteBuffer byteBuffer, long j8, ed edVar) {
        this.f12787f = u74Var.k();
        byteBuffer.remaining();
        this.f12788g = j8;
        this.f12789h = u74Var;
        u74Var.b(u74Var.k() + j8);
        this.f12785d = false;
        this.f12784c = false;
        e();
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void c(id idVar) {
        this.f12783b = idVar;
    }

    protected abstract void d(ByteBuffer byteBuffer);

    public final synchronized void e() {
        b();
        a84 a84Var = f12781j;
        String str = this.f12782a;
        a84Var.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.f12786e;
        if (byteBuffer != null) {
            this.f12784c = true;
            byteBuffer.rewind();
            d(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f12790i = byteBuffer.slice();
            }
            this.f12786e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final String j() {
        return this.f12782a;
    }
}
