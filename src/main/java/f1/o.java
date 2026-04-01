package f1;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.h f21642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.a<m> f21643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m0.d f21644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0.d f21645d;

    class a extends m0.a<m> {
        a(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // m0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(q0.f fVar, m mVar) throws Throwable {
            String str = mVar.f21640a;
            if (str == null) {
                fVar.S(1);
            } else {
                fVar.p(1, str);
            }
            byte[] bArrK = androidx.work.b.k(mVar.f21641b);
            if (bArrK == null) {
                fVar.S(2);
            } else {
                fVar.F(2, bArrK);
            }
        }
    }

    class b extends m0.d {
        b(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends m0.d {
        c(androidx.room.h hVar) {
            super(hVar);
        }

        @Override // m0.d
        public String d() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.h hVar) {
        this.f21642a = hVar;
        this.f21643b = new a(hVar);
        this.f21644c = new b(hVar);
        this.f21645d = new c(hVar);
    }

    @Override // f1.n
    public void a(String str) {
        this.f21642a.b();
        q0.f fVarA = this.f21644c.a();
        if (str == null) {
            fVarA.S(1);
        } else {
            fVarA.p(1, str);
        }
        this.f21642a.c();
        try {
            fVarA.r();
            this.f21642a.r();
        } finally {
            this.f21642a.g();
            this.f21644c.f(fVarA);
        }
    }

    @Override // f1.n
    public void b(m mVar) {
        this.f21642a.b();
        this.f21642a.c();
        try {
            this.f21643b.h(mVar);
            this.f21642a.r();
        } finally {
            this.f21642a.g();
        }
    }

    @Override // f1.n
    public void c() {
        this.f21642a.b();
        q0.f fVarA = this.f21645d.a();
        this.f21642a.c();
        try {
            fVarA.r();
            this.f21642a.r();
        } finally {
            this.f21642a.g();
            this.f21645d.f(fVarA);
        }
    }
}
