package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tm4 f10746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f10747c;

    public lj4() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private lj4(CopyOnWriteArrayList copyOnWriteArrayList, int i8, tm4 tm4Var) {
        this.f10747c = copyOnWriteArrayList;
        this.f10745a = 0;
        this.f10746b = tm4Var;
    }

    public final lj4 a(int i8, tm4 tm4Var) {
        return new lj4(this.f10747c, 0, tm4Var);
    }

    public final void b(Handler handler, mj4 mj4Var) {
        this.f10747c.add(new kj4(handler, mj4Var));
    }

    public final void c(mj4 mj4Var) {
        for (kj4 kj4Var : this.f10747c) {
            if (kj4Var.f10125b == mj4Var) {
                this.f10747c.remove(kj4Var);
            }
        }
    }
}
