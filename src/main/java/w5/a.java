package w5;

import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    /* JADX INFO: renamed from: w5.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0187a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27113a;

        static {
            int[] iArr = new int[a.values().length];
            f27113a = iArr;
            try {
                iArr[a.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27113a[a.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27113a[a.ITALIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27113a[a.MONOSPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static a c(int i8) {
        if (i8 >= 0 && i8 < values().length) {
            return values()[i8];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i8);
        return NORMAL;
    }

    Typeface d() {
        int i8 = C0187a.f27113a[ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
