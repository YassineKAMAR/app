package t6;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f6.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26517d;

    public b(char c8, char c9, int i8) {
        this.f26514a = i8;
        this.f26515b = c9;
        boolean z7 = true;
        if (i8 <= 0 ? q.g(c8, c9) < 0 : q.g(c8, c9) > 0) {
            z7 = false;
        }
        this.f26516c = z7;
        this.f26517d = z7 ? c8 : c9;
    }

    @Override // f6.l
    public char a() {
        int i8 = this.f26517d;
        if (i8 != this.f26515b) {
            this.f26517d = this.f26514a + i8;
        } else {
            if (!this.f26516c) {
                throw new NoSuchElementException();
            }
            this.f26516c = false;
        }
        return (char) i8;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f26516c;
    }
}
