package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends ii0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map f8336s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dj0 f8337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ej0 f8338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MediaPlayer f8342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f8343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private bj0 f8347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f8348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private hi0 f8350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f8352r;

    static {
        HashMap map = new HashMap();
        f8336s = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public gi0(Context context, dj0 dj0Var, boolean z7, boolean z8, cj0 cj0Var, ej0 ej0Var) {
        super(context);
        this.f8340f = 0;
        this.f8341g = 0;
        this.f8351q = false;
        this.f8352r = null;
        setSurfaceTextureListener(this);
        this.f8337c = dj0Var;
        this.f8338d = ej0Var;
        this.f8348n = z7;
        this.f8339e = z8;
        ej0Var.a(this);
    }

    private final void E() {
        j2.v1.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f8343i == null || surfaceTexture == null) {
            return;
        }
        F(false);
        try {
            g2.t.m();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f8342h = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f8342h.setOnCompletionListener(this);
            this.f8342h.setOnErrorListener(this);
            this.f8342h.setOnInfoListener(this);
            this.f8342h.setOnPreparedListener(this);
            this.f8342h.setOnVideoSizeChangedListener(this);
            this.f8346l = 0;
            if (this.f8348n) {
                bj0 bj0Var = new bj0(getContext());
                this.f8347m = bj0Var;
                bj0Var.c(surfaceTexture, getWidth(), getHeight());
                this.f8347m.start();
                SurfaceTexture surfaceTextureA = this.f8347m.a();
                if (surfaceTextureA != null) {
                    surfaceTexture = surfaceTextureA;
                } else {
                    this.f8347m.d();
                    this.f8347m = null;
                }
            }
            this.f8342h.setDataSource(getContext(), this.f8343i);
            g2.t.n();
            this.f8342h.setSurface(new Surface(surfaceTexture));
            this.f8342h.setAudioStreamType(3);
            this.f8342h.setScreenOnWhilePlaying(true);
            this.f8342h.prepareAsync();
            G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e8) {
            qg0.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f8343i)), e8);
            onError(this.f8342h, 1, 0);
        }
    }

    private final void F(boolean z7) {
        j2.v1.k("AdMediaPlayerView release");
        bj0 bj0Var = this.f8347m;
        if (bj0Var != null) {
            bj0Var.d();
            this.f8347m = null;
        }
        MediaPlayer mediaPlayer = this.f8342h;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f8342h.release();
            this.f8342h = null;
            G(0);
            if (z7) {
                this.f8341g = 0;
            }
        }
    }

    private final void G(int i8) {
        if (i8 == 3) {
            this.f8338d.c();
            this.f9220b.b();
        } else if (this.f8340f == 3) {
            this.f8338d.e();
            this.f9220b.c();
        }
        this.f8340f = i8;
    }

    private final void H(float f8) {
        MediaPlayer mediaPlayer = this.f8342h;
        if (mediaPlayer == null) {
            qg0.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f8, f8);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean I() {
        int i8;
        return (this.f8342h == null || (i8 = this.f8340f) == -1 || i8 == 0 || i8 == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void L(gi0 gi0Var, MediaPlayer mediaPlayer) {
        String string;
        String str;
        MediaFormat format;
        if (!((Boolean) h2.y.c().b(ns.O1)).booleanValue() || gi0Var.f8337c == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    gi0Var.f8352r = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    string = format2.getString("codecs-string");
                                    str = "videoCodec";
                                    map.put(str, string);
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                string = format.getString("codecs-string");
                                str = "audioCodec";
                                map.put(str, string);
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                gi0Var.f8337c.U("onMetadataEvent", map);
            }
        } catch (RuntimeException e8) {
            g2.t.q().u(e8, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ void a(int i8) {
        hi0 hi0Var = this.f8350p;
        if (hi0Var != null) {
            hi0Var.onWindowVisibilityChanged(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int i() {
        if (I()) {
            return this.f8342h.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int j() {
        if (Build.VERSION.SDK_INT < 26 || !I()) {
            return -1;
        }
        return this.f8342h.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int k() {
        if (I()) {
            return this.f8342h.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int l() {
        MediaPlayer mediaPlayer = this.f8342h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final int m() {
        MediaPlayer mediaPlayer = this.f8342h;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final long n() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final long o() {
        if (this.f8352r != null) {
            return (p() * ((long) this.f8346l)) / 100;
        }
        return -1L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i8) {
        this.f8346l = i8;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        j2.v1.k("AdMediaPlayerView completion");
        G(5);
        this.f8341g = 5;
        j2.k2.f23991k.post(new xh0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
        Map map = f8336s;
        String str = (String) map.get(Integer.valueOf(i8));
        String str2 = (String) map.get(Integer.valueOf(i9));
        qg0.g("AdMediaPlayerView MediaPlayer error: " + str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2);
        G(-1);
        this.f8341g = -1;
        j2.k2.f23991k.post(new zh0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i8, int i9) {
        Map map = f8336s;
        j2.v1.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i8))) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + ((String) map.get(Integer.valueOf(i9))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f8344j
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.f8345k
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.f8344j
            if (r2 <= 0) goto L7e
            int r2 = r5.f8345k
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.bj0 r2 = r5.f8347m
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.f8344j
            int r1 = r0 * r7
            int r2 = r5.f8345k
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.f8345k
            int r0 = r0 * r6
            int r2 = r5.f8344j
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.f8344j
            int r1 = r1 * r7
            int r2 = r5.f8345k
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.f8344j
            int r4 = r5.f8345k
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.bj0 r6 = r5.f8347m
            if (r6 == 0) goto L88
            r6.b(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gi0.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        j2.v1.k("AdMediaPlayerView prepared");
        G(2);
        this.f8338d.b();
        j2.k2.f23991k.post(new wh0(this, mediaPlayer));
        this.f8344j = mediaPlayer.getVideoWidth();
        this.f8345k = mediaPlayer.getVideoHeight();
        int i8 = this.f8349o;
        if (i8 != 0) {
            t(i8);
        }
        if (this.f8339e && I() && this.f8342h.getCurrentPosition() > 0 && this.f8341g != 3) {
            j2.v1.k("AdMediaPlayerView nudging MediaPlayer");
            H(0.0f);
            this.f8342h.start();
            int currentPosition = this.f8342h.getCurrentPosition();
            long jA = g2.t.b().a();
            while (I() && this.f8342h.getCurrentPosition() == currentPosition && g2.t.b().a() - jA <= 250) {
            }
            this.f8342h.pause();
            v();
        }
        qg0.f("AdMediaPlayerView stream dimensions: " + this.f8344j + " x " + this.f8345k);
        if (this.f8341g == 3) {
            s();
        }
        v();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        j2.v1.k("AdMediaPlayerView surface created");
        E();
        j2.k2.f23991k.post(new ai0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        j2.v1.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f8342h;
        if (mediaPlayer != null && this.f8349o == 0) {
            this.f8349o = mediaPlayer.getCurrentPosition();
        }
        bj0 bj0Var = this.f8347m;
        if (bj0Var != null) {
            bj0Var.d();
        }
        j2.k2.f23991k.post(new ci0(this));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        j2.v1.k("AdMediaPlayerView surface changed");
        int i10 = this.f8341g;
        boolean z7 = false;
        if (this.f8344j == i8 && this.f8345k == i9) {
            z7 = true;
        }
        if (this.f8342h != null && i10 == 3 && z7) {
            int i11 = this.f8349o;
            if (i11 != 0) {
                t(i11);
            }
            s();
        }
        bj0 bj0Var = this.f8347m;
        if (bj0Var != null) {
            bj0Var.b(i8, i9);
        }
        j2.k2.f23991k.post(new bi0(this, i8, i9));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f8338d.f(this);
        this.f9219a.a(surfaceTexture, this.f8350p);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i8, int i9) {
        j2.v1.k("AdMediaPlayerView size changed: " + i8 + " x " + i9);
        this.f8344j = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f8345k = videoHeight;
        if (this.f8344j == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i8) {
        j2.v1.k("AdMediaPlayerView window visibility changed to " + i8);
        j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.vh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16268a.a(i8);
            }
        });
        super.onWindowVisibilityChanged(i8);
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final long p() {
        if (this.f8352r != null) {
            return ((long) k()) * ((long) this.f8352r.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final String q() {
        return "MediaPlayer".concat(true != this.f8348n ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void r() {
        j2.v1.k("AdMediaPlayerView pause");
        if (I() && this.f8342h.isPlaying()) {
            this.f8342h.pause();
            G(4);
            j2.k2.f23991k.post(new ei0(this));
        }
        this.f8341g = 4;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void s() {
        j2.v1.k("AdMediaPlayerView play");
        if (I()) {
            this.f8342h.start();
            G(3);
            this.f9219a.b();
            j2.k2.f23991k.post(new di0(this));
        }
        this.f8341g = 3;
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void t(int i8) {
        j2.v1.k("AdMediaPlayerView seek " + i8);
        if (!I()) {
            this.f8349o = i8;
        } else {
            this.f8342h.seekTo(i8);
            this.f8349o = 0;
        }
    }

    @Override // android.view.View
    public final String toString() {
        return gi0.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void u(hi0 hi0Var) {
        this.f8350p = hi0Var;
    }

    @Override // com.google.android.gms.internal.ads.ii0, com.google.android.gms.internal.ads.gj0
    public final void v() {
        H(this.f9220b.a());
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void w(String str) {
        Uri uri = Uri.parse(str);
        hn hnVarG = hn.g(uri);
        if (hnVarG == null || hnVarG.f8832a != null) {
            if (hnVarG != null) {
                uri = Uri.parse(hnVarG.f8832a);
            }
            this.f8343i = uri;
            this.f8349o = 0;
            E();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void x() {
        j2.v1.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f8342h;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f8342h.release();
            this.f8342h = null;
            G(0);
            this.f8341g = 0;
        }
        this.f8338d.d();
    }

    @Override // com.google.android.gms.internal.ads.ii0
    public final void y(float f8, float f9) {
        bj0 bj0Var = this.f8347m;
        if (bj0Var != null) {
            bj0Var.e(f8, f9);
        }
    }
}
