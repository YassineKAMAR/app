package com.google.android.gms.internal.ads;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent$Builder;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lg4 implements ge4, mg4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ng4 f10692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PlaybackSession f10693c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f10699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PlaybackMetrics$Builder f10700j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10701k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private bk0 f10704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private kg4 f10705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private kg4 f10706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private kg4 f10707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private nb f10708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private nb f10709s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private nb f10710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10711u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f10714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10716z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r01 f10695e = new r01();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final py0 f10696f = new py0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f10698h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f10697g = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10694d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10702l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10703m = 0;

    private lg4(Context context, PlaybackSession playbackSession) {
        this.f10691a = context.getApplicationContext();
        this.f10693c = playbackSession;
        jg4 jg4Var = new jg4(jg4.f9614i);
        this.f10692b = jg4Var;
        jg4Var.e(this);
    }

    public static lg4 m(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new lg4(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int r(int i8) {
        switch (nz2.u(i8)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void s() {
        PlaybackMetrics$Builder playbackMetrics$Builder = this.f10700j;
        if (playbackMetrics$Builder != null && this.f10716z) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.f10715y);
            this.f10700j.setVideoFramesDropped(this.f10713w);
            this.f10700j.setVideoFramesPlayed(this.f10714x);
            Long l8 = (Long) this.f10697g.get(this.f10699i);
            this.f10700j.setNetworkTransferDurationMillis(l8 == null ? 0L : l8.longValue());
            Long l9 = (Long) this.f10698h.get(this.f10699i);
            this.f10700j.setNetworkBytesRead(l9 == null ? 0L : l9.longValue());
            this.f10700j.setStreamSource((l9 == null || l9.longValue() <= 0) ? 0 : 1);
            this.f10693c.reportPlaybackMetrics(this.f10700j.build());
        }
        this.f10700j = null;
        this.f10699i = null;
        this.f10715y = 0;
        this.f10713w = 0;
        this.f10714x = 0;
        this.f10708r = null;
        this.f10709s = null;
        this.f10710t = null;
        this.f10716z = false;
    }

    private final void t(long j8, nb nbVar, int i8) {
        if (nz2.e(this.f10709s, nbVar)) {
            return;
        }
        int i9 = this.f10709s == null ? 1 : 0;
        this.f10709s = nbVar;
        x(0, j8, nbVar, i9);
    }

    private final void u(long j8, nb nbVar, int i8) {
        if (nz2.e(this.f10710t, nbVar)) {
            return;
        }
        int i9 = this.f10710t == null ? 1 : 0;
        this.f10710t = nbVar;
        x(2, j8, nbVar, i9);
    }

    private final void v(s11 s11Var, tm4 tm4Var) {
        int iA;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.f10700j;
        if (tm4Var == null || (iA = s11Var.a(tm4Var.f15161a)) == -1) {
            return;
        }
        int i8 = 0;
        s11Var.d(iA, this.f10696f, false);
        s11Var.e(this.f10696f.f13191c, this.f10695e, 0L);
        fy fyVar = this.f10695e.f13836c.f6163b;
        if (fyVar != null) {
            int iY = nz2.y(fyVar.f8107a);
            i8 = iY != 0 ? iY != 1 ? iY != 2 ? 1 : 4 : 5 : 3;
        }
        playbackMetrics$Builder.setStreamType(i8);
        r01 r01Var = this.f10695e;
        if (r01Var.f13846m != -9223372036854775807L && !r01Var.f13844k && !r01Var.f13841h && !r01Var.b()) {
            playbackMetrics$Builder.setMediaDurationMillis(nz2.E(this.f10695e.f13846m));
        }
        playbackMetrics$Builder.setPlaybackType(true != this.f10695e.b() ? 1 : 2);
        this.f10716z = true;
    }

    private final void w(long j8, nb nbVar, int i8) {
        if (nz2.e(this.f10708r, nbVar)) {
            return;
        }
        int i9 = this.f10708r == null ? 1 : 0;
        this.f10708r = nbVar;
        x(1, j8, nbVar, i9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.metrics.TrackChangeEvent$Builder] */
    private final void x(final int i8, long j8, nb nbVar, int i9) {
        TrackChangeEvent$Builder timeSinceCreatedMillis = new Object(i8) { // from class: android.media.metrics.TrackChangeEvent$Builder
            static {
                throw new NoClassDefFoundError();
            }

            @NonNull
            public native /* synthetic */ TrackChangeEvent build();

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setAudioSampleRate(int i10);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setBitrate(int i10);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setChannelCount(int i10);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setCodecName(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setContainerMimeType(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setHeight(int i10);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setLanguage(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setLanguageRegion(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setSampleMimeType(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTimeSinceCreatedMillis(long j9);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTrackChangeReason(int i10);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTrackState(int i10);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setVideoFrameRate(float f8);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setWidth(int i10);
        }.setTimeSinceCreatedMillis(j8 - this.f10694d);
        if (nbVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i9 != 1 ? 1 : 2);
            String str = nbVar.f11792k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = nbVar.f11793l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = nbVar.f11790i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i10 = nbVar.f11789h;
            if (i10 != -1) {
                timeSinceCreatedMillis.setBitrate(i10);
            }
            int i11 = nbVar.f11798q;
            if (i11 != -1) {
                timeSinceCreatedMillis.setWidth(i11);
            }
            int i12 = nbVar.f11799r;
            if (i12 != -1) {
                timeSinceCreatedMillis.setHeight(i12);
            }
            int i13 = nbVar.f11806y;
            if (i13 != -1) {
                timeSinceCreatedMillis.setChannelCount(i13);
            }
            int i14 = nbVar.f11807z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i14);
            }
            String str4 = nbVar.f11784c;
            if (str4 != null) {
                int i15 = nz2.f12300a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f8 = nbVar.f11800s;
            if (f8 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f8);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f10716z = true;
        this.f10693c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean y(kg4 kg4Var) {
        if (kg4Var != null) {
            return kg4Var.f10074c.equals(this.f10692b.m());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void a(ee4 ee4Var, nb nbVar, ca4 ca4Var) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void b(ee4 ee4Var, int i8, long j8, long j9) {
        tm4 tm4Var = ee4Var.f7290d;
        if (tm4Var != null) {
            ng4 ng4Var = this.f10692b;
            s11 s11Var = ee4Var.f7288b;
            HashMap map = this.f10698h;
            String strD = ng4Var.d(s11Var, tm4Var);
            Long l8 = (Long) map.get(strD);
            Long l9 = (Long) this.f10697g.get(strD);
            this.f10698h.put(strD, Long.valueOf((l8 == null ? 0L : l8.longValue()) + j8));
            this.f10697g.put(strD, Long.valueOf((l9 != null ? l9.longValue() : 0L) + ((long) i8)));
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void c(ee4 ee4Var, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void d(ee4 ee4Var, ba4 ba4Var) {
        this.f10713w += ba4Var.f5687g;
        this.f10714x += ba4Var.f5685e;
    }

    @Override // com.google.android.gms.internal.ads.mg4
    public final void e(ee4 ee4Var, String str) {
        tm4 tm4Var = ee4Var.f7290d;
        if (tm4Var == null || !tm4Var.b()) {
            s();
            this.f10699i = str;
            this.f10700j = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.2.0-alpha01");
            v(ee4Var.f7288b, ee4Var.f7290d);
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void f(ee4 ee4Var, km4 km4Var, pm4 pm4Var, IOException iOException, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void g(ee4 ee4Var, jj1 jj1Var) {
        kg4 kg4Var = this.f10705o;
        if (kg4Var != null) {
            nb nbVar = kg4Var.f10072a;
            if (nbVar.f11799r == -1) {
                l9 l9VarB = nbVar.b();
                l9VarB.C(jj1Var.f9655a);
                l9VarB.h(jj1Var.f9656b);
                this.f10705o = new kg4(l9VarB.D(), 0, kg4Var.f10074c);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ca  */
    /* JADX WARN: Type inference failed for: r5v23, types: [android.media.metrics.PlaybackStateEvent$Builder] */
    /* JADX WARN: Type inference failed for: r5v26, types: [android.media.metrics.NetworkEvent$Builder] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.media.metrics.PlaybackErrorEvent$Builder] */
    @Override // com.google.android.gms.internal.ads.ge4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(com.google.android.gms.internal.ads.lu0 r21, com.google.android.gms.internal.ads.fe4 r22) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lg4.h(com.google.android.gms.internal.ads.lu0, com.google.android.gms.internal.ads.fe4):void");
    }

    @Override // com.google.android.gms.internal.ads.mg4
    public final void i(ee4 ee4Var, String str, boolean z7) {
        tm4 tm4Var = ee4Var.f7290d;
        if ((tm4Var == null || !tm4Var.b()) && str.equals(this.f10699i)) {
            s();
        }
        this.f10697g.remove(str);
        this.f10698h.remove(str);
    }

    public final LogSessionId j() {
        return this.f10693c.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void k(ee4 ee4Var, pm4 pm4Var) {
        tm4 tm4Var = ee4Var.f7290d;
        if (tm4Var == null) {
            return;
        }
        nb nbVar = pm4Var.f12945b;
        nbVar.getClass();
        kg4 kg4Var = new kg4(nbVar, 0, this.f10692b.d(ee4Var.f7288b, tm4Var));
        int i8 = pm4Var.f12944a;
        if (i8 != 0) {
            if (i8 == 1) {
                this.f10706p = kg4Var;
                return;
            } else if (i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f10707q = kg4Var;
                return;
            }
        }
        this.f10705o = kg4Var;
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void l(ee4 ee4Var, nb nbVar, ca4 ca4Var) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void n(ee4 ee4Var, bk0 bk0Var) {
        this.f10704n = bk0Var;
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void o(ee4 ee4Var, Object obj, long j8) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void p(ee4 ee4Var, kt0 kt0Var, kt0 kt0Var2, int i8) {
        if (i8 == 1) {
            this.f10711u = true;
            i8 = 1;
        }
        this.f10701k = i8;
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void q(ee4 ee4Var, int i8, long j8) {
    }
}
