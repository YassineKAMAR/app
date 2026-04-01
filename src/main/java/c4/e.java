package c4;

import a3.n;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import f4.o;
import f4.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f3443k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map<String, e> f3444l = new p.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f3447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f3448d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x<u4.a> f3451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o4.b<n4.f> f3452h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3449e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f3450f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<a> f3453i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<f> f3454j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z7);
    }

    @TargetApi(14)
    private static class b implements a.InterfaceC0074a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f3455a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (e3.m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f3455a.get() == null) {
                    b bVar = new b();
                    if (com.amazon.a.a.l.d.a(f3455a, null, bVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0074a
        public void a(boolean z7) {
            synchronized (e.f3443k) {
                for (e eVar : new ArrayList(e.f3444l.values())) {
                    if (eVar.f3449e.get()) {
                        eVar.B(z7);
                    }
                }
            }
        }
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f3456b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3457a;

        public c(Context context) {
            this.f3457a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f3456b.get() == null) {
                c cVar = new c(context);
                if (com.amazon.a.a.l.d.a(f3456b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f3457a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f3443k) {
                Iterator<e> it = e.f3444l.values().iterator();
                while (it.hasNext()) {
                    it.next().s();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, l lVar) {
        this.f3445a = (Context) a3.o.j(context);
        this.f3446b = a3.o.f(str);
        this.f3447c = (l) a3.o.j(lVar);
        m mVarB = FirebaseInitProvider.b();
        w4.c.b("Firebase");
        w4.c.b("ComponentDiscovery");
        List<o4.b<ComponentRegistrar>> listB = f4.g.c(context, ComponentDiscoveryService.class).b();
        w4.c.a();
        w4.c.b("Runtime");
        o.b bVarG = o.k(g4.m.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(f4.c.s(context, Context.class, new Class[0])).b(f4.c.s(this, e.class, new Class[0])).b(f4.c.s(lVar, l.class, new Class[0])).g(new w4.b());
        if (androidx.core.os.l.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(f4.c.s(mVarB, m.class, new Class[0]));
        }
        o oVarE = bVarG.e();
        this.f3448d = oVarE;
        w4.c.a();
        this.f3451g = new x<>(new o4.b() { // from class: c4.c
            @Override // o4.b
            public final Object get() {
                return this.f3440a.y(context);
            }
        });
        this.f3452h = oVarE.c(n4.f.class);
        g(new a() { // from class: c4.d
            @Override // c4.e.a
            public final void a(boolean z7) {
                this.f3442a.z(z7);
            }
        });
        w4.c.a();
    }

    private static String A(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z7) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f3453i.iterator();
        while (it.hasNext()) {
            it.next().a(z7);
        }
    }

    private void C() {
        Iterator<f> it = this.f3454j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f3446b, this.f3447c);
        }
    }

    private void h() {
        a3.o.n(!this.f3450f.get(), "FirebaseApp was deleted");
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f3443k) {
            Iterator<e> it = f3444l.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<e> m(Context context) {
        ArrayList arrayList;
        synchronized (f3443k) {
            arrayList = new ArrayList(f3444l.values());
        }
        return arrayList;
    }

    public static e n() {
        e eVar;
        synchronized (f3443k) {
            eVar = f3444l.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + e3.o.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            eVar.f3452h.get().k();
        }
        return eVar;
    }

    public static e o(String str) {
        e eVar;
        String str2;
        synchronized (f3443k) {
            eVar = f3444l.get(A(str));
            if (eVar == null) {
                List<String> listK = k();
                if (listK.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", listK);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
            eVar.f3452h.get().k();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (!androidx.core.os.l.a(this.f3445a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            c.b(this.f3445a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f3448d.n(x());
        this.f3452h.get().k();
    }

    public static e t(Context context) {
        synchronized (f3443k) {
            if (f3444l.containsKey("[DEFAULT]")) {
                return n();
            }
            l lVarA = l.a(context);
            if (lVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return u(context, lVarA);
        }
    }

    public static e u(Context context, l lVar) {
        return v(context, lVar, "[DEFAULT]");
    }

    public static e v(Context context, l lVar, String str) {
        e eVar;
        b.c(context);
        String strA = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f3443k) {
            Map<String, e> map = f3444l;
            a3.o.n(!map.containsKey(strA), "FirebaseApp name " + strA + " already exists!");
            a3.o.k(context, "Application context cannot be null.");
            eVar = new e(context, strA, lVar);
            map.put(strA, eVar);
        }
        eVar.s();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u4.a y(Context context) {
        return new u4.a(context, r(), (m4.c) this.f3448d.a(m4.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(boolean z7) {
        if (z7) {
            return;
        }
        this.f3452h.get().k();
    }

    public void D(boolean z7) {
        boolean z8;
        h();
        if (this.f3449e.compareAndSet(!z7, z7)) {
            boolean zD = com.google.android.gms.common.api.internal.a.b().d();
            if (z7 && zD) {
                z8 = true;
            } else if (z7 || !zD) {
                return;
            } else {
                z8 = false;
            }
            B(z8);
        }
    }

    public void E(Boolean bool) {
        h();
        this.f3451g.get().e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f3446b.equals(((e) obj).p());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f3449e.get() && com.google.android.gms.common.api.internal.a.b().d()) {
            aVar.a(true);
        }
        this.f3453i.add(aVar);
    }

    public int hashCode() {
        return this.f3446b.hashCode();
    }

    public void i() {
        if (this.f3450f.compareAndSet(false, true)) {
            synchronized (f3443k) {
                f3444l.remove(this.f3446b);
            }
            C();
        }
    }

    public <T> T j(Class<T> cls) {
        h();
        return (T) this.f3448d.a(cls);
    }

    public Context l() {
        h();
        return this.f3445a;
    }

    public String p() {
        h();
        return this.f3446b;
    }

    public l q() {
        h();
        return this.f3447c;
    }

    public String r() {
        return e3.c.b(p().getBytes(Charset.defaultCharset())) + "+" + e3.c.b(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return n.c(this).a("name", this.f3446b).a("options", this.f3447c).toString();
    }

    public boolean w() {
        h();
        return this.f3451g.get().b();
    }

    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
