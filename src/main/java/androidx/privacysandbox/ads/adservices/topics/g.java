package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public final class g extends i {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context) {
        q.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) TopicsManager.class);
        q.e(systemService, "context.getSystemService…opicsManager::class.java)");
        super((TopicsManager) systemService);
    }
}
