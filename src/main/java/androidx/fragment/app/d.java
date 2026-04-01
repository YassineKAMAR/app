package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.b;
import androidx.lifecycle.a0;
import androidx.lifecycle.d;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class d extends ComponentActivity implements b.d, b.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f2421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f2422n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f2424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f2425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f2426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f2427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    p.i<String> f2428t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final f f2419k = f.b(new a());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final androidx.lifecycle.j f2420l = new androidx.lifecycle.j(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f2423o = true;

    class a extends h<d> implements a0, androidx.activity.c {
        public a() {
            super(d.this);
        }

        @Override // androidx.lifecycle.i
        public androidx.lifecycle.d a() {
            return d.this.f2420l;
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public View c(int i8) {
            return d.this.findViewById(i8);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.e
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.a0
        public z e() {
            return d.this.e();
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher h() {
            return d.this.h();
        }

        @Override // androidx.fragment.app.h
        public void j(Fragment fragment) {
            d.this.w(fragment);
        }

        @Override // androidx.fragment.app.h
        public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater m() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int n() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean o() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public boolean p(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public void q(Fragment fragment, Intent intent, int i8, Bundle bundle) {
            d.this.z(fragment, intent, i8, bundle);
        }

        @Override // androidx.fragment.app.h
        public void r() {
            d.this.A();
        }

        @Override // androidx.fragment.app.h
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public d l() {
            return d.this;
        }
    }

    private int p(Fragment fragment) {
        if (this.f2428t.r() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f2428t.n(this.f2427s) >= 0) {
            this.f2427s = (this.f2427s + 1) % 65534;
        }
        int i8 = this.f2427s;
        this.f2428t.p(i8, fragment.f2340e);
        this.f2427s = (this.f2427s + 1) % 65534;
        return i8;
    }

    static void q(int i8) {
        if ((i8 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void t() {
        while (v(s(), d.b.CREATED)) {
        }
    }

    private static boolean v(i iVar, d.b bVar) {
        boolean zV = false;
        for (Fragment fragment : iVar.e()) {
            if (fragment != null) {
                if (fragment.a().b().c(d.b.STARTED)) {
                    fragment.f2343f0.n(bVar);
                    zV = true;
                }
                if (fragment.x() != null) {
                    zV |= v(fragment.p(), bVar);
                }
            }
        }
        return zV;
    }

    @Deprecated
    public void A() {
        invalidateOptionsMenu();
    }

    @Override // androidx.core.app.b.f
    public final void b(int i8) {
        if (this.f2424p || i8 == -1) {
            return;
        }
        q(i8);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2421m);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2422n);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2423o);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2419k.u().b(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        this.f2419k.v();
        int i10 = i8 >> 16;
        if (i10 == 0) {
            b.e eVarQ = androidx.core.app.b.q();
            if (eVarQ == null || !eVarQ.a(this, i8, i9, intent)) {
                super.onActivityResult(i8, i9, intent);
                return;
            }
            return;
        }
        int i11 = i10 - 1;
        String strK = this.f2428t.k(i11);
        this.f2428t.q(i11);
        if (strK == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentT = this.f2419k.t(strK);
        if (fragmentT != null) {
            fragmentT.W(i8 & 65535, i9, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strK);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2419k.v();
        this.f2419k.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f2419k.a(null);
        if (bundle != null) {
            this.f2419k.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2427s = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2428t = new p.i<>(intArray.length);
                    for (int i8 = 0; i8 < intArray.length; i8++) {
                        this.f2428t.p(intArray[i8], stringArray[i8]);
                    }
                }
            }
        }
        if (this.f2428t == null) {
            this.f2428t = new p.i<>();
            this.f2427s = 0;
        }
        super.onCreate(bundle);
        this.f2420l.h(d.a.ON_CREATE);
        this.f2419k.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i8, Menu menu) {
        return i8 == 0 ? super.onCreatePanelMenu(i8, menu) | this.f2419k.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i8, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewR = r(view, str, context, attributeSet);
        return viewR == null ? super.onCreateView(view, str, context, attributeSet) : viewR;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewR = r(null, str, context, attributeSet);
        return viewR == null ? super.onCreateView(str, context, attributeSet) : viewR;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f2419k.h();
        this.f2420l.h(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2419k.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 == 0) {
            return this.f2419k.k(menuItem);
        }
        if (i8 != 6) {
            return false;
        }
        return this.f2419k.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7) {
        this.f2419k.j(z7);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2419k.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        if (i8 == 0) {
            this.f2419k.l(menu);
        }
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f2422n = false;
        this.f2419k.m();
        this.f2420l.h(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7) {
        this.f2419k.n(z7);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        y();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i8, View view, Menu menu) {
        return i8 == 0 ? x(view, menu) | this.f2419k.o(menu) : super.onPreparePanel(i8, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.f2419k.v();
        int i9 = (i8 >> 16) & 65535;
        if (i9 != 0) {
            int i10 = i9 - 1;
            String strK = this.f2428t.k(i10);
            this.f2428t.q(i10);
            if (strK == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentT = this.f2419k.t(strK);
            if (fragmentT != null) {
                fragmentT.v0(i8 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strK);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f2422n = true;
        this.f2419k.v();
        this.f2419k.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.m, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        t();
        this.f2420l.h(d.a.ON_STOP);
        Parcelable parcelableY = this.f2419k.y();
        if (parcelableY != null) {
            bundle.putParcelable("android:support:fragments", parcelableY);
        }
        if (this.f2428t.r() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2427s);
            int[] iArr = new int[this.f2428t.r()];
            String[] strArr = new String[this.f2428t.r()];
            for (int i8 = 0; i8 < this.f2428t.r(); i8++) {
                iArr[i8] = this.f2428t.o(i8);
                strArr[i8] = this.f2428t.s(i8);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f2423o = false;
        if (!this.f2421m) {
            this.f2421m = true;
            this.f2419k.c();
        }
        this.f2419k.v();
        this.f2419k.s();
        this.f2420l.h(d.a.ON_START);
        this.f2419k.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2419k.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f2423o = true;
        t();
        this.f2419k.r();
        this.f2420l.h(d.a.ON_STOP);
    }

    final View r(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2419k.w(view, str, context, attributeSet);
    }

    public i s() {
        return this.f2419k.u();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8) {
        if (!this.f2426r && i8 != -1) {
            q(i8);
        }
        super.startActivityForResult(intent, i8);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        if (!this.f2426r && i8 != -1) {
            q(i8);
        }
        super.startActivityForResult(intent, i8, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11) {
        if (!this.f2425q && i8 != -1) {
            q(i8);
        }
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        if (!this.f2425q && i8 != -1) {
            q(i8);
        }
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }

    public void w(Fragment fragment) {
    }

    @Deprecated
    protected boolean x(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void y() {
        this.f2420l.h(d.a.ON_RESUME);
        this.f2419k.p();
    }

    public void z(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        this.f2426r = true;
        try {
            if (i8 == -1) {
                androidx.core.app.b.u(this, intent, -1, bundle);
            } else {
                q(i8);
                androidx.core.app.b.u(this, intent, ((p(fragment) + 1) << 16) + (i8 & 65535), bundle);
            }
        } finally {
            this.f2426r = false;
        }
    }
}
