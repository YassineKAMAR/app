package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rl1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2.a f14210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm0 f14211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final eq1 f14213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mx2 f14214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final q12 f14215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f14216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gh f14217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wg0 f14218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final jz2 f14219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b22 f14220k;

    public rl1(Context context, Executor executor, gh ghVar, wg0 wg0Var, g2.a aVar, rm0 rm0Var, q12 q12Var, jz2 jz2Var, eq1 eq1Var, mx2 mx2Var, b22 b22Var) {
        this.f14212c = context;
        this.f14216g = executor;
        this.f14217h = ghVar;
        this.f14218i = wg0Var;
        this.f14210a = aVar;
        this.f14211b = rm0Var;
        this.f14215f = q12Var;
        this.f14219j = jz2Var;
        this.f14213d = eq1Var;
        this.f14214e = mx2Var;
        this.f14220k = b22Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ul1 ul1Var = new ul1(this);
        ul1Var.h();
        return ul1Var;
    }
}
