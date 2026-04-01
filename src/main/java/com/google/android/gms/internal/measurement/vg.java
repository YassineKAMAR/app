package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vg extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zg f19280c;

    public vg(zg zgVar) {
        super("internal.logger");
        this.f19280c = zgVar;
        this.f18935b.put("log", new yg(this, false, true));
        this.f18935b.put("silent", new gg(this, "silent"));
        ((m) this.f18935b.get("silent")).i("log", new yg(this, true, true));
        this.f18935b.put("unmonitored", new xg(this, "unmonitored"));
        ((m) this.f18935b.get("unmonitored")).i("log", new yg(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        return r.L;
    }
}
