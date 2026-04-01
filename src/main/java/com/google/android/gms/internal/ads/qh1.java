package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class qh1 implements kv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ oi1 f13479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f13480b;

    qh1(oi1 oi1Var, ViewGroup viewGroup) {
        this.f13479a = oi1Var;
        this.f13480b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final void a(MotionEvent motionEvent) {
        this.f13479a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final JSONObject j() {
        return this.f13479a.w();
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final JSONObject k() {
        return this.f13479a.y();
    }

    @Override // com.google.android.gms.internal.ads.kv
    public final void l() {
        jb3 jb3Var = nh1.f11870o;
        Map mapX = this.f13479a.x();
        if (mapX == null) {
            return;
        }
        int size = jb3Var.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = mapX.get((String) jb3Var.get(i8));
            i8++;
            if (obj != null) {
                this.f13479a.onClick(this.f13480b);
                return;
            }
        }
    }
}
