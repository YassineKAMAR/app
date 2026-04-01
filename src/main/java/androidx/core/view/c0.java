package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f2178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f2179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f2180c;

    private c0(View view, Runnable runnable) {
        this.f2178a = view;
        this.f2179b = view.getViewTreeObserver();
        this.f2180c = runnable;
    }

    public static c0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        c0 c0Var = new c0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(c0Var);
        view.addOnAttachStateChangeListener(c0Var);
        return c0Var;
    }

    public void b() {
        (this.f2179b.isAlive() ? this.f2179b : this.f2178a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2178a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2180c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2179b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
