package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class oo1 implements nn1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ll1 f12575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ll1 f12576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ll1 f12577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ll1 f12578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f12579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ByteBuffer f12580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12581h;

    public oo1() {
        ByteBuffer byteBuffer = nn1.f11925a;
        this.f12579f = byteBuffer;
        this.f12580g = byteBuffer;
        ll1 ll1Var = ll1.f10770e;
        this.f12577d = ll1Var;
        this.f12578e = ll1Var;
        this.f12575b = ll1Var;
        this.f12576c = ll1Var;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final ll1 a(ll1 ll1Var) {
        this.f12577d = ll1Var;
        this.f12578e = c(ll1Var);
        return q() ? this.f12578e : ll1.f10770e;
    }

    protected abstract ll1 c(ll1 ll1Var);

    protected final ByteBuffer d(int i8) {
        if (this.f12579f.capacity() < i8) {
            this.f12579f = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        } else {
            this.f12579f.clear();
        }
        ByteBuffer byteBuffer = this.f12579f;
        this.f12580g = byteBuffer;
        return byteBuffer;
    }

    protected void e() {
    }

    protected void f() {
    }

    protected void g() {
    }

    protected final boolean h() {
        return this.f12580g.hasRemaining();
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public ByteBuffer k() {
        ByteBuffer byteBuffer = this.f12580g;
        this.f12580g = nn1.f11925a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void l() {
        this.f12580g = nn1.f11925a;
        this.f12581h = false;
        this.f12575b = this.f12577d;
        this.f12576c = this.f12578e;
        e();
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void n() {
        l();
        this.f12579f = nn1.f11925a;
        ll1 ll1Var = ll1.f10770e;
        this.f12577d = ll1Var;
        this.f12578e = ll1Var;
        this.f12575b = ll1Var;
        this.f12576c = ll1Var;
        g();
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public boolean o() {
        return this.f12581h && this.f12580g == nn1.f11925a;
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public final void p() {
        this.f12581h = true;
        f();
    }

    @Override // com.google.android.gms.internal.ads.nn1
    public boolean q() {
        return this.f12578e != ll1.f10770e;
    }
}
