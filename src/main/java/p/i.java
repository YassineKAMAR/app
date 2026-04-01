package p;

/* JADX INFO: loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f25459e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f25460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f25461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f25462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25463d;

    public i() {
        this(10);
    }

    public i(int i8) {
        this.f25460a = false;
        if (i8 == 0) {
            this.f25461b = d.f25421a;
            this.f25462c = d.f25423c;
        } else {
            int iE = d.e(i8);
            this.f25461b = new int[iE];
            this.f25462c = new Object[iE];
        }
    }

    private void i() {
        int i8 = this.f25463d;
        int[] iArr = this.f25461b;
        Object[] objArr = this.f25462c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f25459e) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        this.f25460a = false;
        this.f25463d = i9;
    }

    public void c(int i8, E e8) {
        int i9 = this.f25463d;
        if (i9 != 0 && i8 <= this.f25461b[i9 - 1]) {
            p(i8, e8);
            return;
        }
        if (this.f25460a && i9 >= this.f25461b.length) {
            i();
        }
        int i10 = this.f25463d;
        if (i10 >= this.f25461b.length) {
            int iE = d.e(i10 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f25461b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f25462c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25461b = iArr;
            this.f25462c = objArr;
        }
        this.f25461b[i10] = i8;
        this.f25462c[i10] = e8;
        this.f25463d = i10 + 1;
    }

    public void e() {
        int i8 = this.f25463d;
        Object[] objArr = this.f25462c;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f25463d = 0;
        this.f25460a = false;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f25461b = (int[]) this.f25461b.clone();
            iVar.f25462c = (Object[]) this.f25462c.clone();
            return iVar;
        } catch (CloneNotSupportedException e8) {
            throw new AssertionError(e8);
        }
    }

    public E k(int i8) {
        return l(i8, null);
    }

    public E l(int i8, E e8) {
        E e9;
        int iA = d.a(this.f25461b, this.f25463d, i8);
        return (iA < 0 || (e9 = (E) this.f25462c[iA]) == f25459e) ? e8 : e9;
    }

    public int n(int i8) {
        if (this.f25460a) {
            i();
        }
        return d.a(this.f25461b, this.f25463d, i8);
    }

    public int o(int i8) {
        if (this.f25460a) {
            i();
        }
        return this.f25461b[i8];
    }

    public void p(int i8, E e8) {
        int iA = d.a(this.f25461b, this.f25463d, i8);
        if (iA >= 0) {
            this.f25462c[iA] = e8;
            return;
        }
        int i9 = ~iA;
        int i10 = this.f25463d;
        if (i9 < i10) {
            Object[] objArr = this.f25462c;
            if (objArr[i9] == f25459e) {
                this.f25461b[i9] = i8;
                objArr[i9] = e8;
                return;
            }
        }
        if (this.f25460a && i10 >= this.f25461b.length) {
            i();
            i9 = ~d.a(this.f25461b, this.f25463d, i8);
        }
        int i11 = this.f25463d;
        if (i11 >= this.f25461b.length) {
            int iE = d.e(i11 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f25461b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f25462c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25461b = iArr;
            this.f25462c = objArr2;
        }
        int i12 = this.f25463d;
        if (i12 - i9 != 0) {
            int[] iArr3 = this.f25461b;
            int i13 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i13, i12 - i9);
            Object[] objArr4 = this.f25462c;
            System.arraycopy(objArr4, i9, objArr4, i13, this.f25463d - i9);
        }
        this.f25461b[i9] = i8;
        this.f25462c[i9] = e8;
        this.f25463d++;
    }

    public void q(int i8) {
        int iA = d.a(this.f25461b, this.f25463d, i8);
        if (iA >= 0) {
            Object[] objArr = this.f25462c;
            Object obj = objArr[iA];
            Object obj2 = f25459e;
            if (obj != obj2) {
                objArr[iA] = obj2;
                this.f25460a = true;
            }
        }
    }

    public int r() {
        if (this.f25460a) {
            i();
        }
        return this.f25463d;
    }

    public E s(int i8) {
        if (this.f25460a) {
            i();
        }
        return (E) this.f25462c[i8];
    }

    public String toString() {
        if (r() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f25463d * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f25463d; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(o(i8));
            sb.append('=');
            E eS = s(i8);
            if (eS != this) {
                sb.append(eS);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
