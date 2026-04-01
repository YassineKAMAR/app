package t6;

import f6.e0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26527d;

    public e(int i8, int i9, int i10) {
        this.f26524a = i10;
        this.f26525b = i9;
        boolean z7 = true;
        if (i10 <= 0 ? i8 < i9 : i8 > i9) {
            z7 = false;
        }
        this.f26526c = z7;
        this.f26527d = z7 ? i8 : i9;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26526c;
    }

    @Override // f6.e0
    public int nextInt() {
        int i8 = this.f26527d;
        if (i8 != this.f26525b) {
            this.f26527d = this.f26524a + i8;
        } else {
            if (!this.f26526c) {
                throw new NoSuchElementException();
            }
            this.f26526c = false;
        }
        return i8;
    }
}
