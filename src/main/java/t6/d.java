package t6;

import f6.e0;

/* JADX INFO: loaded from: classes2.dex */
public class d implements Iterable<Integer> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f26520d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26523c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final d a(int i8, int i9, int i10) {
            return new d(i8, i9, i10);
        }
    }

    public d(int i8, int i9, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f26521a = i8;
        this.f26522b = k6.c.c(i8, i9, i10);
        this.f26523c = i10;
    }

    public final int a() {
        return this.f26521a;
    }

    public final int e() {
        return this.f26522b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f26521a != dVar.f26521a || this.f26522b != dVar.f26522b || this.f26523c != dVar.f26523c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f26523c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f26521a * 31) + this.f26522b) * 31) + this.f26523c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e0 iterator() {
        return new e(this.f26521a, this.f26522b, this.f26523c);
    }

    public boolean isEmpty() {
        if (this.f26523c > 0) {
            if (this.f26521a > this.f26522b) {
                return true;
            }
        } else if (this.f26521a < this.f26522b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f26523c > 0) {
            sb = new StringBuilder();
            sb.append(this.f26521a);
            sb.append("..");
            sb.append(this.f26522b);
            sb.append(" step ");
            i8 = this.f26523c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f26521a);
            sb.append(" downTo ");
            sb.append(this.f26522b);
            sb.append(" step ");
            i8 = -this.f26523c;
        }
        sb.append(i8);
        return sb.toString();
    }
}
