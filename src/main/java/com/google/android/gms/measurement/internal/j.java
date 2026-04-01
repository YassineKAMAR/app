package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
enum j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f20145a;

    j(char c8) {
        this.f20145a = c8;
    }

    public static j c(char c8) {
        for (j jVar : values()) {
            if (jVar.f20145a == c8) {
                return jVar;
            }
        }
        return UNSET;
    }
}
