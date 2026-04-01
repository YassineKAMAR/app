package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<x0> f19420a = new ArrayList();

    protected z() {
    }

    final r a(String str) {
        if (!this.f19420a.contains(a6.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract r b(String str, b7 b7Var, List<r> list);
}
