package w3;

import u3.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static int a(int i8, int i9, int i10) {
        h.f(i9 <= i10, "min (%s) must be less than or equal to max (%s)", i9, i10);
        return Math.min(Math.max(i8, i9), i10);
    }
}
