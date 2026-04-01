package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b1 f840i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakHashMap<Context, p.i<ColorStateList>> f842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p.h<String, d> f843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p.i<String> f844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Context, p.e<WeakReference<Drawable.ConstantState>>> f845d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f839h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c f841j = new c(6);

    static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.b1.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e8);
                return null;
            }
        }
    }

    private static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.b1.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e8);
                return null;
            }
        }
    }

    private static class c extends p.f<Integer, PorterDuffColorFilter> {
        public c(int i8) {
            super(i8);
        }

        private static int j(int i8, PorterDuff.Mode mode) {
            return ((i8 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i8, PorterDuff.Mode mode) {
            return c(Integer.valueOf(j(i8, mode)));
        }

        PorterDuffColorFilter l(int i8, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return d(Integer.valueOf(j(i8, mode)), porterDuffColorFilter);
        }
    }

    private interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    interface e {
        boolean a(Context context, int i8, Drawable drawable);

        PorterDuff.Mode b(int i8);

        Drawable c(b1 b1Var, Context context, int i8);

        ColorStateList d(Context context, int i8);

        boolean e(Context context, int i8, Drawable drawable);
    }

    private static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.b1.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.g.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e8);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.f843b == null) {
            this.f843b = new p.h<>();
        }
        this.f843b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j8, Drawable drawable) {
        boolean z7;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            p.e<WeakReference<Drawable.ConstantState>> eVar = this.f845d.get(context);
            if (eVar == null) {
                eVar = new p.e<>();
                this.f845d.put(context, eVar);
            }
            eVar.o(j8, new WeakReference<>(constantState));
            z7 = true;
        } else {
            z7 = false;
        }
        return z7;
    }

    private void c(Context context, int i8, ColorStateList colorStateList) {
        if (this.f842a == null) {
            this.f842a = new WeakHashMap<>();
        }
        p.i<ColorStateList> iVar = this.f842a.get(context);
        if (iVar == null) {
            iVar = new p.i<>();
            this.f842a.put(context, iVar);
        }
        iVar.c(i8, colorStateList);
    }

    private void d(Context context) {
        if (this.f847f) {
            return;
        }
        this.f847f = true;
        Drawable drawableJ = j(context, i.a.f22454a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f847f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i8) {
        if (this.f846e == null) {
            this.f846e = new TypedValue();
        }
        TypedValue typedValue = this.f846e;
        context.getResources().getValue(i8, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        e eVar = this.f848g;
        Drawable drawableC = eVar == null ? null : eVar.c(this, context, i8);
        if (drawableC != null) {
            drawableC.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableC);
        }
        return drawableC;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized b1 h() {
        if (f840i == null) {
            b1 b1Var = new b1();
            f840i = b1Var;
            p(b1Var);
        }
        return f840i;
    }

    private synchronized Drawable i(Context context, long j8) {
        p.e<WeakReference<Drawable.ConstantState>> eVar = this.f845d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceK = eVar.k(j8);
        if (weakReferenceK != null) {
            Drawable.ConstantState constantState = weakReferenceK.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.p(j8);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterK;
        c cVar = f841j;
        porterDuffColorFilterK = cVar.k(i8, mode);
        if (porterDuffColorFilterK == null) {
            porterDuffColorFilterK = new PorterDuffColorFilter(i8, mode);
            cVar.l(i8, mode, porterDuffColorFilterK);
        }
        return porterDuffColorFilterK;
    }

    private ColorStateList n(Context context, int i8) {
        p.i<ColorStateList> iVar;
        WeakHashMap<Context, p.i<ColorStateList>> weakHashMap = this.f842a;
        if (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return iVar.k(i8);
    }

    private static void p(b1 b1Var) {
        if (Build.VERSION.SDK_INT < 24) {
            b1Var.a("vector", new f());
            b1Var.a("animated-vector", new b());
            b1Var.a("animated-selector", new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.g) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i8) {
        int next;
        p.h<String, d> hVar = this.f843b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        p.i<String> iVar = this.f844c;
        if (iVar != null) {
            String strK = iVar.k(i8);
            if ("appcompat_skip_skip".equals(strK) || (strK != null && this.f843b.get(strK) == null)) {
                return null;
            }
        } else {
            this.f844c = new p.i<>();
        }
        if (this.f846e == null) {
            this.f846e = new TypedValue();
        }
        TypedValue typedValue = this.f846e;
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i8);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f844c.c(i8, name);
                d dVar = this.f843b.get(name);
                if (dVar != null) {
                    drawableI = dVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e8) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e8);
            }
        }
        if (drawableI == null) {
            this.f844c.c(i8, "appcompat_skip_skip");
        }
        return drawableI;
    }

    private Drawable v(Context context, int i8, boolean z7, Drawable drawable) {
        ColorStateList colorStateListM = m(context, i8);
        if (colorStateListM == null) {
            e eVar = this.f848g;
            if ((eVar == null || !eVar.e(context, i8, drawable)) && !x(context, i8, drawable) && z7) {
                return null;
            }
            return drawable;
        }
        if (n0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable drawableP = androidx.core.graphics.drawable.a.p(drawable);
        androidx.core.graphics.drawable.a.n(drawableP, colorStateListM);
        PorterDuff.Mode modeO = o(i8);
        if (modeO == null) {
            return drawableP;
        }
        androidx.core.graphics.drawable.a.o(drawableP, modeO);
        return drawableP;
    }

    static void w(Drawable drawable, j1 j1Var, int[] iArr) {
        if (n0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z7 = j1Var.f1006d;
        if (z7 || j1Var.f1005c) {
            drawable.setColorFilter(g(z7 ? j1Var.f1003a : null, j1Var.f1005c ? j1Var.f1004b : f839h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i8) {
        return k(context, i8, false);
    }

    synchronized Drawable k(Context context, int i8, boolean z7) {
        Drawable drawableR;
        d(context);
        drawableR = r(context, i8);
        if (drawableR == null) {
            drawableR = f(context, i8);
        }
        if (drawableR == null) {
            drawableR = androidx.core.content.a.e(context, i8);
        }
        if (drawableR != null) {
            drawableR = v(context, i8, z7, drawableR);
        }
        if (drawableR != null) {
            n0.b(drawableR);
        }
        return drawableR;
    }

    synchronized ColorStateList m(Context context, int i8) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i8);
        if (colorStateListN == null) {
            e eVar = this.f848g;
            colorStateListN = eVar == null ? null : eVar.d(context, i8);
            if (colorStateListN != null) {
                c(context, i8, colorStateListN);
            }
        }
        return colorStateListN;
    }

    PorterDuff.Mode o(int i8) {
        e eVar = this.f848g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i8);
    }

    public synchronized void s(Context context) {
        p.e<WeakReference<Drawable.ConstantState>> eVar = this.f845d.get(context);
        if (eVar != null) {
            eVar.e();
        }
    }

    synchronized Drawable t(Context context, r1 r1Var, int i8) {
        Drawable drawableR = r(context, i8);
        if (drawableR == null) {
            drawableR = r1Var.c(i8);
        }
        if (drawableR == null) {
            return null;
        }
        return v(context, i8, false, drawableR);
    }

    public synchronized void u(e eVar) {
        this.f848g = eVar;
    }

    boolean x(Context context, int i8, Drawable drawable) {
        e eVar = this.f848g;
        return eVar != null && eVar.a(context, i8, drawable);
    }
}
