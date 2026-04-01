package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jb3 f10137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10138b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f10139c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ll1 f10140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ll1 f10141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10142f;

    public kk1(jb3 jb3Var) {
        this.f10137a = jb3Var;
        ll1 ll1Var = ll1.f10770e;
        this.f10140d = ll1Var;
        this.f10141e = ll1Var;
        this.f10142f = false;
    }

    private final int i() {
        return this.f10139c.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z7;
        do {
            int i8 = 0;
            z7 = false;
            while (i8 <= i()) {
                int i9 = i8 + 1;
                if (!this.f10139c[i8].hasRemaining()) {
                    nn1 nn1Var = (nn1) this.f10138b.get(i8);
                    if (!nn1Var.o()) {
                        ByteBuffer byteBuffer2 = i8 > 0 ? this.f10139c[i8 - 1] : byteBuffer.hasRemaining() ? byteBuffer : nn1.f11925a;
                        long jRemaining = byteBuffer2.remaining();
                        nn1Var.b(byteBuffer2);
                        this.f10139c[i8] = nn1Var.k();
                        boolean z8 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.f10139c[i8].hasRemaining()) {
                            z8 = false;
                        }
                        z7 |= z8;
                    } else if (!this.f10139c[i8].hasRemaining() && i8 < i()) {
                        ((nn1) this.f10138b.get(i9)).p();
                    }
                }
                i8 = i9;
            }
        } while (z7);
    }

    public final ll1 a(ll1 ll1Var) throws mm1 {
        if (ll1Var.equals(ll1.f10770e)) {
            throw new mm1("Unhandled input format:", ll1Var);
        }
        for (int i8 = 0; i8 < this.f10137a.size(); i8++) {
            nn1 nn1Var = (nn1) this.f10137a.get(i8);
            ll1 ll1VarA = nn1Var.a(ll1Var);
            if (nn1Var.q()) {
                uu1.f(!ll1VarA.equals(ll1.f10770e));
                ll1Var = ll1VarA;
            }
        }
        this.f10141e = ll1Var;
        return ll1Var;
    }

    public final ByteBuffer b() {
        if (!h()) {
            return nn1.f11925a;
        }
        ByteBuffer byteBuffer = this.f10139c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(nn1.f11925a);
        return this.f10139c[i()];
    }

    public final void c() {
        this.f10138b.clear();
        this.f10140d = this.f10141e;
        this.f10142f = false;
        for (int i8 = 0; i8 < this.f10137a.size(); i8++) {
            nn1 nn1Var = (nn1) this.f10137a.get(i8);
            nn1Var.l();
            if (nn1Var.q()) {
                this.f10138b.add(nn1Var);
            }
        }
        this.f10139c = new ByteBuffer[this.f10138b.size()];
        for (int i9 = 0; i9 <= i(); i9++) {
            this.f10139c[i9] = ((nn1) this.f10138b.get(i9)).k();
        }
    }

    public final void d() {
        if (!h() || this.f10142f) {
            return;
        }
        this.f10142f = true;
        ((nn1) this.f10138b.get(0)).p();
    }

    public final void e(ByteBuffer byteBuffer) {
        if (!h() || this.f10142f) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        if (this.f10137a.size() != kk1Var.f10137a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f10137a.size(); i8++) {
            if (this.f10137a.get(i8) != kk1Var.f10137a.get(i8)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i8 = 0; i8 < this.f10137a.size(); i8++) {
            nn1 nn1Var = (nn1) this.f10137a.get(i8);
            nn1Var.l();
            nn1Var.n();
        }
        this.f10139c = new ByteBuffer[0];
        ll1 ll1Var = ll1.f10770e;
        this.f10140d = ll1Var;
        this.f10141e = ll1Var;
        this.f10142f = false;
    }

    public final boolean g() {
        return this.f10142f && ((nn1) this.f10138b.get(i())).o() && !this.f10139c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.f10138b.isEmpty();
    }

    public final int hashCode() {
        return this.f10137a.hashCode();
    }
}
