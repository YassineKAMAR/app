package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import h5.a;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class f implements d<Activity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f22625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private io.flutter.embedding.engine.a f22626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    s f22627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.flutter.plugin.platform.h f22628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f22629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f22634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.flutter.embedding.engine.d f22635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f22636l;

    class a implements io.flutter.embedding.engine.renderer.a {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
            f.this.f22625a.c();
            f.this.f22631g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void e() {
            f.this.f22625a.e();
            f.this.f22631g = true;
            f.this.f22632h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f22638a;

        b(s sVar) {
            this.f22638a = sVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (f.this.f22631g && f.this.f22629e != null) {
                this.f22638a.getViewTreeObserver().removeOnPreDrawListener(this);
                f.this.f22629e = null;
            }
            return f.this.f22631g;
        }
    }

    interface c extends h.d {
        void A(l lVar);

        String B();

        io.flutter.embedding.engine.g C();

        d0 D();

        e0 E();

        androidx.lifecycle.d a();

        void c();

        void d();

        void e();

        Activity g();

        Context getContext();

        List<String> i();

        String j();

        boolean k();

        String l();

        io.flutter.plugin.platform.h m(Activity activity, io.flutter.embedding.engine.a aVar);

        boolean n();

        boolean o();

        io.flutter.embedding.engine.a p(Context context);

        void q(m mVar);

        void r(io.flutter.embedding.engine.a aVar);

        String s();

        String t();

        boolean v();

        boolean w();

        boolean x();

        void y(io.flutter.embedding.engine.a aVar);

        String z();
    }

    f(c cVar) {
        this(cVar, null);
    }

    f(c cVar, io.flutter.embedding.engine.d dVar) {
        this.f22636l = new a();
        this.f22625a = cVar;
        this.f22632h = false;
        this.f22635k = dVar;
    }

    private d.b g(d.b bVar) {
        String strB = this.f22625a.B();
        if (strB == null || strB.isEmpty()) {
            strB = g5.a.e().c().g();
        }
        a.b bVar2 = new a.b(strB, this.f22625a.l());
        String strT = this.f22625a.t();
        if (strT == null && (strT = o(this.f22625a.g().getIntent())) == null) {
            strT = "/";
        }
        return bVar.i(bVar2).k(strT).j(this.f22625a.i());
    }

    private void h(s sVar) {
        if (this.f22625a.D() != d0.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f22629e != null) {
            sVar.getViewTreeObserver().removeOnPreDrawListener(this.f22629e);
        }
        this.f22629e = new b(sVar);
        sVar.getViewTreeObserver().addOnPreDrawListener(this.f22629e);
    }

    private void i() {
        String str;
        if (this.f22625a.j() == null && !this.f22626b.j().k()) {
            String strT = this.f22625a.t();
            if (strT == null && (strT = o(this.f22625a.g().getIntent())) == null) {
                strT = "/";
            }
            String strZ = this.f22625a.z();
            if (("Executing Dart entrypoint: " + this.f22625a.l() + ", library uri: " + strZ) == null) {
                str = "\"\"";
            } else {
                str = strZ + ", and sending initial route: " + strT;
            }
            g5.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f22626b.n().c(strT);
            String strB = this.f22625a.B();
            if (strB == null || strB.isEmpty()) {
                strB = g5.a.e().c().g();
            }
            this.f22626b.j().j(strZ == null ? new a.b(strB, this.f22625a.l()) : new a.b(strB, strZ, this.f22625a.l()), this.f22625a.i());
        }
    }

    private void j() {
        if (this.f22625a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String o(Intent intent) {
        Uri data;
        if (!this.f22625a.n() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    void A() {
        io.flutter.embedding.engine.a aVar;
        g5.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        j();
        if (!this.f22625a.x() || (aVar = this.f22626b) == null) {
            return;
        }
        aVar.k().e();
    }

    void B(Bundle bundle) {
        g5.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        j();
        if (this.f22625a.k()) {
            bundle.putByteArray("framework", this.f22626b.s().h());
        }
        if (this.f22625a.v()) {
            Bundle bundle2 = new Bundle();
            this.f22626b.i().d(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    void C() {
        g5.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        j();
        i();
        Integer num = this.f22634j;
        if (num != null) {
            this.f22627c.setVisibility(num.intValue());
        }
    }

    void D() {
        io.flutter.embedding.engine.a aVar;
        g5.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        j();
        if (this.f22625a.x() && (aVar = this.f22626b) != null) {
            aVar.k().d();
        }
        this.f22634j = Integer.valueOf(this.f22627c.getVisibility());
        this.f22627c.setVisibility(8);
    }

    void E(int i8) {
        j();
        io.flutter.embedding.engine.a aVar = this.f22626b;
        if (aVar != null) {
            if (this.f22632h && i8 >= 10) {
                aVar.j().l();
                this.f22626b.v().a();
            }
            this.f22626b.r().p(i8);
        }
    }

    void F() {
        j();
        if (this.f22626b == null) {
            g5.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            g5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f22626b.i().e();
        }
    }

    void G(boolean z7) {
        io.flutter.embedding.engine.a aVar;
        j();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z7 ? com.amazon.a.a.o.b.ac : com.amazon.a.a.o.b.ad);
        g5.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f22625a.x() || (aVar = this.f22626b) == null) {
            return;
        }
        if (z7) {
            aVar.k().a();
        } else {
            aVar.k().f();
        }
    }

    void H() {
        this.f22625a = null;
        this.f22626b = null;
        this.f22627c = null;
        this.f22628d = null;
    }

    void I() {
        io.flutter.embedding.engine.d dVar;
        d.b bVarL;
        g5.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String strJ = this.f22625a.j();
        if (strJ != null) {
            io.flutter.embedding.engine.a aVarA = io.flutter.embedding.engine.b.b().a(strJ);
            this.f22626b = aVarA;
            this.f22630f = true;
            if (aVarA != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + strJ + "'");
        }
        c cVar = this.f22625a;
        io.flutter.embedding.engine.a aVarP = cVar.p(cVar.getContext());
        this.f22626b = aVarP;
        if (aVarP != null) {
            this.f22630f = true;
            return;
        }
        String strS = this.f22625a.s();
        if (strS != null) {
            dVar = io.flutter.embedding.engine.e.b().a(strS);
            if (dVar == null) {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + strS + "'");
            }
            bVarL = new d.b(this.f22625a.getContext());
        } else {
            g5.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            dVar = this.f22635k;
            if (dVar == null) {
                dVar = new io.flutter.embedding.engine.d(this.f22625a.getContext(), this.f22625a.C().b());
            }
            bVarL = new d.b(this.f22625a.getContext()).h(false).l(this.f22625a.k());
        }
        this.f22626b = dVar.a(g(bVarL));
        this.f22630f = false;
    }

    void J() {
        io.flutter.plugin.platform.h hVar = this.f22628d;
        if (hVar != null) {
            hVar.C();
        }
    }

    @Override // io.flutter.embedding.android.d
    public void d() {
        if (!this.f22625a.w()) {
            this.f22625a.d();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f22625a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    @Override // io.flutter.embedding.android.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Activity e() {
        Activity activityG = this.f22625a.g();
        if (activityG != null) {
            return activityG;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    io.flutter.embedding.engine.a l() {
        return this.f22626b;
    }

    boolean m() {
        return this.f22633i;
    }

    boolean n() {
        return this.f22630f;
    }

    void p(int i8, int i9, Intent intent) {
        j();
        if (this.f22626b == null) {
            g5.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        g5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i8 + "\nresultCode: " + i9 + "\ndata: " + intent);
        this.f22626b.i().b(i8, i9, intent);
    }

    void q(Context context) {
        j();
        if (this.f22626b == null) {
            I();
        }
        if (this.f22625a.v()) {
            g5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f22626b.i().g(this, this.f22625a.a());
        }
        c cVar = this.f22625a;
        this.f22628d = cVar.m(cVar.g(), this.f22626b);
        this.f22625a.r(this.f22626b);
        this.f22633i = true;
    }

    void r() {
        j();
        if (this.f22626b == null) {
            g5.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            g5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f22626b.n().a();
        }
    }

    View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i8, boolean z7) {
        s sVar;
        g5.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        j();
        if (this.f22625a.D() == d0.surface) {
            l lVar = new l(this.f22625a.getContext(), this.f22625a.E() == e0.transparent);
            this.f22625a.A(lVar);
            sVar = new s(this.f22625a.getContext(), lVar);
        } else {
            m mVar = new m(this.f22625a.getContext());
            mVar.setOpaque(this.f22625a.E() == e0.opaque);
            this.f22625a.q(mVar);
            sVar = new s(this.f22625a.getContext(), mVar);
        }
        this.f22627c = sVar;
        this.f22627c.l(this.f22636l);
        if (this.f22625a.o()) {
            g5.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f22627c.n(this.f22626b);
        }
        this.f22627c.setId(i8);
        if (z7) {
            h(this.f22627c);
        }
        return this.f22627c;
    }

    void t() {
        g5.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        j();
        if (this.f22629e != null) {
            this.f22627c.getViewTreeObserver().removeOnPreDrawListener(this.f22629e);
            this.f22629e = null;
        }
        s sVar = this.f22627c;
        if (sVar != null) {
            sVar.s();
            this.f22627c.y(this.f22636l);
        }
    }

    void u() {
        io.flutter.embedding.engine.a aVar;
        g5.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        j();
        this.f22625a.y(this.f22626b);
        if (this.f22625a.v()) {
            g5.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f22625a.g().isChangingConfigurations()) {
                this.f22626b.i().j();
            } else {
                this.f22626b.i().i();
            }
        }
        io.flutter.plugin.platform.h hVar = this.f22628d;
        if (hVar != null) {
            hVar.p();
            this.f22628d = null;
        }
        if (this.f22625a.x() && (aVar = this.f22626b) != null) {
            aVar.k().b();
        }
        if (this.f22625a.w()) {
            this.f22626b.g();
            if (this.f22625a.j() != null) {
                io.flutter.embedding.engine.b.b().d(this.f22625a.j());
            }
            this.f22626b = null;
        }
        this.f22633i = false;
    }

    void v(Intent intent) {
        j();
        if (this.f22626b == null) {
            g5.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        g5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f22626b.i().f(intent);
        String strO = o(intent);
        if (strO == null || strO.isEmpty()) {
            return;
        }
        this.f22626b.n().b(strO);
    }

    void w() {
        io.flutter.embedding.engine.a aVar;
        g5.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        j();
        if (!this.f22625a.x() || (aVar = this.f22626b) == null) {
            return;
        }
        aVar.k().c();
    }

    void x() {
        g5.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        j();
        if (this.f22626b != null) {
            J();
        } else {
            g5.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    void y(int i8, String[] strArr, int[] iArr) {
        j();
        if (this.f22626b == null) {
            g5.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        g5.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i8 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f22626b.i().onRequestPermissionsResult(i8, strArr, iArr);
    }

    void z(Bundle bundle) {
        Bundle bundle2;
        g5.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        j();
        byte[] byteArray = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            byteArray = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f22625a.k()) {
            this.f22626b.s().j(byteArray);
        }
        if (this.f22625a.v()) {
            this.f22626b.i().c(bundle2);
        }
    }
}
