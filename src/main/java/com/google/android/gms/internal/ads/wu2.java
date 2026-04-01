package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f16953a = new HashMap();

    public final vu2 a(mu2 mu2Var, Context context, du2 du2Var, cv2 cv2Var) {
        vu2 vu2Var = (vu2) this.f16953a.get(mu2Var);
        if (vu2Var != null) {
            return vu2Var;
        }
        ju2 ju2Var = new ju2(pu2.g(mu2Var, context));
        vu2 vu2Var2 = new vu2(ju2Var, new ev2(ju2Var, du2Var, cv2Var));
        this.f16953a.put(mu2Var, vu2Var2);
        return vu2Var2;
    }
}
