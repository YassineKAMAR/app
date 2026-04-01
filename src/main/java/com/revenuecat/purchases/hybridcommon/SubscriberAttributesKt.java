package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.Purchases;
import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberAttributesKt {
    public static final void collectDeviceIdentifiers() {
        Purchases.Companion.getSharedInstance().collectDeviceIdentifiers();
    }

    public static final void setAd(String str) {
        Purchases.Companion.getSharedInstance().setAd(str);
    }

    public static final void setAdGroup(String str) {
        Purchases.Companion.getSharedInstance().setAdGroup(str);
    }

    public static final void setAdjustID(String str) {
        Purchases.Companion.getSharedInstance().setAdjustID(str);
    }

    public static final void setAirshipChannelID(String str) {
        Purchases.Companion.getSharedInstance().setAirshipChannelID(str);
    }

    public static final void setAppsflyerID(String str) {
        Purchases.Companion.getSharedInstance().setAppsflyerID(str);
    }

    public static final void setAttributes(Map<String, String> attributes) {
        q.f(attributes, "attributes");
        Purchases.Companion.getSharedInstance().setAttributes(attributes);
    }

    public static final void setCampaign(String str) {
        Purchases.Companion.getSharedInstance().setCampaign(str);
    }

    public static final void setCleverTapID(String str) {
        Purchases.Companion.getSharedInstance().setCleverTapID(str);
    }

    public static final void setCreative(String str) {
        Purchases.Companion.getSharedInstance().setCreative(str);
    }

    public static final void setDisplayName(String str) {
        Purchases.Companion.getSharedInstance().setDisplayName(str);
    }

    public static final void setEmail(String str) {
        Purchases.Companion.getSharedInstance().setEmail(str);
    }

    public static final void setFBAnonymousID(String str) {
        Purchases.Companion.getSharedInstance().setFBAnonymousID(str);
    }

    public static final void setFirebaseAppInstanceID(String str) {
        Purchases.Companion.getSharedInstance().setFirebaseAppInstanceID(str);
    }

    public static final void setKeyword(String str) {
        Purchases.Companion.getSharedInstance().setKeyword(str);
    }

    public static final void setMediaSource(String str) {
        Purchases.Companion.getSharedInstance().setMediaSource(str);
    }

    public static final void setMixpanelDistinctID(String str) {
        Purchases.Companion.getSharedInstance().setMixpanelDistinctID(str);
    }

    public static final void setMparticleID(String str) {
        Purchases.Companion.getSharedInstance().setMparticleID(str);
    }

    public static final void setOnesignalID(String str) {
        Purchases.Companion.getSharedInstance().setOnesignalID(str);
    }

    public static final void setPhoneNumber(String str) {
        Purchases.Companion.getSharedInstance().setPhoneNumber(str);
    }

    public static final void setPushToken(String str) {
        Purchases.Companion.getSharedInstance().setPushToken(str);
    }
}
