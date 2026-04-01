package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2759a;

    f(long j8) {
        this.f2759a = j8;
    }

    public long c() {
        return this.f2759a;
    }
}
