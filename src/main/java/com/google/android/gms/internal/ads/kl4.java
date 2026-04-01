package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes.dex */
final class kl4 implements hl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f10155b;

    public kl4(boolean z7, boolean z8) {
        int i8 = 1;
        if (!z7 && !z8) {
            i8 = 0;
        }
        this.f10154a = i8;
    }

    private final void c() {
        if (this.f10155b == null) {
            this.f10155b = new MediaCodecList(this.f10154a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final MediaCodecInfo d(int i8) {
        c();
        return this.f10155b[i8];
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final int j() {
        c();
        return this.f10155b.length;
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final boolean m() {
        return true;
    }
}
