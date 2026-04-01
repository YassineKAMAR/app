package u3;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    static class a<T> implements k<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k<T> f26726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile transient boolean f26727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        transient T f26728c;

        a(k<T> kVar) {
            this.f26726a = (k) h.i(kVar);
        }

        @Override // u3.k
        public T get() {
            if (!this.f26727b) {
                synchronized (this) {
                    if (!this.f26727b) {
                        T t7 = this.f26726a.get();
                        this.f26728c = t7;
                        this.f26727b = true;
                        return t7;
                    }
                }
            }
            return (T) e.a(this.f26728c);
        }

        public String toString() {
            Object string;
            if (this.f26727b) {
                String strValueOf = String.valueOf(this.f26728c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            } else {
                string = this.f26726a;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b<T> implements k<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile k<T> f26729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile boolean f26730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f26731c;

        b(k<T> kVar) {
            this.f26729a = (k) h.i(kVar);
        }

        @Override // u3.k
        public T get() {
            if (!this.f26730b) {
                synchronized (this) {
                    if (!this.f26730b) {
                        k<T> kVar = this.f26729a;
                        Objects.requireNonNull(kVar);
                        T t7 = kVar.get();
                        this.f26731c = t7;
                        this.f26730b = true;
                        this.f26729a = null;
                        return t7;
                    }
                }
            }
            return (T) e.a(this.f26731c);
        }

        public String toString() {
            Object string = this.f26729a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f26731c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c<T> implements k<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f26732a;

        c(T t7) {
            this.f26732a = t7;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f26732a, ((c) obj).f26732a);
            }
            return false;
        }

        @Override // u3.k
        public T get() {
            return this.f26732a;
        }

        public int hashCode() {
            return f.b(this.f26732a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f26732a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> k<T> a(k<T> kVar) {
        return ((kVar instanceof b) || (kVar instanceof a)) ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar);
    }

    public static <T> k<T> b(T t7) {
        return new c(t7);
    }
}
