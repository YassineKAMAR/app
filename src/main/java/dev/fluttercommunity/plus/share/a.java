package dev.fluttercommunity.plus.share;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import s5.k;
import s5.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0101a f21083d = new C0101a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k.d f21085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f21086c;

    /* JADX INFO: renamed from: dev.fluttercommunity.plus.share.a$a, reason: collision with other inner class name */
    public static final class C0101a {
        private C0101a() {
        }

        public /* synthetic */ C0101a(j jVar) {
            this();
        }
    }

    public a(Context context) {
        q.f(context, "context");
        this.f21084a = context;
        this.f21086c = new AtomicBoolean(true);
    }

    private final void a(String str) {
        k.d dVar;
        if (!this.f21086c.compareAndSet(false, true) || (dVar = this.f21085b) == null) {
            return;
        }
        q.c(dVar);
        dVar.a(str);
        this.f21085b = null;
    }

    @Override // s5.m
    public boolean b(int i8, int i9, Intent intent) {
        if (i8 != 22643) {
            return false;
        }
        a(SharePlusPendingIntent.f21081a.a());
        return true;
    }

    public final boolean c(k.d callback) {
        q.f(callback, "callback");
        if (!this.f21086c.compareAndSet(true, false)) {
            callback.b("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        SharePlusPendingIntent.f21081a.b("");
        this.f21086c.set(false);
        this.f21085b = callback;
        return true;
    }

    public final void d() {
        a("dev.fluttercommunity.plus/share/unavailable");
    }
}
