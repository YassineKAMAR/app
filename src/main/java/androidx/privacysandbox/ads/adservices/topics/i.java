package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import androidx.core.os.j;
import java.util.ArrayList;
import kotlin.jvm.internal.q;
import y6.k;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TopicsManager f2724b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2726b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2728d;

        a(h6.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2726b = obj;
            this.f2728d |= Integer.MIN_VALUE;
            return i.e(i.this, null, this);
        }
    }

    public i(TopicsManager mTopicsManager) {
        q.f(mTopicsManager, "mTopicsManager");
        this.f2724b = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.i r4, androidx.privacysandbox.ads.adservices.topics.b r5, h6.d<? super androidx.privacysandbox.ads.adservices.topics.c> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.i.a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.i$a r0 = (androidx.privacysandbox.ads.adservices.topics.i.a) r0
            int r1 = r0.f2728d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2728d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.i$a r0 = new androidx.privacysandbox.ads.adservices.topics.i$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2726b
            java.lang.Object r1 = i6.b.e()
            int r2 = r0.f2728d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f2725a
            androidx.privacysandbox.ads.adservices.topics.i r4 = (androidx.privacysandbox.ads.adservices.topics.i) r4
            e6.t.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e6.t.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.f2725a = r4
            r0.f2728d = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.c r4 = r4.d(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.i.e(androidx.privacysandbox.ads.adservices.topics.i, androidx.privacysandbox.ads.adservices.topics.b, h6.d):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, h6.d<? super GetTopicsResponse> dVar) throws Throwable {
        k kVar = new k(i6.c.c(dVar), 1);
        kVar.x();
        this.f2724b.getTopics(getTopicsRequest, new l0.b(), j.a(kVar));
        Object objU = kVar.u();
        if (objU == i6.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.f
    public Object a(b bVar, h6.d<? super c> dVar) {
        return e(this, bVar, dVar);
    }

    public GetTopicsRequest c(b request) {
        q.f(request, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(request.a()).build();
        q.e(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final c d(GetTopicsResponse response) {
        q.f(response, "response");
        ArrayList arrayList = new ArrayList();
        for (Topic topic : response.getTopics()) {
            arrayList.add(new e(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new c(arrayList);
    }
}
