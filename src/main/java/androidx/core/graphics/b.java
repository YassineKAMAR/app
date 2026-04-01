package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f2007e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2011d;

    static class a {
        static Insets a(int i8, int i9, int i10, int i11) {
            return Insets.of(i8, i9, i10, i11);
        }
    }

    private b(int i8, int i9, int i10, int i11) {
        this.f2008a = i8;
        this.f2009b = i9;
        this.f2010c = i10;
        this.f2011d = i11;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f2008a, bVar2.f2008a), Math.max(bVar.f2009b, bVar2.f2009b), Math.max(bVar.f2010c, bVar2.f2010c), Math.max(bVar.f2011d, bVar2.f2011d));
    }

    public static b b(int i8, int i9, int i10, int i11) {
        return (i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) ? f2007e : new b(i8, i9, i10, i11);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2008a, this.f2009b, this.f2010c, this.f2011d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2011d == bVar.f2011d && this.f2008a == bVar.f2008a && this.f2010c == bVar.f2010c && this.f2009b == bVar.f2009b;
    }

    public int hashCode() {
        return (((((this.f2008a * 31) + this.f2009b) * 31) + this.f2010c) * 31) + this.f2011d;
    }

    public String toString() {
        return "Insets{left=" + this.f2008a + ", top=" + this.f2009b + ", right=" + this.f2010c + ", bottom=" + this.f2011d + '}';
    }
}
