package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.e;
import androidx.core.app.m;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.u;
import androidx.lifecycle.z;
import java.util.concurrent.atomic.AtomicInteger;
import p0.d;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends m implements a0, d, androidx.activity.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private z f299f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f301h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c.a f296c = new c.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f297d = new j(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p0.c f298e = p0.c.a(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final OnBackPressedDispatcher f300g = new OnBackPressedDispatcher(new a());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f302i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ActivityResultRegistry f303j = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e8) {
                if (!TextUtils.equals(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e8;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f310b;

            a(int i8, IntentSender.SendIntentException sendIntentException) {
                this.f309a = i8;
                this.f310b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f309a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f310b));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void e(int i8, d.a<I, O> aVar, I i9, e eVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            aVar.b(componentActivity, i9);
            Intent intentA = aVar.a(componentActivity, i9);
            Bundle bundleExtra = null;
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle = bundleExtra;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.t(componentActivity, stringArrayExtra, i8);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                androidx.core.app.b.u(componentActivity, intentA, i8, bundle);
                return;
            }
            androidx.activity.result.d dVar = (androidx.activity.result.d) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                androidx.core.app.b.v(componentActivity, dVar.e(), i8, dVar.b(), dVar.c(), dVar.d(), 0, bundle);
            } catch (IntentSender.SendIntentException e8) {
                new Handler(Looper.getMainLooper()).post(new a(i8, e8));
            }
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        z f313b;

        c() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i8 = Build.VERSION.SDK_INT;
        a().a(new g() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.g
            public void a(i iVar, d.a aVar) {
                if (aVar == d.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        a().a(new g() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.g
            public void a(i iVar, d.a aVar) {
                if (aVar == d.a.ON_DESTROY) {
                    ComponentActivity.this.f296c.a();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.e().a();
                }
            }
        });
        a().a(new g() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.g
            public void a(i iVar, d.a aVar) {
                ComponentActivity.this.k();
                ComponentActivity.this.a().c(this);
            }
        });
        if (i8 <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
    }

    private void l() {
        b0.a(getWindow().getDecorView(), this);
        c0.a(getWindow().getDecorView(), this);
        p0.e.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.core.app.m, androidx.lifecycle.i
    public androidx.lifecycle.d a() {
        return this.f297d;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        l();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.a0
    public z e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        k();
        return this.f299f;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher h() {
        return this.f300g;
    }

    void k() {
        if (this.f299f == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f299f = cVar.f313b;
            }
            if (this.f299f == null) {
                this.f299f = new z();
            }
        }
    }

    @Deprecated
    public Object m() {
        return null;
    }

    public final <I, O> androidx.activity.result.c<I> n(d.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return o(aVar, this.f303j, bVar);
    }

    public final <I, O> androidx.activity.result.c<I> o(d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.h("activity_rq#" + this.f302i.getAndIncrement(), this, aVar, bVar);
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i8, int i9, Intent intent) {
        if (this.f303j.b(i8, i9, intent)) {
            return;
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f300g.c();
    }

    @Override // androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f298e.d(bundle);
        this.f296c.b(this);
        super.onCreate(bundle);
        this.f303j.f(bundle);
        u.e(this);
        int i8 = this.f301h;
        if (i8 != 0) {
            setContentView(i8);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (this.f303j.b(i8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objM = m();
        z zVar = this.f299f;
        if (zVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            zVar = cVar.f313b;
        }
        if (zVar == null && objM == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f312a = objM;
        cVar2.f313b = zVar;
        return cVar2;
    }

    @Override // androidx.core.app.m, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d dVarA = a();
        if (dVarA instanceof j) {
            ((j) dVarA).n(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f298e.e(bundle);
        this.f303j.g(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (t0.b.h()) {
                t0.b.c("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            t0.b.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i8) {
        l();
        super.setContentView(i8);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        l();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        l();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8) {
        super.startActivityForResult(intent, i8);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        super.startActivityForResult(intent, i8, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11) {
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i8, intent, i9, i10, i11, bundle);
    }

    @Override // p0.d
    public final androidx.savedstate.a u() {
        return this.f298e.b();
    }
}
