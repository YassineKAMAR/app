package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class ph4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioTrack f12879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f12880b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f12881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f12883e;

    public ph4(AudioTrack audioTrack) {
        this.f12879a = audioTrack;
    }

    public final long a() {
        return this.f12883e;
    }

    public final long b() {
        return this.f12880b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f12879a.getTimestamp(this.f12880b);
        if (timestamp) {
            long j8 = this.f12880b.framePosition;
            if (this.f12882d > j8) {
                this.f12881c++;
            }
            this.f12882d = j8;
            this.f12883e = j8 + (this.f12881c << 32);
        }
        return timestamp;
    }
}
