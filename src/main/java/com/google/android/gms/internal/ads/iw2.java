package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class iw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ tw2 f9393c;

    /* synthetic */ iw2(tw2 tw2Var, Object obj, List list, hw2 hw2Var) {
        this.f9393c = tw2Var;
        this.f9391a = obj;
        this.f9392b = list;
    }

    public final sw2 a(Callable callable) {
        yf3 yf3VarB = zf3.b(this.f9392b);
        x3.d dVarA = yf3VarB.a(new Callable() { // from class: com.google.android.gms.internal.ads.gw2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eh0.f7327f);
        x3.d dVarA2 = yf3VarB.a(callable, this.f9393c.f15356a);
        return new sw2(this.f9393c, this.f9391a, dVarA, this.f9392b, dVarA2);
    }
}
