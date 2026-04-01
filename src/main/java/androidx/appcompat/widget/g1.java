package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f957a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f958b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f959c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f960d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f961e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f962f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f963g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f964h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[] f965i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f966j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e.j.f21348z0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(e.j.E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i8) {
        ColorStateList colorStateListE = e(context, i8);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f958b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i8, typedValueF.getFloat());
    }

    public static int c(Context context, int i8) {
        int[] iArr = f966j;
        iArr[0] = i8;
        l1 l1VarT = l1.t(context, null, iArr);
        try {
            return l1VarT.b(0, 0);
        } finally {
            l1VarT.v();
        }
    }

    static int d(Context context, int i8, float f8) {
        return androidx.core.graphics.a.f(c(context, i8), Math.round(Color.alpha(r0) * f8));
    }

    public static ColorStateList e(Context context, int i8) {
        int[] iArr = f966j;
        iArr[0] = i8;
        l1 l1VarT = l1.t(context, null, iArr);
        try {
            return l1VarT.c(0);
        } finally {
            l1VarT.v();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = f957a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
