package t6;

import f6.f0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f26534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26537d;

    public h(long j8, long j9, long j10) {
        this.f26534a = j10;
        this.f26535b = j9;
        boolean z7 = true;
        if (j10 <= 0 ? j8 < j9 : j8 > j9) {
            z7 = false;
        }
        this.f26536c = z7;
        this.f26537d = z7 ? j8 : j9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26536c;
    }

    @Override // f6.f0
    public long nextLong() {
        long j8 = this.f26537d;
        if (j8 != this.f26535b) {
            this.f26537d = this.f26534a + j8;
        } else {
            if (!this.f26536c) {
                throw new NoSuchElementException();
            }
            this.f26536c = false;
        }
        return j8;
    }
}
