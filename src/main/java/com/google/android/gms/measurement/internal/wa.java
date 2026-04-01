package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f20653b;

    wa(String str) {
        this.f20652a = str;
    }

    wa(String str, Map<String, String> map) {
        this.f20652a = str;
        this.f20653b = map;
    }

    public final String a() {
        return this.f20652a;
    }

    public final Map<String, String> b() {
        return this.f20653b;
    }
}
