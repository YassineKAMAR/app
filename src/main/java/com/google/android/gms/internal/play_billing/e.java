package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class e extends c6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f19497c;

    e(g gVar, int i8) {
        super(gVar.size(), i8);
        this.f19497c = gVar;
    }

    @Override // com.google.android.gms.internal.play_billing.c6
    protected final Object a(int i8) {
        return this.f19497c.get(i8);
    }
}
