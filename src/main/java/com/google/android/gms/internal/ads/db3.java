package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class db3 {
    db3() {
    }

    static int b(int i8, int i9) {
        int i10 = i8 + (i8 >> 1) + 1;
        if (i10 < i9) {
            int iHighestOneBit = Integer.highestOneBit(i9 - 1);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    public abstract db3 a(Object obj);
}
