package p;

/* JADX INFO: loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f25424e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f25426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f25427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25428d;

    public e() {
        this(10);
    }

    public e(int i8) {
        this.f25425a = false;
        if (i8 == 0) {
            this.f25426b = d.f25422b;
            this.f25427c = d.f25423c;
        } else {
            int iF = d.f(i8);
            this.f25426b = new long[iF];
            this.f25427c = new Object[iF];
        }
    }

    private void i() {
        int i8 = this.f25428d;
        long[] jArr = this.f25426b;
        Object[] objArr = this.f25427c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f25424e) {
                if (i10 != i9) {
                    jArr[i9] = jArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        this.f25425a = false;
        this.f25428d = i9;
    }

    public void c(long j8, E e8) {
        int i8 = this.f25428d;
        if (i8 != 0 && j8 <= this.f25426b[i8 - 1]) {
            o(j8, e8);
            return;
        }
        if (this.f25425a && i8 >= this.f25426b.length) {
            i();
        }
        int i9 = this.f25428d;
        if (i9 >= this.f25426b.length) {
            int iF = d.f(i9 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f25426b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f25427c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25426b = jArr;
            this.f25427c = objArr;
        }
        this.f25426b[i9] = j8;
        this.f25427c[i9] = e8;
        this.f25428d = i9 + 1;
    }

    public void e() {
        int i8 = this.f25428d;
        Object[] objArr = this.f25427c;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f25428d = 0;
        this.f25425a = false;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f25426b = (long[]) this.f25426b.clone();
            eVar.f25427c = (Object[]) this.f25427c.clone();
            return eVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public E k(long j8) {
        return l(j8, null);
    }

    public E l(long j8, E e8) {
        E e9;
        int iB = d.b(this.f25426b, this.f25428d, j8);
        return (iB < 0 || (e9 = (E) this.f25427c[iB]) == f25424e) ? e8 : e9;
    }

    public long n(int i8) {
        if (this.f25425a) {
            i();
        }
        return this.f25426b[i8];
    }

    public void o(long j8, E e8) {
        int iB = d.b(this.f25426b, this.f25428d, j8);
        if (iB >= 0) {
            this.f25427c[iB] = e8;
            return;
        }
        int i8 = ~iB;
        int i9 = this.f25428d;
        if (i8 < i9) {
            Object[] objArr = this.f25427c;
            if (objArr[i8] == f25424e) {
                this.f25426b[i8] = j8;
                objArr[i8] = e8;
                return;
            }
        }
        if (this.f25425a && i9 >= this.f25426b.length) {
            i();
            i8 = ~d.b(this.f25426b, this.f25428d, j8);
        }
        int i10 = this.f25428d;
        if (i10 >= this.f25426b.length) {
            int iF = d.f(i10 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f25426b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f25427c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25426b = jArr;
            this.f25427c = objArr2;
        }
        int i11 = this.f25428d;
        if (i11 - i8 != 0) {
            long[] jArr3 = this.f25426b;
            int i12 = i8 + 1;
            System.arraycopy(jArr3, i8, jArr3, i12, i11 - i8);
            Object[] objArr4 = this.f25427c;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f25428d - i8);
        }
        this.f25426b[i8] = j8;
        this.f25427c[i8] = e8;
        this.f25428d++;
    }

    public void p(long j8) {
        int iB = d.b(this.f25426b, this.f25428d, j8);
        if (iB >= 0) {
            Object[] objArr = this.f25427c;
            Object obj = objArr[iB];
            Object obj2 = f25424e;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f25425a = true;
            }
        }
    }

    public int q() {
        if (this.f25425a) {
            i();
        }
        return this.f25428d;
    }

    public E r(int i8) {
        if (this.f25425a) {
            i();
        }
        return (E) this.f25427c[i8];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25428d * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f25428d; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(n(i8));
            sb.append('=');
            E eR = r(i8);
            if (eR != this) {
                sb.append(eR);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
