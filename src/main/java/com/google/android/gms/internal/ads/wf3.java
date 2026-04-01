package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
final class wf3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Future f16718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final vf3 f16719b;

    wf3(Future future, vf3 vf3Var) {
        this.f16718a = future;
        this.f16719b = vf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Object obj = this.f16718a;
        if ((obj instanceof dh3) && (thA = eh3.a((dh3) obj)) != null) {
            this.f16719b.a(thA);
            return;
        }
        try {
            this.f16719b.b(zf3.p(this.f16718a));
        } catch (Error e8) {
            e = e8;
            this.f16719b.a(e);
        } catch (RuntimeException e9) {
            e = e9;
            this.f16719b.a(e);
        } catch (ExecutionException e10) {
            this.f16719b.a(e10.getCause());
        }
    }

    public final String toString() {
        e83 e83VarA = f83.a(this);
        e83VarA.a(this.f16719b);
        return e83VarA.toString();
    }
}
