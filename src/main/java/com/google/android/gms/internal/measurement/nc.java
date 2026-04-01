package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class nc extends IllegalArgumentException {
    nc(int i8, int i9) {
        super("Unpaired surrogate at index " + i8 + " of " + i9);
    }
}
