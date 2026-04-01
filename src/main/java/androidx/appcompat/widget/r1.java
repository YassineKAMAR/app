package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class r1 extends Resources {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f1121b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f1122a;

    public r1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1122a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1121b;
    }

    public static boolean b() {
        a();
        return false;
    }

    final Drawable c(int i8) {
        return super.getDrawable(i8);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i8) {
        Context context = this.f1122a.get();
        return context != null ? b1.h().t(context, this, i8) : super.getDrawable(i8);
    }
}
