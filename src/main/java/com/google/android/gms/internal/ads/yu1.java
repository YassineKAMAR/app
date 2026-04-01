package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yu1 implements j84 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w84 f17929a;

    public yu1(w84 w84Var) {
        this.f17929a = w84Var;
    }

    @Override // com.google.android.gms.internal.ads.w84
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String k() {
        String packageName = ((io0) this.f17929a).a().getPackageName();
        r84.b(packageName);
        return packageName;
    }
}
