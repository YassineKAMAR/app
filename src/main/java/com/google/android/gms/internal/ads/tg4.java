package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tg4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15092c;

    public final tg4 a(boolean z7) {
        this.f15090a = true;
        return this;
    }

    public final tg4 b(boolean z7) {
        this.f15091b = z7;
        return this;
    }

    public final tg4 c(boolean z7) {
        this.f15092c = z7;
        return this;
    }

    public final vg4 d() {
        if (this.f15090a || !(this.f15091b || this.f15092c)) {
            return new vg4(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
