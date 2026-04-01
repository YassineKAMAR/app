package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import p0.d;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f2921g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f2924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Recreator.b f2926e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m.b<String, c> f2922a = new m.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2927f = true;

    /* JADX INFO: renamed from: androidx.savedstate.a$a, reason: collision with other inner class name */
    public interface InterfaceC0042a {
        void a(d dVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }
    }

    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a this$0, i iVar, d.a event) {
        boolean z7;
        q.f(this$0, "this$0");
        q.f(iVar, "<anonymous parameter 0>");
        q.f(event, "event");
        if (event == d.a.ON_START) {
            z7 = true;
        } else if (event != d.a.ON_STOP) {
            return;
        } else {
            z7 = false;
        }
        this$0.f2927f = z7;
    }

    public final Bundle b(String key) {
        q.f(key, "key");
        if (!this.f2925d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f2924c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f2924c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f2924c;
        boolean z7 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z7 = true;
        }
        if (!z7) {
            this.f2924c = null;
        }
        return bundle2;
    }

    public final void d(androidx.lifecycle.d lifecycle) {
        q.f(lifecycle, "lifecycle");
        if (!(!this.f2923b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new g() { // from class: p0.b
            @Override // androidx.lifecycle.g
            public final void a(i iVar, d.a aVar) {
                androidx.savedstate.a.c(this.f25465a, iVar, aVar);
            }
        });
        this.f2923b = true;
    }

    public final void e(Bundle bundle) {
        if (!this.f2923b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f2925d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f2924c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f2925d = true;
    }

    public final void f(Bundle outBundle) {
        q.f(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2924c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        m.b<String, c>.d dVarG = this.f2922a.g();
        q.e(dVarG, "this.components.iteratorWithAdditions()");
        while (dVarG.hasNext()) {
            Map.Entry next = dVarG.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void g(String key, c provider) {
        q.f(key, "key");
        q.f(provider, "provider");
        if (!(this.f2922a.p(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void h(Class<? extends InterfaceC0042a> clazz) {
        q.f(clazz, "clazz");
        if (!this.f2927f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f2926e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f2926e = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f2926e;
            if (bVar2 != null) {
                String name = clazz.getName();
                q.e(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e8) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
        }
    }
}
