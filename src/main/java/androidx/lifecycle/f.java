package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2657a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f2658b = new AtomicBoolean(false);

    public static final class a extends b {
        @Override // androidx.lifecycle.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.q.f(activity, "activity");
            u.f2688b.c(activity);
        }
    }

    private f() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.q.f(context, "context");
        if (f2658b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.q.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
