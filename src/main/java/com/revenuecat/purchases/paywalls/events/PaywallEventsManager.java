package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import e6.i0;
import f6.o;
import f6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.y;
import p6.l;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
public final class PaywallEventsManager {
    public static final Companion Companion = new Companion(null);
    private static final long FLUSH_COUNT = 50;
    public static final String PAYWALL_EVENTS_FILE_PATH = "RevenueCat/paywall_event_store/paywall_event_store.jsonl";
    private final Backend backend;
    private final EventsFileHelper<PaywallStoredEvent> fileHelper;
    private boolean flushInProgress;
    private final IdentityManager identityManager;
    private final Dispatcher paywallEventsDispatcher;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements p6.a<i0> {

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends r implements p6.a<i0> {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$2$1, reason: invalid class name and collision with other inner class name */
            static final class C00951 extends r implements p6.a<i0> {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00951(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // p6.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f21430a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(0);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // p6.a
            public /* bridge */ /* synthetic */ i0 invoke() {
                invoke2();
                return i0.f21430a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LogUtilsKt.verboseLog("Paywall event flush: success.");
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new C00951(paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends r implements p<PurchasesError, Boolean, i0> {
            final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
            final /* synthetic */ PaywallEventsManager this$0;

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$flushEvents$1$3$1, reason: invalid class name and collision with other inner class name */
            static final class C00961 extends r implements p6.a<i0> {
                final /* synthetic */ List<PaywallStoredEvent> $eventsToSyncWithNullValues;
                final /* synthetic */ boolean $shouldMarkAsSynced;
                final /* synthetic */ PaywallEventsManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00961(boolean z7, PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                    super(0);
                    this.$shouldMarkAsSynced = z7;
                    this.this$0 = paywallEventsManager;
                    this.$eventsToSyncWithNullValues = list;
                }

                @Override // p6.a
                public /* bridge */ /* synthetic */ i0 invoke() {
                    invoke2();
                    return i0.f21430a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.$shouldMarkAsSynced) {
                        this.this$0.fileHelper.clear(this.$eventsToSyncWithNullValues.size());
                    }
                    this.this$0.flushInProgress = false;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PaywallEventsManager paywallEventsManager, List<PaywallStoredEvent> list) {
                super(2);
                this.this$0 = paywallEventsManager;
                this.$eventsToSyncWithNullValues = list;
            }

            @Override // p6.p
            public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Boolean bool) {
                invoke(purchasesError, bool.booleanValue());
                return i0.f21430a;
            }

            public final void invoke(PurchasesError error, boolean z7) {
                q.f(error, "error");
                LogUtilsKt.errorLog$default("Paywall event flush error: " + error + '.', null, 2, null);
                PaywallEventsManager paywallEventsManager = this.this$0;
                PaywallEventsManager.enqueue$default(paywallEventsManager, null, new C00961(z7, paywallEventsManager, this.$eventsToSyncWithNullValues), 1, null);
            }
        }

        AnonymousClass1() {
            super(0);
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (PaywallEventsManager.this.flushInProgress) {
                LogUtilsKt.debugLog("Flush already in progress.");
                return;
            }
            PaywallEventsManager.this.flushInProgress = true;
            List eventsToSync = PaywallEventsManager.this.getEventsToSync();
            List listW = w.w(eventsToSync);
            int size = listW.size();
            if (listW.isEmpty()) {
                LogUtilsKt.verboseLog("No paywall events to sync.");
                PaywallEventsManager.this.flushInProgress = false;
                return;
            }
            LogUtilsKt.verboseLog("Paywall event flush: posting " + size + " events.");
            Backend backend = PaywallEventsManager.this.backend;
            ArrayList arrayList = new ArrayList(f6.p.m(listW, 10));
            Iterator it = listW.iterator();
            while (it.hasNext()) {
                arrayList.add(((PaywallStoredEvent) it.next()).toPaywallBackendEvent());
            }
            backend.postPaywallEvents(new PaywallEventRequest(arrayList), new AnonymousClass2(PaywallEventsManager.this, eventsToSync), new AnonymousClass3(PaywallEventsManager.this, eventsToSync));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$getEventsToSync$1, reason: invalid class name and case insensitive filesystem */
    static final class C02881 extends r implements l<Stream<PaywallStoredEvent>, i0> {
        final /* synthetic */ y<List<PaywallStoredEvent>> $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02881(y<List<PaywallStoredEvent>> yVar) {
            super(1);
            this.$eventsToSync = yVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(Stream<PaywallStoredEvent> stream) {
            invoke2(stream);
            return i0.f21430a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Stream<PaywallStoredEvent> stream) {
            q.f(stream, "stream");
            y<List<PaywallStoredEvent>> yVar = this.$eventsToSync;
            ?? Collect = stream.limit(PaywallEventsManager.FLUSH_COUNT).collect(Collectors.toList());
            q.e(Collect, "stream.limit(FLUSH_COUNT…lect(Collectors.toList())");
            yVar.f24325a = Collect;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.events.PaywallEventsManager$track$1, reason: invalid class name and case insensitive filesystem */
    static final class C02891 extends r implements p6.a<i0> {
        final /* synthetic */ PaywallEvent $event;
        final /* synthetic */ PaywallEventsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02891(PaywallEvent paywallEvent, PaywallEventsManager paywallEventsManager) {
            super(0);
            this.$event = paywallEvent;
            this.this$0 = paywallEventsManager;
        }

        @Override // p6.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LogUtilsKt.debugLog("Tracking paywall event: " + this.$event);
            this.this$0.fileHelper.appendEvent(new PaywallStoredEvent(this.$event, this.this$0.identityManager.getCurrentAppUserID()));
        }
    }

    public PaywallEventsManager(EventsFileHelper<PaywallStoredEvent> fileHelper, IdentityManager identityManager, Dispatcher paywallEventsDispatcher, Backend backend) {
        q.f(fileHelper, "fileHelper");
        q.f(identityManager, "identityManager");
        q.f(paywallEventsDispatcher, "paywallEventsDispatcher");
        q.f(backend, "backend");
        this.fileHelper = fileHelper;
        this.identityManager = identityManager;
        this.paywallEventsDispatcher = paywallEventsDispatcher;
        this.backend = backend;
    }

    private final void enqueue(Delay delay, final p6.a<i0> aVar) {
        this.paywallEventsDispatcher.enqueue(new Runnable() { // from class: com.revenuecat.purchases.paywalls.events.a
            @Override // java.lang.Runnable
            public final void run() {
                PaywallEventsManager.enqueue$lambda$0(aVar);
            }
        }, delay);
    }

    static /* synthetic */ void enqueue$default(PaywallEventsManager paywallEventsManager, Delay delay, p6.a aVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            delay = Delay.NONE;
        }
        paywallEventsManager.enqueue(delay, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$0(p6.a command) {
        q.f(command, "$command");
        command.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.List] */
    public final List<PaywallStoredEvent> getEventsToSync() {
        y yVar = new y();
        yVar.f24325a = o.d();
        this.fileHelper.readFile(new C02881(yVar));
        return (List) yVar.f24325a;
    }

    public final synchronized void flushEvents() {
        enqueue$default(this, null, new AnonymousClass1(), 1, null);
    }

    public final synchronized void track(PaywallEvent event) {
        q.f(event, "event");
        enqueue$default(this, null, new C02891(event, this), 1, null);
    }
}
