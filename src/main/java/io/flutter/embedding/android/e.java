package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.d;
import io.flutter.embedding.android.f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends Activity implements f.c, androidx.lifecycle.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22616e = b6.h.e(61938);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22617a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected f f22618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.j f22619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final OnBackInvokedCallback f22620d;

    class a implements OnBackInvokedCallback {
        a() {
        }

        @Override // android.window.OnBackInvokedCallback
        public void onBackInvoked() {
            e.this.onBackPressed();
        }
    }

    public e() {
        this.f22620d = Build.VERSION.SDK_INT >= 33 ? new a() : null;
        this.f22619c = new androidx.lifecycle.j(this);
    }

    private void F() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void G() {
        if (I() == g.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View H() {
        return this.f22618b.s(null, null, null, f22616e, D() == d0.surface);
    }

    private boolean L() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean O(String str) {
        StringBuilder sb;
        String str2;
        f fVar = this.f22618b;
        if (fVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else {
            if (fVar.m()) {
                return true;
            }
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        g5.b.g("FlutterActivity", sb.toString());
        return false;
    }

    private void P() {
        try {
            Bundle bundleK = K();
            if (bundleK != null) {
                int i8 = bundleK.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i8 != -1) {
                    setTheme(i8);
                }
            } else {
                g5.b.f("FlutterActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            g5.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void A(l lVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public String B() {
        String dataString;
        if (L() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.g C() {
        return io.flutter.embedding.engine.g.a(getIntent());
    }

    @Override // io.flutter.embedding.android.f.c
    public d0 D() {
        return I() == g.opaque ? d0.surface : d0.texture;
    }

    @Override // io.flutter.embedding.android.f.c
    public e0 E() {
        return I() == g.opaque ? e0.opaque : e0.transparent;
    }

    protected g I() {
        return getIntent().hasExtra("background_mode") ? g.valueOf(getIntent().getStringExtra("background_mode")) : g.opaque;
    }

    protected io.flutter.embedding.engine.a J() {
        return this.f22618b.l();
    }

    protected Bundle K() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void M() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f22620d);
            this.f22617a = true;
        }
    }

    public void N() {
        Q();
        f fVar = this.f22618b;
        if (fVar != null) {
            fVar.H();
            this.f22618b = null;
        }
    }

    public void Q() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f22620d);
            this.f22617a = false;
        }
    }

    @Override // io.flutter.embedding.android.f.c, androidx.lifecycle.i
    public androidx.lifecycle.d a() {
        return this.f22619c;
    }

    @Override // io.flutter.plugin.platform.h.d
    public boolean b() {
        return false;
    }

    @Override // io.flutter.embedding.android.f.c
    public void c() {
    }

    @Override // io.flutter.embedding.android.f.c
    public void d() {
        g5.b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + J() + " evicted by another attaching activity");
        f fVar = this.f22618b;
        if (fVar != null) {
            fVar.t();
            this.f22618b.u();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.h.d
    public void f(boolean z7) {
        if (z7 && !this.f22617a) {
            M();
        } else {
            if (z7 || !this.f22617a) {
                return;
            }
            Q();
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public Activity g() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public Context getContext() {
        return this;
    }

    @Override // io.flutter.embedding.android.f.c
    public List<String> i() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // io.flutter.embedding.android.f.c
    public String j() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean k() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : j() == null;
    }

    @Override // io.flutter.embedding.android.f.c
    public String l() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleK = K();
            String string = bundleK != null ? bundleK.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.plugin.platform.h m(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.h(g(), aVar.o(), this);
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean n() {
        try {
            Bundle bundleK = K();
            if (bundleK != null) {
                return bundleK.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean o() {
        return true;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        if (O("onActivityResult")) {
            this.f22618b.p(i8, i9, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (O("onBackPressed")) {
            this.f22618b.r();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        P();
        super.onCreate(bundle);
        f fVar = new f(this);
        this.f22618b = fVar;
        fVar.q(this);
        this.f22618b.z(bundle);
        this.f22619c.h(d.a.ON_CREATE);
        G();
        setContentView(H());
        F();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (O("onDestroy")) {
            this.f22618b.t();
            this.f22618b.u();
        }
        N();
        this.f22619c.h(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (O("onNewIntent")) {
            this.f22618b.v(intent);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        if (O("onPause")) {
            this.f22618b.w();
        }
        this.f22619c.h(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (O("onPostResume")) {
            this.f22618b.x();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (O("onRequestPermissionsResult")) {
            this.f22618b.y(i8, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f22619c.h(d.a.ON_RESUME);
        if (O("onResume")) {
            this.f22618b.A();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (O("onSaveInstanceState")) {
            this.f22618b.B(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f22619c.h(d.a.ON_START);
        if (O("onStart")) {
            this.f22618b.C();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        if (O("onStop")) {
            this.f22618b.D();
        }
        this.f22619c.h(d.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i8) {
        super.onTrimMemory(i8);
        if (O("onTrimMemory")) {
            this.f22618b.E(i8);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (O("onUserLeaveHint")) {
            this.f22618b.F();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (O("onWindowFocusChanged")) {
            this.f22618b.G(z7);
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public io.flutter.embedding.engine.a p(Context context) {
        return null;
    }

    @Override // io.flutter.embedding.android.f.c
    public void q(m mVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public void r(io.flutter.embedding.engine.a aVar) {
        if (this.f22618b.n()) {
            return;
        }
        q5.a.a(aVar);
    }

    @Override // io.flutter.embedding.android.f.c
    public String s() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // io.flutter.embedding.android.f.c
    public String t() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleK = K();
            if (bundleK != null) {
                return bundleK.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean v() {
        return true;
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean w() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (j() != null || this.f22618b.n()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // io.flutter.embedding.android.f.c
    public boolean x() {
        return true;
    }

    @Override // io.flutter.embedding.android.f.c
    public void y(io.flutter.embedding.engine.a aVar) {
    }

    @Override // io.flutter.embedding.android.f.c
    public String z() {
        try {
            Bundle bundleK = K();
            if (bundleK != null) {
                return bundleK.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
