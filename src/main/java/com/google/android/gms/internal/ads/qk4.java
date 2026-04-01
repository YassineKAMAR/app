package com.google.android.gms.internal.ads;

import android.annotation.NonNull;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class qk4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint] */
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, final int i8, final int i9, double d8) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = nz2.f12301b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = nz2.f12303d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    final int i10 = (int) d8;
                    ?? r72 = new Object(i8, i9, i10) { // from class: android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ boolean covers(@NonNull MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint);
                    };
                    for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                        if (((MediaCodecInfo$VideoCapabilities$PerformancePoint) supportedPerformancePoints.get(i11)).covers(r72)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
