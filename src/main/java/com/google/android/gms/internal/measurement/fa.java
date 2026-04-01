package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class fa implements na {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private na[] f18698a;

    fa(na... naVarArr) {
        this.f18698a = naVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final ka a(Class<?> cls) {
        for (na naVar : this.f18698a) {
            if (naVar.b(cls)) {
                return naVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.na
    public final boolean b(Class<?> cls) {
        for (na naVar : this.f18698a) {
            if (naVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
