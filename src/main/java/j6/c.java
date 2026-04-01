package j6;

import f6.j;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
final class c<T extends Enum<T>> extends f6.b<T> implements a<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T[] f24136b;

    public c(T[] entries) {
        q.f(entries, "entries");
        this.f24136b = entries;
    }

    @Override // f6.a
    public int a() {
        return this.f24136b.length;
    }

    @Override // f6.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return false;
    }

    public boolean e(T element) {
        q.f(element, "element");
        return ((Enum) j.t(this.f24136b, element.ordinal())) == element;
    }

    @Override // f6.b, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public T get(int i8) {
        f6.b.f21788a.a(i8, this.f24136b.length);
        return this.f24136b[i8];
    }

    public int i(T element) {
        q.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) j.t(this.f24136b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // f6.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }

    @Override // f6.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    public int n(T element) {
        q.f(element, "element");
        return indexOf(element);
    }
}
