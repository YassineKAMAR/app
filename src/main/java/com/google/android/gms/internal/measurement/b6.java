package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class b6 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ y5 f18587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b6(y5 y5Var, Handler handler) {
        super(null);
        this.f18587a = y5Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        this.f18587a.f();
    }
}
