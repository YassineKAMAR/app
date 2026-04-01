package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class hu2 implements f52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Message f8980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private iv2 f8981b;

    private hu2() {
    }

    /* synthetic */ hu2(gt2 gt2Var) {
    }

    private final void c() {
        this.f8980a = null;
        this.f8981b = null;
        iv2.a(this);
    }

    public final hu2 a(Message message, iv2 iv2Var) {
        this.f8980a = message;
        this.f8981b = iv2Var;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.f8980a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // com.google.android.gms.internal.ads.f52
    public final void j() {
        Message message = this.f8980a;
        message.getClass();
        message.sendToTarget();
        c();
    }
}
