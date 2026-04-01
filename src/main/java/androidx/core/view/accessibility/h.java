package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public class h {

    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i8) {
            accessibilityRecord.setMaxScrollX(i8);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i8) {
            accessibilityRecord.setMaxScrollY(i8);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i8) {
        a.c(accessibilityRecord, i8);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i8) {
        a.d(accessibilityRecord, i8);
    }
}
