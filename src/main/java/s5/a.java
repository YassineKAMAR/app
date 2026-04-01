package s5;

import java.nio.ByteBuffer;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f26228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i<T> f26230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0171c f26231d;

    private final class b implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<T> f26232a;

        /* JADX INFO: renamed from: s5.a$b$a, reason: collision with other inner class name */
        class C0170a implements e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f26234a;

            C0170a(c.b bVar) {
                this.f26234a = bVar;
            }

            @Override // s5.a.e
            public void a(T t7) {
                this.f26234a.a(a.this.f26230c.a(t7));
            }
        }

        private b(d<T> dVar) {
            this.f26232a = dVar;
        }

        @Override // s5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f26232a.a((T) a.this.f26230c.b(byteBuffer), new C0170a(bVar));
            } catch (RuntimeException e8) {
                g5.b.c("BasicMessageChannel#" + a.this.f26229b, "Failed to handle message", e8);
                bVar.a(null);
            }
        }
    }

    private final class c implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e<T> f26236a;

        private c(e<T> eVar) {
            this.f26236a = eVar;
        }

        @Override // s5.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f26236a.a((T) a.this.f26230c.b(byteBuffer));
            } catch (RuntimeException e8) {
                g5.b.c("BasicMessageChannel#" + a.this.f26229b, "Failed to handle message reply", e8);
            }
        }
    }

    public interface d<T> {
        void a(T t7, e<T> eVar);
    }

    public interface e<T> {
        void a(T t7);
    }

    public a(s5.c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, null);
    }

    public a(s5.c cVar, String str, i<T> iVar, c.InterfaceC0171c interfaceC0171c) {
        this.f26228a = cVar;
        this.f26229b = str;
        this.f26230c = iVar;
        this.f26231d = interfaceC0171c;
    }

    public void c(T t7) {
        d(t7, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void d(T t7, e<T> eVar) {
        this.f26228a.h(this.f26229b, this.f26230c.a(t7), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s5.c] */
    /* JADX WARN: Type inference failed for: r1v0, types: [s5.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [s5.c$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void e(d<T> dVar) {
        if (this.f26231d != null) {
            this.f26228a.d(this.f26229b, dVar != null ? new b(dVar) : null, this.f26231d);
        } else {
            this.f26228a.e(this.f26229b, dVar != null ? new b(dVar) : 0);
        }
    }
}
