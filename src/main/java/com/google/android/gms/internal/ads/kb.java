package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10007a;

    public kb(Handler handler) {
        this.f10007a = new ib(this, handler);
    }

    public final void a(ub ubVar, dc dcVar) {
        ubVar.s("post-error");
        ((ib) this.f10007a).f9123a.post(new jb(ubVar, ac.a(dcVar), null));
    }

    public final void b(ub ubVar, ac acVar, Runnable runnable) {
        ubVar.w();
        ubVar.s("post-response");
        ((ib) this.f10007a).f9123a.post(new jb(ubVar, acVar, runnable));
    }
}
