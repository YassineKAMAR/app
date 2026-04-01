package x6;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f27329a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<DecimalFormat>[] f27330b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i8 = 0; i8 < 4; i8++) {
            threadLocalArr[i8] = new ThreadLocal<>();
        }
        f27330b = threadLocalArr;
    }

    public static final boolean a() {
        return f27329a;
    }
}
