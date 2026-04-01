package androidx.lifecycle;

import f0.a;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f2699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0.a f2701c;

    public interface a {
        <T extends w> T a(Class<T> cls);

        <T extends w> T b(Class<T> cls, f0.a aVar);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2702a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a.b<String> f2703b = a.C0035a.f2704a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.y$b$a$a, reason: collision with other inner class name */
            private static final class C0035a implements a.b<String> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0035a f2704a = new C0035a();

                private C0035a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
                this();
            }
        }
    }

    public static class c {
        public void a(w viewModel) {
            kotlin.jvm.internal.q.f(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(z store, a factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.q.f(store, "store");
        kotlin.jvm.internal.q.f(factory, "factory");
    }

    public y(z store, a factory, f0.a defaultCreationExtras) {
        kotlin.jvm.internal.q.f(store, "store");
        kotlin.jvm.internal.q.f(factory, "factory");
        kotlin.jvm.internal.q.f(defaultCreationExtras, "defaultCreationExtras");
        this.f2699a = store;
        this.f2700b = factory;
        this.f2701c = defaultCreationExtras;
    }

    public /* synthetic */ y(z zVar, a aVar, f0.a aVar2, int i8, kotlin.jvm.internal.j jVar) {
        this(zVar, aVar, (i8 & 4) != 0 ? a.C0104a.f21616b : aVar2);
    }

    public <T extends w> T a(Class<T> modelClass) {
        kotlin.jvm.internal.q.f(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
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
    public <T extends w> T b(String key, Class<T> modelClass) {
        T t7;
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(modelClass, "modelClass");
        T t8 = (T) this.f2699a.b(key);
        if (!modelClass.isInstance(t8)) {
            f0.b bVar = new f0.b(this.f2701c);
            bVar.b(b.f2703b, key);
            try {
                t7 = (T) this.f2700b.b(modelClass, bVar);
            } catch (AbstractMethodError unused) {
                t7 = (T) this.f2700b.a(modelClass);
            }
            this.f2699a.d(key, t7);
            return t7;
        }
        Object obj = this.f2700b;
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar != null) {
            kotlin.jvm.internal.q.c(t8);
            cVar.a(t8);
        }
        kotlin.jvm.internal.q.d(t8, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t8;
    }
}
