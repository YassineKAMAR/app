package com.revenuecat.purchases.common.subscriberattributes;

/* JADX INFO: loaded from: classes.dex */
public enum ReservedSubscriberAttribute {
    EMAIL("$email"),
    DISPLAY_NAME("$displayName"),
    PHONE_NUMBER("$phoneNumber"),
    FCM_TOKENS("$fcmTokens"),
    IDFA("$idfa"),
    IDFV("$idfv"),
    IP("$ip"),
    GPS_AD_ID("$gpsAdId"),
    ANDROID_ID("$androidId"),
    AMAZON_AD_ID("$amazonAdId"),
    ADJUST_ID("$adjustId"),
    APPSFLYER_ID("$appsflyerId"),
    FB_ANON_ID("$fbAnonId"),
    MPARTICLE_ID("$mparticleId"),
    ONESIGNAL_ID("$onesignalId"),
    ONESIGNAL_USER_ID("$onesignalUserId"),
    AIRSHIP_CHANNEL_ID("$airshipChannelId"),
    CLEVER_TAP_ID("$clevertapId"),
    MIXPANEL_DISTINCT_ID("$mixpanelDistinctId"),
    FIREBASE_APP_INSTANCE_ID("$firebaseAppInstanceId"),
    MEDIA_SOURCE("$mediaSource"),
    CAMPAIGN("$campaign"),
    AD_GROUP("$adGroup"),
    AD("$ad"),
    KEYWORD("$keyword"),
    CREATIVE("$creative");

    private final String value;

    ReservedSubscriberAttribute(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
