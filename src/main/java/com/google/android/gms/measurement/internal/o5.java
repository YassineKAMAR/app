package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.wg;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f20313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f20314b;

    static {
        int[] iArr = new int[g4.e.values().length];
        f20314b = iArr;
        try {
            iArr[g4.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20314b[g4.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20314b[g4.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20314b[g4.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[wg.values().length];
        f20313a = iArr2;
        try {
            iArr2[wg.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f20313a[wg.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f20313a[wg.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f20313a[wg.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
