package o7;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o7.a f25350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25352c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.k implements p6.q<e6.c<e6.i0, n7.h>, e6.i0, h6.d<? super n7.h>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f25354c;

        a(h6.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // p6.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e6.c<e6.i0, n7.h> cVar, e6.i0 i0Var, h6.d<? super n7.h> dVar) {
            a aVar = n0.this.new a(dVar);
            aVar.f25354c = cVar;
            return aVar.invokeSuspend(e6.i0.f21430a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = i6.d.e();
            int i8 = this.f25353b;
            if (i8 == 0) {
                e6.t.b(obj);
                e6.c cVar = (e6.c) this.f25354c;
                byte bE = n0.this.f25350a.E();
                if (bE == 1) {
                    return n0.this.j(true);
                }
                if (bE == 0) {
                    return n0.this.j(false);
                }
                if (bE != 6) {
                    if (bE == 8) {
                        return n0.this.f();
                    }
                    o7.a.y(n0.this.f25350a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new e6.h();
                }
                n0 n0Var = n0.this;
                this.f25353b = 1;
                obj = n0Var.h(cVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e6.t.b(obj);
            }
            return (n7.h) obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f25356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f25357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f25358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f25359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f25360e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f25362g;

        b(h6.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25360e = obj;
            this.f25362g |= Integer.MIN_VALUE;
            return n0.this.h(null, this);
        }
    }

    public n0(n7.f configuration, o7.a lexer) {
        kotlin.jvm.internal.q.f(configuration, "configuration");
        kotlin.jvm.internal.q.f(lexer, "lexer");
        this.f25350a = lexer;
        this.f25351b = configuration.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n7.h f() {
        byte bM = this.f25350a.m();
        if (this.f25350a.E() == 4) {
            o7.a.y(this.f25350a, "Unexpected leading comma", 0, null, 6, null);
            throw new e6.h();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f25350a.f()) {
            arrayList.add(e());
            bM = this.f25350a.m();
            if (bM != 4) {
                o7.a aVar = this.f25350a;
                boolean z7 = bM == 9;
                int i8 = aVar.f25302a;
                if (!z7) {
                    o7.a.y(aVar, "Expected end of the array or comma", i8, null, 4, null);
                    throw new e6.h();
                }
            }
        }
        if (bM == 8) {
            this.f25350a.n((byte) 9);
        } else if (bM == 4) {
            o7.a.y(this.f25350a, "Unexpected trailing comma", 0, null, 6, null);
            throw new e6.h();
        }
        return new n7.b(arrayList);
    }

    private final n7.h g() {
        return (n7.h) e6.b.b(new e6.a(new a(null)), e6.i0.f21430a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(e6.c<e6.i0, n7.h> r21, h6.d<? super n7.h> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.n0.h(e6.c, h6.d):java.lang.Object");
    }

    private final n7.h i() {
        byte bN = this.f25350a.n((byte) 6);
        if (this.f25350a.E() == 4) {
            o7.a.y(this.f25350a, "Unexpected leading comma", 0, null, 6, null);
            throw new e6.h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f25350a.f()) {
                break;
            }
            String strS = this.f25351b ? this.f25350a.s() : this.f25350a.q();
            this.f25350a.n((byte) 5);
            linkedHashMap.put(strS, e());
            bN = this.f25350a.m();
            if (bN != 4) {
                if (bN != 7) {
                    o7.a.y(this.f25350a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new e6.h();
                }
            }
        }
        if (bN == 6) {
            this.f25350a.n((byte) 7);
        } else if (bN == 4) {
            o7.a.y(this.f25350a, "Unexpected trailing comma", 0, null, 6, null);
            throw new e6.h();
        }
        return new n7.t(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n7.v j(boolean z7) {
        String strS = (this.f25351b || !z7) ? this.f25350a.s() : this.f25350a.q();
        return (z7 || !kotlin.jvm.internal.q.b(strS, "null")) ? new n7.o(strS, z7) : n7.r.f25207c;
    }

    public final n7.h e() {
        byte bE = this.f25350a.E();
        if (bE == 1) {
            return j(true);
        }
        if (bE == 0) {
            return j(false);
        }
        if (bE == 6) {
            int i8 = this.f25352c + 1;
            this.f25352c = i8;
            this.f25352c--;
            return i8 == 200 ? g() : i();
        }
        if (bE == 8) {
            return f();
        }
        o7.a.y(this.f25350a, "Cannot begin reading element, unexpected token: " + ((int) bE), 0, null, 6, null);
        throw new e6.h();
    }
}
