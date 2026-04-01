package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19433a;

    public z6(d7 d7Var) {
        u3.h.j(d7Var, "BuildInfo must be non-null");
        this.f19433a = !d7Var.j();
    }

    public final boolean a(String str) {
        u3.h.j(str, "flagName must not be null");
        if (this.f19433a) {
            return c7.f18619a.get().b(str);
        }
        return true;
    }
}
