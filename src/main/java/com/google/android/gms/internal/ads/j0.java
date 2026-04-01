package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f9427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9428b = new AtomicBoolean(false);

    public j0(i0 i0Var) {
        this.f9427a = i0Var;
    }

    public final p0 a(Object... objArr) {
        Constructor constructorJ;
        synchronized (this.f9428b) {
            if (this.f9428b.get()) {
                constructorJ = null;
            } else {
                try {
                    constructorJ = this.f9427a.j();
                } catch (ClassNotFoundException unused) {
                    this.f9428b.set(true);
                    constructorJ = null;
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating extension", e8);
                }
            }
        }
        if (constructorJ == null) {
            return null;
        }
        try {
            return (p0) constructorJ.newInstance(objArr);
        } catch (Exception e9) {
            throw new IllegalStateException("Unexpected error creating extractor", e9);
        }
    }
}
