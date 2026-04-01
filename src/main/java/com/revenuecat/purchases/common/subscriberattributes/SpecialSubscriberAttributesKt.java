package com.revenuecat.purchases.common.subscriberattributes;

import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class SpecialSubscriberAttributesKt {
    public static final SubscriberAttributeKey getSubscriberAttributeKey(String str) {
        q.f(str, "<this>");
        return q.b(str, ReservedSubscriberAttribute.EMAIL.getValue()) ? SubscriberAttributeKey.Email.INSTANCE : q.b(str, ReservedSubscriberAttribute.DISPLAY_NAME.getValue()) ? SubscriberAttributeKey.DisplayName.INSTANCE : q.b(str, ReservedSubscriberAttribute.PHONE_NUMBER.getValue()) ? SubscriberAttributeKey.PhoneNumber.INSTANCE : q.b(str, ReservedSubscriberAttribute.FCM_TOKENS.getValue()) ? SubscriberAttributeKey.FCMTokens.INSTANCE : new SubscriberAttributeKey.Custom(str);
    }
}
