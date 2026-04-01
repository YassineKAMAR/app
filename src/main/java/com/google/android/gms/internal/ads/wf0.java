package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class wf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16710a;

    public wf0(int i8, int i9) {
        this.f16710a = i9;
    }

    public final int a() {
        int i8 = this.f16710a;
        if (i8 == 2) {
            return 10;
        }
        if (i8 == 5) {
            return 11;
        }
        if (i8 == 29) {
            return 12;
        }
        if (i8 == 42) {
            return 16;
        }
        if (i8 != 22) {
            return i8 != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
