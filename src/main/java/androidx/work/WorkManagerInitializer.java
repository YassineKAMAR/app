package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import x0.j;
import x0.t;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements s0.a<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3062a = j.f("WrkMgrInitializer");

    @Override // s0.a
    public List<Class<? extends s0.a<?>>> a() {
        return Collections.emptyList();
    }

    @Override // s0.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t b(Context context) {
        j.c().a(f3062a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        t.e(context, new a.b().a());
        return t.d(context);
    }
}
