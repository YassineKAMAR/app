package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f15817a = new CopyOnWriteArrayList();

    public final void a(Handler handler, vq4 vq4Var) {
        c(vq4Var);
        this.f15817a.add(new tq4(handler, vq4Var));
    }

    public final void b(final int i8, final long j8, final long j9) {
        for (final tq4 tq4Var : this.f15817a) {
            if (!tq4Var.f15241c) {
                tq4Var.f15239a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.sq4
                    @Override // java.lang.Runnable
                    public final void run() {
                        tq4Var.f15240b.O(i8, j8, j9);
                    }
                });
            }
        }
    }

    public final void c(vq4 vq4Var) {
        for (tq4 tq4Var : this.f15817a) {
            if (tq4Var.f15240b == vq4Var) {
                tq4Var.c();
                this.f15817a.remove(tq4Var);
            }
        }
    }
}
