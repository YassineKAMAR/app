package g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.b1;
import androidx.core.content.res.c;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f21867a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<a>> f21868b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f21869c = new Object();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ColorStateList f21870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Configuration f21871b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f21870a = colorStateList;
            this.f21871b = configuration;
        }
    }

    private static void a(Context context, int i8, ColorStateList colorStateList) {
        synchronized (f21869c) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = f21868b;
            SparseArray<a> sparseArray = weakHashMap.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(context, sparseArray);
            }
            sparseArray.append(i8, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i8) {
        a aVar;
        synchronized (f21869c) {
            SparseArray<a> sparseArray = f21868b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i8)) != null) {
                if (aVar.f21871b.equals(context.getResources().getConfiguration())) {
                    return aVar.f21870a;
                }
                sparseArray.remove(i8);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i8);
        }
        ColorStateList colorStateListB = b(context, i8);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListF = f(context, i8);
        if (colorStateListF == null) {
            return androidx.core.content.a.d(context, i8);
        }
        a(context, i8, colorStateListF);
        return colorStateListF;
    }

    public static Drawable d(Context context, int i8) {
        return b1.h().j(context, i8);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = f21867a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i8) {
        if (g(context, i8)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return c.a(resources, resources.getXml(i8), context.getTheme());
        } catch (Exception e8) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    private static boolean g(Context context, int i8) {
        Resources resources = context.getResources();
        TypedValue typedValueE = e();
        resources.getValue(i8, typedValueE, true);
        int i9 = typedValueE.type;
        return i9 >= 28 && i9 <= 31;
    }
}
