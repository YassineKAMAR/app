package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l5.a;
import m5.c;
import s5.m;
import s5.n;
import s5.p;
import s5.q;

/* JADX INFO: loaded from: classes.dex */
class c implements l5.b, m5.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a f22756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.b f22757c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.android.d<Activity> f22759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0124c f22760f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Service f22763i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f22765k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContentProvider f22767m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends l5.a>, l5.a> f22755a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends l5.a>, m5.a> f22758d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22761g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends l5.a>, p5.a> f22762h = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<Class<? extends l5.a>, n5.a> f22764j = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<Class<? extends l5.a>, o5.a> f22766l = new HashMap();

    private static class b implements a.InterfaceC0144a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j5.d f22768a;

        private b(j5.d dVar) {
            this.f22768a = dVar;
        }

        @Override // l5.a.InterfaceC0144a
        public String a(String str) {
            return this.f22768a.i(str);
        }
    }

    /* JADX INFO: renamed from: io.flutter.embedding.engine.c$c, reason: collision with other inner class name */
    private static class C0124c implements m5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f22769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HiddenLifecycleReference f22770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<p> f22771c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<m> f22772d = new HashSet();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set<n> f22773e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set<q> f22774f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Object> f22775g = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Set<c.a> f22776h = new HashSet();

        public C0124c(Activity activity, androidx.lifecycle.d dVar) {
            this.f22769a = activity;
            this.f22770b = new HiddenLifecycleReference(dVar);
        }

        @Override // m5.c
        public void a(m mVar) {
            this.f22772d.add(mVar);
        }

        boolean b(int i8, int i9, Intent intent) {
            boolean z7;
            Iterator it = new HashSet(this.f22772d).iterator();
            while (true) {
                while (it.hasNext()) {
                    z7 = ((m) it.next()).b(i8, i9, intent) || z7;
                }
                return z7;
            }
        }

        void c(Intent intent) {
            Iterator<n> it = this.f22773e.iterator();
            while (it.hasNext()) {
                it.next().f(intent);
            }
        }

        boolean d(int i8, String[] strArr, int[] iArr) {
            boolean z7;
            Iterator<p> it = this.f22771c.iterator();
            while (true) {
                while (it.hasNext()) {
                    z7 = it.next().onRequestPermissionsResult(i8, strArr, iArr) || z7;
                }
                return z7;
            }
        }

        void e(Bundle bundle) {
            Iterator<c.a> it = this.f22776h.iterator();
            while (it.hasNext()) {
                it.next().c(bundle);
            }
        }

        void f(Bundle bundle) {
            Iterator<c.a> it = this.f22776h.iterator();
            while (it.hasNext()) {
                it.next().d(bundle);
            }
        }

        @Override // m5.c
        public Activity g() {
            return this.f22769a;
        }

        void h() {
            Iterator<q> it = this.f22774f.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
    }

    c(Context context, io.flutter.embedding.engine.a aVar, j5.d dVar, d dVar2) {
        this.f22756b = aVar;
        this.f22757c = new a.b(context, aVar, aVar.j(), aVar.r(), aVar.p().W(), new b(dVar), dVar2);
    }

    private void k(Activity activity, androidx.lifecycle.d dVar) {
        this.f22760f = new C0124c(activity, dVar);
        this.f22756b.p().s0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f22756b.p().C(activity, this.f22756b.r(), this.f22756b.j());
        for (m5.a aVar : this.f22758d.values()) {
            if (this.f22761g) {
                aVar.onReattachedToActivityForConfigChanges(this.f22760f);
            } else {
                aVar.onAttachedToActivity(this.f22760f);
            }
        }
        this.f22761g = false;
    }

    private void m() {
        this.f22756b.p().O();
        this.f22759e = null;
        this.f22760f = null;
    }

    private void n() {
        if (s()) {
            i();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    private boolean s() {
        return this.f22759e != null;
    }

    private boolean t() {
        return this.f22765k != null;
    }

    private boolean u() {
        return this.f22767m != null;
    }

    private boolean v() {
        return this.f22763i != null;
    }

    @Override // l5.b
    public l5.a a(Class<? extends l5.a> cls) {
        return this.f22755a.get(cls);
    }

    @Override // m5.b
    public boolean b(int i8, int i9, Intent intent) {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        b6.e.a("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            return this.f22760f.b(i8, i9, intent);
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void c(Bundle bundle) {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f22760f.e(bundle);
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void d(Bundle bundle) {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f22760f.f(bundle);
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void e() {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f22760f.h();
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void f(Intent intent) {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f22760f.c(intent);
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void g(io.flutter.embedding.android.d<Activity> dVar, androidx.lifecycle.d dVar2) {
        b6.e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.d<Activity> dVar3 = this.f22759e;
            if (dVar3 != null) {
                dVar3.d();
            }
            n();
            this.f22759e = dVar;
            k(dVar.e(), dVar2);
        } finally {
            b6.e.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l5.b
    public void h(l5.a aVar) {
        b6.e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (r(aVar.getClass())) {
                g5.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f22756b + ").");
                return;
            }
            g5.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f22755a.put((Class<? extends l5.a>) aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f22757c);
            if (aVar instanceof m5.a) {
                m5.a aVar2 = (m5.a) aVar;
                this.f22758d.put((Class<? extends l5.a>) aVar.getClass(), aVar2);
                if (s()) {
                    aVar2.onAttachedToActivity(this.f22760f);
                }
            }
            if (aVar instanceof p5.a) {
                p5.a aVar3 = (p5.a) aVar;
                this.f22762h.put((Class<? extends l5.a>) aVar.getClass(), aVar3);
                if (v()) {
                    aVar3.b(null);
                }
            }
            if (aVar instanceof n5.a) {
                n5.a aVar4 = (n5.a) aVar;
                this.f22764j.put((Class<? extends l5.a>) aVar.getClass(), aVar4);
                if (t()) {
                    aVar4.a(null);
                }
            }
            if (aVar instanceof o5.a) {
                o5.a aVar5 = (o5.a) aVar;
                this.f22766l.put((Class<? extends l5.a>) aVar.getClass(), aVar5);
                if (u()) {
                    aVar5.b(null);
                }
            }
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void i() {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator<m5.a> it = this.f22758d.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            m();
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public void j() {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f22761g = true;
            Iterator<m5.a> it = this.f22758d.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivityForConfigChanges();
            }
            m();
        } finally {
            b6.e.d();
        }
    }

    public void l() {
        g5.b.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public void o() {
        if (!t()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator<n5.a> it = this.f22764j.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        } finally {
            b6.e.d();
        }
    }

    @Override // m5.b
    public boolean onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (!s()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        b6.e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            return this.f22760f.d(i8, strArr, iArr);
        } finally {
            b6.e.d();
        }
    }

    public void p() {
        if (!u()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator<o5.a> it = this.f22766l.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } finally {
            b6.e.d();
        }
    }

    public void q() {
        if (!v()) {
            g5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator<p5.a> it = this.f22762h.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f22763i = null;
        } finally {
            b6.e.d();
        }
    }

    public boolean r(Class<? extends l5.a> cls) {
        return this.f22755a.containsKey(cls);
    }

    public void w(Class<? extends l5.a> cls) {
        l5.a aVar = this.f22755a.get(cls);
        if (aVar == null) {
            return;
        }
        b6.e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof m5.a) {
                if (s()) {
                    ((m5.a) aVar).onDetachedFromActivity();
                }
                this.f22758d.remove(cls);
            }
            if (aVar instanceof p5.a) {
                if (v()) {
                    ((p5.a) aVar).a();
                }
                this.f22762h.remove(cls);
            }
            if (aVar instanceof n5.a) {
                if (t()) {
                    ((n5.a) aVar).b();
                }
                this.f22764j.remove(cls);
            }
            if (aVar instanceof o5.a) {
                if (u()) {
                    ((o5.a) aVar).a();
                }
                this.f22766l.remove(cls);
            }
            aVar.onDetachedFromEngine(this.f22757c);
            this.f22755a.remove(cls);
        } finally {
            b6.e.d();
        }
    }

    public void x(Set<Class<? extends l5.a>> set) {
        Iterator<Class<? extends l5.a>> it = set.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f22755a.keySet()));
        this.f22755a.clear();
    }
}
