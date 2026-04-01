package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.n;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class b extends f implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0043b f2945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f2947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Animator.AnimatorListener f2948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<Object> f2949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Drawable.Callback f2950g;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
            b.this.scheduleSelf(runnable, j8);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0043b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f2953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f2954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f2955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        p.a<Animator, String> f2956e;

        public C0043b(Context context, C0043b c0043b, Drawable.Callback callback, Resources resources) {
            if (c0043b != null) {
                this.f2952a = c0043b.f2952a;
                g gVar = c0043b.f2953b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    this.f2953b = (g) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    g gVar2 = (g) this.f2953b.mutate();
                    this.f2953b = gVar2;
                    gVar2.setCallback(callback);
                    this.f2953b.setBounds(c0043b.f2953b.getBounds());
                    this.f2953b.h(false);
                }
                ArrayList<Animator> arrayList = c0043b.f2955d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2955d = new ArrayList<>(size);
                    this.f2956e = new p.a<>(size);
                    for (int i8 = 0; i8 < size; i8++) {
                        Animator animator = c0043b.f2955d.get(i8);
                        Animator animatorClone = animator.clone();
                        String str = c0043b.f2956e.get(animator);
                        animatorClone.setTarget(this.f2953b.d(str));
                        this.f2955d.add(animatorClone);
                        this.f2956e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f2954c == null) {
                this.f2954c = new AnimatorSet();
            }
            this.f2954c.playTogether(this.f2955d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2952a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2957a;

        public c(Drawable.ConstantState constantState) {
            this.f2957a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2957a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2957a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f2957a.newDrawable();
            bVar.f2960a = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f2950g);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f2957a.newDrawable(resources);
            bVar.f2960a = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f2950g);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable drawableNewDrawable = this.f2957a.newDrawable(resources, theme);
            bVar.f2960a = drawableNewDrawable;
            drawableNewDrawable.setCallback(bVar.f2950g);
            return bVar;
        }
    }

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, C0043b c0043b, Resources resources) {
        this.f2947d = null;
        this.f2948e = null;
        this.f2949f = null;
        a aVar = new a();
        this.f2950g = aVar;
        this.f2946c = context;
        if (c0043b != null) {
            this.f2945b = c0043b;
        } else {
            this.f2945b = new C0043b(context, c0043b, aVar, resources);
        }
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f2945b.f2953b.d(str));
        C0043b c0043b = this.f2945b;
        if (c0043b.f2955d == null) {
            c0043b.f2955d = new ArrayList<>();
            this.f2945b.f2956e = new p.a<>();
        }
        this.f2945b.f2955d.add(animator);
        this.f2945b.f2956e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2945b.f2953b.draw(canvas);
        if (this.f2945b.f2954c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2960a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2945b.f2953b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2945b.f2952a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2960a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2945b.f2953b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2960a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f2960a.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2945b.f2953b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2945b.f2953b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getOpacity() : this.f2945b.f2953b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2937e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVarB = g.b(resources, resourceId, theme);
                        gVarB.h(false);
                        gVarB.setCallback(this.f2950g);
                        g gVar = this.f2945b.f2953b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f2945b.f2953b = gVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f2938f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2946c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f2945b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2960a;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2945b.f2953b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f2960a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2945b.f2954c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.isStateful() : this.f2945b.f2953b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2945b.f2953b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i8) {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.setLevel(i8) : this.f2945b.f2953b.setLevel(i8);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.setState(iArr) : this.f2945b.f2953b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else {
            this.f2945b.f2953b.setAlpha(i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z7);
        } else {
            this.f2945b.f2953b.setAutoMirrored(z7);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i8) {
        super.setChangingConfigurations(i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i8, PorterDuff.Mode mode) {
        super.setColorFilter(i8, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2945b.f2953b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i8, int i9, int i10, int i11) {
        super.setHotspotBounds(i8, i9, i10, i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i8);
        } else {
            this.f2945b.f2953b.setTint(i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
        } else {
            this.f2945b.f2953b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
        } else {
            this.f2945b.f2953b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f2945b.f2953b.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f2945b.f2954c.isStarted()) {
                return;
            }
            this.f2945b.f2954c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2945b.f2954c.end();
        }
    }
}
