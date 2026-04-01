package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum lq implements c14 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d14 f10942h = new d14() { // from class: com.google.android.gms.internal.ads.jq
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10944a;

    lq(int i8) {
        this.f10944a = i8;
    }

    public static lq a(int i8) {
        if (i8 == 0) {
            return UNSPECIFIED;
        }
        if (i8 == 1) {
            return CONNECTING;
        }
        if (i8 == 2) {
            return CONNECTED;
        }
        if (i8 == 3) {
            return DISCONNECTING;
        }
        if (i8 == 4) {
            return DISCONNECTED;
        }
        if (i8 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    public final int j() {
        return this.f10944a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f10944a);
    }
}
