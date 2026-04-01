package com.revenuecat.purchases.common;

import com.revenuecat.purchases.strings.Emojis;
import f6.n;
import f6.o;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public enum LogIntent {
    DEBUG(n.b(Emojis.INFO)),
    GOOGLE_ERROR(o.g(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(o.g(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(n.b(Emojis.INFO)),
    PURCHASE(n.b(Emojis.MONEY_BAG)),
    RC_ERROR(o.g(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(o.g(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(n.b(Emojis.HEART_CAT_EYES)),
    USER(n.b(Emojis.PERSON)),
    WARNING(n.b(Emojis.WARNING)),
    AMAZON_WARNING(o.g(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(o.g(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
