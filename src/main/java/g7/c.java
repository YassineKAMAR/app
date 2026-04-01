package g7;

import d7.h0;
import e6.i0;
import kotlin.jvm.internal.r;
import p6.l;
import p6.q;
import y6.j;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q<Object, Object, Object, Object> f22066a = a.f22072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f22067b = new h0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h0 f22068c = new h0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0 f22069d = new h0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f22070e = new h0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0 f22071f = new h0("PARAM_CLAUSE_0");

    static final class a extends r implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22072a = new a();

        a() {
            super(3);
        }

        @Override // p6.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(int i8) {
        if (i8 == 0) {
            return d.SUCCESSFUL;
        }
        if (i8 == 1) {
            return d.REREGISTER;
        }
        if (i8 == 2) {
            return d.CANCELLED;
        }
        if (i8 == 3) {
            return d.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i8).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(j<? super i0> jVar, l<? super Throwable, i0> lVar) {
        Object objB = jVar.b(i0.f21430a, null, lVar);
        if (objB == null) {
            return false;
        }
        jVar.e(objB);
        return true;
    }
}
