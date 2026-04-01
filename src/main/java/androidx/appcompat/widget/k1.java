package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class k1 extends c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f1008b;

    public k1(Context context, Resources resources) {
        super(resources);
        this.f1008b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.c1, android.content.res.Resources
    public Drawable getDrawable(int i8) {
        Drawable drawable = super.getDrawable(i8);
        Context context = this.f1008b.get();
        if (drawable != null && context != null) {
            b1.h().x(context, i8, drawable);
        }
        return drawable;
    }
}
