package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
final class ps4 {
    public static void a(Surface surface, float f8) {
        try {
            surface.setFrameRate(f8, f8 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e8) {
            pf2.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
        }
    }
}
