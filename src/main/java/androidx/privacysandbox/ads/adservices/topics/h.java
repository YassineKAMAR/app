package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi", "ClassVerificationFailure"})
public final class h extends i {
    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context) {
        q.f(context, "context");
        Object systemService = context.getSystemService((Class<Object>) TopicsManager.class);
        q.e(systemService, "context.getSystemService…opicsManager::class.java)");
        super((TopicsManager) systemService);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.i
    public GetTopicsRequest c(b request) {
        q.f(request, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).setShouldRecordObservation(request.b()).build();
        q.e(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
