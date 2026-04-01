package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f2321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f2323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f2324d;

    static class a {
        static void a(PopupWindow popupWindow, View view, int i8, int i9, int i10) {
            popupWindow.showAsDropDown(view, i8, i9, i10);
        }
    }

    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z7) {
            popupWindow.setOverlapAnchor(z7);
        }

        static void d(PopupWindow popupWindow, int i8) {
            popupWindow.setWindowLayoutType(i8);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z7) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.c(popupWindow, z7);
            return;
        }
        if (!f2324d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2323c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e8);
            }
            f2324d = true;
        }
        Field field = f2323c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z7));
            } catch (IllegalAccessException e9) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e9);
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i8);
            return;
        }
        if (!f2322b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2321a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2322b = true;
        }
        Method method = f2321a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i8));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i8, int i9, int i10) {
        a.a(popupWindow, view, i8, i9, i10);
    }
}
