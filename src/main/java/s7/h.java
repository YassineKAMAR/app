package s7;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f26338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f26339b;

    /* JADX WARN: Illegal instructions before constructor call */
    public h() {
        float f8 = 0.0f;
        this(f8, f8, 3, null);
    }

    public h(float f8, float f9) {
        this.f26338a = f8;
        this.f26339b = f9;
    }

    public /* synthetic */ h(float f8, float f9, int i8, j jVar) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 1.0f : f9);
    }

    public final float a() {
        return this.f26338a;
    }

    public final float b() {
        return this.f26339b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f26338a, hVar.f26338a) == 0 && Float.compare(this.f26339b, hVar.f26339b) == 0;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f26338a) * 31) + Float.floatToIntBits(this.f26339b);
    }

    public String toString() {
        return "VolumeInfo(left=" + this.f26338a + ", right=" + this.f26339b + ')';
    }
}
