package j2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.rh0;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f24048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f24049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f24050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f24053f;

    public t1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f24049b = activity;
        this.f24048a = view;
        this.f24053f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.f24050c) {
            return;
        }
        Activity activity = this.f24049b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f24053f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f24048a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f24053f;
        g2.t.z();
        rh0.a(view, onGlobalLayoutListener2);
        this.f24050c = true;
    }

    private final void h() {
        Activity activity = this.f24049b;
        if (activity != null && this.f24050c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f24053f;
            ViewTreeObserver viewTreeObserverF = f(activity);
            if (viewTreeObserverF != null) {
                viewTreeObserverF.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f24050c = false;
        }
    }

    public final void a() {
        this.f24052e = false;
        h();
    }

    public final void b() {
        this.f24052e = true;
        if (this.f24051d) {
            g();
        }
    }

    public final void c() {
        this.f24051d = true;
        if (this.f24052e) {
            g();
        }
    }

    public final void d() {
        this.f24051d = false;
        h();
    }

    public final void e(Activity activity) {
        this.f24049b = activity;
    }
}
