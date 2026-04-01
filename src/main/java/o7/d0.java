package o7;

import java.util.Arrays;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f25318a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f25319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25320c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25321a = new a();

        private a() {
        }
    }

    public d0() {
        int[] iArr = new int[8];
        for (int i8 = 0; i8 < 8; i8++) {
            iArr[i8] = -1;
        }
        this.f25319b = iArr;
        this.f25320c = -1;
    }

    private final void e() {
        int i8 = this.f25320c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f25318a, i8);
        kotlin.jvm.internal.q.e(objArrCopyOf, "copyOf(this, newSize)");
        this.f25318a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f25319b, i8);
        kotlin.jvm.internal.q.e(iArrCopyOf, "copyOf(this, newSize)");
        this.f25319b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i8 = this.f25320c + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = this.f25318a[i9];
            if (obj instanceof k7.f) {
                k7.f fVar = (k7.f) obj;
                if (!kotlin.jvm.internal.q.b(fVar.e(), k.b.f24283a)) {
                    int i10 = this.f25319b[i9];
                    if (i10 >= 0) {
                        sb.append(".");
                        sb.append(fVar.g(i10));
                    }
                } else if (this.f25319b[i9] != -1) {
                    sb.append("[");
                    sb.append(this.f25319b[i9]);
                    sb.append("]");
                }
            } else if (obj != a.f25321a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.q.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void b() {
        int i8 = this.f25320c;
        int[] iArr = this.f25319b;
        if (iArr[i8] == -2) {
            iArr[i8] = -1;
            this.f25320c = i8 - 1;
        }
        int i9 = this.f25320c;
        if (i9 != -1) {
            this.f25320c = i9 - 1;
        }
    }

    public final void c(k7.f sd) {
        kotlin.jvm.internal.q.f(sd, "sd");
        int i8 = this.f25320c + 1;
        this.f25320c = i8;
        if (i8 == this.f25318a.length) {
            e();
        }
        this.f25318a[i8] = sd;
    }

    public final void d() {
        int[] iArr = this.f25319b;
        int i8 = this.f25320c;
        if (iArr[i8] == -2) {
            this.f25318a[i8] = a.f25321a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f25319b;
        int i8 = this.f25320c;
        if (iArr[i8] != -2) {
            int i9 = i8 + 1;
            this.f25320c = i9;
            if (i9 == this.f25318a.length) {
                e();
            }
        }
        Object[] objArr = this.f25318a;
        int i10 = this.f25320c;
        objArr[i10] = obj;
        this.f25319b[i10] = -2;
    }

    public final void g(int i8) {
        this.f25319b[this.f25320c] = i8;
    }

    public String toString() {
        return a();
    }
}
