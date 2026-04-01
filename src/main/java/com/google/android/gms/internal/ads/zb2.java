package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zb2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f18134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lg3 f18135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f18136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ts2 f18137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f18138e;

    public zb2(lg3 lg3Var, lg3 lg3Var2, Context context, ts2 ts2Var, ViewGroup viewGroup) {
        this.f18134a = lg3Var;
        this.f18135b = lg3Var2;
        this.f18136c = context;
        this.f18137d = ts2Var;
        this.f18138e = viewGroup;
    }

    private final List c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f18138e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    final /* synthetic */ ac2 a() {
        return new ac2(this.f18136c, this.f18137d.f15303e, c());
    }

    final /* synthetic */ ac2 b() {
        return new ac2(this.f18136c, this.f18137d.f15303e, c());
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        lg3 lg3Var;
        Callable callable;
        ns.a(this.f18136c);
        if (((Boolean) h2.y.c().b(ns.ga)).booleanValue()) {
            lg3Var = this.f18135b;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.xb2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17161a.a();
                }
            };
        } else {
            lg3Var = this.f18134a;
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.yb2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f17727a.b();
                }
            };
        }
        return lg3Var.Z(callable);
    }
}
