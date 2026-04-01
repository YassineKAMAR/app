package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f4.e0;
import f4.h;
import f4.r;
import g4.k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n4.i;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p4.d lambda$getComponents$0(f4.e eVar) {
        return new b((c4.e) eVar.a(c4.e.class), eVar.c(i.class), (ExecutorService) eVar.f(e0.a(e4.a.class, ExecutorService.class)), k.a((Executor) eVar.f(e0.a(e4.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f4.c<?>> getComponents() {
        return Arrays.asList(f4.c.e(p4.d.class).g(LIBRARY_NAME).b(r.i(c4.e.class)).b(r.g(i.class)).b(r.h(e0.a(e4.a.class, ExecutorService.class))).b(r.h(e0.a(e4.b.class, Executor.class))).e(new h() { // from class: p4.e
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
            }
        }).c(), n4.h.a(), v4.h.b(LIBRARY_NAME, "17.2.0"));
    }
}
