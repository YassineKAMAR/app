package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class fc extends dc<bc, bc> {
    fc() {
    }

    private static void m(Object obj, bc bcVar) {
        ((y8) obj).zzb = bcVar;
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ int a(bc bcVar) {
        return bcVar.a();
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ bc b(bc bcVar, bc bcVar2) {
        bc bcVar3 = bcVar;
        bc bcVar4 = bcVar2;
        return bc.k().equals(bcVar4) ? bcVar3 : bc.k().equals(bcVar3) ? bc.c(bcVar3, bcVar4) : bcVar3.b(bcVar4);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ void c(bc bcVar, int i8, o7 o7Var) {
        bcVar.e((i8 << 3) | 2, o7Var);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ void d(bc bcVar, zc zcVar) {
        bcVar.g(zcVar);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ int e(bc bcVar) {
        return bcVar.i();
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ void f(bc bcVar, int i8, long j8) {
        bcVar.e(i8 << 3, Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ void g(bc bcVar, zc zcVar) {
        bcVar.j(zcVar);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ void h(Object obj, bc bcVar) {
        m(obj, bcVar);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ bc i(Object obj) {
        bc bcVar = ((y8) obj).zzb;
        if (bcVar != bc.k()) {
            return bcVar;
        }
        bc bcVarL = bc.l();
        m(obj, bcVarL);
        return bcVarL;
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ void j(Object obj, bc bcVar) {
        m(obj, bcVar);
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final /* synthetic */ bc k(Object obj) {
        return ((y8) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.dc
    final void l(Object obj) {
        ((y8) obj).zzb.m();
    }
}
