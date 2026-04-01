package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* JADX INFO: loaded from: classes.dex */
final class h implements a.InterfaceC0074a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f4862a;

    h(b bVar) {
        this.f4862a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0074a
    public final void a(boolean z7) {
        b bVar = this.f4862a;
        bVar.f4840p.sendMessage(bVar.f4840p.obtainMessage(1, Boolean.valueOf(z7)));
    }
}
