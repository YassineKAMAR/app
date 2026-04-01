package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class yg extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f19418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ vg f19419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(vg vgVar, boolean z7, boolean z8) {
        super("log");
        this.f19419e = vgVar;
        this.f19417c = z7;
        this.f19418d = z8;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final r b(b7 b7Var, List<r> list) {
        List<String> arrayList;
        zg zgVar;
        a6.k("log", 1, list);
        if (list.size() == 1) {
            this.f19419e.f19280c.a(wg.INFO, b7Var.b(list.get(0)).n(), Collections.emptyList(), this.f19417c, this.f19418d);
        } else {
            wg wgVarA = wg.a(a6.i(b7Var.b(list.get(0)).m().doubleValue()));
            String strN = b7Var.b(list.get(1)).n();
            if (list.size() == 2) {
                zgVar = this.f19419e.f19280c;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
                for (int i8 = 2; i8 < Math.min(list.size(), 5); i8++) {
                    arrayList.add(b7Var.b(list.get(i8)).n());
                }
                zgVar = this.f19419e.f19280c;
            }
            zgVar.a(wgVarA, strN, arrayList, this.f19417c, this.f19418d);
        }
        return r.L;
    }
}
