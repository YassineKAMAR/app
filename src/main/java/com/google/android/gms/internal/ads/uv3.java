package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum uv3 implements c14 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d14 f15907h = new d14() { // from class: com.google.android.gms.internal.ads.tv3
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15909a;

    uv3(int i8) {
        this.f15909a = i8;
    }

    public final int j() {
        if (this != UNRECOGNIZED) {
            return this.f15909a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(j());
    }
}
