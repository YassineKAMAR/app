package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends z {
    @Override // com.google.android.gms.internal.measurement.z
    public final r b(String str, b7 b7Var, List<r> list) {
        if (str == null || str.isEmpty() || !b7Var.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        r rVarC = b7Var.c(str);
        if (rVarC instanceof m) {
            return ((m) rVarC).b(b7Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
