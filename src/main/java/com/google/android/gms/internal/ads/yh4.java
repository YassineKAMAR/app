package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;

/* JADX INFO: loaded from: classes.dex */
public final class yh4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f17772a;

    public yh4(Context context) {
    }

    public final vg4 a(nb nbVar, zb4 zb4Var) {
        nbVar.getClass();
        zb4Var.getClass();
        int i8 = nz2.f12300a;
        if (i8 < 29 || nbVar.f11807z == -1) {
            return vg4.f16263d;
        }
        Boolean bool = this.f17772a;
        if (bool == null) {
            bool = Boolean.FALSE;
            this.f17772a = bool;
        }
        bool.booleanValue();
        String str = nbVar.f11793l;
        str.getClass();
        int iA = xg0.a(str, nbVar.f11790i);
        if (iA == 0 || i8 < nz2.r(iA)) {
            return vg4.f16263d;
        }
        int iS = nz2.s(nbVar.f11806y);
        if (iS == 0) {
            return vg4.f16263d;
        }
        try {
            AudioFormat audioFormatG = nz2.G(nbVar.f11807z, iS, iA);
            AudioAttributes audioAttributes = zb4Var.a().f17143a;
            return i8 >= 31 ? xh4.a(audioFormatG, audioAttributes, false) : vh4.a(audioFormatG, audioAttributes, false);
        } catch (IllegalArgumentException unused) {
            return vg4.f16263d;
        }
    }
}
