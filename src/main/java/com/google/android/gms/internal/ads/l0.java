package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10399a;

    private l0(int i8, int i9, String str) {
        this.f10399a = str;
    }

    public static l0 a(dq2 dq2Var) {
        String str;
        dq2Var.h(2);
        int iU = dq2Var.u();
        int i8 = iU >> 1;
        int i9 = iU & 1;
        int iU2 = dq2Var.u() >> 3;
        if (i8 == 4 || i8 == 5 || i8 == 7) {
            str = "dvhe";
        } else if (i8 == 8) {
            str = "hev1";
        } else {
            if (i8 != 9) {
                return null;
            }
            str = "avc3";
        }
        int i10 = iU2 | (i9 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i8);
        sb.append(i10 >= 10 ? "." : ".0");
        sb.append(i10);
        return new l0(i8, i10, sb.toString());
    }
}
