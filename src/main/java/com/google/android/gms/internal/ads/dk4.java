package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class dk4 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ fk4 f6788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dk4(fk4 fk4Var, Looper looper) {
        super(looper);
        this.f6788a = fk4Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        fk4.a(this.f6788a, message);
    }
}
