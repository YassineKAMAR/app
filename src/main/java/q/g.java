package q;

/* JADX INFO: loaded from: classes.dex */
class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f25687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25688b;

    g(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f25687a = new Object[i8];
    }

    @Override // q.f
    public boolean a(T t7) {
        int i8 = this.f25688b;
        Object[] objArr = this.f25687a;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = t7;
        this.f25688b = i8 + 1;
        return true;
    }

    @Override // q.f
    public T b() {
        int i8 = this.f25688b;
        if (i8 <= 0) {
            return null;
        }
        int i9 = i8 - 1;
        Object[] objArr = this.f25687a;
        T t7 = (T) objArr[i9];
        objArr[i9] = null;
        this.f25688b = i8 - 1;
        return t7;
    }

    @Override // q.f
    public void c(T[] tArr, int i8) {
        if (i8 > tArr.length) {
            i8 = tArr.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            T t7 = tArr[i9];
            int i10 = this.f25688b;
            Object[] objArr = this.f25687a;
            if (i10 < objArr.length) {
                objArr[i10] = t7;
                this.f25688b = i10 + 1;
            }
        }
    }
}
