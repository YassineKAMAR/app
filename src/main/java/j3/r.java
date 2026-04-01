package j3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class r implements u2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2.b f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u2.b f24110b;

    public r(Context context) {
        this.f24109a = new p(context, x2.f.f());
        this.f24110b = l.d(context);
    }

    public static /* synthetic */ s3.h b(r rVar, s3.h hVar) {
        if (hVar.m() || hVar.k()) {
            return hVar;
        }
        Exception excI = hVar.i();
        if (!(excI instanceof y2.b)) {
            return hVar;
        }
        int iB = ((y2.b) excI).b();
        return (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) ? rVar.f24110b.a() : iB == 43000 ? s3.k.d(new Exception("Failed to get app set ID due to an internal error. Please try again later.")) : iB != 15 ? hVar : s3.k.d(new Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // u2.b
    public final s3.h<u2.c> a() {
        return this.f24109a.a().h(new s3.a() { // from class: j3.q
            @Override // s3.a
            public final Object a(s3.h hVar) {
                return r.b(this.f24108a, hVar);
            }
        });
    }
}
