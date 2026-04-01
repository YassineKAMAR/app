package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements s0.a<i> {
    @Override // s0.a
    public List<Class<? extends s0.a<?>>> a() {
        return f6.o.d();
    }

    @Override // s0.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i b(Context context) {
        kotlin.jvm.internal.q.f(context, "context");
        androidx.startup.a aVarD = androidx.startup.a.d(context);
        kotlin.jvm.internal.q.e(aVarD, "getInstance(context)");
        if (!aVarD.e(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        f.a(context);
        t.b bVar = t.f2676i;
        bVar.b(context);
        return bVar.a();
    }
}
