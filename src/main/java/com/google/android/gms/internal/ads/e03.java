package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class e03 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f7084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c03 f7085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q03 f7087e;

    public e03(Handler handler, Context context, c03 c03Var, q03 q03Var) {
        super(handler);
        this.f7083a = context;
        this.f7084b = (AudioManager) context.getSystemService("audio");
        this.f7085c = c03Var;
        this.f7087e = q03Var;
    }

    private final float c() {
        AudioManager audioManager = this.f7084b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f8 = streamVolume / streamMaxVolume;
        if (f8 > 1.0f) {
            return 1.0f;
        }
        return f8;
    }

    private final void d() {
        this.f7087e.e(this.f7086d);
    }

    public final void a() {
        this.f7086d = c();
        d();
        this.f7083a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f7083a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        super.onChange(z7);
        float fC = c();
        if (fC != this.f7086d) {
            this.f7086d = fC;
            d();
        }
    }
}
