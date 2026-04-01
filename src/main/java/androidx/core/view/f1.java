package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f2206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f2207b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f2208c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2209d = -1;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g1 f2210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2211b;

        a(g1 g1Var, View view) {
            this.f2210a = g1Var;
            this.f2211b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2210a.a(this.f2211b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2210a.b(this.f2211b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2210a.c(this.f2211b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    f1(View view) {
        this.f2206a = new WeakReference<>(view);
    }

    private void i(View view, g1 g1Var) {
        if (g1Var != null) {
            view.animate().setListener(new a(g1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public f1 b(float f8) {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    public void c() {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f2206a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public f1 f(long j8) {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
        return this;
    }

    public f1 g(Interpolator interpolator) {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public f1 h(g1 g1Var) {
        View view = this.f2206a.get();
        if (view != null) {
            i(view, g1Var);
        }
        return this;
    }

    public f1 j(long j8) {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().setStartDelay(j8);
        }
        return this;
    }

    public f1 k(final i1 i1Var) {
        final View view = this.f2206a.get();
        if (view != null) {
            b.a(view.animate(), i1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.e1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    i1Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public f1 m(float f8) {
        View view = this.f2206a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }
}
