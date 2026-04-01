package h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.b1;
import androidx.core.content.res.n;
import androidx.core.graphics.drawable.i;
import h.c;
import h.e;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public class a extends h.e implements i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f22078t = a.class.getSimpleName();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c f22079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g f22080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f22081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f22082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22083s;

    private static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animatable f22084a;

        b(Animatable animatable) {
            super();
            this.f22084a = animatable;
        }

        @Override // h.a.g
        public void c() {
            this.f22084a.start();
        }

        @Override // h.a.g
        public void d() {
            this.f22084a.stop();
        }
    }

    static class c extends e.a {
        p.e<Long> K;
        p.i<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            p.i<Integer> iVar;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                iVar = cVar.L;
            } else {
                this.K = new p.e<>();
                iVar = new p.i<>();
            }
            this.L = iVar;
        }

        private static long D(int i8, int i9) {
            return ((long) i9) | (((long) i8) << 32);
        }

        int B(int[] iArr, Drawable drawable, int i8) {
            int iZ = super.z(iArr, drawable);
            this.L.p(iZ, Integer.valueOf(i8));
            return iZ;
        }

        int C(int i8, int i9, Drawable drawable, boolean z7) {
            int iA = super.a(drawable);
            long jD = D(i8, i9);
            long j8 = z7 ? 8589934592L : 0L;
            long j9 = iA;
            this.K.c(jD, Long.valueOf(j9 | j8));
            if (z7) {
                this.K.c(D(i9, i8), Long.valueOf(4294967296L | j9 | j8));
            }
            return iA;
        }

        int E(int i8) {
            if (i8 < 0) {
                return 0;
            }
            return this.L.l(i8, 0).intValue();
        }

        int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        int G(int i8, int i9) {
            return (int) this.K.l(D(i8, i9), -1L).longValue();
        }

        boolean H(int i8, int i9) {
            return (this.K.l(D(i8, i9), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i8, int i9) {
            return (this.K.l(D(i8, i9), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // h.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // h.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override // h.e.a, h.c.AbstractC0115c
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f22085a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f22085a = bVar;
        }

        @Override // h.a.g
        public void c() {
            this.f22085a.start();
        }

        @Override // h.a.g
        public void d() {
            this.f22085a.stop();
        }
    }

    private static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f22086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22087b;

        e(AnimationDrawable animationDrawable, boolean z7, boolean z8) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i8 = z7 ? numberOfFrames - 1 : 0;
            int i9 = z7 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z7);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i8, i9);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f22087b = z8;
            this.f22086a = objectAnimatorOfInt;
        }

        @Override // h.a.g
        public boolean a() {
            return this.f22087b;
        }

        @Override // h.a.g
        public void b() {
            this.f22086a.reverse();
        }

        @Override // h.a.g
        public void c() {
            this.f22086a.start();
        }

        @Override // h.a.g
        public void d() {
            this.f22086a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f22088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f22090c;

        f(AnimationDrawable animationDrawable, boolean z7) {
            b(animationDrawable, z7);
        }

        int a() {
            return this.f22090c;
        }

        int b(AnimationDrawable animationDrawable, boolean z7) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f22089b = numberOfFrames;
            int[] iArr = this.f22088a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f22088a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f22088a;
            int i8 = 0;
            for (int i9 = 0; i9 < numberOfFrames; i9++) {
                int duration = animationDrawable.getDuration(z7 ? (numberOfFrames - i9) - 1 : i9);
                iArr2[i9] = duration;
                i8 += duration;
            }
            this.f22090c = i8;
            return i8;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            int i8 = (int) ((f8 * this.f22090c) + 0.5f);
            int i9 = this.f22089b;
            int[] iArr = this.f22088a;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = iArr[i10];
                if (i8 < i11) {
                    break;
                }
                i8 -= i11;
                i10++;
            }
            return (i10 / i9) + (i10 < i9 ? i8 / this.f22090c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f22081q = -1;
        this.f22082r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = n.k(resources, theme, attributeSet, i.b.f22462h);
        int resourceId = typedArrayK.getResourceId(i.b.f22463i, 0);
        int resourceId2 = typedArrayK.getResourceId(i.b.f22464j, -1);
        Drawable drawableJ = resourceId2 > 0 ? b1.h().j(context, resourceId2) : null;
        typedArrayK.recycle();
        int[] iArrK = k(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.g.c(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.f22079o.B(iArrK, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = n.k(resources, theme, attributeSet, i.b.f22465k);
        int resourceId = typedArrayK.getResourceId(i.b.f22468n, -1);
        int resourceId2 = typedArrayK.getResourceId(i.b.f22467m, -1);
        int resourceId3 = typedArrayK.getResourceId(i.b.f22466l, -1);
        Drawable drawableJ = resourceId3 > 0 ? b1.h().j(context, resourceId3) : null;
        boolean z7 = typedArrayK.getBoolean(i.b.f22469o, false);
        typedArrayK.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f22079o.C(resourceId, resourceId2, drawableJ, z7);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean s(int i8) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.f22080p;
        if (gVar == null) {
            iC = c();
        } else {
            if (i8 == this.f22081q) {
                return true;
            }
            if (i8 == this.f22082r && gVar.a()) {
                gVar.b();
                this.f22081q = this.f22082r;
                this.f22082r = i8;
                return true;
            }
            iC = this.f22081q;
            gVar.d();
        }
        this.f22080p = null;
        this.f22082r = -1;
        this.f22081q = -1;
        c cVar = this.f22079o;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i8);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        }
        bVar.c();
        this.f22080p = bVar;
        this.f22082r = iC;
        this.f22081q = i8;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f22079o;
        cVar.f22108d |= typedArray.getChangingConfigurations();
        cVar.x(typedArray.getBoolean(i.b.f22458d, cVar.f22113i));
        cVar.t(typedArray.getBoolean(i.b.f22459e, cVar.f22116l));
        cVar.u(typedArray.getInt(i.b.f22460f, cVar.A));
        cVar.v(typedArray.getInt(i.b.f22461g, cVar.B));
        setDither(typedArray.getBoolean(i.b.f22456b, cVar.f22128x));
    }

    @Override // h.e, h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // h.e, h.c
    void h(c.AbstractC0115c abstractC0115c) {
        super.h(abstractC0115c);
        if (abstractC0115c instanceof c) {
            this.f22079o = (c) abstractC0115c;
        }
    }

    @Override // h.c, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // h.e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f22080p;
        if (gVar != null) {
            gVar.d();
            this.f22080p = null;
            g(this.f22081q);
            this.f22081q = -1;
            this.f22082r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h.e
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f22079o, this, null);
    }

    @Override // h.e, h.c, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f22083s && super.mutate() == this) {
            this.f22079o.r();
            this.f22083s = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayK = n.k(resources, theme, attributeSet, i.b.f22455a);
        setVisible(typedArrayK.getBoolean(i.b.f22457c, true), true);
        t(typedArrayK);
        i(resources);
        typedArrayK.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i8) {
        return super.onLayoutDirectionChanged(i8);
    }

    @Override // h.e, h.c, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iF = this.f22079o.F(iArr);
        boolean z7 = iF != c() && (s(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? z7 | current.setState(iArr) : z7;
    }

    @Override // h.c, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        super.scheduleDrawable(drawable, runnable, j8);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i8) {
        super.setAlpha(i8);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z7) {
        super.setAutoMirrored(z7);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z7) {
        super.setDither(z7);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i8, int i9, int i10, int i11) {
        super.setHotspotBounds(i8, i9, i10, i11);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        g gVar = this.f22080p;
        if (gVar != null && (visible || z8)) {
            if (z7) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // h.c, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
