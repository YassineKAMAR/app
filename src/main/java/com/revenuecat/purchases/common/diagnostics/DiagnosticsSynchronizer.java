package com.revenuecat.purchases.common.diagnostics;

import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import e6.i0;
import e6.k;
import e6.m;
import f6.o;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.y;
import org.json.JSONObject;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsSynchronizer {
    public static final String CONSECUTIVE_FAILURES_COUNT_KEY = "consecutive_failures_count";
    public static final Companion Companion = new Companion(null);
    public static final long MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsTracker diagnosticsTracker;
    private final k<SharedPreferences> sharedPreferences;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends r implements p6.a<SharedPreferences> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p6.a
        public final SharedPreferences invoke() {
            return DiagnosticsSynchronizer.Companion.initializeSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getCONSECUTIVE_FAILURES_COUNT_KEY$annotations() {
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            q.f(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com_revenuecat_purchases_" + context.getPackageName() + "_preferences_diagnostics", 0);
            q.e(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$clearDiagnosticsFileIfTooBig$1, reason: invalid class name and case insensitive filesystem */
    static final class C02471 extends r implements p6.a<i0> {
        C02471() {
            super(0);
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (DiagnosticsSynchronizer.this.diagnosticsFileHelper.isDiagnosticsFileTooBig()) {
                LogUtilsKt.verboseLog("Diagnostics file is too big. Deleting it.");
                DiagnosticsTracker.trackMaxEventsStoredLimitReached$default(DiagnosticsSynchronizer.this.diagnosticsTracker, false, 1, null);
                DiagnosticsSynchronizer.this.resetDiagnosticsStatus();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$getEventsToSync$1, reason: invalid class name and case insensitive filesystem */
    static final class C02481 extends r implements l<Stream<JSONObject>, i0> {
        final /* synthetic */ y<List<JSONObject>> $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02481(y<List<JSONObject>> yVar) {
            super(1);
            this.$eventsToSync = yVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Stream<JSONObject> stream) {
            invoke2(stream);
            return i0.f21430a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Stream<JSONObject> stream) {
            q.f(stream, "stream");
            y<List<JSONObject>> yVar = this.$eventsToSync;
            ?? Collect = stream.limit(200L).collect(Collectors.toList());
            q.e(Collect, "stream.limit(MAX_EVENTS_…lect(Collectors.toList())");
            yVar.f24325a = Collect;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C02491 extends r implements p6.a<i0> {

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00891 extends r implements l<JSONObject, i0> {
            final /* synthetic */ int $diagnosticsCount;
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00891(DiagnosticsSynchronizer diagnosticsSynchronizer, int i8) {
                super(1);
                this.this$0 = diagnosticsSynchronizer;
                this.$diagnosticsCount = i8;
            }

            @Override // p6.l
            public /* bridge */ /* synthetic */ i0 invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(JSONObject it) {
                q.f(it, "it");
                LogUtilsKt.verboseLog("Synced diagnostics file successfully.");
                this.this$0.clearConsecutiveNumberOfErrors();
                this.this$0.diagnosticsFileHelper.clear(this.$diagnosticsCount);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer$syncDiagnosticsFileIfNeeded$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends r implements p<PurchasesError, Boolean, i0> {
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DiagnosticsSynchronizer diagnosticsSynchronizer) {
                super(2);
                this.this$0 = diagnosticsSynchronizer;
            }

            @Override // p6.p
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
                invoke(purchasesError, bool.booleanValue());
                return i0.f21430a;
            }

            public final void invoke(PurchasesError error, boolean z7) {
                StringBuilder sb;
                String str;
                q.f(error, "error");
                if (z7) {
                    LogUtilsKt.verboseLog("Error syncing diagnostics file: " + error + ". Will retry the next time the SDK is initialized");
                    if (this.this$0.increaseConsecutiveNumberOfErrors() < 3) {
                        return;
                    }
                    sb = new StringBuilder();
                    sb.append("Error syncing diagnostics file: ");
                    sb.append(error);
                    str = ". This was the final attempt (3). Deleting diagnostics file without posting.";
                } else {
                    sb = new StringBuilder();
                    sb.append("Error syncing diagnostics file: ");
                    sb.append(error);
                    str = ". Deleting diagnostics file without retrying.";
                }
                sb.append(str);
                LogUtilsKt.verboseLog(sb.toString());
                this.this$0.resetDiagnosticsStatus();
            }
        }

        C02491() {
            super(0);
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                List<? extends JSONObject> eventsToSync = DiagnosticsSynchronizer.this.getEventsToSync();
                int size = eventsToSync.size();
                if (size == 0) {
                    LogUtilsKt.verboseLog("No diagnostics to sync.");
                } else {
                    DiagnosticsSynchronizer.this.backend.postDiagnostics(eventsToSync, new C00891(DiagnosticsSynchronizer.this, size), new AnonymousClass2(DiagnosticsSynchronizer.this));
                }
            } catch (Exception e8) {
                LogUtilsKt.verboseLog("Error syncing diagnostics file: " + e8);
                try {
                    DiagnosticsSynchronizer.this.resetDiagnosticsStatus();
                } catch (IOException e9) {
                    LogUtilsKt.verboseLog("Error deleting diagnostics file: " + e9);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiagnosticsSynchronizer(Context context, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher diagnosticsDispatcher, k<? extends SharedPreferences> sharedPreferences) {
        q.f(context, "context");
        q.f(diagnosticsFileHelper, "diagnosticsFileHelper");
        q.f(diagnosticsTracker, "diagnosticsTracker");
        q.f(backend, "backend");
        q.f(diagnosticsDispatcher, "diagnosticsDispatcher");
        q.f(sharedPreferences, "sharedPreferences");
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = diagnosticsDispatcher;
        this.sharedPreferences = sharedPreferences;
    }

    public /* synthetic */ DiagnosticsSynchronizer(Context context, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher dispatcher, k kVar, int i8, j jVar) {
        this(context, diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher, (i8 & 32) != 0 ? m.b(new AnonymousClass1(context)) : kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearConsecutiveNumberOfErrors() {
        this.sharedPreferences.getValue().edit().remove(CONSECUTIVE_FAILURES_COUNT_KEY).apply();
    }

    private final void enqueue(final p6.a<i0> aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.diagnostics.a
            @Override // java.lang.Runnable
            public final void run() {
                DiagnosticsSynchronizer.enqueue$lambda$0(aVar);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(p6.a tmp0) {
        q.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List] */
    public final List<JSONObject> getEventsToSync() {
        y yVar = new y();
        yVar.f24325a = o.d();
        this.diagnosticsFileHelper.readFileAsJson(new C02481(yVar));
        return (List) yVar.f24325a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int increaseConsecutiveNumberOfErrors() {
        int i8 = this.sharedPreferences.getValue().getInt(CONSECUTIVE_FAILURES_COUNT_KEY, 0) + 1;
        this.sharedPreferences.getValue().edit().putInt(CONSECUTIVE_FAILURES_COUNT_KEY, i8).apply();
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetDiagnosticsStatus() {
        clearConsecutiveNumberOfErrors();
        this.diagnosticsFileHelper.deleteFile();
    }

    public final void clearDiagnosticsFileIfTooBig() {
        enqueue(new C02471());
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new C02491());
    }
}
