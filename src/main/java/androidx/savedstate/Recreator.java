package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import p0.d;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2918b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f2919a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public static final class b implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f2920a;

        public b(androidx.savedstate.a registry) {
            q.f(registry, "registry");
            this.f2920a = new LinkedHashSet();
            registry.g("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2920a));
            return bundle;
        }

        public final void b(String className) {
            q.f(className, "className");
            this.f2920a.add(className);
        }
    }

    public Recreator(d owner) {
        q.f(owner, "owner");
        this.f2919a = owner;
    }

    private final void b(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0042a.class);
            q.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    q.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((a.InterfaceC0042a) objNewInstance).a(this.f2919a);
                } catch (Exception e8) {
                    throw new RuntimeException("Failed to instantiate " + str, e8);
                }
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Class " + str + " wasn't found", e10);
        }
    }

    @Override // androidx.lifecycle.g
    public void a(i source, d.a event) {
        q.f(source, "source");
        q.f(event, "event");
        if (event != d.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.a().c(this);
        Bundle bundleB = this.f2919a.u().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }
}
