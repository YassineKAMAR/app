package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class j0 implements Comparator<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ m f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ b7 f18820b;

    j0(m mVar, b7 b7Var) {
        this.f18819a = mVar;
        this.f18820b = b7Var;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(r rVar, r rVar2) {
        r rVar3 = rVar;
        r rVar4 = rVar2;
        m mVar = this.f18819a;
        b7 b7Var = this.f18820b;
        if (rVar3 instanceof y) {
            return !(rVar4 instanceof y) ? 1 : 0;
        }
        if (rVar4 instanceof y) {
            return -1;
        }
        return mVar == null ? rVar3.n().compareTo(rVar4.n()) : (int) a6.a(mVar.b(b7Var, Arrays.asList(rVar3, rVar4)).m().doubleValue());
    }
}
