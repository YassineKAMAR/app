package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class rg4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AudioAttributes f14119a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i8, int i9) {
        for (int i10 = 10; i10 > 0; i10--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i9).setChannelMask(nz2.s(i10)).build(), f14119a)) {
                return i10;
            }
        }
        return 0;
    }

    public static jb3<Integer> b() {
        gb3 gb3Var = new gb3();
        kd3 it = sg4.f14658e.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (nz2.f12300a >= nz2.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f14119a)) {
                gb3Var.g(Integer.valueOf(iIntValue));
            }
        }
        gb3Var.g(2);
        return gb3Var.j();
    }
}
