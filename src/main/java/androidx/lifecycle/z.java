package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, w> f2705a = new LinkedHashMap();

    public final void a() {
        Iterator<w> it = this.f2705a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f2705a.clear();
    }

    public final w b(String key) {
        kotlin.jvm.internal.q.f(key, "key");
        return this.f2705a.get(key);
    }

    public final Set<String> c() {
        return new HashSet(this.f2705a.keySet());
    }

    public final void d(String key, w viewModel) {
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(viewModel, "viewModel");
        w wVarPut = this.f2705a.put(key, viewModel);
        if (wVarPut != null) {
            wVarPut.d();
        }
    }
}
