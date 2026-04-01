package com.revenuecat.purchases.common.diagnostics;

import com.revenuecat.purchases.common.Anonymizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e6.p;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsAnonymizer {
    private final Anonymizer anonymizer;

    public DiagnosticsAnonymizer(Anonymizer anonymizer) {
        q.f(anonymizer, "anonymizer");
        this.anonymizer = anonymizer;
    }

    private final DiagnosticsEntry anonymizeCounter(DiagnosticsEntry.Counter counter) {
        return DiagnosticsEntry.Counter.copy$default(counter, null, this.anonymizer.anonymizedStringMap(counter.getTags()), 0, 5, null);
    }

    private final DiagnosticsEntry anonymizeEvent(DiagnosticsEntry.Event event) {
        return DiagnosticsEntry.Event.copy$default(event, null, this.anonymizer.anonymizedMap(event.getProperties()), null, null, 13, null);
    }

    public final DiagnosticsEntry anonymizeEntryIfNeeded(DiagnosticsEntry diagnosticsEntry) {
        q.f(diagnosticsEntry, "diagnosticsEntry");
        if (diagnosticsEntry instanceof DiagnosticsEntry.Event) {
            return anonymizeEvent((DiagnosticsEntry.Event) diagnosticsEntry);
        }
        if (diagnosticsEntry instanceof DiagnosticsEntry.Counter) {
            return anonymizeCounter((DiagnosticsEntry.Counter) diagnosticsEntry);
        }
        if (diagnosticsEntry instanceof DiagnosticsEntry.Histogram) {
            return diagnosticsEntry;
        }
        throw new p();
    }
}
