package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class e53 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f7132a;

    public e53(Looper looper) {
        super(looper);
        this.f7132a = Looper.getMainLooper();
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}
