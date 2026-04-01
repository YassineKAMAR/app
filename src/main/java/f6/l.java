package f6;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l implements Iterator<Character> {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
