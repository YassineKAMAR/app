package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import f6.w;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalWindowApi
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public ActivityRule(Set<ActivityFilter> filters, boolean z7) {
        q.f(filters, "filters");
        this.alwaysExpand = z7;
        this.filters = w.Y(filters);
    }

    public /* synthetic */ ActivityRule(Set set, boolean z7, int i8, j jVar) {
        this(set, (i8 & 2) != 0 ? false : z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return q.b(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (this.filters.hashCode() * 31) + androidx.privacysandbox.ads.adservices.topics.a.a(this.alwaysExpand);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        q.f(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new ActivityRule(w.Y(linkedHashSet), this.alwaysExpand);
    }
}
