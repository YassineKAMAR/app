package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import c4.l;
import io.flutter.plugins.firebase.core.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l5.a;

/* JADX INFO: loaded from: classes.dex */
public class i implements l5.a, p.b, p.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, String> f23053c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23055b = false;

    private s3.h<p.f> o(final c4.e eVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f23050a.r(eVar, iVar);
            }
        });
        return iVar.a();
    }

    private p.e p(c4.l lVar) {
        p.e.a aVar = new p.e.a();
        aVar.b(lVar.b());
        aVar.c(lVar.c());
        if (lVar.f() != null) {
            aVar.e(lVar.f());
        }
        if (lVar.g() != null) {
            aVar.f(lVar.g());
        }
        aVar.d(lVar.d());
        aVar.g(lVar.h());
        aVar.h(lVar.e());
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(String str, s3.i iVar) {
        try {
            try {
                c4.e.o(str).i();
            } catch (IllegalStateException unused) {
            }
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(c4.e eVar, s3.i iVar) {
        try {
            p.f.a aVar = new p.f.a();
            aVar.c(eVar.p());
            aVar.d(p(eVar.q()));
            aVar.b(Boolean.valueOf(eVar.w()));
            aVar.e((Map) s3.k.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(eVar)));
            iVar.c(aVar.a());
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(p.e eVar, String str, s3.i iVar) {
        try {
            c4.l lVarA = new l.b().b(eVar.b()).c(eVar.c()).d(eVar.e()).f(eVar.f()).g(eVar.g()).h(eVar.h()).e(eVar.i()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (eVar.d() != null) {
                f23053c.put(str, eVar.d());
            }
            iVar.c((p.f) s3.k.a(o(c4.e.v(this.f23054a, lVarA, str))));
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(s3.i iVar) {
        try {
            if (this.f23055b) {
                s3.k.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f23055b = true;
            }
            List<c4.e> listM = c4.e.m(this.f23054a);
            ArrayList arrayList = new ArrayList(listM.size());
            Iterator<c4.e> it = listM.iterator();
            while (it.hasNext()) {
                arrayList.add((p.f) s3.k.a(o(it.next())));
            }
            iVar.c(arrayList);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(p.g gVar, s3.h hVar) {
        if (hVar.m()) {
            gVar.a(hVar.j());
        } else {
            gVar.b(hVar.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(s3.i iVar) {
        try {
            c4.l lVarA = c4.l.a(this.f23054a);
            if (lVarA == null) {
                iVar.c(null);
            } else {
                iVar.c(p(lVarA));
            }
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(String str, Boolean bool, s3.i iVar) {
        try {
            c4.e.o(str).E(bool);
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(String str, Boolean bool, s3.i iVar) {
        try {
            c4.e.o(str).D(bool.booleanValue());
            iVar.c(null);
        } catch (Exception e8) {
            iVar.b(e8);
        }
    }

    private <T> void y(s3.i<T> iVar, final p.g<T> gVar) {
        iVar.a().c(new s3.d() { // from class: io.flutter.plugins.firebase.core.g
            @Override // s3.d
            public final void a(s3.h hVar) {
                i.u(gVar, hVar);
            }
        });
    }

    @Override // io.flutter.plugins.firebase.core.p.b
    public void a(final String str, final p.e eVar, p.g<p.f> gVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f23039a.s(eVar, str, iVar);
            }
        });
        y(iVar, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.p.b
    public void b(p.g<List<p.f>> gVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f23037a.t(iVar);
            }
        });
        y(iVar, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.p.b
    public void c(p.g<p.e> gVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f23035a.v(iVar);
            }
        });
        y(iVar, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.p.a
    public void d(final String str, final Boolean bool, p.g<Void> gVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.f
            @Override // java.lang.Runnable
            public final void run() {
                i.x(str, bool, iVar);
            }
        });
        y(iVar, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.p.a
    public void e(final String str, p.g<Void> gVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.a
            @Override // java.lang.Runnable
            public final void run() {
                i.q(str, iVar);
            }
        });
        y(iVar, gVar);
    }

    @Override // io.flutter.plugins.firebase.core.p.a
    public void f(final String str, final Boolean bool, p.g<Void> gVar) {
        final s3.i iVar = new s3.i();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.e
            @Override // java.lang.Runnable
            public final void run() {
                i.w(str, bool, iVar);
            }
        });
        y(iVar, gVar);
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        t.e(bVar.b(), this);
        o.e(bVar.b(), this);
        this.f23054a = bVar.a();
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f23054a = null;
        t.e(bVar.b(), null);
        o.e(bVar.b(), null);
    }
}
