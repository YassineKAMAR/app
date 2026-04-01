package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class fm4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w0 f7816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7817b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7818c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f7819d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private on3 f7820e;

    public fm4(w0 w0Var) {
        this.f7816a = w0Var;
    }

    public final void a(on3 on3Var) {
        if (on3Var != this.f7820e) {
            this.f7820e = on3Var;
            this.f7817b.clear();
            this.f7819d.clear();
        }
    }
}
