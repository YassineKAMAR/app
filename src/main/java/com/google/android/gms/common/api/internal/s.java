package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
final class s extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ c.a f4900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(c.a aVar, x2.d[] dVarArr, boolean z7, int i8) {
        super(dVarArr, z7, i8);
        this.f4900d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.c
    protected final void b(a.b bVar, s3.i iVar) {
        this.f4900d.f4849a.accept(bVar, iVar);
    }
}
