package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ej1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.s0 f7370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3.e f7371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f7372c;

    public ej1(j2.s0 s0Var, e3.e eVar, Executor executor) {
        this.f7370a = s0Var;
        this.f7371b = eVar;
        this.f7372c = executor;
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        long jB = this.f7371b.b();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jB2 = this.f7371b.b();
        if (bitmapDecodeByteArray != null) {
            long j8 = jB2 - jB;
            j2.v1.k("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j8 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ Bitmap a(double d8, boolean z7, qb qbVar) {
        byte[] bArr = qbVar.f13385b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d8 * 160.0d);
        if (!z7) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) h2.y.c().b(ns.f12046c6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i8 = options.outWidth * options.outHeight;
            if (i8 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i8 - 1) / ((Integer) h2.y.c().b(ns.f12055d6)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final x3.d b(String str, final double d8, final boolean z7) {
        return zf3.m(this.f7370a.a(str), new z73() { // from class: com.google.android.gms.internal.ads.dj1
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f6773a.a(d8, z7, (qb) obj);
            }
        }, this.f7372c);
    }
}
