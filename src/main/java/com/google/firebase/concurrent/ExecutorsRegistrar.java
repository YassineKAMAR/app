package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import f4.e0;
import f4.x;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final x<ScheduledExecutorService> f20781a = new x<>(new o4.b() { // from class: g4.c
        @Override // o4.b
        public final Object get() {
            return ExecutorsRegistrar.p();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final x<ScheduledExecutorService> f20782b = new x<>(new o4.b() { // from class: g4.d
        @Override // o4.b
        public final Object get() {
            return ExecutorsRegistrar.q();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final x<ScheduledExecutorService> f20783c = new x<>(new o4.b() { // from class: g4.e
        @Override // o4.b
        public final Object get() {
            return ExecutorsRegistrar.r();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final x<ScheduledExecutorService> f20784d = new x<>(new o4.b() { // from class: g4.f
        @Override // o4.b
        public final Object get() {
            return ExecutorsRegistrar.s();
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 23) {
            builderDetectNetwork.detectResourceMismatches();
            if (i8 >= 26) {
                builderDetectNetwork.detectUnbufferedIo();
            }
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i8) {
        return new b(str, i8, null);
    }

    private static ThreadFactory k(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i8, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService l(f4.e eVar) {
        return f20781a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService m(f4.e eVar) {
        return f20783c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService n(f4.e eVar) {
        return f20782b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Executor o(f4.e eVar) {
        return g4.m.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService p() {
        return u(Executors.newFixedThreadPool(4, k("Firebase Background", 10, i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService q() {
        return u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), k("Firebase Lite", 0, t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService r() {
        return u(Executors.newCachedThreadPool(j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ScheduledExecutorService s() {
        return Executors.newSingleThreadScheduledExecutor(j("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f20784d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f4.c<?>> getComponents() {
        return Arrays.asList(f4.c.d(e0.a(e4.a.class, ScheduledExecutorService.class), e0.a(e4.a.class, ExecutorService.class), e0.a(e4.a.class, Executor.class)).e(new f4.h() { // from class: g4.g
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return ExecutorsRegistrar.l(eVar);
            }
        }).c(), f4.c.d(e0.a(e4.b.class, ScheduledExecutorService.class), e0.a(e4.b.class, ExecutorService.class), e0.a(e4.b.class, Executor.class)).e(new f4.h() { // from class: g4.h
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return ExecutorsRegistrar.m(eVar);
            }
        }).c(), f4.c.d(e0.a(e4.c.class, ScheduledExecutorService.class), e0.a(e4.c.class, ExecutorService.class), e0.a(e4.c.class, Executor.class)).e(new f4.h() { // from class: g4.i
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return ExecutorsRegistrar.n(eVar);
            }
        }).c(), f4.c.c(e0.a(e4.d.class, Executor.class)).e(new f4.h() { // from class: g4.j
            @Override // f4.h
            public final Object a(f4.e eVar) {
                return ExecutorsRegistrar.o(eVar);
            }
        }).c());
    }
}
