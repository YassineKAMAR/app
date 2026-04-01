package o1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1.a f25262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x1.a f25263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25264d;

    c(Context context, x1.a aVar, x1.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f25261a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f25262b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f25263c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f25264d = str;
    }

    @Override // o1.h
    public Context b() {
        return this.f25261a;
    }

    @Override // o1.h
    public String c() {
        return this.f25264d;
    }

    @Override // o1.h
    public x1.a d() {
        return this.f25263c;
    }

    @Override // o1.h
    public x1.a e() {
        return this.f25262b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f25261a.equals(hVar.b()) && this.f25262b.equals(hVar.e()) && this.f25263c.equals(hVar.d()) && this.f25264d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f25261a.hashCode() ^ 1000003) * 1000003) ^ this.f25262b.hashCode()) * 1000003) ^ this.f25263c.hashCode()) * 1000003) ^ this.f25264d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f25261a + ", wallClock=" + this.f25262b + ", monotonicClock=" + this.f25263c + ", backendName=" + this.f25264d + "}";
    }
}
