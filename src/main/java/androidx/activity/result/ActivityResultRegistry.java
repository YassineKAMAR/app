package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.e;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f329a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f330b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f331c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, c> f332d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<String> f333e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Map<String, b<?>> f334f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Map<String, Object> f335g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Bundle f336h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends androidx.activity.result.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d.a f343c;

        a(String str, int i8, d.a aVar) {
            this.f341a = str;
            this.f342b = i8;
            this.f343c = aVar;
        }

        @Override // androidx.activity.result.c
        public void b(I i8, e eVar) {
            ActivityResultRegistry.this.f333e.add(this.f341a);
            ActivityResultRegistry.this.e(this.f342b, this.f343c, i8, eVar);
        }
    }

    private static class b<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b<O> f345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d.a<?, O> f346b;

        b(androidx.activity.result.b<O> bVar, d.a<?, O> aVar) {
            this.f345a = bVar;
            this.f346b = aVar;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.d f347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<g> f348b = new ArrayList<>();

        c(androidx.lifecycle.d dVar) {
            this.f347a = dVar;
        }

        void a(g gVar) {
            this.f347a.a(gVar);
            this.f348b.add(gVar);
        }

        void b() {
            Iterator<g> it = this.f348b.iterator();
            while (it.hasNext()) {
                this.f347a.c(it.next());
            }
            this.f348b.clear();
        }
    }

    private void a(int i8, String str) {
        this.f330b.put(Integer.valueOf(i8), str);
        this.f331c.put(str, Integer.valueOf(i8));
    }

    private <O> void c(String str, int i8, Intent intent, b<O> bVar) {
        androidx.activity.result.b<O> bVar2;
        if (bVar != null && (bVar2 = bVar.f345a) != null) {
            bVar2.a(bVar.f346b.c(i8, intent));
        } else {
            this.f335g.remove(str);
            this.f336h.putParcelable(str, new androidx.activity.result.a(i8, intent));
        }
    }

    private int d() {
        int iNextInt = this.f329a.nextInt(2147418112);
        while (true) {
            int i8 = iNextInt + 65536;
            if (!this.f330b.containsKey(Integer.valueOf(i8))) {
                return i8;
            }
            iNextInt = this.f329a.nextInt(2147418112);
        }
    }

    private int i(String str) {
        Integer num = this.f331c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iD = d();
        a(iD, str);
        return iD;
    }

    public final boolean b(int i8, int i9, Intent intent) {
        String str = this.f330b.get(Integer.valueOf(i8));
        if (str == null) {
            return false;
        }
        this.f333e.remove(str);
        c(str, i9, intent, this.f334f.get(str));
        return true;
    }

    public abstract <I, O> void e(int i8, d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i9, e eVar);

    public final void f(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        int size = stringArrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            a(integerArrayList.get(i8).intValue(), stringArrayList.get(i8));
        }
        this.f333e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f329a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f336h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
    }

    public final void g(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f330b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f330b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f333e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f336h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f329a);
    }

    public final <I, O> androidx.activity.result.c<I> h(final String str, i iVar, final d.a<I, O> aVar, final androidx.activity.result.b<O> bVar) {
        androidx.lifecycle.d dVarA = iVar.a();
        if (dVarA.b().c(d.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + iVar + " is attempting to register while current state is " + dVarA.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int i8 = i(str);
        c cVar = this.f332d.get(str);
        if (cVar == null) {
            cVar = new c(dVarA);
        }
        cVar.a(new g() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.g
            public void a(i iVar2, d.a aVar2) {
                if (!d.a.ON_START.equals(aVar2)) {
                    if (d.a.ON_STOP.equals(aVar2)) {
                        ActivityResultRegistry.this.f334f.remove(str);
                        return;
                    } else {
                        if (d.a.ON_DESTROY.equals(aVar2)) {
                            ActivityResultRegistry.this.j(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f334f.put(str, new b<>(bVar, aVar));
                if (ActivityResultRegistry.this.f335g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f335g.get(str);
                    ActivityResultRegistry.this.f335g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) ActivityResultRegistry.this.f336h.getParcelable(str);
                if (aVar3 != null) {
                    ActivityResultRegistry.this.f336h.remove(str);
                    bVar.a(aVar.c(aVar3.c(), aVar3.b()));
                }
            }
        });
        this.f332d.put(str, cVar);
        return new a(str, i8, aVar);
    }

    final void j(String str) {
        Integer numRemove;
        if (!this.f333e.contains(str) && (numRemove = this.f331c.remove(str)) != null) {
            this.f330b.remove(numRemove);
        }
        this.f334f.remove(str);
        if (this.f335g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f335g.get(str));
            this.f335g.remove(str);
        }
        if (this.f336h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f336h.getParcelable(str));
            this.f336h.remove(str);
        }
        c cVar = this.f332d.get(str);
        if (cVar != null) {
            cVar.b();
            this.f332d.remove(str);
        }
    }
}
