package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class k extends Drawable implements Drawable.Callback, j, i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final PorterDuff.Mode f2034g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PorterDuff.Mode f2036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f2038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f2040f;

    k(Drawable drawable) {
        this.f2038d = d();
        a(drawable);
    }

    k(m mVar, Resources resources) {
        this.f2038d = mVar;
        e(resources);
    }

    private m d() {
        return new m(this.f2038d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        m mVar = this.f2038d;
        if (mVar == null || (constantState = mVar.f2043b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        m mVar = this.f2038d;
        ColorStateList colorStateList = mVar.f2044c;
        PorterDuff.Mode mode = mVar.f2045d;
        if (colorStateList == null || mode == null) {
            this.f2037c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2037c || colorForState != this.f2035a || mode != this.f2036b) {
                setColorFilter(colorForState, mode);
                this.f2035a = colorForState;
                this.f2036b = mode;
                this.f2037c = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.j
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f2040f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2040f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            m mVar = this.f2038d;
            if (mVar != null) {
                mVar.f2043b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.j
    public final Drawable b() {
        return this.f2040f;
    }

    protected boolean c() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2040f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        m mVar = this.f2038d;
        return changingConfigurations | (mVar != null ? mVar.getChangingConfigurations() : 0) | this.f2040f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        m mVar = this.f2038d;
        if (mVar == null || !mVar.a()) {
            return null;
        }
        this.f2038d.f2042a = getChangingConfigurations();
        return this.f2038d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2040f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2040f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2040f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.e(this.f2040f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2040f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2040f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2040f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2040f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2040f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2040f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.g(this.f2040f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        m mVar;
        ColorStateList colorStateList = (!c() || (mVar = this.f2038d) == null) ? null : mVar.f2044c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2040f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2040f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2039e && super.mutate() == this) {
            this.f2038d = d();
            Drawable drawable = this.f2040f;
            if (drawable != null) {
                drawable.mutate();
            }
            m mVar = this.f2038d;
            if (mVar != null) {
                Drawable drawable2 = this.f2040f;
                mVar.f2043b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2039e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2040f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i8) {
        return a.l(this.f2040f, i8);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        return this.f2040f.setLevel(i8);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f2040f.setAlpha(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        a.i(this.f2040f, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i8) {
        this.f2040f.setChangingConfigurations(i8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2040f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        this.f2040f.setDither(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z7) {
        this.f2040f.setFilterBitmap(z7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2040f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        setTintList(ColorStateList.valueOf(i8));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2038d.f2044c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2038d.f2045d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        return super.setVisible(z7, z8) || this.f2040f.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
