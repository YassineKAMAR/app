package b1;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3271d;

    public b(boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f3268a = z7;
        this.f3269b = z8;
        this.f3270c = z9;
        this.f3271d = z10;
    }

    public boolean a() {
        return this.f3268a;
    }

    public boolean b() {
        return this.f3270c;
    }

    public boolean c() {
        return this.f3271d;
    }

    public boolean d() {
        return this.f3269b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3268a == bVar.f3268a && this.f3269b == bVar.f3269b && this.f3270c == bVar.f3270c && this.f3271d == bVar.f3271d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f3268a;
        int i8 = r02;
        if (this.f3269b) {
            i8 = r02 + 16;
        }
        int i9 = i8;
        if (this.f3270c) {
            i9 = i8 + 256;
        }
        return this.f3271d ? i9 + 4096 : i9;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f3268a), Boolean.valueOf(this.f3269b), Boolean.valueOf(this.f3270c), Boolean.valueOf(this.f3271d));
    }
}
