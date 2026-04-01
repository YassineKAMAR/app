package z1;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f27675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f27676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f27677c;

    public x(int i8, int i9, int i10) {
        this.f27675a = i8;
        this.f27676b = i9;
        this.f27677c = i10;
    }

    public int a() {
        return this.f27675a;
    }

    public int b() {
        return this.f27677c;
    }

    public int c() {
        return this.f27676b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f27675a), Integer.valueOf(this.f27676b), Integer.valueOf(this.f27677c));
    }
}
