package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b6.h;
import h5.a;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import r5.i;
import r5.j;
import r5.m;
import r5.n;
import r5.o;
import r5.p;
import r5.q;

/* JADX INFO: loaded from: classes.dex */
public class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f22732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FlutterRenderer f22733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h5.a f22734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f22735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t5.b f22736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r5.a f22737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r5.b f22738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r5.f f22739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r5.g f22740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r5.h f22741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final i f22742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final m f22743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final j f22744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f22745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o f22746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f22747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final q f22748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final w f22749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Set<b> f22750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final b f22751t;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    class C0123a implements b {
        C0123a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            g5.b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f22750s.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f22749r.m0();
            a.this.f22743l.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, j5.d dVar, FlutterJNI flutterJNI, w wVar, String[] strArr, boolean z7, boolean z8) {
        this(context, dVar, flutterJNI, wVar, strArr, z7, z8, null);
    }

    public a(Context context, j5.d dVar, FlutterJNI flutterJNI, w wVar, String[] strArr, boolean z7, boolean z8, d dVar2) {
        AssetManager assets;
        this.f22750s = new HashSet();
        this.f22751t = new C0123a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        g5.a aVarE = g5.a.e();
        flutterJNI = flutterJNI == null ? aVarE.d().a() : flutterJNI;
        this.f22732a = flutterJNI;
        h5.a aVar = new h5.a(flutterJNI, assets);
        this.f22734c = aVar;
        aVar.m();
        i5.a aVarA = g5.a.e().a();
        this.f22737f = new r5.a(aVar, flutterJNI);
        r5.b bVar = new r5.b(aVar);
        this.f22738g = bVar;
        this.f22739h = new r5.f(aVar);
        r5.g gVar = new r5.g(aVar);
        this.f22740i = gVar;
        this.f22741j = new r5.h(aVar);
        this.f22742k = new i(aVar);
        this.f22744m = new j(aVar);
        this.f22743l = new m(aVar, z8);
        this.f22745n = new n(aVar);
        this.f22746o = new o(aVar);
        this.f22747p = new p(aVar);
        this.f22748q = new q(aVar);
        if (aVarA != null) {
            aVarA.a(bVar);
        }
        t5.b bVar2 = new t5.b(context, gVar);
        this.f22736e = bVar2;
        dVar = dVar == null ? aVarE.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.m(context.getApplicationContext());
            dVar.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f22751t);
        flutterJNI.setPlatformViewsController(wVar);
        flutterJNI.setLocalizationPlugin(bVar2);
        flutterJNI.setDeferredComponentManager(aVarE.a());
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f22733b = new FlutterRenderer(flutterJNI);
        this.f22749r = wVar;
        wVar.g0();
        this.f22735d = new c(context.getApplicationContext(), this, dVar, dVar2);
        bVar2.d(context.getResources().getConfiguration());
        if (z7 && dVar.e()) {
            q5.a.a(this);
        }
        h.c(context, this);
    }

    private void f() {
        g5.b.f("FlutterEngine", "Attaching to JNI.");
        this.f22732a.attachToNative();
        if (!x()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean x() {
        return this.f22732a.isAttached();
    }

    @Override // b6.h.a
    public void a(float f8, float f9, float f10) {
        this.f22732a.updateDisplayMetrics(0, f8, f9, f10);
    }

    public void e(b bVar) {
        this.f22750s.add(bVar);
    }

    public void g() {
        g5.b.f("FlutterEngine", "Destroying.");
        Iterator<b> it = this.f22750s.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f22735d.l();
        this.f22749r.i0();
        this.f22734c.n();
        this.f22732a.removeEngineLifecycleListener(this.f22751t);
        this.f22732a.setDeferredComponentManager(null);
        this.f22732a.detachFromNativeAndReleaseResources();
        if (g5.a.e().a() != null) {
            g5.a.e().a().destroy();
            this.f22738g.c(null);
        }
    }

    public r5.a h() {
        return this.f22737f;
    }

    public m5.b i() {
        return this.f22735d;
    }

    public h5.a j() {
        return this.f22734c;
    }

    public r5.f k() {
        return this.f22739h;
    }

    public t5.b l() {
        return this.f22736e;
    }

    public r5.h m() {
        return this.f22741j;
    }

    public i n() {
        return this.f22742k;
    }

    public j o() {
        return this.f22744m;
    }

    public w p() {
        return this.f22749r;
    }

    public l5.b q() {
        return this.f22735d;
    }

    public FlutterRenderer r() {
        return this.f22733b;
    }

    public m s() {
        return this.f22743l;
    }

    public n t() {
        return this.f22745n;
    }

    public o u() {
        return this.f22746o;
    }

    public p v() {
        return this.f22747p;
    }

    public q w() {
        return this.f22748q;
    }

    a y(Context context, a.b bVar, String str, List<String> list, w wVar, boolean z7, boolean z8) {
        if (x()) {
            return new a(context, null, this.f22732a.spawn(bVar.f22401c, bVar.f22400b, str, list), wVar, null, z7, z8);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
}
