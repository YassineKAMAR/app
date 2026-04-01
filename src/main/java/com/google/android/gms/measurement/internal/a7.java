package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f19790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f19791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f19792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f19793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Boolean f19794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f19795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.android.gms.internal.measurement.e2 f19796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f19797h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Long f19798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f19799j;

    public a7(Context context, com.google.android.gms.internal.measurement.e2 e2Var, Long l8) {
        this.f19797h = true;
        a3.o.j(context);
        Context applicationContext = context.getApplicationContext();
        a3.o.j(applicationContext);
        this.f19790a = applicationContext;
        this.f19798i = l8;
        if (e2Var != null) {
            this.f19796g = e2Var;
            this.f19791b = e2Var.f18670f;
            this.f19792c = e2Var.f18669e;
            this.f19793d = e2Var.f18668d;
            this.f19797h = e2Var.f18667c;
            this.f19795f = e2Var.f18666b;
            this.f19799j = e2Var.f18672h;
            Bundle bundle = e2Var.f18671g;
            if (bundle != null) {
                this.f19794e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
