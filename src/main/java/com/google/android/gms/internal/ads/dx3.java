package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum dx3 implements c14 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d14 f7056h = new d14() { // from class: com.google.android.gms.internal.ads.cx3
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7058a;

    dx3(int i8) {
        this.f7058a = i8;
    }

    public static dx3 a(int i8) {
        if (i8 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i8 == 1) {
            return TINK;
        }
        if (i8 == 2) {
            return LEGACY;
        }
        if (i8 == 3) {
            return RAW;
        }
        if (i8 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int j() {
        if (this != UNRECOGNIZED) {
            return this.f7058a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(j());
    }
}
