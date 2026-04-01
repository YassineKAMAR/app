package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f15054d;

    public tc(int i8, List list, int i9, InputStream inputStream) {
        this.f15051a = i8;
        this.f15052b = list;
        this.f15053c = i9;
        this.f15054d = inputStream;
    }

    public final int a() {
        return this.f15053c;
    }

    public final int b() {
        return this.f15051a;
    }

    public final InputStream c() {
        InputStream inputStream = this.f15054d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f15052b);
    }
}
