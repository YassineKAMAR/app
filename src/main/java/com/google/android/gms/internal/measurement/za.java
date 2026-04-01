package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class za {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final za f19437c = new za();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, eb<?>> f19439b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gb f19438a = new z9();

    private za() {
    }

    public static za a() {
        return f19437c;
    }

    public final <T> eb<T> b(Class<T> cls) {
        a9.f(cls, "messageType");
        eb<T> ebVar = (eb) this.f19439b.get(cls);
        if (ebVar != null) {
            return ebVar;
        }
        eb<T> ebVarA = this.f19438a.a(cls);
        a9.f(cls, "messageType");
        a9.f(ebVarA, com.amazon.device.simplesignin.a.a.a.A);
        eb<T> ebVar2 = (eb) this.f19439b.putIfAbsent(cls, ebVarA);
        return ebVar2 != null ? ebVar2 : ebVarA;
    }

    public final <T> eb<T> c(T t7) {
        return b(t7.getClass());
    }
}
