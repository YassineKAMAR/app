package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class gs4 implements ff1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c93 f8490a = f93.a(new c93() { // from class: com.google.android.gms.internal.ads.es4
        @Override // com.google.android.gms.internal.ads.c93
        public final Object j() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                objInvoke.getClass();
                return (ff1) objInvoke;
            } catch (Exception e8) {
                throw new IllegalStateException(e8);
            }
        }
    });

    /* synthetic */ gs4(fs4 fs4Var) {
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final hh1 a(Context context, wn4 wn4Var, sk4 sk4Var, sk4 sk4Var2, boolean z7, Executor executor, gg1 gg1Var) {
        return ((ff1) f8490a.j()).a(context, wn4Var, sk4Var, sk4Var2, false, executor, gg1Var);
    }
}
