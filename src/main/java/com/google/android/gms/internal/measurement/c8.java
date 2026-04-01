package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p5;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class c8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f18620a;

    static {
        int[] iArr = new int[p5.b.values().length];
        f18620a = iArr;
        try {
            iArr[p5.b.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f18620a[p5.b.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f18620a[p5.b.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f18620a[p5.b.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f18620a[p5.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
