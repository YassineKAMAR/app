package com.revenuecat.purchases.subscriberattributes;

import e6.x;
import f6.k0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import v6.f;
import v6.h;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberAttributesFactoriesKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<String, e6.r<? extends String, ? extends SubscriberAttribute>> {
        final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        @Override // p6.l
        public final e6.r<String, SubscriberAttribute> invoke(String str) throws JSONException {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            q.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return x.a(str, new SubscriberAttribute((JSONObject) obj));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1, reason: invalid class name and case insensitive filesystem */
    static final class C02901 extends r implements l<String, e6.r<? extends String, ? extends Map<String, ? extends SubscriberAttribute>>> {
        final /* synthetic */ JSONObject $attributesJSONObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02901(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        @Override // p6.l
        public final e6.r<String, Map<String, SubscriberAttribute>> invoke(String str) throws JSONException {
            Object obj = this.$attributesJSONObject.get(str);
            q.d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return x.a(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
        }
    }

    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) throws JSONException {
        q.f(jSONObject, "<this>");
        JSONObject attributesJSONObject = jSONObject.getJSONObject("attributes");
        q.e(attributesJSONObject, "attributesJSONObject");
        return buildSubscriberAttributesMap(attributesJSONObject);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        q.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        q.e(itKeys, "this.keys()");
        return k0.q(h.d(f.a(itKeys), new AnonymousClass1(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) throws JSONException {
        q.f(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> itKeys = jSONObject2.keys();
        q.e(itKeys, "attributesJSONObject.keys()");
        return k0.q(h.d(f.a(itKeys), new C02901(jSONObject2)));
    }
}
