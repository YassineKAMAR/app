package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nh4 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nb f11888c;

    public nh4(int i8, nb nbVar, boolean z7) {
        super("AudioTrack write failed: " + i8);
        this.f11887b = z7;
        this.f11886a = i8;
        this.f11888c = nbVar;
    }
}
