package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class rk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f14179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f14183h;

    rk4(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f14176a = str;
        this.f14177b = str2;
        this.f14178c = str3;
        this.f14179d = codecCapabilities;
        this.f14182g = z7;
        this.f14180e = z10;
        this.f14181f = z12;
        this.f14183h = xg0.g(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.rk4 c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.rk4 r11 = new com.google.android.gms.internal.ads.rk4
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.nz2.f12300a
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.nz2.f12300a
            r5 = 22
            if (r3 > r5) goto L3b
            java.lang.String r3 = com.google.android.gms.internal.ads.nz2.f12303d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2a
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            r3 = 21
            if (r4 == 0) goto L50
            int r5 = com.google.android.gms.internal.ads.nz2.f12300a
            if (r5 < r3) goto L50
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L50
            r9 = 1
            goto L51
        L50:
            r9 = 0
        L51:
            if (r20 != 0) goto L64
            if (r4 == 0) goto L62
            int r5 = com.google.android.gms.internal.ads.nz2.f12300a
            if (r5 < r3) goto L62
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L62
            goto L64
        L62:
            r10 = 0
            goto L65
        L64:
            r10 = 1
        L65:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk4.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.rk4");
    }

    private static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i10 = nz2.f12300a;
        return new Point((((i8 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i9 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void j(String str) {
        pf2.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f14176a + ", " + this.f14177b + "] [" + nz2.f12304e + "]");
    }

    private static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d8) {
        Point pointI = i(videoCapabilities, i8, i9);
        int i10 = pointI.x;
        int i11 = pointI.y;
        return (d8 == -1.0d || d8 < 1.0d) ? videoCapabilities.isSizeSupported(i10, i11) : videoCapabilities.areSizeAndRateSupported(i10, i11, Math.floor(d8));
    }

    private final boolean l(nb nbVar, boolean z7) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairB = ql4.b(nbVar);
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        int i8 = 8;
        if ("video/dolby-vision".equals(nbVar.f11793l)) {
            if ("video/avc".equals(this.f14177b)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(this.f14177b)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.f14183h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = h();
        if (nz2.f12300a <= 23 && "video/x-vnd.on2.vp9".equals(this.f14177b) && codecProfileLevelArrH.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14179d;
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i8 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i8 = 512;
            } else if (iIntValue3 >= 60000000) {
                i8 = 256;
            } else if (iIntValue3 >= 30000000) {
                i8 = 128;
            } else if (iIntValue3 >= 18000000) {
                i8 = 64;
            } else if (iIntValue3 >= 12000000) {
                i8 = 32;
            } else if (iIntValue3 >= 7200000) {
                i8 = 16;
            } else if (iIntValue3 < 3600000) {
                i8 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i8;
            codecProfileLevelArrH = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrH) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z7)) {
                if ("video/hevc".equals(this.f14177b) && iIntValue == 2) {
                    String str = nz2.f12301b;
                    if ("sailfish".equals(str) || "marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        j("codec.profileLevel, " + nbVar.f11790i + ", " + this.f14178c);
        return false;
    }

    private final boolean m(nb nbVar) {
        return this.f14177b.equals(nbVar.f11793l) || this.f14177b.equals(ql4.e(nbVar));
    }

    public final Point a(int i8, int i9) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14179d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i8, i9);
    }

    public final ca4 b(nb nbVar, nb nbVar2) {
        int i8 = true != nz2.e(nbVar.f11793l, nbVar2.f11793l) ? 8 : 0;
        if (this.f14183h) {
            if (nbVar.f11801t != nbVar2.f11801t) {
                i8 |= 1024;
            }
            if (!this.f14180e && (nbVar.f11798q != nbVar2.f11798q || nbVar.f11799r != nbVar2.f11799r)) {
                i8 |= 512;
            }
            if (!nz2.e(nbVar.f11805x, nbVar2.f11805x)) {
                i8 |= 2048;
            }
            String str = this.f14176a;
            if (nz2.f12303d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !nbVar.d(nbVar2)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new ca4(this.f14176a, nbVar, nbVar2, true != nbVar.d(nbVar2) ? 2 : 3, 0);
            }
        } else {
            if (nbVar.f11806y != nbVar2.f11806y) {
                i8 |= 4096;
            }
            if (nbVar.f11807z != nbVar2.f11807z) {
                i8 |= 8192;
            }
            if (nbVar.A != nbVar2.A) {
                i8 |= 16384;
            }
            if (i8 == 0 && "audio/mp4a-latm".equals(this.f14177b)) {
                Pair pairB = ql4.b(nbVar);
                Pair pairB2 = ql4.b(nbVar2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ca4(this.f14176a, nbVar, nbVar2, 3, 0);
                    }
                }
            }
            if (!nbVar.d(nbVar2)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(this.f14177b)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new ca4(this.f14176a, nbVar, nbVar2, 1, 0);
            }
        }
        return new ca4(this.f14176a, nbVar, nbVar2, 0, i8);
    }

    public final boolean d(nb nbVar) {
        return m(nbVar) && l(nbVar, false);
    }

    public final boolean e(nb nbVar) {
        String str;
        String str2;
        int i8;
        if (!m(nbVar) || !l(nbVar, true)) {
            return false;
        }
        if (this.f14183h) {
            int i9 = nbVar.f11798q;
            if (i9 <= 0 || (i8 = nbVar.f11799r) <= 0) {
                return true;
            }
            if (nz2.f12300a >= 21) {
                return g(i9, i8, nbVar.f11800s);
            }
            boolean z7 = i9 * i8 <= ql4.a();
            if (!z7) {
                j("legacyFrameSize, " + nbVar.f11798q + "x" + nbVar.f11799r);
            }
            return z7;
        }
        int i10 = nz2.f12300a;
        if (i10 >= 21) {
            int i11 = nbVar.f11807z;
            if (i11 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14179d;
                if (codecCapabilities == null) {
                    str2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        str2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i11)) {
                        str2 = "sampleRate.support, " + i11;
                    }
                }
                j(str2);
                return false;
            }
            int i12 = nbVar.f11806y;
            if (i12 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f14179d;
                if (codecCapabilities2 == null) {
                    str = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        str = "channelCount.aCaps";
                    } else {
                        String str3 = this.f14176a;
                        String str4 = this.f14177b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i10 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                            int i13 = "audio/ac3".equals(str4) ? 6 : "audio/eac3".equals(str4) ? 16 : 30;
                            pf2.f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i13 + "]");
                            maxInputChannelCount = i13;
                        }
                        if (maxInputChannelCount < i12) {
                            str = "channelCount.support, " + i12;
                        }
                    }
                }
                j(str);
                return false;
            }
        }
        return true;
    }

    public final boolean f(nb nbVar) {
        if (this.f14183h) {
            return this.f14180e;
        }
        Pair pairB = ql4.b(nbVar);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r8, int r9, double r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rk4.g(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14179d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.f14176a;
    }
}
