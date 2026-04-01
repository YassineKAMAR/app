package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes.dex */
final class qi implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ si f13497a;

    qi(si siVar) {
        this.f13497a = siVar;
    }

    public final void onOpActiveChanged(String str, int i8, String str2, boolean z7) {
        si siVar;
        boolean z8;
        si siVar2 = this.f13497a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z7) {
            siVar2.f14704a = jCurrentTimeMillis;
            siVar = this.f13497a;
            z8 = true;
        } else {
            if (siVar2.f14705b > 0) {
                si siVar3 = this.f13497a;
                if (jCurrentTimeMillis >= siVar3.f14705b) {
                    siVar3.f14706c = jCurrentTimeMillis - siVar3.f14705b;
                }
            }
            siVar = this.f13497a;
            z8 = false;
        }
        siVar.f14707d = z8;
    }
}
