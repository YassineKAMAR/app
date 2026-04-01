package androidx.core.graphics;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f2006a = new ThreadLocal<>();

    public static int a(double d8, double d9, double d10) {
        double d11 = (((3.2406d * d8) + ((-1.5372d) * d9)) + ((-0.4986d) * d10)) / 100.0d;
        double d12 = ((((-0.9689d) * d8) + (1.8758d * d9)) + (0.0415d * d10)) / 100.0d;
        double d13 = (((0.0557d * d8) + ((-0.204d) * d9)) + (1.057d * d10)) / 100.0d;
        return Color.rgb(e((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255), e((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255));
    }

    private static int b(int i8, int i9) {
        return 255 - (((255 - i9) * (255 - i8)) / 255);
    }

    public static int c(int i8, int i9) {
        int iAlpha = Color.alpha(i9);
        int iAlpha2 = Color.alpha(i8);
        int iB = b(iAlpha2, iAlpha);
        return Color.argb(iB, d(Color.red(i8), iAlpha2, Color.red(i9), iAlpha, iB), d(Color.green(i8), iAlpha2, Color.green(i9), iAlpha, iB), d(Color.blue(i8), iAlpha2, Color.blue(i9), iAlpha, iB));
    }

    private static int d(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        return (((i8 * 255) * i9) + ((i10 * i11) * (255 - i9))) / (i12 * 255);
    }

    private static int e(int i8, int i9, int i10) {
        return i8 < i9 ? i9 : Math.min(i8, i10);
    }

    public static int f(int i8, int i9) {
        if (i9 < 0 || i9 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i8 & 16777215) | (i9 << 24);
    }
}
