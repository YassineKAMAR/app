package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.a0;
import androidx.lifecycle.d;
import androidx.lifecycle.z;
import com.revenuecat.purchases.common.Constants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
final class j extends androidx.fragment.app.i implements LayoutInflater.Factory2 {
    static boolean H = false;
    static final Interpolator I = new DecelerateInterpolator(2.5f);
    static final Interpolator W = new DecelerateInterpolator(1.5f);
    ArrayList<Boolean> A;
    ArrayList<Fragment> B;
    ArrayList<m> E;
    private androidx.fragment.app.l F;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<k> f2439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f2440d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f2444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<Fragment> f2445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private OnBackPressedDispatcher f2446j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f2448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList<Integer> f2449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList<i.a> f2450n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.fragment.app.h f2453q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    androidx.fragment.app.e f2454r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Fragment f2455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Fragment f2456t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f2457u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f2458v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f2459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f2460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f2461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f2462z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2441e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ArrayList<Fragment> f2442f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final HashMap<String, Fragment> f2443g = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.activity.b f2447k = new a(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList<i> f2451o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f2452p = 0;
    Bundle C = null;
    SparseArray<Parcelable> D = null;
    Runnable G = new b();

    class a extends androidx.activity.b {
        a(boolean z7) {
            super(z7);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.A0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.k0();
        }
    }

    class c implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2466b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f2466b.n() != null) {
                    c.this.f2466b.f1(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.f2466b;
                    jVar.Q0(fragment, fragment.J(), 0, 0, false);
                }
            }
        }

        c(ViewGroup viewGroup, Fragment fragment) {
            this.f2465a = viewGroup;
            this.f2466b = fragment;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2465a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2471c;

        d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2469a = viewGroup;
            this.f2470b = view;
            this.f2471c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2469a.endViewTransition(this.f2470b);
            Animator animatorO = this.f2471c.o();
            this.f2471c.g1(null);
            if (animatorO == null || this.f2469a.indexOfChild(this.f2470b) >= 0) {
                return;
            }
            j jVar = j.this;
            Fragment fragment = this.f2471c;
            jVar.Q0(fragment, fragment.J(), 0, 0, false);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2475c;

        e(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2473a = viewGroup;
            this.f2474b = view;
            this.f2475c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2473a.endViewTransition(this.f2474b);
            animator.removeListener(this);
            Fragment fragment = this.f2475c;
            View view = fragment.G;
            if (view == null || !fragment.f2366y) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class f extends androidx.fragment.app.g {
        f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            androidx.fragment.app.h hVar = j.this.f2453q;
            return hVar.b(hVar.g(), str, null);
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f2479b;

        g(Animator animator) {
            this.f2478a = null;
            this.f2479b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        g(Animation animation) {
            this.f2478a = animation;
            this.f2479b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    private static class h extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f2480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f2481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2484e;

        h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2484e = true;
            this.f2480a = viewGroup;
            this.f2481b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation) {
            this.f2484e = true;
            if (this.f2482c) {
                return !this.f2483d;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f2482c = true;
                c0.a(this.f2480a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation, float f8) {
            this.f2484e = true;
            if (this.f2482c) {
                return !this.f2483d;
            }
            if (!super.getTransformation(j8, transformation, f8)) {
                this.f2482c = true;
                c0.a(this.f2480a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2482c || !this.f2484e) {
                this.f2480a.endViewTransition(this.f2481b);
                this.f2483d = true;
            } else {
                this.f2484e = false;
                this.f2480a.post(this);
            }
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f2485a;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.j$j, reason: collision with other inner class name */
    static class C0031j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f2486a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    interface k {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class l implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f2487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f2489c;

        l(String str, int i8, int i9) {
            this.f2487a = str;
            this.f2488b = i8;
            this.f2489c = i9;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.f2456t;
            if (fragment == null || this.f2488b >= 0 || this.f2487a != null || !fragment.p().g()) {
                return j.this.U0(arrayList, arrayList2, this.f2487a, this.f2488b, this.f2489c);
            }
            return false;
        }
    }

    static class m implements Fragment.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f2491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f2492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2493c;

        m(androidx.fragment.app.a aVar, boolean z7) {
            this.f2491a = z7;
            this.f2492b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            this.f2493c++;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            int i8 = this.f2493c - 1;
            this.f2493c = i8;
            if (i8 != 0) {
                return;
            }
            this.f2492b.f2389s.g1();
        }

        public void c() {
            androidx.fragment.app.a aVar = this.f2492b;
            aVar.f2389s.u(aVar, this.f2491a, false, false);
        }

        public void d() {
            boolean z7 = this.f2493c > 0;
            j jVar = this.f2492b.f2389s;
            int size = jVar.f2442f.size();
            for (int i8 = 0; i8 < size; i8++) {
                Fragment fragment = jVar.f2442f.get(i8);
                fragment.l1(null);
                if (z7 && fragment.R()) {
                    fragment.o1();
                }
            }
            androidx.fragment.app.a aVar = this.f2492b;
            aVar.f2389s.u(aVar, this.f2491a, !z7, true);
        }

        public boolean e() {
            return this.f2493c == 0;
        }
    }

    j() {
    }

    private boolean D0(Fragment fragment) {
        return (fragment.C && fragment.D) || fragment.f2361t.r();
    }

    static g J0(float f8, float f9) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f8, f9);
        alphaAnimation.setInterpolator(W);
        alphaAnimation.setDuration(220L);
        return new g(alphaAnimation);
    }

    static g L0(float f8, float f9, float f10, float f11) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f8, f9, f8, f9, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(I);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f10, f11);
        alphaAnimation.setInterpolator(W);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void M0(p.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragmentV = bVar.v(i8);
            if (!fragmentV.f2352k) {
                View viewC1 = fragmentV.c1();
                fragmentV.f2335b0 = viewC1.getAlpha();
                viewC1.setAlpha(0.0f);
            }
        }
    }

    private boolean T0(String str, int i8, int i9) {
        k0();
        i0(true);
        Fragment fragment = this.f2456t;
        if (fragment != null && i8 < 0 && str == null && fragment.p().g()) {
            return true;
        }
        boolean zU0 = U0(this.f2462z, this.A, str, i8, i9);
        if (zU0) {
            this.f2440d = true;
            try {
                Y0(this.f2462z, this.A);
            } finally {
                t();
            }
        }
        o1();
        f0();
        q();
        return zU0;
    }

    private int V0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i9, p.b<Fragment> bVar) {
        int i10 = i9;
        for (int i11 = i9 - 1; i11 >= i8; i11--) {
            androidx.fragment.app.a aVar = arrayList.get(i11);
            boolean zBooleanValue = arrayList2.get(i11).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i11 + 1, i9)) {
                if (this.E == null) {
                    this.E = new ArrayList<>();
                }
                m mVar = new m(aVar, zBooleanValue);
                this.E.add(mVar);
                aVar.u(mVar);
                if (zBooleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i10--;
                if (i11 != i10) {
                    arrayList.remove(i11);
                    arrayList.add(i10, aVar);
                }
                i(bVar);
            }
        }
        return i10;
    }

    private void W(Fragment fragment) {
        if (fragment == null || this.f2443g.get(fragment.f2340e) != fragment) {
            return;
        }
        fragment.U0();
    }

    private void Y0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        n0(arrayList, arrayList2);
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            if (!arrayList.get(i8).f2536q) {
                if (i9 != i8) {
                    m0(arrayList, arrayList2, i9, i8);
                }
                i9 = i8 + 1;
                if (arrayList2.get(i8).booleanValue()) {
                    while (i9 < size && arrayList2.get(i9).booleanValue() && !arrayList.get(i9).f2536q) {
                        i9++;
                    }
                }
                m0(arrayList, arrayList2, i8, i9);
                i8 = i9 - 1;
            }
            i8++;
        }
        if (i9 != size) {
            m0(arrayList, arrayList2, i9, size);
        }
    }

    public static int c1(int i8) {
        if (i8 == 4097) {
            return 8194;
        }
        if (i8 != 4099) {
            return i8 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void d0(int i8) {
        try {
            this.f2440d = true;
            O0(i8, false);
            this.f2440d = false;
            k0();
        } catch (Throwable th) {
            this.f2440d = false;
            throw th;
        }
    }

    private void g0() {
        for (Fragment fragment : this.f2443g.values()) {
            if (fragment != null) {
                if (fragment.n() != null) {
                    int iJ = fragment.J();
                    View viewN = fragment.n();
                    Animation animation = viewN.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        viewN.clearAnimation();
                    }
                    fragment.f1(null);
                    Q0(fragment, iJ, 0, 0, false);
                } else if (fragment.o() != null) {
                    fragment.o().end();
                }
            }
        }
    }

    private void i(p.b<Fragment> bVar) {
        int i8 = this.f2452p;
        if (i8 < 1) {
            return;
        }
        int iMin = Math.min(i8, 3);
        int size = this.f2442f.size();
        for (int i9 = 0; i9 < size; i9++) {
            Fragment fragment = this.f2442f.get(i9);
            if (fragment.f2332a < iMin) {
                Q0(fragment, iMin, fragment.z(), fragment.A(), false);
                if (fragment.G != null && !fragment.f2366y && fragment.Z) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void i0(boolean z7) {
        if (this.f2440d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2453q == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f2453q.i().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7) {
            s();
        }
        if (this.f2462z == null) {
            this.f2462z = new ArrayList<>();
            this.A = new ArrayList<>();
        }
        this.f2440d = true;
        try {
            n0(null, null);
        } finally {
            this.f2440d = false;
        }
    }

    private static void l0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i9) {
        while (i8 < i9) {
            androidx.fragment.app.a aVar = arrayList.get(i8);
            if (arrayList2.get(i8).booleanValue()) {
                aVar.h(-1);
                aVar.m(i8 == i9 + (-1));
            } else {
                aVar.h(1);
                aVar.l();
            }
            i8++;
        }
    }

    private void m0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i8, int i9) {
        int i10;
        int i11;
        int i12 = i8;
        boolean z7 = arrayList.get(i12).f2536q;
        ArrayList<Fragment> arrayList3 = this.B;
        if (arrayList3 == null) {
            this.B = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.B.addAll(this.f2442f);
        Fragment fragmentY0 = y0();
        boolean z8 = false;
        for (int i13 = i12; i13 < i9; i13++) {
            androidx.fragment.app.a aVar = arrayList.get(i13);
            fragmentY0 = !arrayList2.get(i13).booleanValue() ? aVar.n(this.B, fragmentY0) : aVar.v(this.B, fragmentY0);
            z8 = z8 || aVar.f2527h;
        }
        this.B.clear();
        if (!z7) {
            o.B(this, arrayList, arrayList2, i8, i9, false);
        }
        l0(arrayList, arrayList2, i8, i9);
        if (z7) {
            p.b<Fragment> bVar = new p.b<>();
            i(bVar);
            int iV0 = V0(arrayList, arrayList2, i8, i9, bVar);
            M0(bVar);
            i10 = iV0;
        } else {
            i10 = i9;
        }
        if (i10 != i12 && z7) {
            o.B(this, arrayList, arrayList2, i8, i10, true);
            O0(this.f2452p, true);
        }
        while (i12 < i9) {
            androidx.fragment.app.a aVar2 = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue() && (i11 = aVar2.f2391u) >= 0) {
                s0(i11);
                aVar2.f2391u = -1;
            }
            aVar2.t();
            i12++;
        }
        if (z8) {
            a1();
        }
    }

    private void m1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
        androidx.fragment.app.h hVar = this.f2453q;
        try {
            if (hVar != null) {
                hVar.k("  ", null, printWriter, new String[0]);
            } else {
                b("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw runtimeException;
        }
    }

    private void n(Fragment fragment, g gVar, int i8) {
        View view = fragment.G;
        ViewGroup viewGroup = fragment.F;
        viewGroup.startViewTransition(view);
        fragment.m1(i8);
        if (gVar.f2478a != null) {
            h hVar = new h(gVar.f2478a, viewGroup, view);
            fragment.f1(fragment.G);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.G.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.f2479b;
        fragment.g1(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.G);
        animator.start();
    }

    private void n0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<m> arrayList3 = this.E;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i8 = 0;
        while (i8 < size) {
            m mVar = this.E.get(i8);
            if (arrayList == null || mVar.f2491a || (iIndexOf2 = arrayList.indexOf(mVar.f2492b)) == -1 || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (mVar.e() || (arrayList != null && mVar.f2492b.q(arrayList, 0, arrayList.size()))) {
                    this.E.remove(i8);
                    i8--;
                    size--;
                    if (arrayList == null || mVar.f2491a || (iIndexOf = arrayList.indexOf(mVar.f2492b)) == -1 || !arrayList2.get(iIndexOf).booleanValue()) {
                        mVar.d();
                    }
                }
                i8++;
            } else {
                this.E.remove(i8);
                i8--;
                size--;
            }
            mVar.c();
            i8++;
        }
    }

    public static int n1(int i8, boolean z7) {
        if (i8 == 4097) {
            return z7 ? 1 : 2;
        }
        if (i8 == 4099) {
            return z7 ? 5 : 6;
        }
        if (i8 != 8194) {
            return -1;
        }
        return z7 ? 3 : 4;
    }

    private void o1() {
        ArrayList<k> arrayList = this.f2439c;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f2447k.f(u0() > 0 && E0(this.f2455s));
        } else {
            this.f2447k.f(true);
        }
    }

    private void q() {
        this.f2443g.values().removeAll(Collections.singleton(null));
    }

    private Fragment q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.F;
        View view = fragment.G;
        if (viewGroup != null && view != null) {
            for (int iIndexOf = this.f2442f.indexOf(fragment) - 1; iIndexOf >= 0; iIndexOf--) {
                Fragment fragment2 = this.f2442f.get(iIndexOf);
                if (fragment2.F == viewGroup && fragment2.G != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void r0() {
        if (this.E != null) {
            while (!this.E.isEmpty()) {
                this.E.remove(0).d();
            }
        }
    }

    private void s() {
        if (G0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void t() {
        this.f2440d = false;
        this.A.clear();
        this.f2462z.clear();
    }

    private boolean t0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<k> arrayList3 = this.f2439c;
            if (arrayList3 != null && arrayList3.size() != 0) {
                int size = this.f2439c.size();
                boolean zA = false;
                for (int i8 = 0; i8 < size; i8++) {
                    zA |= this.f2439c.get(i8).a(arrayList, arrayList2);
                }
                this.f2439c.clear();
                this.f2453q.i().removeCallbacks(this.G);
                return zA;
            }
            return false;
        }
    }

    public void A() {
        this.f2458v = false;
        this.f2459w = false;
        d0(1);
    }

    void A0() {
        k0();
        if (this.f2447k.c()) {
            g();
        } else {
            this.f2446j.c();
        }
    }

    public boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f2452p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null && fragment.H0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z7 = true;
            }
        }
        if (this.f2445i != null) {
            for (int i9 = 0; i9 < this.f2445i.size(); i9++) {
                Fragment fragment2 = this.f2445i.get(i9);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.h0();
                }
            }
        }
        this.f2445i = arrayList;
        return z7;
    }

    public void B0(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.f2366y) {
            return;
        }
        fragment.f2366y = true;
        fragment.f2333a0 = true ^ fragment.f2333a0;
    }

    public void C() {
        this.f2460x = true;
        k0();
        d0(0);
        this.f2453q = null;
        this.f2454r = null;
        this.f2455s = null;
        if (this.f2446j != null) {
            this.f2447k.d();
            this.f2446j = null;
        }
    }

    public boolean C0() {
        return this.f2460x;
    }

    public void D() {
        d0(1);
    }

    public void E() {
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null) {
                fragment.N0();
            }
        }
    }

    boolean E0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.f2359r;
        return fragment == jVar.y0() && E0(jVar.f2455s);
    }

    public void F(boolean z7) {
        for (int size = this.f2442f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2442f.get(size);
            if (fragment != null) {
                fragment.O0(z7);
            }
        }
    }

    boolean F0(int i8) {
        return this.f2452p >= i8;
    }

    void G(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).G(fragment, bundle, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    public boolean G0() {
        return this.f2458v || this.f2459w;
    }

    void H(Fragment fragment, Context context, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).H(fragment, context, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    g H0(Fragment fragment, int i8, boolean z7, int i9) {
        int iN1;
        int iZ = fragment.z();
        boolean z8 = false;
        fragment.j1(0);
        ViewGroup viewGroup = fragment.F;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation animationC0 = fragment.c0(i8, z7, iZ);
        if (animationC0 != null) {
            return new g(animationC0);
        }
        Animator animatorD0 = fragment.d0(i8, z7, iZ);
        if (animatorD0 != null) {
            return new g(animatorD0);
        }
        if (iZ != 0) {
            boolean zEquals = "anim".equals(this.f2453q.g().getResources().getResourceTypeName(iZ));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.f2453q.g(), iZ);
                    if (animationLoadAnimation != null) {
                        return new g(animationLoadAnimation);
                    }
                    z8 = true;
                } catch (Resources.NotFoundException e8) {
                    throw e8;
                } catch (RuntimeException unused) {
                }
            }
            if (!z8) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.f2453q.g(), iZ);
                    if (animatorLoadAnimator != null) {
                        return new g(animatorLoadAnimator);
                    }
                } catch (RuntimeException e9) {
                    if (zEquals) {
                        throw e9;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(this.f2453q.g(), iZ);
                    if (animationLoadAnimation2 != null) {
                        return new g(animationLoadAnimation2);
                    }
                }
            }
        }
        if (i8 == 0 || (iN1 = n1(i8, z7)) < 0) {
            return null;
        }
        switch (iN1) {
            case 1:
                return L0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return L0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return L0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return L0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return J0(0.0f, 1.0f);
            case 6:
                return J0(1.0f, 0.0f);
            default:
                if (i9 == 0 && this.f2453q.o()) {
                    this.f2453q.n();
                }
                return null;
        }
    }

    void I(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).I(fragment, bundle, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void I0(Fragment fragment) {
        if (this.f2443g.get(fragment.f2340e) != null) {
            return;
        }
        this.f2443g.put(fragment.f2340e, fragment);
        if (fragment.B) {
            if (fragment.A) {
                l(fragment);
            } else {
                Z0(fragment);
            }
            fragment.B = false;
        }
        if (H) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    void J(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).J(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void K(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).K(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void K0(Fragment fragment) {
        if (this.f2443g.get(fragment.f2340e) == null) {
            return;
        }
        if (H) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
        for (Fragment fragment2 : this.f2443g.values()) {
            if (fragment2 != null && fragment.f2340e.equals(fragment2.f2346h)) {
                fragment2.f2344g = fragment;
                fragment2.f2346h = null;
            }
        }
        this.f2443g.put(fragment.f2340e, null);
        Z0(fragment);
        String str = fragment.f2346h;
        if (str != null) {
            fragment.f2344g = this.f2443g.get(str);
        }
        fragment.N();
    }

    void L(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).L(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void M(Fragment fragment, Context context, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).M(fragment, context, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void N(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).N(fragment, bundle, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void N0(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        if (!this.f2443g.containsKey(fragment.f2340e)) {
            if (H) {
                Log.v("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2452p + "since it is not added to " + this);
                return;
            }
            return;
        }
        int iMin = this.f2452p;
        if (fragment.f2353l) {
            iMin = fragment.Q() ? Math.min(iMin, 1) : Math.min(iMin, 0);
        }
        Q0(fragment, iMin, fragment.A(), fragment.B(), false);
        if (fragment.G != null) {
            Fragment fragmentQ0 = q0(fragment);
            if (fragmentQ0 != null) {
                View view = fragmentQ0.G;
                ViewGroup viewGroup = fragment.F;
                int iIndexOfChild = viewGroup.indexOfChild(view);
                int iIndexOfChild2 = viewGroup.indexOfChild(fragment.G);
                if (iIndexOfChild2 < iIndexOfChild) {
                    viewGroup.removeViewAt(iIndexOfChild2);
                    viewGroup.addView(fragment.G, iIndexOfChild);
                }
            }
            if (fragment.Z && fragment.F != null) {
                float f8 = fragment.f2335b0;
                if (f8 > 0.0f) {
                    fragment.G.setAlpha(f8);
                }
                fragment.f2335b0 = 0.0f;
                fragment.Z = false;
                g gVarH0 = H0(fragment, fragment.A(), true, fragment.B());
                if (gVarH0 != null) {
                    Animation animation = gVarH0.f2478a;
                    if (animation != null) {
                        fragment.G.startAnimation(animation);
                    } else {
                        gVarH0.f2479b.setTarget(fragment.G);
                        gVarH0.f2479b.start();
                    }
                }
            }
        }
        if (fragment.f2333a0) {
            v(fragment);
        }
    }

    void O(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).O(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void O0(int i8, boolean z7) {
        androidx.fragment.app.h hVar;
        if (this.f2453q == null && i8 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i8 != this.f2452p) {
            this.f2452p = i8;
            int size = this.f2442f.size();
            for (int i9 = 0; i9 < size; i9++) {
                N0(this.f2442f.get(i9));
            }
            for (Fragment fragment : this.f2443g.values()) {
                if (fragment != null && (fragment.f2353l || fragment.f2367z)) {
                    if (!fragment.Z) {
                        N0(fragment);
                    }
                }
            }
            l1();
            if (this.f2457u && (hVar = this.f2453q) != null && this.f2452p == 4) {
                hVar.r();
                this.f2457u = false;
            }
        }
    }

    void P(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).P(fragment, bundle, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    void P0(Fragment fragment) {
        Q0(fragment, this.f2452p, 0, 0, false);
    }

    void Q(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).Q(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void Q0(androidx.fragment.app.Fragment r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.Q0(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    void R(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).R(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    public void R0() {
        this.f2458v = false;
        this.f2459w = false;
        int size = this.f2442f.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null) {
                fragment.U();
            }
        }
    }

    void S(Fragment fragment, View view, Bundle bundle, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).S(fragment, view, bundle, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    public void S0(Fragment fragment) {
        if (fragment.I) {
            if (this.f2440d) {
                this.f2461y = true;
            } else {
                fragment.I = false;
                Q0(fragment, this.f2452p, 0, 0, false);
            }
        }
    }

    void T(Fragment fragment, boolean z7) {
        Fragment fragment2 = this.f2455s;
        if (fragment2 != null) {
            androidx.fragment.app.i iVarW = fragment2.w();
            if (iVarW instanceof j) {
                ((j) iVarW).T(fragment, true);
            }
        }
        for (i iVar : this.f2451o) {
            if (!z7 || iVar.f2485a) {
                iVar.getClass();
                throw null;
            }
        }
    }

    public boolean U(MenuItem menuItem) {
        if (this.f2452p < 1) {
            return false;
        }
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean U0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i8, int i9) {
        int i10;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2444h;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i8 < 0 && (i9 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2444h.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i8 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f2444h.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i8 >= 0 && i8 == aVar.f2391u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i9 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f2444h.get(size2);
                        if (str == null || !str.equals(aVar2.o())) {
                            if (i8 < 0 || i8 != aVar2.f2391u) {
                                break;
                            }
                        }
                    }
                }
                i10 = size2;
            } else {
                i10 = -1;
            }
            if (i10 == this.f2444h.size() - 1) {
                return false;
            }
            for (int size3 = this.f2444h.size() - 1; size3 > i10; size3--) {
                arrayList.add(this.f2444h.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void V(Menu menu) {
        if (this.f2452p < 1) {
            return;
        }
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null) {
                fragment.Q0(menu);
            }
        }
    }

    public void W0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f2359r != this) {
            m1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f2340e);
    }

    public void X() {
        d0(3);
    }

    public void X0(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f2358q);
        }
        boolean z7 = !fragment.Q();
        if (!fragment.f2367z || z7) {
            synchronized (this.f2442f) {
                this.f2442f.remove(fragment);
            }
            if (D0(fragment)) {
                this.f2457u = true;
            }
            fragment.f2352k = false;
            fragment.f2353l = true;
        }
    }

    public void Y(boolean z7) {
        for (int size = this.f2442f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2442f.get(size);
            if (fragment != null) {
                fragment.S0(z7);
            }
        }
    }

    public boolean Z(Menu menu) {
        if (this.f2452p < 1) {
            return false;
        }
        boolean z7 = false;
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null && fragment.T0(menu)) {
                z7 = true;
            }
        }
        return z7;
    }

    void Z0(Fragment fragment) {
        if (G0()) {
            if (H) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.F.l(fragment) && H) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new androidx.fragment.app.a(this);
    }

    void a0() {
        o1();
        W(this.f2456t);
    }

    void a1() {
        if (this.f2450n != null) {
            for (int i8 = 0; i8 < this.f2450n.size(); i8++) {
                this.f2450n.get(i8).onBackStackChanged();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + "    ";
        if (!this.f2443g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            for (Fragment fragment : this.f2443g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.g(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f2442f.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size5; i8++) {
                Fragment fragment2 = this.f2442f.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2445i;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i9 = 0; i9 < size4; i9++) {
                Fragment fragment3 = this.f2445i.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f2444h;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size3; i10++) {
                androidx.fragment.app.a aVar = this.f2444h.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f2448l;
            if (arrayList3 != null && (size2 = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj = (androidx.fragment.app.a) this.f2448l.get(i11);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i11);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            ArrayList<Integer> arrayList4 = this.f2449m;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f2449m.toArray()));
            }
        }
        ArrayList<k> arrayList5 = this.f2439c;
        if (arrayList5 != null && (size = arrayList5.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i12 = 0; i12 < size; i12++) {
                Object obj2 = (k) this.f2439c.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2453q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2454r);
        if (this.f2455s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2455s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2452p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2458v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2459w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2460x);
        if (this.f2457u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2457u);
        }
    }

    public void b0() {
        this.f2458v = false;
        this.f2459w = false;
        d0(4);
    }

    void b1(Parcelable parcelable) {
        androidx.fragment.app.m next;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.k kVar = (androidx.fragment.app.k) parcelable;
        if (kVar.f2494a == null) {
            return;
        }
        for (Fragment fragment : this.F.i()) {
            if (H) {
                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
            }
            Iterator<androidx.fragment.app.m> it = kVar.f2494a.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f2507b.equals(fragment.f2340e)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                if (H) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + kVar.f2494a);
                }
                Q0(fragment, 1, 0, 0, false);
                fragment.f2353l = true;
                Q0(fragment, 0, 0, 0, false);
            } else {
                next.f2519n = fragment;
                fragment.f2336c = null;
                fragment.f2358q = 0;
                fragment.f2355n = false;
                fragment.f2352k = false;
                Fragment fragment2 = fragment.f2344g;
                fragment.f2346h = fragment2 != null ? fragment2.f2340e : null;
                fragment.f2344g = null;
                Bundle bundle = next.f2518m;
                if (bundle != null) {
                    bundle.setClassLoader(this.f2453q.g().getClassLoader());
                    fragment.f2336c = next.f2518m.getSparseParcelableArray("android:view_state");
                    fragment.f2334b = next.f2518m;
                }
            }
        }
        this.f2443g.clear();
        for (androidx.fragment.app.m mVar : kVar.f2494a) {
            if (mVar != null) {
                Fragment fragmentB = mVar.b(this.f2453q.g().getClassLoader(), d());
                fragmentB.f2359r = this;
                if (H) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentB.f2340e + "): " + fragmentB);
                }
                this.f2443g.put(fragmentB.f2340e, fragmentB);
                mVar.f2519n = null;
            }
        }
        this.f2442f.clear();
        ArrayList<String> arrayList = kVar.f2495b;
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment fragment3 = this.f2443g.get(str);
                if (fragment3 == null) {
                    m1(new IllegalStateException("No instantiated fragment for (" + str + ")"));
                }
                fragment3.f2352k = true;
                if (H) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragment3);
                }
                if (this.f2442f.contains(fragment3)) {
                    throw new IllegalStateException("Already added " + fragment3);
                }
                synchronized (this.f2442f) {
                    this.f2442f.add(fragment3);
                }
            }
        }
        if (kVar.f2496c != null) {
            this.f2444h = new ArrayList<>(kVar.f2496c.length);
            int i8 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = kVar.f2496c;
                if (i8 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = bVarArr[i8].b(this);
                if (H) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + aVarB.f2391u + "): " + aVarB);
                    PrintWriter printWriter = new PrintWriter(new androidx.core.util.c("FragmentManager"));
                    aVarB.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2444h.add(aVarB);
                int i9 = aVarB.f2391u;
                if (i9 >= 0) {
                    h1(i9, aVarB);
                }
                i8++;
            }
        } else {
            this.f2444h = null;
        }
        String str2 = kVar.f2497d;
        if (str2 != null) {
            Fragment fragment4 = this.f2443g.get(str2);
            this.f2456t = fragment4;
            W(fragment4);
        }
        this.f2441e = kVar.f2498e;
    }

    @Override // androidx.fragment.app.i
    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.f2442f.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2442f.get(size);
                if (fragment != null && str.equals(fragment.f2365x)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.f2443g.values()) {
            if (fragment2 != null && str.equals(fragment2.f2365x)) {
                return fragment2;
            }
        }
        return null;
    }

    public void c0() {
        this.f2458v = false;
        this.f2459w = false;
        d0(3);
    }

    @Override // androidx.fragment.app.i
    public androidx.fragment.app.g d() {
        if (super.d() == androidx.fragment.app.i.f2437b) {
            Fragment fragment = this.f2455s;
            if (fragment != null) {
                return fragment.f2359r.d();
            }
            h(new f());
        }
        return super.d();
    }

    Parcelable d1() {
        ArrayList<String> arrayList;
        int size;
        r0();
        g0();
        k0();
        this.f2458v = true;
        androidx.fragment.app.b[] bVarArr = null;
        if (this.f2443g.isEmpty()) {
            return null;
        }
        ArrayList<androidx.fragment.app.m> arrayList2 = new ArrayList<>(this.f2443g.size());
        boolean z7 = false;
        for (Fragment fragment : this.f2443g.values()) {
            if (fragment != null) {
                if (fragment.f2359r != this) {
                    m1(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                }
                androidx.fragment.app.m mVar = new androidx.fragment.app.m(fragment);
                arrayList2.add(mVar);
                if (fragment.f2332a <= 0 || mVar.f2518m != null) {
                    mVar.f2518m = fragment.f2334b;
                } else {
                    mVar.f2518m = e1(fragment);
                    String str = fragment.f2346h;
                    if (str != null) {
                        Fragment fragment2 = this.f2443g.get(str);
                        if (fragment2 == null) {
                            m1(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f2346h));
                        }
                        if (mVar.f2518m == null) {
                            mVar.f2518m = new Bundle();
                        }
                        W0(mVar.f2518m, "android:target_state", fragment2);
                        int i8 = fragment.f2348i;
                        if (i8 != 0) {
                            mVar.f2518m.putInt("android:target_req_state", i8);
                        }
                    }
                }
                if (H) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + mVar.f2518m);
                }
                z7 = true;
            }
        }
        if (!z7) {
            if (H) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f2442f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            for (Fragment fragment3 : this.f2442f) {
                arrayList.add(fragment3.f2340e);
                if (fragment3.f2359r != this) {
                    m1(new IllegalStateException("Failure saving state: active " + fragment3 + " was removed from the FragmentManager"));
                }
                if (H) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment3.f2340e + "): " + fragment3);
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f2444h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i9 = 0; i9 < size; i9++) {
                bVarArr[i9] = new androidx.fragment.app.b(this.f2444h.get(i9));
                if (H) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i9 + ": " + this.f2444h.get(i9));
                }
            }
        }
        androidx.fragment.app.k kVar = new androidx.fragment.app.k();
        kVar.f2494a = arrayList2;
        kVar.f2495b = arrayList;
        kVar.f2496c = bVarArr;
        Fragment fragment4 = this.f2456t;
        if (fragment4 != null) {
            kVar.f2497d = fragment4.f2340e;
        }
        kVar.f2498e = this.f2441e;
        return kVar;
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> e() {
        List<Fragment> list;
        if (this.f2442f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2442f) {
            list = (List) this.f2442f.clone();
        }
        return list;
    }

    public void e0() {
        this.f2459w = true;
        d0(2);
    }

    Bundle e1(Fragment fragment) {
        if (this.C == null) {
            this.C = new Bundle();
        }
        fragment.W0(this.C);
        P(fragment, this.C, false);
        Bundle bundle = null;
        if (!this.C.isEmpty()) {
            Bundle bundle2 = this.C;
            this.C = null;
            bundle = bundle2;
        }
        if (fragment.G != null) {
            f1(fragment);
        }
        if (fragment.f2336c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f2336c);
        }
        if (!fragment.W) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.W);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public void f(int i8, int i9) {
        if (i8 >= 0) {
            h0(new l(null, i8, i9), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }

    void f0() {
        if (this.f2461y) {
            this.f2461y = false;
            l1();
        }
    }

    void f1(Fragment fragment) {
        if (fragment.H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.D;
        if (sparseArray == null) {
            this.D = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.H.saveHierarchyState(this.D);
        if (this.D.size() > 0) {
            fragment.f2336c = this.D;
            this.D = null;
        }
    }

    @Override // androidx.fragment.app.i
    public boolean g() {
        s();
        return T0(null, -1, 0);
    }

    void g1() {
        synchronized (this) {
            ArrayList<m> arrayList = this.E;
            boolean z7 = false;
            boolean z8 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            ArrayList<k> arrayList2 = this.f2439c;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z7 = true;
            }
            if (z8 || z7) {
                this.f2453q.i().removeCallbacks(this.G);
                this.f2453q.i().post(this.G);
                o1();
            }
        }
    }

    public void h0(k kVar, boolean z7) {
        if (!z7) {
            s();
        }
        synchronized (this) {
            if (!this.f2460x && this.f2453q != null) {
                if (this.f2439c == null) {
                    this.f2439c = new ArrayList<>();
                }
                this.f2439c.add(kVar);
                g1();
                return;
            }
            if (!z7) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void h1(int i8, androidx.fragment.app.a aVar) {
        synchronized (this) {
            if (this.f2448l == null) {
                this.f2448l = new ArrayList<>();
            }
            int size = this.f2448l.size();
            if (i8 < size) {
                if (H) {
                    Log.v("FragmentManager", "Setting back stack index " + i8 + " to " + aVar);
                }
                this.f2448l.set(i8, aVar);
            } else {
                while (size < i8) {
                    this.f2448l.add(null);
                    if (this.f2449m == null) {
                        this.f2449m = new ArrayList<>();
                    }
                    if (H) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f2449m.add(Integer.valueOf(size));
                    size++;
                }
                if (H) {
                    Log.v("FragmentManager", "Adding back stack index " + i8 + " with " + aVar);
                }
                this.f2448l.add(aVar);
            }
        }
    }

    public void i1(Fragment fragment, d.b bVar) {
        if (this.f2443g.get(fragment.f2340e) == fragment && (fragment.f2360s == null || fragment.w() == this)) {
            fragment.f2341e0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void j(androidx.fragment.app.a aVar) {
        if (this.f2444h == null) {
            this.f2444h = new ArrayList<>();
        }
        this.f2444h.add(aVar);
    }

    void j0(Fragment fragment) {
        if (!fragment.f2354m || fragment.f2357p) {
            return;
        }
        fragment.I0(fragment.M0(fragment.f2334b), null, fragment.f2334b);
        View view = fragment.G;
        if (view == null) {
            fragment.H = null;
            return;
        }
        fragment.H = view;
        view.setSaveFromParentEnabled(false);
        if (fragment.f2366y) {
            fragment.G.setVisibility(8);
        }
        fragment.A0(fragment.G, fragment.f2334b);
        S(fragment, fragment.G, fragment.f2334b, false);
    }

    public void j1(Fragment fragment) {
        if (fragment == null || (this.f2443g.get(fragment.f2340e) == fragment && (fragment.f2360s == null || fragment.w() == this))) {
            Fragment fragment2 = this.f2456t;
            this.f2456t = fragment;
            W(fragment2);
            W(this.f2456t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void k(Fragment fragment, boolean z7) {
        if (H) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        I0(fragment);
        if (fragment.f2367z) {
            return;
        }
        if (this.f2442f.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2442f) {
            this.f2442f.add(fragment);
        }
        fragment.f2352k = true;
        fragment.f2353l = false;
        if (fragment.G == null) {
            fragment.f2333a0 = false;
        }
        if (D0(fragment)) {
            this.f2457u = true;
        }
        if (z7) {
            P0(fragment);
        }
    }

    public boolean k0() {
        i0(true);
        boolean z7 = false;
        while (t0(this.f2462z, this.A)) {
            this.f2440d = true;
            try {
                Y0(this.f2462z, this.A);
                t();
                z7 = true;
            } catch (Throwable th) {
                t();
                throw th;
            }
        }
        o1();
        f0();
        q();
        return z7;
    }

    public void k1(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f2366y) {
            fragment.f2366y = false;
            fragment.f2333a0 = !fragment.f2333a0;
        }
    }

    void l(Fragment fragment) {
        if (G0()) {
            if (H) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.F.e(fragment) && H) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    void l1() {
        for (Fragment fragment : this.f2443g.values()) {
            if (fragment != null) {
                S0(fragment);
            }
        }
    }

    public int m(androidx.fragment.app.a aVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f2449m;
            if (arrayList != null && arrayList.size() > 0) {
                int iIntValue = this.f2449m.remove(r0.size() - 1).intValue();
                if (H) {
                    Log.v("FragmentManager", "Adding back stack index " + iIntValue + " with " + aVar);
                }
                this.f2448l.set(iIntValue, aVar);
                return iIntValue;
            }
            if (this.f2448l == null) {
                this.f2448l = new ArrayList<>();
            }
            int size = this.f2448l.size();
            if (H) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + aVar);
            }
            this.f2448l.add(aVar);
            return size;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(androidx.fragment.app.h hVar, androidx.fragment.app.e eVar, Fragment fragment) {
        if (this.f2453q != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2453q = hVar;
        this.f2454r = eVar;
        this.f2455s = fragment;
        if (fragment != null) {
            o1();
        }
        if (hVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) hVar;
            OnBackPressedDispatcher onBackPressedDispatcherH = cVar.h();
            this.f2446j = onBackPressedDispatcherH;
            androidx.lifecycle.i iVar = cVar;
            if (fragment != null) {
                iVar = fragment;
            }
            onBackPressedDispatcherH.a(iVar, this.f2447k);
        }
        this.F = fragment != null ? fragment.f2359r.v0(fragment) : hVar instanceof a0 ? androidx.fragment.app.l.h(((a0) hVar).e()) : new androidx.fragment.app.l(false);
    }

    public Fragment o0(int i8) {
        for (int size = this.f2442f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2442f.get(size);
            if (fragment != null && fragment.f2363v == i8) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f2443g.values()) {
            if (fragment2 != null && fragment2.f2363v == i8) {
                return fragment2;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0031j.f2486a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (str2 == null || !androidx.fragment.app.g.b(context.getClassLoader(), str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        Fragment fragmentO0 = resourceId != -1 ? o0(resourceId) : null;
        if (fragmentO0 == null && string != null) {
            fragmentO0 = c(string);
        }
        if (fragmentO0 == null && id != -1) {
            fragmentO0 = o0(id);
        }
        if (H) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + fragmentO0);
        }
        if (fragmentO0 == null) {
            fragmentO0 = d().a(context.getClassLoader(), str2);
            fragmentO0.f2354m = true;
            fragmentO0.f2363v = resourceId != 0 ? resourceId : id;
            fragmentO0.f2364w = id;
            fragmentO0.f2365x = string;
            fragmentO0.f2355n = true;
            fragmentO0.f2359r = this;
            androidx.fragment.app.h hVar = this.f2453q;
            fragmentO0.f2360s = hVar;
            fragmentO0.n0(hVar.g(), attributeSet, fragmentO0.f2334b);
            k(fragmentO0, true);
        } else {
            if (fragmentO0.f2355n) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            fragmentO0.f2355n = true;
            androidx.fragment.app.h hVar2 = this.f2453q;
            fragmentO0.f2360s = hVar2;
            fragmentO0.n0(hVar2.g(), attributeSet, fragmentO0.f2334b);
        }
        Fragment fragment = fragmentO0;
        if (this.f2452p >= 1 || !fragment.f2354m) {
            P0(fragment);
        } else {
            Q0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.G;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.G.getTag() == null) {
                fragment.G.setTag(string);
            }
            return fragment.G;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void p(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f2367z) {
            fragment.f2367z = false;
            if (fragment.f2352k) {
                return;
            }
            if (this.f2442f.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            if (H) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            synchronized (this.f2442f) {
                this.f2442f.add(fragment);
            }
            fragment.f2352k = true;
            if (D0(fragment)) {
                this.f2457u = true;
            }
        }
    }

    public Fragment p0(String str) {
        Fragment fragmentJ;
        for (Fragment fragment : this.f2443g.values()) {
            if (fragment != null && (fragmentJ = fragment.j(str)) != null) {
                return fragmentJ;
            }
        }
        return null;
    }

    boolean r() {
        boolean zD0 = false;
        for (Fragment fragment : this.f2443g.values()) {
            if (fragment != null) {
                zD0 = D0(fragment);
            }
            if (zD0) {
                return true;
            }
        }
        return false;
    }

    public void s0(int i8) {
        synchronized (this) {
            this.f2448l.set(i8, null);
            if (this.f2449m == null) {
                this.f2449m = new ArrayList<>();
            }
            if (H) {
                Log.v("FragmentManager", "Freeing back stack index " + i8);
            }
            this.f2449m.add(Integer.valueOf(i8));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f2455s;
        if (obj == null) {
            obj = this.f2453q;
        }
        androidx.core.util.b.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    void u(androidx.fragment.app.a aVar, boolean z7, boolean z8, boolean z9) {
        if (z7) {
            aVar.m(z9);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z7));
        if (z8) {
            o.B(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z9) {
            O0(this.f2452p, true);
        }
        for (Fragment fragment : this.f2443g.values()) {
            if (fragment != null && fragment.G != null && fragment.Z && aVar.p(fragment.f2364w)) {
                float f8 = fragment.f2335b0;
                if (f8 > 0.0f) {
                    fragment.G.setAlpha(f8);
                }
                if (z9) {
                    fragment.f2335b0 = 0.0f;
                } else {
                    fragment.f2335b0 = -1.0f;
                    fragment.Z = false;
                }
            }
        }
    }

    public int u0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f2444h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void v(Fragment fragment) {
        Animator animator;
        if (fragment.G != null) {
            g gVarH0 = H0(fragment, fragment.A(), !fragment.f2366y, fragment.B());
            if (gVarH0 == null || (animator = gVarH0.f2479b) == null) {
                if (gVarH0 != null) {
                    fragment.G.startAnimation(gVarH0.f2478a);
                    gVarH0.f2478a.start();
                }
                fragment.G.setVisibility((!fragment.f2366y || fragment.P()) ? 0 : 8);
                if (fragment.P()) {
                    fragment.i1(false);
                }
            } else {
                animator.setTarget(fragment.G);
                if (!fragment.f2366y) {
                    fragment.G.setVisibility(0);
                } else if (fragment.P()) {
                    fragment.i1(false);
                } else {
                    ViewGroup viewGroup = fragment.F;
                    View view = fragment.G;
                    viewGroup.startViewTransition(view);
                    gVarH0.f2479b.addListener(new e(viewGroup, view, fragment));
                }
                gVarH0.f2479b.start();
            }
        }
        if (fragment.f2352k && D0(fragment)) {
            this.f2457u = true;
        }
        fragment.f2333a0 = false;
        fragment.l0(fragment.f2366y);
    }

    androidx.fragment.app.l v0(Fragment fragment) {
        return this.F.g(fragment);
    }

    public void w(Fragment fragment) {
        if (H) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.f2367z) {
            return;
        }
        fragment.f2367z = true;
        if (fragment.f2352k) {
            if (H) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            synchronized (this.f2442f) {
                this.f2442f.remove(fragment);
            }
            if (D0(fragment)) {
                this.f2457u = true;
            }
            fragment.f2352k = false;
        }
    }

    public Fragment w0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.f2443g.get(string);
        if (fragment == null) {
            m1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragment;
    }

    public void x() {
        this.f2458v = false;
        this.f2459w = false;
        d0(2);
    }

    LayoutInflater.Factory2 x0() {
        return this;
    }

    public void y(Configuration configuration) {
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null) {
                fragment.E0(configuration);
            }
        }
    }

    public Fragment y0() {
        return this.f2456t;
    }

    public boolean z(MenuItem menuItem) {
        if (this.f2452p < 1) {
            return false;
        }
        for (int i8 = 0; i8 < this.f2442f.size(); i8++) {
            Fragment fragment = this.f2442f.get(i8);
            if (fragment != null && fragment.F0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    z z0(Fragment fragment) {
        return this.F.j(fragment);
    }
}
