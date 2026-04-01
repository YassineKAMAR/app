package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f2720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f2721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2722c;

    public e(long j8, long j9, int i8) {
        this.f2720a = j8;
        this.f2721b = j9;
        this.f2722c = i8;
    }

    public final long a() {
        return this.f2721b;
    }

    public final long b() {
        return this.f2720a;
    }

    public final int c() {
        return this.f2722c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2720a == eVar.f2720a && this.f2721b == eVar.f2721b && this.f2722c == eVar.f2722c;
    }

    public int hashCode() {
        return (((d.a(this.f2720a) * 31) + d.a(this.f2721b)) * 31) + this.f2722c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f2720a + ", ModelVersion=" + this.f2721b + ", TopicCode=" + this.f2722c + " }");
    }
}
