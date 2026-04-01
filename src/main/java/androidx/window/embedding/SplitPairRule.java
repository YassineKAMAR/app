package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import f6.w;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalWindowApi
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> filters, boolean z7, boolean z8, boolean z9, int i8, int i9, float f8, int i10) {
        super(i8, i9, f8, i10);
        q.f(filters, "filters");
        this.finishPrimaryWithSecondary = z7;
        this.finishSecondaryWithPrimary = z8;
        this.clearTop = z9;
        this.filters = w.Y(filters);
    }

    public /* synthetic */ SplitPairRule(Set set, boolean z7, boolean z8, boolean z9, int i8, int i9, float f8, int i10, int i11, j jVar) {
        this(set, (i11 & 2) != 0 ? false : z7, (i11 & 4) != 0 ? true : z8, (i11 & 8) != 0 ? false : z9, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) == 0 ? i9 : 0, (i11 & 64) != 0 ? 0.5f : f8, (i11 & 128) != 0 ? 3 : i10);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        return q.b(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.finishPrimaryWithSecondary)) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.finishSecondaryWithPrimary)) * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter filter) {
        q.f(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPairRule(w.Y(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }
}
