package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum hv3 implements c14 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d14 f8998i = new d14() { // from class: com.google.android.gms.internal.ads.gv3
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9000a;

    hv3(int i8) {
        this.f9000a = i8;
    }

    public final int j() {
        if (this != UNRECOGNIZED) {
            return this.f9000a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(j());
    }
}
