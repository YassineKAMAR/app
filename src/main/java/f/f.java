package f;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.s1;
import androidx.core.content.res.h;
import androidx.core.view.a0;
import androidx.core.view.e;
import androidx.core.view.e0;
import androidx.core.view.f1;
import androidx.core.view.h1;
import androidx.core.view.j1;
import androidx.lifecycle.d;
import j.b;
import j.f;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class f extends f.d implements e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final p.h<String, Integer> f21467n0 = new p.h<>();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final boolean f21468o0 = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int[] f21469p0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final boolean f21470q0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final boolean f21471r0 = true;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private q[] G;
    private q H;
    private boolean I;
    private boolean W;
    private boolean X;
    private boolean Y;
    boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f21472a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f21473b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f21474c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f21475d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f21476d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Context f21477e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private j f21478e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Window f21479f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private j f21480f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f21481g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    boolean f21482g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final f.c f21483h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    int f21484h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    f.a f21485i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Runnable f21486i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    MenuInflater f21487j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f21488j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f21489k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Rect f21490k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l0 f21491l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Rect f21492l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C0103f f21493m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private f.j f21494m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private r f21495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    j.b f21496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ActionBarContextView f21497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    PopupWindow f21498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Runnable f21499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    f1 f21500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f21501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ViewGroup f21503v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f21504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f21505x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f21506y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f21507z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.f21484h0 & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.f21484h0 & 4096) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.f21482g0 = false;
            fVar3.f21484h0 = 0;
        }
    }

    class b implements a0 {
        b() {
        }

        @Override // androidx.core.view.a0
        public j1 a(View view, j1 j1Var) {
            int iK = j1Var.k();
            int iL0 = f.this.L0(j1Var, null);
            if (iK != iL0) {
                j1Var = j1Var.o(j1Var.i(), iL0, j1Var.j(), j1Var.h());
            }
            return e0.z(view, j1Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    class d implements Runnable {

        class a extends h1 {
            a() {
            }

            @Override // androidx.core.view.g1
            public void b(View view) {
                f.this.f21497p.setAlpha(1.0f);
                f.this.f21500s.h(null);
                f.this.f21500s = null;
            }

            @Override // androidx.core.view.h1, androidx.core.view.g1
            public void c(View view) {
                f.this.f21497p.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f21498q.showAtLocation(fVar.f21497p, 55, 0, 0);
            f.this.V();
            if (!f.this.D0()) {
                f.this.f21497p.setAlpha(1.0f);
                f.this.f21497p.setVisibility(0);
            } else {
                f.this.f21497p.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.f21500s = e0.b(fVar2.f21497p).b(1.0f);
                f.this.f21500s.h(new a());
            }
        }
    }

    class e extends h1 {
        e() {
        }

        @Override // androidx.core.view.g1
        public void b(View view) {
            f.this.f21497p.setAlpha(1.0f);
            f.this.f21500s.h(null);
            f.this.f21500s = null;
        }

        @Override // androidx.core.view.h1, androidx.core.view.g1
        public void c(View view) {
            f.this.f21497p.setVisibility(0);
            f.this.f21497p.sendAccessibilityEvent(32);
            if (f.this.f21497p.getParent() instanceof View) {
                e0.E((View) f.this.f21497p.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: f.f$f, reason: collision with other inner class name */
    private final class C0103f implements j.a {
        C0103f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            f.this.L(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackF0 = f.this.f0();
            if (callbackF0 == null) {
                return true;
            }
            callbackF0.onMenuOpened(108, eVar);
            return true;
        }
    }

    class g implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.a f21515a;

        class a extends h1 {
            a() {
            }

            @Override // androidx.core.view.g1
            public void b(View view) {
                f.this.f21497p.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.f21498q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f21497p.getParent() instanceof View) {
                    e0.E((View) f.this.f21497p.getParent());
                }
                f.this.f21497p.removeAllViews();
                f.this.f21500s.h(null);
                f fVar2 = f.this;
                fVar2.f21500s = null;
                e0.E(fVar2.f21503v);
            }
        }

        public g(b.a aVar) {
            this.f21515a = aVar;
        }

        @Override // j.b.a
        public boolean a(j.b bVar, Menu menu) {
            return this.f21515a.a(bVar, menu);
        }

        @Override // j.b.a
        public void b(j.b bVar) {
            this.f21515a.b(bVar);
            f fVar = f.this;
            if (fVar.f21498q != null) {
                fVar.f21479f.getDecorView().removeCallbacks(f.this.f21499r);
            }
            f fVar2 = f.this;
            if (fVar2.f21497p != null) {
                fVar2.V();
                f fVar3 = f.this;
                fVar3.f21500s = e0.b(fVar3.f21497p).b(0.0f);
                f.this.f21500s.h(new a());
            }
            f fVar4 = f.this;
            f.c cVar = fVar4.f21483h;
            if (cVar != null) {
                cVar.g(fVar4.f21496o);
            }
            f fVar5 = f.this;
            fVar5.f21496o = null;
            e0.E(fVar5.f21503v);
        }

        @Override // j.b.a
        public boolean c(j.b bVar, MenuItem menuItem) {
            return this.f21515a.c(bVar, menuItem);
        }

        @Override // j.b.a
        public boolean d(j.b bVar, Menu menu) {
            e0.E(f.this.f21503v);
            return this.f21515a.d(bVar, menu);
        }
    }

    class h extends j.m {
        h(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(f.this.f21477e, callback);
            j.b bVarF0 = f.this.F0(aVar);
            if (bVarF0 != null) {
                return aVar.e(bVarF0);
            }
            return null;
        }

        @Override // j.m, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // j.m, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // j.m, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i8, Menu menu) {
            if (i8 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i8, menu);
            }
            return false;
        }

        @Override // j.m, android.view.Window.Callback
        public boolean onMenuOpened(int i8, Menu menu) {
            super.onMenuOpened(i8, menu);
            f.this.u0(i8);
            return true;
        }

        @Override // j.m, android.view.Window.Callback
        public void onPanelClosed(int i8, Menu menu) {
            super.onPanelClosed(i8, menu);
            f.this.v0(i8);
        }

        @Override // j.m, android.view.Window.Callback
        public boolean onPreparePanel(int i8, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i8 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i8, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // j.m, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i8) {
            androidx.appcompat.view.menu.e eVar;
            q qVarD0 = f.this.d0(0, true);
            if (qVarD0 == null || (eVar = qVarD0.f21536j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i8);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i8);
            }
        }

        @Override // j.m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.m0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // j.m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
            return (f.this.m0() && i8 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i8);
        }
    }

    private class i extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f21519c;

        i(Context context) {
            super();
            this.f21519c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // f.f.j
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // f.f.j
        public int c() {
            return this.f21519c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // f.f.j
        public void d() {
            f.this.F();
        }
    }

    abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f21521a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        j() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f21521a;
            if (broadcastReceiver != null) {
                try {
                    f.this.f21477e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f21521a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f21521a == null) {
                this.f21521a = new a();
            }
            f.this.f21477e.registerReceiver(this.f21521a, intentFilterB);
        }
    }

    private class k extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.m f21524c;

        k(f.m mVar) {
            super();
            this.f21524c = mVar;
        }

        @Override // f.f.j
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // f.f.j
        public int c() {
            return this.f21524c.d() ? 2 : 1;
        }

        @Override // f.f.j
        public void d() {
            f.this.F();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i8 = configuration.densityDpi;
            int i9 = configuration2.densityDpi;
            if (i8 != i9) {
                configuration3.densityDpi = i9;
            }
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i8 = configuration.colorMode & 3;
            int i9 = configuration2.colorMode;
            if (i8 != (i9 & 3)) {
                configuration3.colorMode |= i9 & 3;
            }
            int i10 = configuration.colorMode & 12;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 12)) {
                configuration3.colorMode |= i11 & 12;
            }
        }
    }

    private static class o {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        private boolean b(int i8, int i9) {
            return i8 < -5 || i9 < -5 || i8 > getWidth() + 5 || i9 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.N(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i8) {
            setBackgroundDrawable(g.b.d(getContext(), i8));
        }
    }

    protected static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f21528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f21529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f21530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f21532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f21533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f21534h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f21535i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f21536j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f21537k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f21538l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f21539m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f21540n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f21541o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f21542p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f21543q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f21544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f21545s;

        q(int i8) {
            this.f21527a = i8;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f21536j == null) {
                return null;
            }
            if (this.f21537k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f21538l, e.g.f21195j);
                this.f21537k = cVar;
                cVar.h(aVar);
                this.f21536j.b(this.f21537k);
            }
            return this.f21537k.b(this.f21533g);
        }

        public boolean b() {
            if (this.f21534h == null) {
                return false;
            }
            return this.f21535i != null || this.f21537k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f21536j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f21537k);
            }
            this.f21536j = eVar;
            if (eVar == null || (cVar = this.f21537k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(e.a.f21087a, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            }
            themeNewTheme.resolveAttribute(e.a.D, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 == 0) {
                i9 = e.i.f21219b;
            }
            themeNewTheme.applyStyle(i9, true);
            j.d dVar = new j.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f21538l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(e.j.f21348z0);
            this.f21528b = typedArrayObtainStyledAttributes.getResourceId(e.j.C0, 0);
            this.f21532f = typedArrayObtainStyledAttributes.getResourceId(e.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class r implements j.a {
        r() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z8 = eVarD != eVar;
            f fVar = f.this;
            if (z8) {
                eVar = eVarD;
            }
            q qVarY = fVar.Y(eVar);
            if (qVarY != null) {
                if (!z8) {
                    f.this.O(qVarY, z7);
                } else {
                    f.this.K(qVarY.f21527a, qVarY, eVarD);
                    f.this.O(qVarY, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackF0;
            if (eVar != eVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.A || (callbackF0 = fVar.f0()) == null || f.this.Z) {
                return true;
            }
            callbackF0.onMenuOpened(108, eVar);
            return true;
        }
    }

    f(Activity activity, f.c cVar) {
        this(activity, null, cVar, activity);
    }

    f(Dialog dialog, f.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    private f(Context context, Window window, f.c cVar, Object obj) {
        p.h<String, Integer> hVar;
        Integer num;
        f.b bVarI0;
        this.f21500s = null;
        this.f21501t = true;
        this.f21472a0 = -100;
        this.f21486i0 = new a();
        this.f21477e = context;
        this.f21483h = cVar;
        this.f21475d = obj;
        if (this.f21472a0 == -100 && (obj instanceof Dialog) && (bVarI0 = I0()) != null) {
            this.f21472a0 = bVarI0.B().k();
        }
        if (this.f21472a0 == -100 && (num = (hVar = f21467n0).get(obj.getClass().getName())) != null) {
            this.f21472a0 = num.intValue();
            hVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.i.h();
    }

    private boolean A0(q qVar, KeyEvent keyEvent) {
        l0 l0Var;
        l0 l0Var2;
        l0 l0Var3;
        if (this.Z) {
            return false;
        }
        if (qVar.f21539m) {
            return true;
        }
        q qVar2 = this.H;
        if (qVar2 != null && qVar2 != qVar) {
            O(qVar2, false);
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null) {
            qVar.f21535i = callbackF0.onCreatePanelView(qVar.f21527a);
        }
        int i8 = qVar.f21527a;
        boolean z7 = i8 == 0 || i8 == 108;
        if (z7 && (l0Var3 = this.f21491l) != null) {
            l0Var3.c();
        }
        if (qVar.f21535i == null) {
            if (z7) {
                y0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f21536j;
            if (eVar == null || qVar.f21544r) {
                if (eVar == null && (!j0(qVar) || qVar.f21536j == null)) {
                    return false;
                }
                if (z7 && this.f21491l != null) {
                    if (this.f21493m == null) {
                        this.f21493m = new C0103f();
                    }
                    this.f21491l.a(qVar.f21536j, this.f21493m);
                }
                qVar.f21536j.d0();
                if (!callbackF0.onCreatePanelMenu(qVar.f21527a, qVar.f21536j)) {
                    qVar.c(null);
                    if (z7 && (l0Var = this.f21491l) != null) {
                        l0Var.a(null, this.f21493m);
                    }
                    return false;
                }
                qVar.f21544r = false;
            }
            qVar.f21536j.d0();
            Bundle bundle = qVar.f21545s;
            if (bundle != null) {
                qVar.f21536j.P(bundle);
                qVar.f21545s = null;
            }
            if (!callbackF0.onPreparePanel(0, qVar.f21535i, qVar.f21536j)) {
                if (z7 && (l0Var2 = this.f21491l) != null) {
                    l0Var2.a(null, this.f21493m);
                }
                qVar.f21536j.c0();
                return false;
            }
            boolean z8 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f21542p = z8;
            qVar.f21536j.setQwertyMode(z8);
            qVar.f21536j.c0();
        }
        qVar.f21539m = true;
        qVar.f21540n = false;
        this.H = qVar;
        return true;
    }

    private void B0(boolean z7) {
        l0 l0Var = this.f21491l;
        if (l0Var == null || !l0Var.d() || (ViewConfiguration.get(this.f21477e).hasPermanentMenuKey() && !this.f21491l.e())) {
            q qVarD0 = d0(0, true);
            qVarD0.f21543q = true;
            O(qVarD0, false);
            x0(qVarD0, null);
            return;
        }
        Window.Callback callbackF0 = f0();
        if (this.f21491l.b() && z7) {
            this.f21491l.f();
            if (this.Z) {
                return;
            }
            callbackF0.onPanelClosed(108, d0(0, true).f21536j);
            return;
        }
        if (callbackF0 == null || this.Z) {
            return;
        }
        if (this.f21482g0 && (this.f21484h0 & 1) != 0) {
            this.f21479f.getDecorView().removeCallbacks(this.f21486i0);
            this.f21486i0.run();
        }
        q qVarD02 = d0(0, true);
        androidx.appcompat.view.menu.e eVar = qVarD02.f21536j;
        if (eVar == null || qVarD02.f21544r || !callbackF0.onPreparePanel(0, qVarD02.f21535i, eVar)) {
            return;
        }
        callbackF0.onMenuOpened(108, qVarD02.f21536j);
        this.f21491l.g();
    }

    private int C0(int i8) {
        if (i8 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i8 != 9) {
            return i8;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f21479f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || e0.v((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z7) {
        if (this.Z) {
            return false;
        }
        int iJ = J();
        boolean zJ0 = J0(n0(this.f21477e, iJ), z7);
        if (iJ == 0) {
            c0(this.f21477e).e();
        } else {
            j jVar = this.f21478e0;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (iJ == 3) {
            b0(this.f21477e).e();
        } else {
            j jVar2 = this.f21480f0;
            if (jVar2 != null) {
                jVar2.a();
            }
        }
        return zJ0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f21503v.findViewById(R.id.content);
        View decorView = this.f21479f.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f21477e.obtainStyledAttributes(e.j.f21348z0);
        typedArrayObtainStyledAttributes.getValue(e.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(e.j.M0, contentFrameLayout.getMinWidthMinor());
        int i8 = e.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            typedArrayObtainStyledAttributes.getValue(i8, contentFrameLayout.getFixedWidthMajor());
        }
        int i9 = e.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            typedArrayObtainStyledAttributes.getValue(i9, contentFrameLayout.getFixedWidthMinor());
        }
        int i10 = e.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedHeightMajor());
        }
        int i11 = e.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.f21502u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f21479f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof h) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        h hVar = new h(callback);
        this.f21481g = hVar;
        window.setCallback(hVar);
        l1 l1VarT = l1.t(this.f21477e, null, f21469p0);
        Drawable drawableG = l1VarT.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        l1VarT.v();
        this.f21479f = window;
    }

    private f.b I0() {
        for (Context baseContext = this.f21477e; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof f.b) {
                return (f.b) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i8 = this.f21472a0;
        return i8 != -100 ? i8 : f.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f21477e
            r1 = 0
            android.content.res.Configuration r0 = r6.P(r0, r7, r1)
            boolean r2 = r6.l0()
            android.content.Context r3 = r6.f21477e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.W
            if (r8 == 0) goto L47
            boolean r8 = f.f.f21470q0
            if (r8 != 0) goto L30
            boolean r8 = r6.X
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f21475d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f21475d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.s(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.K0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f21475d
            boolean r0 = r8 instanceof f.b
            if (r0 == 0) goto L5e
            f.b r8 = (f.b) r8
            r8.E(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.J0(int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(int i8, boolean z7, Configuration configuration) {
        Resources resources = this.f21477e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i8 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            f.k.a(resources);
        }
        int i10 = this.f21473b0;
        if (i10 != 0) {
            this.f21477e.setTheme(i10);
            if (i9 >= 23) {
                this.f21477e.getTheme().applyStyle(this.f21473b0, true);
            }
        }
        if (z7) {
            Object obj = this.f21475d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.i) {
                    if (!((androidx.lifecycle.i) activity).a().b().c(d.b.STARTED)) {
                        return;
                    }
                } else if (!this.Y) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        j jVar = this.f21478e0;
        if (jVar != null) {
            jVar.a();
        }
        j jVar2 = this.f21480f0;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    private void M0(View view) {
        Context context;
        int i8;
        if ((e0.s(view) & 8192) != 0) {
            context = this.f21477e;
            i8 = e.c.f21115b;
        } else {
            context = this.f21477e;
            i8 = e.c.f21114a;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i8));
    }

    private Configuration P(Context context, int i8, Configuration configuration) {
        int i9 = i8 != 1 ? i8 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i9 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f21477e.obtainStyledAttributes(e.j.f21348z0);
        int i8 = e.j.E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i8)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.N0, false)) {
            z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i8, false)) {
            z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.F0, false)) {
            z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(e.j.G0, false)) {
            z(10);
        }
        this.D = typedArrayObtainStyledAttributes.getBoolean(e.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        X();
        this.f21479f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21477e);
        if (this.E) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.C ? e.g.f21200o : e.g.f21199n, (ViewGroup) null);
        } else if (this.D) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(e.g.f21191f, (ViewGroup) null);
            this.B = false;
            this.A = false;
        } else if (this.A) {
            TypedValue typedValue = new TypedValue();
            this.f21477e.getTheme().resolveAttribute(e.a.f21092f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.d(this.f21477e, typedValue.resourceId) : this.f21477e).inflate(e.g.f21201p, (ViewGroup) null);
            l0 l0Var = (l0) viewGroup.findViewById(e.f.f21175p);
            this.f21491l = l0Var;
            l0Var.setWindowCallback(f0());
            if (this.B) {
                this.f21491l.h(109);
            }
            if (this.f21506y) {
                this.f21491l.h(2);
            }
            if (this.f21507z) {
                this.f21491l.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        e0.N(viewGroup, new b());
        if (this.f21491l == null) {
            this.f21504w = (TextView) viewGroup.findViewById(e.f.M);
        }
        s1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(e.f.f21161b);
        ViewGroup viewGroup2 = (ViewGroup) this.f21479f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f21479f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void W() {
        if (this.f21502u) {
            return;
        }
        this.f21503v = Q();
        CharSequence charSequenceE0 = e0();
        if (!TextUtils.isEmpty(charSequenceE0)) {
            l0 l0Var = this.f21491l;
            if (l0Var != null) {
                l0Var.setWindowTitle(charSequenceE0);
            } else if (y0() != null) {
                y0().s(charSequenceE0);
            } else {
                TextView textView = this.f21504w;
                if (textView != null) {
                    textView.setText(charSequenceE0);
                }
            }
        }
        H();
        w0(this.f21503v);
        this.f21502u = true;
        q qVarD0 = d0(0, false);
        if (this.Z) {
            return;
        }
        if (qVarD0 == null || qVarD0.f21536j == null) {
            k0(108);
        }
    }

    private void X() {
        if (this.f21479f == null) {
            Object obj = this.f21475d;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f21479f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            int i8 = configuration.mcc;
            int i9 = configuration2.mcc;
            if (i8 != i9) {
                configuration3.mcc = i9;
            }
            int i10 = configuration.mnc;
            int i11 = configuration2.mnc;
            if (i10 != i11) {
                configuration3.mnc = i11;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i13 = configuration.touchscreen;
            int i14 = configuration2.touchscreen;
            if (i13 != i14) {
                configuration3.touchscreen = i14;
            }
            int i15 = configuration.keyboard;
            int i16 = configuration2.keyboard;
            if (i15 != i16) {
                configuration3.keyboard = i16;
            }
            int i17 = configuration.keyboardHidden;
            int i18 = configuration2.keyboardHidden;
            if (i17 != i18) {
                configuration3.keyboardHidden = i18;
            }
            int i19 = configuration.navigation;
            int i20 = configuration2.navigation;
            if (i19 != i20) {
                configuration3.navigation = i20;
            }
            int i21 = configuration.navigationHidden;
            int i22 = configuration2.navigationHidden;
            if (i21 != i22) {
                configuration3.navigationHidden = i22;
            }
            int i23 = configuration.orientation;
            int i24 = configuration2.orientation;
            if (i23 != i24) {
                configuration3.orientation = i24;
            }
            int i25 = configuration.screenLayout & 15;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 15)) {
                configuration3.screenLayout |= i26 & 15;
            }
            int i27 = configuration.screenLayout & 192;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 192)) {
                configuration3.screenLayout |= i28 & 192;
            }
            int i29 = configuration.screenLayout & 48;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 48)) {
                configuration3.screenLayout |= i30 & 48;
            }
            int i31 = configuration.screenLayout & 768;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 768)) {
                configuration3.screenLayout |= i32 & 768;
            }
            if (i12 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i33 = configuration.uiMode & 15;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 15)) {
                configuration3.uiMode |= i34 & 15;
            }
            int i35 = configuration.uiMode & 48;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 48)) {
                configuration3.uiMode |= i36 & 48;
            }
            int i37 = configuration.screenWidthDp;
            int i38 = configuration2.screenWidthDp;
            if (i37 != i38) {
                configuration3.screenWidthDp = i38;
            }
            int i39 = configuration.screenHeightDp;
            int i40 = configuration2.screenHeightDp;
            if (i39 != i40) {
                configuration3.screenHeightDp = i40;
            }
            int i41 = configuration.smallestScreenWidthDp;
            int i42 = configuration2.smallestScreenWidthDp;
            if (i41 != i42) {
                configuration3.smallestScreenWidthDp = i42;
            }
            l.a(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private j b0(Context context) {
        if (this.f21480f0 == null) {
            this.f21480f0 = new i(context);
        }
        return this.f21480f0;
    }

    private j c0(Context context) {
        if (this.f21478e0 == null) {
            this.f21478e0 = new k(f.m.a(context));
        }
        return this.f21478e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0() {
        /*
            r3 = this;
            r3.W()
            boolean r0 = r3.A
            if (r0 == 0) goto L37
            f.a r0 = r3.f21485i
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f21475d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            f.n r0 = new f.n
            java.lang.Object r1 = r3.f21475d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.B
            r0.<init>(r1, r2)
        L1d:
            r3.f21485i = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            f.n r0 = new f.n
            java.lang.Object r1 = r3.f21475d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            f.a r0 = r3.f21485i
            if (r0 == 0) goto L37
            boolean r1 = r3.f21488j0
            r0.q(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.g0():void");
    }

    private boolean h0(q qVar) {
        View view = qVar.f21535i;
        if (view != null) {
            qVar.f21534h = view;
            return true;
        }
        if (qVar.f21536j == null) {
            return false;
        }
        if (this.f21495n == null) {
            this.f21495n = new r();
        }
        View view2 = (View) qVar.a(this.f21495n);
        qVar.f21534h = view2;
        return view2 != null;
    }

    private boolean i0(q qVar) {
        qVar.d(a0());
        qVar.f21533g = new p(qVar.f21538l);
        qVar.f21529c = 81;
        return true;
    }

    private boolean j0(q qVar) {
        Context context = this.f21477e;
        int i8 = qVar.f21527a;
        if ((i8 == 0 || i8 == 108) && this.f21491l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(e.a.f21092f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(e.a.f21093g, typedValue, true);
            } else {
                theme.resolveAttribute(e.a.f21093g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        qVar.c(eVar);
        return true;
    }

    private void k0(int i8) {
        this.f21484h0 = (1 << i8) | this.f21484h0;
        if (this.f21482g0) {
            return;
        }
        e0.C(this.f21479f.getDecorView(), this.f21486i0);
        this.f21482g0 = true;
    }

    private boolean l0() {
        if (!this.f21476d0 && (this.f21475d instanceof Activity)) {
            PackageManager packageManager = this.f21477e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i8 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f21477e, this.f21475d.getClass()), i8 >= 29 ? 269221888 : i8 >= 24 ? 786432 : 0);
                this.f21474c0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.f21474c0 = false;
            }
        }
        this.f21476d0 = true;
        return this.f21474c0;
    }

    private boolean q0(int i8, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarD0 = d0(i8, true);
        if (qVarD0.f21541o) {
            return false;
        }
        return A0(qVarD0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean t0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            j.b r0 = r4.f21496o
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            f.f$q r2 = r4.d0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.l0 r5 = r4.f21491l
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f21477e
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.l0 r5 = r4.f21491l
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.Z
            if (r5 != 0) goto L62
            boolean r5 = r4.A0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.l0 r5 = r4.f21491l
            boolean r0 = r5.g()
            goto L68
        L3c:
            androidx.appcompat.widget.l0 r5 = r4.f21491l
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.f21541o
            if (r5 != 0) goto L64
            boolean r3 = r2.f21540n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f21539m
            if (r5 == 0) goto L62
            boolean r5 = r2.f21544r
            if (r5 == 0) goto L5b
            r2.f21539m = r1
            boolean r5 = r4.A0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.x0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.O(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f21477e
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.t0(int, android.view.KeyEvent):boolean");
    }

    private void x0(q qVar, KeyEvent keyEvent) {
        int i8;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f21541o || this.Z) {
            return;
        }
        if (qVar.f21527a == 0) {
            if ((this.f21477e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !callbackF0.onMenuOpened(qVar.f21527a, qVar.f21536j)) {
            O(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f21477e.getSystemService("window");
        if (windowManager != null && A0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f21533g;
            if (viewGroup != null && !qVar.f21543q) {
                View view = qVar.f21535i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i8 = -1;
                }
                qVar.f21540n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i8, -2, qVar.f21530d, qVar.f21531e, 1002, 8519680, -3);
                layoutParams2.gravity = qVar.f21529c;
                layoutParams2.windowAnimations = qVar.f21532f;
                windowManager.addView(qVar.f21533g, layoutParams2);
                qVar.f21541o = true;
            }
            if (viewGroup == null) {
                if (!i0(qVar) || qVar.f21533g == null) {
                    return;
                }
            } else if (qVar.f21543q && viewGroup.getChildCount() > 0) {
                qVar.f21533g.removeAllViews();
            }
            if (!h0(qVar) || !qVar.b()) {
                qVar.f21543q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = qVar.f21534h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f21533g.setBackgroundResource(qVar.f21528b);
            ViewParent parent = qVar.f21534h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qVar.f21534h);
            }
            qVar.f21533g.addView(qVar.f21534h, layoutParams3);
            if (!qVar.f21534h.hasFocus()) {
                qVar.f21534h.requestFocus();
            }
            i8 = -2;
            qVar.f21540n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i8, -2, qVar.f21530d, qVar.f21531e, 1002, 8519680, -3);
            layoutParams22.gravity = qVar.f21529c;
            layoutParams22.windowAnimations = qVar.f21532f;
            windowManager.addView(qVar.f21533g, layoutParams22);
            qVar.f21541o = true;
        }
    }

    private boolean z0(q qVar, int i8, KeyEvent keyEvent, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f21539m || A0(qVar, keyEvent)) && (eVar = qVar.f21536j) != null) {
            zPerformShortcut = eVar.performShortcut(i8, keyEvent, i9);
        }
        if (zPerformShortcut && (i9 & 1) == 0 && this.f21491l == null) {
            O(qVar, true);
        }
        return zPerformShortcut;
    }

    @Override // f.d
    public void A(int i8) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f21503v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f21477e).inflate(i8, viewGroup);
        this.f21481g.a().onContentChanged();
    }

    @Override // f.d
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f21503v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f21481g.a().onContentChanged();
    }

    @Override // f.d
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f21503v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f21481g.a().onContentChanged();
    }

    @Override // f.d
    public void D(int i8) {
        this.f21473b0 = i8;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.f21502u && (viewGroup = this.f21503v) != null && e0.w(viewGroup);
    }

    @Override // f.d
    public final void E(CharSequence charSequence) {
        this.f21489k = charSequence;
        l0 l0Var = this.f21491l;
        if (l0Var != null) {
            l0Var.setWindowTitle(charSequence);
            return;
        }
        if (y0() != null) {
            y0().s(charSequence);
            return;
        }
        TextView textView = this.f21504w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean F() {
        return G(true);
    }

    public j.b F0(b.a aVar) {
        f.c cVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        j.b bVar = this.f21496o;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(aVar);
        f.a aVarM = m();
        if (aVarM != null) {
            j.b bVarT = aVarM.t(gVar);
            this.f21496o = bVarT;
            if (bVarT != null && (cVar = this.f21483h) != null) {
                cVar.d(bVarT);
            }
        }
        if (this.f21496o == null) {
            this.f21496o = G0(gVar);
        }
        return this.f21496o;
    }

    j.b G0(b.a aVar) {
        j.b bVarI;
        Context dVar;
        f.c cVar;
        V();
        j.b bVar = this.f21496o;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof g)) {
            aVar = new g(aVar);
        }
        f.c cVar2 = this.f21483h;
        if (cVar2 == null || this.Z) {
            bVarI = null;
        } else {
            try {
                bVarI = cVar2.i(aVar);
            } catch (AbstractMethodError unused) {
                bVarI = null;
            }
        }
        if (bVarI != null) {
            this.f21496o = bVarI;
        } else {
            if (this.f21497p == null) {
                if (this.D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f21477e.getTheme();
                    theme.resolveAttribute(e.a.f21092f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f21477e.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new j.d(this.f21477e, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f21477e;
                    }
                    this.f21497p = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, e.a.f21095i);
                    this.f21498q = popupWindow;
                    androidx.core.widget.k.b(popupWindow, 2);
                    this.f21498q.setContentView(this.f21497p);
                    this.f21498q.setWidth(-1);
                    dVar.getTheme().resolveAttribute(e.a.f21088b, typedValue, true);
                    this.f21497p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f21498q.setHeight(-2);
                    this.f21499r = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f21503v.findViewById(e.f.f21167h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(a0()));
                        this.f21497p = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f21497p != null) {
                V();
                this.f21497p.k();
                j.e eVar = new j.e(this.f21497p.getContext(), this.f21497p, aVar, this.f21498q == null);
                if (aVar.a(eVar, eVar.e())) {
                    eVar.k();
                    this.f21497p.h(eVar);
                    this.f21496o = eVar;
                    if (D0()) {
                        this.f21497p.setAlpha(0.0f);
                        f1 f1VarB = e0.b(this.f21497p).b(1.0f);
                        this.f21500s = f1VarB;
                        f1VarB.h(new e());
                    } else {
                        this.f21497p.setAlpha(1.0f);
                        this.f21497p.setVisibility(0);
                        this.f21497p.sendAccessibilityEvent(32);
                        if (this.f21497p.getParent() instanceof View) {
                            e0.E((View) this.f21497p.getParent());
                        }
                    }
                    if (this.f21498q != null) {
                        this.f21479f.getDecorView().post(this.f21499r);
                    }
                } else {
                    this.f21496o = null;
                }
            }
        }
        j.b bVar2 = this.f21496o;
        if (bVar2 != null && (cVar = this.f21483h) != null) {
            cVar.d(bVar2);
        }
        return this.f21496o;
    }

    void K(int i8, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i8 >= 0) {
                q[] qVarArr = this.G;
                if (i8 < qVarArr.length) {
                    qVar = qVarArr[i8];
                }
            }
            if (qVar != null) {
                menu = qVar.f21536j;
            }
        }
        if ((qVar == null || qVar.f21541o) && !this.Z) {
            this.f21481g.a().onPanelClosed(i8, menu);
        }
    }

    void L(androidx.appcompat.view.menu.e eVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f21491l.i();
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !this.Z) {
            callbackF0.onPanelClosed(108, eVar);
        }
        this.F = false;
    }

    final int L0(j1 j1Var, Rect rect) {
        boolean z7;
        boolean z8;
        int iK = j1Var != null ? j1Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f21497p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f21497p.getLayoutParams();
            if (this.f21497p.isShown()) {
                if (this.f21490k0 == null) {
                    this.f21490k0 = new Rect();
                    this.f21492l0 = new Rect();
                }
                Rect rect2 = this.f21490k0;
                Rect rect3 = this.f21492l0;
                if (j1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(j1Var.i(), j1Var.k(), j1Var.j(), j1Var.h());
                }
                s1.a(this.f21503v, rect2, rect3);
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                j1 j1VarP = e0.p(this.f21503v);
                int i11 = j1VarP == null ? 0 : j1VarP.i();
                int iJ = j1VarP == null ? 0 : j1VarP.j();
                if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i8;
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i10;
                    z8 = true;
                }
                if (i8 <= 0 || this.f21505x != null) {
                    View view = this.f21505x;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != iJ) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = i11;
                            marginLayoutParams2.rightMargin = iJ;
                            this.f21505x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f21477e);
                    this.f21505x = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = iJ;
                    this.f21503v.addView(this.f21505x, -1, layoutParams);
                }
                View view3 = this.f21505x;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    M0(this.f21505x);
                }
                if (!this.C && z) {
                    iK = 0;
                }
                z7 = z;
                z = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z7 = false;
            } else {
                z7 = false;
                z = false;
            }
            if (z) {
                this.f21497p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f21505x;
        if (view4 != null) {
            view4.setVisibility(z7 ? 0 : 8);
        }
        return iK;
    }

    void N(int i8) {
        O(d0(i8, true), true);
    }

    void O(q qVar, boolean z7) {
        ViewGroup viewGroup;
        l0 l0Var;
        if (z7 && qVar.f21527a == 0 && (l0Var = this.f21491l) != null && l0Var.b()) {
            L(qVar.f21536j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f21477e.getSystemService("window");
        if (windowManager != null && qVar.f21541o && (viewGroup = qVar.f21533g) != null) {
            windowManager.removeView(viewGroup);
            if (z7) {
                K(qVar.f21527a, qVar, null);
            }
        }
        qVar.f21539m = false;
        qVar.f21540n = false;
        qVar.f21541o = false;
        qVar.f21534h = null;
        qVar.f21543q = true;
        if (this.H == qVar) {
            this.H = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        f.j jVar;
        boolean zE0 = false;
        if (this.f21494m0 == null) {
            String string = this.f21477e.obtainStyledAttributes(e.j.f21348z0).getString(e.j.D0);
            if (string == null) {
                jVar = new f.j();
            } else {
                try {
                    this.f21494m0 = (f.j) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    jVar = new f.j();
                    this.f21494m0 = jVar;
                }
            }
            this.f21494m0 = jVar;
        }
        boolean z8 = f21468o0;
        if (z8) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zE0 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zE0 = true;
            }
            z7 = zE0;
        } else {
            z7 = false;
        }
        return this.f21494m0.q(view, str, context, attributeSet, z7, z8, true, r1.b());
    }

    void S() {
        androidx.appcompat.view.menu.e eVar;
        l0 l0Var = this.f21491l;
        if (l0Var != null) {
            l0Var.i();
        }
        if (this.f21498q != null) {
            this.f21479f.getDecorView().removeCallbacks(this.f21499r);
            if (this.f21498q.isShowing()) {
                try {
                    this.f21498q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f21498q = null;
        }
        V();
        q qVarD0 = d0(0, false);
        if (qVarD0 == null || (eVar = qVarD0.f21536j) == null) {
            return;
        }
        eVar.close();
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f21475d;
        if (((obj instanceof e.a) || (obj instanceof f.i)) && (decorView = this.f21479f.getDecorView()) != null && androidx.core.view.e.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f21481g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i8) {
        q qVarD0;
        q qVarD02 = d0(i8, true);
        if (qVarD02.f21536j != null) {
            Bundle bundle = new Bundle();
            qVarD02.f21536j.Q(bundle);
            if (bundle.size() > 0) {
                qVarD02.f21545s = bundle;
            }
            qVarD02.f21536j.d0();
            qVarD02.f21536j.clear();
        }
        qVarD02.f21544r = true;
        qVarD02.f21543q = true;
        if ((i8 != 108 && i8 != 0) || this.f21491l == null || (qVarD0 = d0(0, false)) == null) {
            return;
        }
        qVarD0.f21539m = false;
        A0(qVarD0, null);
    }

    void V() {
        f1 f1Var = this.f21500s;
        if (f1Var != null) {
            f1Var.c();
        }
    }

    q Y(Menu menu) {
        q[] qVarArr = this.G;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i8 = 0; i8 < length; i8++) {
            q qVar = qVarArr[i8];
            if (qVar != null && qVar.f21536j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        q qVarY;
        Window.Callback callbackF0 = f0();
        if (callbackF0 == null || this.Z || (qVarY = Y(eVar.D())) == null) {
            return false;
        }
        return callbackF0.onMenuItemSelected(qVarY.f21527a, menuItem);
    }

    final Context a0() {
        f.a aVarM = m();
        Context contextJ = aVarM != null ? aVarM.j() : null;
        return contextJ == null ? this.f21477e : contextJ;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(true);
    }

    @Override // f.d
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.f21503v.findViewById(R.id.content)).addView(view, layoutParams);
        this.f21481g.a().onContentChanged();
    }

    protected q d0(int i8, boolean z7) {
        q[] qVarArr = this.G;
        if (qVarArr == null || qVarArr.length <= i8) {
            q[] qVarArr2 = new q[i8 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.G = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i8];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i8);
        qVarArr[i8] = qVar2;
        return qVar2;
    }

    final CharSequence e0() {
        Object obj = this.f21475d;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f21489k;
    }

    @Override // f.d
    public Context f(Context context) {
        this.W = true;
        int iN0 = n0(context, J());
        if (f21471r0 && (context instanceof ContextThemeWrapper)) {
            try {
                o.a((ContextThemeWrapper) context, P(context, iN0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof j.d) {
            try {
                ((j.d) context).a(P(context, iN0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f21470q0) {
            return super.f(context);
        }
        try {
            Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration2 = context.getResources().getConfiguration();
            Configuration configurationP = P(context, iN0, configuration.equals(configuration2) ? null : Z(configuration, configuration2));
            j.d dVar = new j.d(context, e.i.f21220c);
            dVar.a(configurationP);
            boolean z7 = false;
            try {
                z7 = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z7) {
                h.f.a(dVar.getTheme());
            }
            return super.f(dVar);
        } catch (PackageManager.NameNotFoundException e8) {
            throw new RuntimeException("Application failed to obtain resources from itself", e8);
        }
    }

    final Window.Callback f0() {
        return this.f21479f.getCallback();
    }

    @Override // f.d
    public <T extends View> T i(int i8) {
        W();
        return (T) this.f21479f.findViewById(i8);
    }

    @Override // f.d
    public int k() {
        return this.f21472a0;
    }

    @Override // f.d
    public MenuInflater l() {
        if (this.f21487j == null) {
            g0();
            f.a aVar = this.f21485i;
            this.f21487j = new j.g(aVar != null ? aVar.j() : this.f21477e);
        }
        return this.f21487j;
    }

    @Override // f.d
    public f.a m() {
        g0();
        return this.f21485i;
    }

    public boolean m0() {
        return this.f21501t;
    }

    @Override // f.d
    public void n() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f21477e);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.f.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i8) {
        j jVarC0;
        if (i8 == -100) {
            return -1;
        }
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    jVarC0 = b0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                jVarC0 = c0(context);
            }
            return jVarC0.c();
        }
        return i8;
    }

    @Override // f.d
    public void o() {
        f.a aVarM = m();
        if (aVarM == null || !aVarM.k()) {
            k0(0);
        }
    }

    boolean o0() {
        j.b bVar = this.f21496o;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        f.a aVarM = m();
        return aVarM != null && aVarM.g();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // f.d
    public void p(Configuration configuration) {
        f.a aVarM;
        if (this.A && this.f21502u && (aVarM = m()) != null) {
            aVarM.l(configuration);
        }
        androidx.appcompat.widget.i.b().g(this.f21477e);
        G(false);
    }

    boolean p0(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            this.I = (keyEvent.getFlags() & 128) != 0;
        } else if (i8 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // f.d
    public void q(Bundle bundle) {
        this.W = true;
        G(false);
        X();
        Object obj = this.f21475d;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = androidx.core.app.n.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                f.a aVarY0 = y0();
                if (aVarY0 == null) {
                    this.f21488j0 = true;
                } else {
                    aVarY0.q(true);
                }
            }
            f.d.c(this);
        }
        this.X = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // f.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f21475d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            f.d.x(r3)
        L9:
            boolean r0 = r3.f21482g0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f21479f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f21486i0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.Y = r0
            r0 = 1
            r3.Z = r0
            int r0 = r3.f21472a0
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f21475d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            p.h<java.lang.String, java.lang.Integer> r0 = f.f.f21467n0
            java.lang.Object r1 = r3.f21475d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f21472a0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            p.h<java.lang.String, java.lang.Integer> r0 = f.f.f21467n0
            java.lang.Object r1 = r3.f21475d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            f.a r0 = r3.f21485i
            if (r0 == 0) goto L5e
            r0.m()
        L5e:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.f.r():void");
    }

    boolean r0(int i8, KeyEvent keyEvent) {
        f.a aVarM = m();
        if (aVarM != null && aVarM.n(i8, keyEvent)) {
            return true;
        }
        q qVar = this.H;
        if (qVar != null && z0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.H;
            if (qVar2 != null) {
                qVar2.f21540n = true;
            }
            return true;
        }
        if (this.H == null) {
            q qVarD0 = d0(0, true);
            A0(qVarD0, keyEvent);
            boolean zZ0 = z0(qVarD0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarD0.f21539m = false;
            if (zZ0) {
                return true;
            }
        }
        return false;
    }

    @Override // f.d
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            boolean z7 = this.I;
            this.I = false;
            q qVarD0 = d0(0, false);
            if (qVarD0 != null && qVarD0.f21541o) {
                if (!z7) {
                    O(qVarD0, true);
                }
                return true;
            }
            if (o0()) {
                return true;
            }
        } else if (i8 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // f.d
    public void t() {
        f.a aVarM = m();
        if (aVarM != null) {
            aVarM.r(true);
        }
    }

    @Override // f.d
    public void u(Bundle bundle) {
    }

    void u0(int i8) {
        f.a aVarM;
        if (i8 != 108 || (aVarM = m()) == null) {
            return;
        }
        aVarM.h(true);
    }

    @Override // f.d
    public void v() {
        this.Y = true;
        F();
    }

    void v0(int i8) {
        if (i8 == 108) {
            f.a aVarM = m();
            if (aVarM != null) {
                aVarM.h(false);
                return;
            }
            return;
        }
        if (i8 == 0) {
            q qVarD0 = d0(i8, true);
            if (qVarD0.f21541o) {
                O(qVarD0, false);
            }
        }
    }

    @Override // f.d
    public void w() {
        this.Y = false;
        f.a aVarM = m();
        if (aVarM != null) {
            aVarM.r(false);
        }
    }

    void w0(ViewGroup viewGroup) {
    }

    final f.a y0() {
        return this.f21485i;
    }

    @Override // f.d
    public boolean z(int i8) {
        int iC0 = C0(i8);
        if (this.E && iC0 == 108) {
            return false;
        }
        if (this.A && iC0 == 1) {
            this.A = false;
        }
        if (iC0 == 1) {
            H0();
            this.E = true;
            return true;
        }
        if (iC0 == 2) {
            H0();
            this.f21506y = true;
            return true;
        }
        if (iC0 == 5) {
            H0();
            this.f21507z = true;
            return true;
        }
        if (iC0 == 10) {
            H0();
            this.C = true;
            return true;
        }
        if (iC0 == 108) {
            H0();
            this.A = true;
            return true;
        }
        if (iC0 != 109) {
            return this.f21479f.requestFeature(iC0);
        }
        H0();
        this.B = true;
        return true;
    }
}
