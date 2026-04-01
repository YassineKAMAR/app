package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum wg {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19310a;

    wg(int i8) {
        this.f19310a = i8;
    }

    public static wg a(int i8) {
        return i8 != 2 ? i8 != 3 ? i8 != 5 ? i8 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
