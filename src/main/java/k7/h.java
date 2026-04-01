package k7;

import java.util.Iterator;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public static final class a implements Iterator<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24274b;

        a(f fVar) {
            this.f24274b = fVar;
            this.f24273a = fVar.f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f next() {
            f fVar = this.f24274b;
            int iF = fVar.f();
            int i8 = this.f24273a;
            this.f24273a = i8 - 1;
            return fVar.i(iF - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24273a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f24276b;

        b(f fVar) {
            this.f24276b = fVar;
            this.f24275a = fVar.f();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            f fVar = this.f24276b;
            int iF = fVar.f();
            int i8 = this.f24275a;
            this.f24275a = i8 - 1;
            return fVar.g(iF - i8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24275a > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24277a;

        public c(f fVar) {
            this.f24277a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<f> iterator() {
            return new a(this.f24277a);
        }
    }

    public static final class d implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f24278a;

        public d(f fVar) {
            this.f24278a = fVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return new b(this.f24278a);
        }
    }

    public static final Iterable<f> a(f fVar) {
        q.f(fVar, "<this>");
        return new c(fVar);
    }

    public static final Iterable<String> b(f fVar) {
        q.f(fVar, "<this>");
        return new d(fVar);
    }
}
