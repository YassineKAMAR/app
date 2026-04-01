package com.amazon.a.a.g;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.amazon.a.a.o.c f3622a = new com.amazon.a.a.o.c("Appstore SDK - Production Mode");

    private static String d(String str, String str2) {
        return str + ": " + str2;
    }

    @Override // com.amazon.a.a.g.c
    public void a(String str, String str2) {
        f3622a.a(d(str, str2));
    }

    @Override // com.amazon.a.a.g.c
    public boolean a() {
        return com.amazon.a.a.o.c.f3947a;
    }

    @Override // com.amazon.a.a.g.c
    public void b(String str, String str2) {
        f3622a.b(d(str, str2));
    }

    @Override // com.amazon.a.a.g.c
    public boolean b() {
        return com.amazon.a.a.o.c.f3948b;
    }

    @Override // com.amazon.a.a.g.c
    public void c(String str, String str2) {
        f3622a.c(d(str, str2));
    }

    @Override // com.amazon.a.a.g.c
    public boolean c() {
        return com.amazon.a.a.o.c.b();
    }
}
