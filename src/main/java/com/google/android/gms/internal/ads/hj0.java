package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class hj0 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f8764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj0 f8765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8769f = 1.0f;

    public hj0(Context context, gj0 gj0Var) {
        this.f8764a = (AudioManager) context.getSystemService("audio");
        this.f8765b = gj0Var;
    }

    private final void f() {
        boolean z7 = false;
        if (!this.f8767d || this.f8768e || this.f8769f <= 0.0f) {
            if (!this.f8766c) {
                return;
            }
            AudioManager audioManager = this.f8764a;
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z7 = true;
                }
                this.f8766c = z7;
            }
        } else {
            if (this.f8766c) {
                return;
            }
            AudioManager audioManager2 = this.f8764a;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z7 = true;
                }
                this.f8766c = z7;
            }
        }
        this.f8765b.v();
    }

    public final float a() {
        float f8 = this.f8768e ? 0.0f : this.f8769f;
        if (this.f8766c) {
            return f8;
        }
        return 0.0f;
    }

    public final void b() {
        this.f8767d = true;
        f();
    }

    public final void c() {
        this.f8767d = false;
        f();
    }

    public final void d(boolean z7) {
        this.f8768e = z7;
        f();
    }

    public final void e(float f8) {
        this.f8769f = f8;
        f();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i8) {
        this.f8766c = i8 > 0;
        this.f8765b.v();
    }
}
