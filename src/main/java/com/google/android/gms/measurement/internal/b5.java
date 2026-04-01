package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ y4 f19816e;

    public b5(y4 y4Var, String str, boolean z7) {
        this.f19816e = y4Var;
        a3.o.f(str);
        this.f19812a = str;
        this.f19813b = z7;
    }

    public final void a(boolean z7) {
        SharedPreferences.Editor editorEdit = this.f19816e.F().edit();
        editorEdit.putBoolean(this.f19812a, z7);
        editorEdit.apply();
        this.f19815d = z7;
    }

    public final boolean b() {
        if (!this.f19814c) {
            this.f19814c = true;
            this.f19815d = this.f19816e.F().getBoolean(this.f19812a, this.f19813b);
        }
        return this.f19815d;
    }
}
