package m3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class d2 extends h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f24647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f24648b;

    d2(Object obj) {
        this.f24648b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f24647a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f24647a) {
            throw new NoSuchElementException();
        }
        this.f24647a = true;
        return this.f24648b;
    }
}
