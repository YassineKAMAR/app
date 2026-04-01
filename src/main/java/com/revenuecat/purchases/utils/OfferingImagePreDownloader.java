package com.revenuecat.purchases.utils;

import android.net.Uri;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import f6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    public OfferingImagePreDownloader(boolean z7, CoilImageDownloader coilImageDownloader) {
        q.f(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z7;
        this.coilImageDownloader = coilImageDownloader;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OfferingImagePreDownloader(boolean z7, CoilImageDownloader coilImageDownloader, int i8, j jVar) {
        if ((i8 & 1) != 0) {
            try {
                Class.forName("com.revenuecat.purchases.ui.revenuecatui.PaywallKt");
                z7 = true;
            } catch (ClassNotFoundException unused) {
                z7 = false;
            }
        }
        this(z7, coilImageDownloader);
    }

    public final void preDownloadOfferingImages(Offering offering) {
        q.f(offering, "offering");
        if (!this.shouldPredownloadImages) {
            LogUtilsKt.verboseLog("OfferingImagePreDownloader won't pre-download images");
            return;
        }
        LogUtilsKt.debugLog("OfferingImagePreDownloader: starting image download");
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List<String> all$purchases_defaultsRelease = paywall.getConfig().getImages().getAll$purchases_defaultsRelease();
            ArrayList<Uri> arrayList = new ArrayList(p.m(all$purchases_defaultsRelease, 10));
            Iterator<T> it = all$purchases_defaultsRelease.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path((String) it.next()).build());
            }
            for (Uri it2 : arrayList) {
                LogUtilsKt.debugLog("Pre-downloading paywall image: " + it2);
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                q.e(it2, "it");
                coilImageDownloader.downloadImage(it2);
            }
        }
    }
}
