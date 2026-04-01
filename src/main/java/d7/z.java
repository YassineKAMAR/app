package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    static final class a extends kotlin.jvm.internal.r implements p6.l<Throwable, e6.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p6.l<E, e6.i0> f21078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ E f21079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h6.g f21080c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p6.l<? super E, e6.i0> lVar, E e8, h6.g gVar) {
            super(1);
            this.f21078a = lVar;
            this.f21079b = e8;
            this.f21080c = gVar;
        }

        public final void a(Throwable th) {
            z.b(this.f21078a, this.f21079b, this.f21080c);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(Throwable th) {
            a(th);
            return e6.i0.f21430a;
        }
    }

    public static final <E> p6.l<Throwable, e6.i0> a(p6.l<? super E, e6.i0> lVar, E e8, h6.g gVar) {
        return new a(lVar, e8, gVar);
    }

    public static final <E> void b(p6.l<? super E, e6.i0> lVar, E e8, h6.g gVar) {
        q0 q0VarC = c(lVar, e8, null);
        if (q0VarC != null) {
            y6.d0.a(gVar, q0VarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> q0 c(p6.l<? super E, e6.i0> lVar, E e8, q0 q0Var) {
        try {
            lVar.invoke(e8);
        } catch (Throwable th) {
            if (q0Var == null || q0Var.getCause() == th) {
                return new q0("Exception in undelivered element handler for " + e8, th);
            }
            e6.f.a(q0Var, th);
        }
        return q0Var;
    }

    public static /* synthetic */ q0 d(p6.l lVar, Object obj, q0 q0Var, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            q0Var = null;
        }
        return c(lVar, obj, q0Var);
    }
}
