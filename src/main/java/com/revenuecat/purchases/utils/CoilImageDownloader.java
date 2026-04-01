package com.revenuecat.purchases.utils;

import android.content.Context;
import android.net.Uri;
import coil.request.ImageRequest;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class CoilImageDownloader {
    private final Context applicationContext;

    public CoilImageDownloader(Context applicationContext) {
        q.f(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final void downloadImage(Uri uri) {
        q.f(uri, "uri");
        CoilImageDownloaderKt.getRevenueCatUIImageLoader(this.applicationContext).enqueue(new ImageRequest.Builder(this.applicationContext).data(uri).build());
    }
}
