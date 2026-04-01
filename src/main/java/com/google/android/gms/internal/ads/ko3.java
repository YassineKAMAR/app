package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f10191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f10192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f10193c;

    @SafeVarargs
    protected ko3(Class cls, lp3... lp3VarArr) {
        this.f10191a = cls;
        HashMap map = new HashMap();
        for (int i8 = 0; i8 <= 0; i8++) {
            lp3 lp3Var = lp3VarArr[i8];
            if (map.containsKey(lp3Var.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(lp3Var.b().getCanonicalName())));
            }
            map.put(lp3Var.b(), lp3Var);
        }
        this.f10193c = lp3VarArr[0].b();
        this.f10192b = Collections.unmodifiableMap(map);
    }

    public abstract jo3 a();

    public abstract uv3 b();

    public abstract k24 c(rz3 rz3Var);

    public abstract String d();

    public abstract void e(k24 k24Var);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.f10193c;
    }

    public final Class h() {
        return this.f10191a;
    }

    public final Object i(k24 k24Var, Class cls) {
        lp3 lp3Var = (lp3) this.f10192b.get(cls);
        if (lp3Var != null) {
            return lp3Var.a(k24Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.f10192b.keySet();
    }
}
