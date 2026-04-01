package o7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f25323a = i.f25330a.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25324b;

    private final void d(int i8, int i9, String str) {
        byte b8;
        int length = str.length();
        while (i8 < length) {
            int iF = f(i9, 2);
            char cCharAt = str.charAt(i8);
            if (cCharAt >= v0.a().length || (b8 = v0.a()[cCharAt]) == 0) {
                int i10 = iF + 1;
                this.f25323a[iF] = cCharAt;
                i9 = i10;
                i8++;
            } else {
                if (b8 == 1) {
                    String str2 = v0.b()[cCharAt];
                    kotlin.jvm.internal.q.c(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f25323a, iF2);
                    i9 = iF2 + str2.length();
                } else {
                    char[] cArr = this.f25323a;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b8;
                    i9 = iF + 2;
                }
                this.f25324b = i9;
                i8++;
            }
        }
        int iF3 = f(i9, 1);
        this.f25323a[iF3] = '\"';
        this.f25324b = iF3 + 1;
    }

    private final void e(int i8) {
        f(this.f25324b, i8);
    }

    private final int f(int i8, int i9) {
        int i10 = i9 + i8;
        char[] cArr = this.f25323a;
        if (cArr.length <= i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, t6.l.b(i10, i8 * 2));
            kotlin.jvm.internal.q.e(cArrCopyOf, "copyOf(this, newSize)");
            this.f25323a = cArrCopyOf;
        }
        return i8;
    }

    @Override // o7.o0
    public void a(char c8) {
        e(1);
        char[] cArr = this.f25323a;
        int i8 = this.f25324b;
        this.f25324b = i8 + 1;
        cArr[i8] = c8;
    }

    @Override // o7.o0
    public void b(String text) {
        kotlin.jvm.internal.q.f(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f25323a;
        int i8 = this.f25324b;
        int i9 = i8 + 1;
        cArr[i8] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i9);
        int i10 = length + i9;
        for (int i11 = i9; i11 < i10; i11++) {
            char c8 = cArr[i11];
            if (c8 < v0.a().length && v0.a()[c8] != 0) {
                d(i11 - i9, i11, text);
                return;
            }
        }
        cArr[i10] = '\"';
        this.f25324b = i10 + 1;
    }

    @Override // o7.o0
    public void c(String text) {
        kotlin.jvm.internal.q.f(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f25323a, this.f25324b);
        this.f25324b += length;
    }

    public void g() {
        i.f25330a.a(this.f25323a);
    }

    public String toString() {
        return new String(this.f25323a, 0, this.f25324b);
    }

    @Override // o7.o0
    public void writeLong(long j8) {
        c(String.valueOf(j8));
    }
}
