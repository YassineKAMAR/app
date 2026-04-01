package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.r0;
import androidx.lifecycle.a0;
import androidx.lifecycle.d;
import androidx.lifecycle.z;
import com.revenuecat.purchases.common.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.i, a0, p0.d {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    static final Object f2331k0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    private boolean E;
    ViewGroup F;
    View G;
    View H;
    boolean I;
    d X;
    boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    boolean f2333a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bundle f2334b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    float f2335b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SparseArray<Parcelable> f2336c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    LayoutInflater f2337c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Boolean f2338d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f2339d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bundle f2342f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    androidx.lifecycle.j f2343f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Fragment f2344g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    r f2345g0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f2348i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    p0.c f2349i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f2351j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f2352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f2353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f2354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f2355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f2356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f2357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f2358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    j f2359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    h f2360s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Fragment f2362u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f2363v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f2364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    String f2365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f2366y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f2367z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2332a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f2340e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f2346h = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f2350j = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    j f2361t = new j();
    boolean D = true;
    boolean W = true;
    Runnable Y = new a();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    d.b f2341e0 = d.b.RESUMED;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    androidx.lifecycle.o<androidx.lifecycle.i> f2347h0 = new androidx.lifecycle.o<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.o1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.f();
        }
    }

    class c extends androidx.fragment.app.e {
        c() {
        }

        @Override // androidx.fragment.app.e
        public View c(int i8) {
            View view = Fragment.this.G;
            if (view != null) {
                return view.findViewById(i8);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        @Override // androidx.fragment.app.e
        public boolean d() {
            return Fragment.this.G != null;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f2372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Animator f2373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2377f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f2378g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f2379h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f2380i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f2381j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f2382k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f2383l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Boolean f2384m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Boolean f2385n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f2386o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        f f2387p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f2388q;

        d() {
            Object obj = Fragment.f2331k0;
            this.f2379h = obj;
            this.f2380i = null;
            this.f2381j = obj;
            this.f2382k = null;
            this.f2383l = obj;
        }
    }

    public static class e extends RuntimeException {
        public e(String str, Exception exc) {
            super(str, exc);
        }
    }

    interface f {
        void a();

        void b();
    }

    public Fragment() {
        M();
    }

    private void M() {
        this.f2343f0 = new androidx.lifecycle.j(this);
        this.f2349i0 = p0.c.a(this);
        this.f2343f0.a(new androidx.lifecycle.g() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.lifecycle.g
            public void a(androidx.lifecycle.i iVar, d.a aVar) {
                View view;
                if (aVar != d.a.ON_STOP || (view = Fragment.this.G) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
    }

    @Deprecated
    public static Fragment O(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = g.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.h1(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e8) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (InstantiationException e9) {
            throw new e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }

    private d i() {
        if (this.X == null) {
            this.X = new d();
        }
        return this.X;
    }

    int A() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2376e;
    }

    public void A0(View view, Bundle bundle) {
    }

    int B() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2377f;
    }

    public void B0(Bundle bundle) {
        this.E = true;
    }

    public final Fragment C() {
        return this.f2362u;
    }

    void C0(Bundle bundle) {
        this.f2361t.R0();
        this.f2332a = 2;
        this.E = false;
        V(bundle);
        if (this.E) {
            this.f2361t.x();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object D() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2381j;
        return obj == f2331k0 ? t() : obj;
    }

    void D0() {
        this.f2361t.o(this.f2360s, new c(), this);
        this.E = false;
        Y(this.f2360s.g());
        if (this.E) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final Resources E() {
        return a1().getResources();
    }

    void E0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2361t.y(configuration);
    }

    public final boolean F() {
        return this.A;
    }

    boolean F0(MenuItem menuItem) {
        if (this.f2366y) {
            return false;
        }
        return a0(menuItem) || this.f2361t.z(menuItem);
    }

    public Object G() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2379h;
        return obj == f2331k0 ? r() : obj;
    }

    void G0(Bundle bundle) {
        this.f2361t.R0();
        this.f2332a = 1;
        this.E = false;
        this.f2349i0.d(bundle);
        b0(bundle);
        this.f2339d0 = true;
        if (this.E) {
            this.f2343f0.h(d.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    public Object H() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f2382k;
    }

    boolean H0(Menu menu, MenuInflater menuInflater) {
        boolean z7 = false;
        if (this.f2366y) {
            return false;
        }
        if (this.C && this.D) {
            z7 = true;
            e0(menu, menuInflater);
        }
        return z7 | this.f2361t.B(menu, menuInflater);
    }

    public Object I() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f2383l;
        return obj == f2331k0 ? H() : obj;
    }

    void I0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2361t.R0();
        this.f2357p = true;
        this.f2345g0 = new r();
        View viewF0 = f0(layoutInflater, viewGroup, bundle);
        this.G = viewF0;
        if (viewF0 != null) {
            this.f2345g0.c();
            this.f2347h0.i(this.f2345g0);
        } else {
            if (this.f2345g0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2345g0 = null;
        }
    }

    int J() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2374c;
    }

    void J0() {
        this.f2361t.C();
        this.f2343f0.h(d.a.ON_DESTROY);
        this.f2332a = 0;
        this.E = false;
        this.f2339d0 = false;
        g0();
        if (this.E) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final Fragment K() {
        String str;
        Fragment fragment = this.f2344g;
        if (fragment != null) {
            return fragment;
        }
        j jVar = this.f2359r;
        if (jVar == null || (str = this.f2346h) == null) {
            return null;
        }
        return jVar.f2443g.get(str);
    }

    void K0() {
        this.f2361t.D();
        if (this.G != null) {
            this.f2345g0.b(d.a.ON_DESTROY);
        }
        this.f2332a = 1;
        this.E = false;
        i0();
        if (this.E) {
            androidx.loader.app.a.b(this).c();
            this.f2357p = false;
        } else {
            throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public View L() {
        return this.G;
    }

    void L0() {
        this.E = false;
        j0();
        this.f2337c0 = null;
        if (this.E) {
            if (this.f2361t.C0()) {
                return;
            }
            this.f2361t.C();
            this.f2361t = new j();
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater M0(Bundle bundle) {
        LayoutInflater layoutInflaterK0 = k0(bundle);
        this.f2337c0 = layoutInflaterK0;
        return layoutInflaterK0;
    }

    void N() {
        M();
        this.f2340e = UUID.randomUUID().toString();
        this.f2352k = false;
        this.f2353l = false;
        this.f2354m = false;
        this.f2355n = false;
        this.f2356o = false;
        this.f2358q = 0;
        this.f2359r = null;
        this.f2361t = new j();
        this.f2360s = null;
        this.f2363v = 0;
        this.f2364w = 0;
        this.f2365x = null;
        this.f2366y = false;
        this.f2367z = false;
    }

    void N0() {
        onLowMemory();
        this.f2361t.E();
    }

    void O0(boolean z7) {
        o0(z7);
        this.f2361t.F(z7);
    }

    boolean P() {
        d dVar = this.X;
        if (dVar == null) {
            return false;
        }
        return dVar.f2388q;
    }

    boolean P0(MenuItem menuItem) {
        if (this.f2366y) {
            return false;
        }
        return (this.C && this.D && p0(menuItem)) || this.f2361t.U(menuItem);
    }

    final boolean Q() {
        return this.f2358q > 0;
    }

    void Q0(Menu menu) {
        if (this.f2366y) {
            return;
        }
        if (this.C && this.D) {
            q0(menu);
        }
        this.f2361t.V(menu);
    }

    boolean R() {
        d dVar = this.X;
        if (dVar == null) {
            return false;
        }
        return dVar.f2386o;
    }

    void R0() {
        this.f2361t.X();
        if (this.G != null) {
            this.f2345g0.b(d.a.ON_PAUSE);
        }
        this.f2343f0.h(d.a.ON_PAUSE);
        this.f2332a = 3;
        this.E = false;
        r0();
        if (this.E) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean S() {
        return this.f2353l;
    }

    void S0(boolean z7) {
        s0(z7);
        this.f2361t.Y(z7);
    }

    public final boolean T() {
        j jVar = this.f2359r;
        if (jVar == null) {
            return false;
        }
        return jVar.G0();
    }

    boolean T0(Menu menu) {
        boolean z7 = false;
        if (this.f2366y) {
            return false;
        }
        if (this.C && this.D) {
            z7 = true;
            t0(menu);
        }
        return z7 | this.f2361t.Z(menu);
    }

    void U() {
        this.f2361t.R0();
    }

    void U0() {
        boolean zE0 = this.f2359r.E0(this);
        Boolean bool = this.f2350j;
        if (bool == null || bool.booleanValue() != zE0) {
            this.f2350j = Boolean.valueOf(zE0);
            u0(zE0);
            this.f2361t.a0();
        }
    }

    public void V(Bundle bundle) {
        this.E = true;
    }

    void V0() {
        this.f2361t.R0();
        this.f2361t.k0();
        this.f2332a = 4;
        this.E = false;
        w0();
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.j jVar = this.f2343f0;
        d.a aVar = d.a.ON_RESUME;
        jVar.h(aVar);
        if (this.G != null) {
            this.f2345g0.b(aVar);
        }
        this.f2361t.b0();
        this.f2361t.k0();
    }

    public void W(int i8, int i9, Intent intent) {
    }

    void W0(Bundle bundle) {
        x0(bundle);
        this.f2349i0.e(bundle);
        Parcelable parcelableD1 = this.f2361t.d1();
        if (parcelableD1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableD1);
        }
    }

    @Deprecated
    public void X(Activity activity) {
        this.E = true;
    }

    void X0() {
        this.f2361t.R0();
        this.f2361t.k0();
        this.f2332a = 3;
        this.E = false;
        y0();
        if (!this.E) {
            throw new s("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.j jVar = this.f2343f0;
        d.a aVar = d.a.ON_START;
        jVar.h(aVar);
        if (this.G != null) {
            this.f2345g0.b(aVar);
        }
        this.f2361t.c0();
    }

    public void Y(Context context) {
        this.E = true;
        h hVar = this.f2360s;
        Activity activityF = hVar == null ? null : hVar.f();
        if (activityF != null) {
            this.E = false;
            X(activityF);
        }
    }

    void Y0() {
        this.f2361t.e0();
        if (this.G != null) {
            this.f2345g0.b(d.a.ON_STOP);
        }
        this.f2343f0.h(d.a.ON_STOP);
        this.f2332a = 2;
        this.E = false;
        z0();
        if (this.E) {
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStop()");
    }

    public void Z(Fragment fragment) {
    }

    public final androidx.fragment.app.d Z0() {
        androidx.fragment.app.d dVarK = k();
        if (dVarK != null) {
            return dVarK;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.d a() {
        return this.f2343f0;
    }

    public boolean a0(MenuItem menuItem) {
        return false;
    }

    public final Context a1() {
        Context contextQ = q();
        if (contextQ != null) {
            return contextQ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void b0(Bundle bundle) {
        this.E = true;
        d1(bundle);
        if (this.f2361t.F0(1)) {
            return;
        }
        this.f2361t.A();
    }

    public final i b1() {
        i iVarW = w();
        if (iVarW != null) {
            return iVarW;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Animation c0(int i8, boolean z7, int i9) {
        return null;
    }

    public final View c1() {
        View viewL = L();
        if (viewL != null) {
            return viewL;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Animator d0(int i8, boolean z7, int i9) {
        return null;
    }

    void d1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f2361t.b1(parcelable);
        this.f2361t.A();
    }

    @Override // androidx.lifecycle.a0
    public z e() {
        j jVar = this.f2359r;
        if (jVar != null) {
            return jVar.z0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void e0(Menu menu, MenuInflater menuInflater) {
    }

    final void e1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2336c;
        if (sparseArray != null) {
            this.H.restoreHierarchyState(sparseArray);
            this.f2336c = null;
        }
        this.E = false;
        B0(bundle);
        if (this.E) {
            if (this.G != null) {
                this.f2345g0.b(d.a.ON_CREATE);
            }
        } else {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    void f() {
        d dVar = this.X;
        f fVar = null;
        if (dVar != null) {
            dVar.f2386o = false;
            f fVar2 = dVar.f2387p;
            dVar.f2387p = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.b();
        }
    }

    public View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = this.f2351j0;
        if (i8 != 0) {
            return layoutInflater.inflate(i8, viewGroup, false);
        }
        return null;
    }

    void f1(View view) {
        i().f2372a = view;
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2363v));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2364w));
        printWriter.print(" mTag=");
        printWriter.println(this.f2365x);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2332a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2340e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2358q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2352k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2353l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2354m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2355n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2366y);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2367z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.D);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.C);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.W);
        if (this.f2359r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2359r);
        }
        if (this.f2360s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2360s);
        }
        if (this.f2362u != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2362u);
        }
        if (this.f2342f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2342f);
        }
        if (this.f2334b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2334b);
        }
        if (this.f2336c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2336c);
        }
        Fragment fragmentK = K();
        if (fragmentK != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentK);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2348i);
        }
        if (z() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(z());
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.G);
        }
        if (n() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(n());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(J());
        }
        if (q() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2361t + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        this.f2361t.b(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void g0() {
        this.E = true;
    }

    void g1(Animator animator) {
        i().f2373b = animator;
    }

    public void h0() {
    }

    public void h1(Bundle bundle) {
        if (this.f2359r != null && T()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2342f = bundle;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i0() {
        this.E = true;
    }

    void i1(boolean z7) {
        i().f2388q = z7;
    }

    Fragment j(String str) {
        return str.equals(this.f2340e) ? this : this.f2361t.p0(str);
    }

    public void j0() {
        this.E = true;
    }

    void j1(int i8) {
        if (this.X == null && i8 == 0) {
            return;
        }
        i().f2375d = i8;
    }

    public final androidx.fragment.app.d k() {
        h hVar = this.f2360s;
        if (hVar == null) {
            return null;
        }
        return (androidx.fragment.app.d) hVar.f();
    }

    public LayoutInflater k0(Bundle bundle) {
        return y(bundle);
    }

    void k1(int i8, int i9) {
        if (this.X == null && i8 == 0 && i9 == 0) {
            return;
        }
        i();
        d dVar = this.X;
        dVar.f2376e = i8;
        dVar.f2377f = i9;
    }

    public boolean l() {
        Boolean bool;
        d dVar = this.X;
        if (dVar == null || (bool = dVar.f2385n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void l0(boolean z7) {
    }

    void l1(f fVar) {
        i();
        d dVar = this.X;
        f fVar2 = dVar.f2387p;
        if (fVar == fVar2) {
            return;
        }
        if (fVar != null && fVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (dVar.f2386o) {
            dVar.f2387p = fVar;
        }
        if (fVar != null) {
            fVar.a();
        }
    }

    public boolean m() {
        Boolean bool;
        d dVar = this.X;
        if (dVar == null || (bool = dVar.f2384m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void m0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
    }

    void m1(int i8) {
        i().f2374c = i8;
    }

    View n() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f2372a;
    }

    public void n0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.E = true;
        h hVar = this.f2360s;
        Activity activityF = hVar == null ? null : hVar.f();
        if (activityF != null) {
            this.E = false;
            m0(activityF, attributeSet, bundle);
        }
    }

    public void n1(@SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        h hVar = this.f2360s;
        if (hVar != null) {
            hVar.q(this, intent, i8, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    Animator o() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f2373b;
    }

    public void o0(boolean z7) {
    }

    public void o1() {
        j jVar = this.f2359r;
        if (jVar == null || jVar.f2453q == null) {
            i().f2386o = false;
        } else if (Looper.myLooper() != this.f2359r.f2453q.i().getLooper()) {
            this.f2359r.f2453q.i().postAtFrontOfQueue(new b());
        } else {
            f();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.E = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Z0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.E = true;
    }

    public final i p() {
        if (this.f2360s != null) {
            return this.f2361t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public boolean p0(MenuItem menuItem) {
        return false;
    }

    public Context q() {
        h hVar = this.f2360s;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public void q0(Menu menu) {
    }

    public Object r() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f2378g;
    }

    public void r0() {
        this.E = true;
    }

    r0 s() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void s0(boolean z7) {
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i8) {
        n1(intent, i8, null);
    }

    public Object t() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        return dVar.f2380i;
    }

    public void t0(Menu menu) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        androidx.core.util.b.a(this, sb);
        sb.append(" (");
        sb.append(this.f2340e);
        sb.append(")");
        if (this.f2363v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2363v));
        }
        if (this.f2365x != null) {
            sb.append(" ");
            sb.append(this.f2365x);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // p0.d
    public final androidx.savedstate.a u() {
        return this.f2349i0.b();
    }

    public void u0(boolean z7) {
    }

    r0 v() {
        d dVar = this.X;
        if (dVar == null) {
            return null;
        }
        dVar.getClass();
        return null;
    }

    public void v0(int i8, String[] strArr, int[] iArr) {
    }

    public final i w() {
        return this.f2359r;
    }

    public void w0() {
        this.E = true;
    }

    public final Object x() {
        h hVar = this.f2360s;
        if (hVar == null) {
            return null;
        }
        return hVar.l();
    }

    public void x0(Bundle bundle) {
    }

    @Deprecated
    public LayoutInflater y(Bundle bundle) {
        h hVar = this.f2360s;
        if (hVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterM = hVar.m();
        androidx.core.view.f.a(layoutInflaterM, this.f2361t.x0());
        return layoutInflaterM;
    }

    public void y0() {
        this.E = true;
    }

    int z() {
        d dVar = this.X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f2375d;
    }

    public void z0() {
        this.E = true;
    }
}
