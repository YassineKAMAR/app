package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public final class x94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f17143a;

    /* synthetic */ x94(zb4 zb4Var, e74 e74Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i8 = nz2.f12300a;
        if (i8 >= 29) {
            bp2.a(usage, 1);
        }
        if (i8 >= 32) {
            gg3.a(usage, 0);
        }
        this.f17143a = usage.build();
    }
}
