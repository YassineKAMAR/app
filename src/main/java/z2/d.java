package z2;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27696a;

    public d(Activity activity) {
        a3.o.k(activity, "Activity must not be null");
        this.f27696a = activity;
    }

    public final Activity a() {
        return (Activity) this.f27696a;
    }

    public final androidx.fragment.app.d b() {
        return (androidx.fragment.app.d) this.f27696a;
    }

    public final boolean c() {
        return this.f27696a instanceof Activity;
    }

    public final boolean d() {
        return this.f27696a instanceof androidx.fragment.app.d;
    }
}
