package p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f25417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25420d;

    public c() {
        this(8);
    }

    public c(int i8) {
        if (i8 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i8 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i8 = Integer.bitCount(i8) != 1 ? Integer.highestOneBit(i8 - 1) << 1 : i8;
        this.f25420d = i8 - 1;
        this.f25417a = new int[i8];
    }

    private void c() {
        int[] iArr = this.f25417a;
        int length = iArr.length;
        int i8 = this.f25418b;
        int i9 = length - i8;
        int i10 = length << 1;
        if (i10 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, i8, iArr2, 0, i9);
        System.arraycopy(this.f25417a, 0, iArr2, i9, this.f25418b);
        this.f25417a = iArr2;
        this.f25418b = 0;
        this.f25419c = length;
        this.f25420d = i10 - 1;
    }

    public void a(int i8) {
        int[] iArr = this.f25417a;
        int i9 = this.f25419c;
        iArr[i9] = i8;
        int i10 = this.f25420d & (i9 + 1);
        this.f25419c = i10;
        if (i10 == this.f25418b) {
            c();
        }
    }

    public void b() {
        this.f25419c = this.f25418b;
    }

    public boolean d() {
        return this.f25418b == this.f25419c;
    }

    public int e() {
        int i8 = this.f25418b;
        if (i8 == this.f25419c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = this.f25417a[i8];
        this.f25418b = (i8 + 1) & this.f25420d;
        return i9;
    }
}
