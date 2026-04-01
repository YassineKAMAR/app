package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m04 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile m04 f11115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final m04 f11116c = new m04(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11117a;

    m04() {
        this.f11117a = new HashMap();
    }

    m04(boolean z7) {
        this.f11117a = Collections.emptyMap();
    }

    public static m04 a() {
        return f11116c;
    }

    public static m04 b() {
        m04 m04Var = f11115b;
        if (m04Var != null) {
            return m04Var;
        }
        synchronized (m04.class) {
            m04 m04Var2 = f11115b;
            if (m04Var2 != null) {
                return m04Var2;
            }
            m04 m04VarB = u04.b(m04.class);
            f11115b = m04VarB;
            return m04VarB;
        }
    }

    public final y04 c(k24 k24Var, int i8) {
        return (y04) this.f11117a.get(new l04(k24Var, i8));
    }
}
