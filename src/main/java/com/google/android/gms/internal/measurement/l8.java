package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.y8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile l8 f18923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final l8 f18924c = new l8(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<a, y8.f<?, ?>> f18925a;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f18926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18927b;

        a(Object obj, int i8) {
            this.f18926a = obj;
            this.f18927b = i8;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18926a == aVar.f18926a && this.f18927b == aVar.f18927b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f18926a) * 65535) + this.f18927b;
        }
    }

    l8() {
        this.f18925a = new HashMap();
    }

    private l8(boolean z7) {
        this.f18925a = Collections.emptyMap();
    }

    public static l8 a() {
        l8 l8Var = f18923b;
        if (l8Var != null) {
            return l8Var;
        }
        synchronized (l8.class) {
            l8 l8Var2 = f18923b;
            if (l8Var2 != null) {
                return l8Var2;
            }
            l8 l8VarB = w8.b(l8.class);
            f18923b = l8VarB;
            return l8VarB;
        }
    }

    public final <ContainingType extends ma> y8.f<ContainingType, ?> b(ContainingType containingtype, int i8) {
        return (y8.f) this.f18925a.get(new a(containingtype, i8));
    }
}
