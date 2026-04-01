package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes.dex */
final class jl4 implements hl4 {
    /* synthetic */ jl4(il4 il4Var) {
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final MediaCodecInfo d(int i8) {
        return MediaCodecList.getCodecInfoAt(i8);
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final int j() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.hl4
    public final boolean m() {
        return false;
    }
}
