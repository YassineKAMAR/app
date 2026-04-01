package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class yj4 implements mk4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c93 f17788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c93 f17789c;

    public yj4(int i8, boolean z7) {
        wj4 wj4Var = new wj4(i8);
        xj4 xj4Var = new xj4(i8);
        this.f17788b = wj4Var;
        this.f17789c = xj4Var;
    }

    static /* synthetic */ HandlerThread a(int i8) {
        return new HandlerThread(bk4.n(i8, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread b(int i8) {
        return new HandlerThread(bk4.n(i8, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final bk4 c(lk4 lk4Var) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = lk4Var.f10762a.f14176a;
        bk4 bk4Var = null;
        try {
            int i8 = nz2.f12300a;
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                bk4 bk4Var2 = new bk4(mediaCodecCreateByCodecName, a(((wj4) this.f17788b).f16772a), b(((xj4) this.f17789c).f17302a), false, null);
                try {
                    Trace.endSection();
                    bk4.m(bk4Var2, lk4Var.f10763b, lk4Var.f10765d, null, 0);
                    return bk4Var2;
                } catch (Exception e8) {
                    e = e8;
                    bk4Var = bk4Var2;
                    if (bk4Var != null) {
                        bk4Var.u();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodecCreateByCodecName = null;
        }
    }
}
