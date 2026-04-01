package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class l extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Method f2041h;

    l(Drawable drawable) {
        super(drawable);
        g();
    }

    l(m mVar, Resources resources) {
        super(mVar, resources);
        g();
    }

    private void g() {
        if (f2041h == null) {
            try {
                f2041h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e8) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e8);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.k
    protected boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2040f;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2040f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2040f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2040f;
        if (drawable != null && (method = f2041h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e8) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e8);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f8, float f9) {
        this.f2040f.setHotspot(f8, f9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i8, int i9, int i10, int i11) {
        this.f2040f.setHotspotBounds(i8, i9, i10, i11);
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public void setTint(int i8) {
        if (c()) {
            super.setTint(i8);
        } else {
            this.f2040f.setTint(i8);
        }
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2040f.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.k, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f2040f.setTintMode(mode);
        }
    }
}
