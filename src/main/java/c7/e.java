package c7;

import d7.d0;
import h6.g;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import p6.p;
import y6.j1;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    static final class a extends r implements p<Integer, g.b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<?> f3495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f3495a = cVar;
        }

        public final Integer a(int i8, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVarA = this.f3495a.f3488b.a(key);
            if (key != j1.V) {
                return Integer.valueOf(bVar != bVarA ? Integer.MIN_VALUE : i8 + 1);
            }
            j1 j1Var = (j1) bVarA;
            q.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            j1 j1VarB = e.b((j1) bVar, j1Var);
            if (j1VarB == j1Var) {
                if (j1Var != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + j1VarB + ", expected child of " + j1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.P(0, new a(cVar))).intValue() == cVar.f3489c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f3488b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final j1 b(j1 j1Var, j1 j1Var2) {
        while (j1Var != null) {
            if (j1Var == j1Var2 || !(j1Var instanceof d0)) {
                return j1Var;
            }
            j1Var = j1Var.getParent();
        }
        return null;
    }
}
