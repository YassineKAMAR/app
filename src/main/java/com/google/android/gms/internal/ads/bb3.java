package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class bb3 {
    static int a(int i8) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i8) * (-862048943)), 15)) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
