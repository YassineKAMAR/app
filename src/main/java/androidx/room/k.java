package androidx.room;

import java.io.File;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
class k implements c.InterfaceC0159c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f2911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.InterfaceC0159c f2912c;

    k(String str, File file, c.InterfaceC0159c interfaceC0159c) {
        this.f2910a = str;
        this.f2911b = file;
        this.f2912c = interfaceC0159c;
    }

    @Override // q0.c.InterfaceC0159c
    public q0.c a(c.b bVar) {
        return new j(bVar.f25740a, this.f2910a, this.f2911b, bVar.f25742c.f25739a, this.f2912c.a(bVar));
    }
}
