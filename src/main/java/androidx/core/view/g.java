package androidx.core.view;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    static class a {
        static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        static int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        static boolean d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        static void e(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
            marginLayoutParams.resolveLayoutDirection(i8);
        }

        static void f(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
            marginLayoutParams.setLayoutDirection(i8);
        }

        static void g(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
            marginLayoutParams.setMarginEnd(i8);
        }

        static void h(ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
            marginLayoutParams.setMarginStart(i8);
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.c(marginLayoutParams);
    }
}
