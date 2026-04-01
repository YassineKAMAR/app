package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f317e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f318a;

    ImmLeaksCleaner(Activity activity) {
        this.f318a = activity;
    }

    private static void b() {
        try {
            f314b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f316d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f317e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f315c = declaredField3;
            declaredField3.setAccessible(true);
            f314b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, d.a aVar) {
        if (aVar != d.a.ON_DESTROY) {
            return;
        }
        if (f314b == 0) {
            b();
        }
        if (f314b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f318a.getSystemService("input_method");
            try {
                Object obj = f315c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f316d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f317e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
