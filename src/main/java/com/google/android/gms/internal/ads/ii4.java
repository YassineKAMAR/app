package com.google.android.gms.internal.ads;

import android.annotation.NonNull;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
final class ii4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb f9231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kk1 f9239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f9240j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9241k = false;

    public ii4(nb nbVar, int i8, int i9, int i10, int i11, int i12, int i13, int i14, kk1 kk1Var, boolean z7, boolean z8) {
        this.f9231a = nbVar;
        this.f9232b = i8;
        this.f9233c = i9;
        this.f9234d = i10;
        this.f9235e = i11;
        this.f9236f = i12;
        this.f9237g = i13;
        this.f9238h = i14;
        this.f9239i = kk1Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.media.AudioTrack$Builder] */
    public final AudioTrack a(boolean z7, zb4 zb4Var, int i8) throws kh4 {
        AudioTrack audioTrack;
        try {
            int i9 = nz2.f12300a;
            if (i9 >= 29) {
                audioTrack = new Object() { // from class: android.media.AudioTrack$Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    @NonNull
                    public native /* synthetic */ AudioTrack build() throws UnsupportedOperationException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setAudioAttributes(@NonNull AudioAttributes audioAttributes) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setAudioFormat(@NonNull AudioFormat audioFormat) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setBufferSizeInBytes(int i10) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setSessionId(int i10) throws IllegalArgumentException;

                    @NonNull
                    public native /* synthetic */ AudioTrack$Builder setTransferMode(int i10) throws IllegalArgumentException;
                }.setAudioAttributes(zb4Var.a().f17143a).setAudioFormat(nz2.G(this.f9235e, this.f9236f, this.f9237g)).setTransferMode(1).setBufferSizeInBytes(this.f9238h).setSessionId(i8).setOffloadedPlayback(this.f9233c == 1).build();
            } else if (i9 >= 21) {
                audioTrack = new AudioTrack(zb4Var.a().f17143a, nz2.G(this.f9235e, this.f9236f, this.f9237g), this.f9238h, 1, i8);
            } else {
                int i10 = zb4Var.f18146a;
                audioTrack = i8 == 0 ? new AudioTrack(3, this.f9235e, this.f9236f, this.f9237g, this.f9238h, 1) : new AudioTrack(3, this.f9235e, this.f9236f, this.f9237g, this.f9238h, 1, i8);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new kh4(state, this.f9235e, this.f9236f, this.f9238h, this.f9231a, b(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e8) {
            throw new kh4(0, this.f9235e, this.f9236f, this.f9238h, this.f9231a, b(), e8);
        }
    }

    public final boolean b() {
        return this.f9233c == 1;
    }
}
