package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f14132a;

    public rh2(int i8) {
        int i9 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i9 = iHighestOneBit + iHighestOneBit;
        }
        this.f14132a = new long[i9];
    }
}
