package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f2030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f2032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f2033d;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0023a {
        static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i8) {
            return drawableContainerState.getChild(i8);
        }

        static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static void e(Drawable drawable, boolean z7) {
            drawable.setAutoMirrored(z7);
        }
    }

    static class b {
        static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(Drawable drawable, float f8, float f9) {
            drawable.setHotspot(f8, f9);
        }

        static void f(Drawable drawable, int i8, int i9, int i10, int i11) {
            drawable.setHotspotBounds(i8, i9, i10, i11);
        }

        static void g(Drawable drawable, int i8) {
            drawable.setTint(i8);
        }

        static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class c {
        static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(Drawable drawable, int i8) {
            return drawable.setLayoutDirection(i8);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        b.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return b.b(drawable);
    }

    public static int c(Drawable drawable) {
        return C0023a.a(drawable);
    }

    public static ColorFilter d(Drawable drawable) {
        return b.c(drawable);
    }

    public static int e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(drawable);
        }
        if (!f2033d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2032c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e8);
            }
            f2033d = true;
        }
        Method method = f2032c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e9) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e9);
                f2032c = null;
            }
        }
        return 0;
    }

    public static void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean g(Drawable drawable) {
        return C0023a.d(drawable);
    }

    @Deprecated
    public static void h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void i(Drawable drawable, boolean z7) {
        C0023a.e(drawable, z7);
    }

    public static void j(Drawable drawable, float f8, float f9) {
        b.e(drawable, f8, f9);
    }

    public static void k(Drawable drawable, int i8, int i9, int i10, int i11) {
        b.f(drawable, i8, i9, i10, i11);
    }

    public static boolean l(Drawable drawable, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.b(drawable, i8);
        }
        if (!f2031b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f2030a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e8);
            }
            f2031b = true;
        }
        Method method = f2030a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i8));
                return true;
            } catch (Exception e9) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e9);
                f2030a = null;
            }
        }
        return false;
    }

    public static void m(Drawable drawable, int i8) {
        b.g(drawable, i8);
    }

    public static void n(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void o(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }

    public static Drawable p(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof i)) ? new l(drawable) : drawable;
    }
}
