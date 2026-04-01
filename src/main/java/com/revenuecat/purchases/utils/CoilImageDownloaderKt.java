package com.revenuecat.purchases.utils;

import android.content.Context;
import coil.ImageLoader;
import coil.disk.DiskCache;
import java.io.File;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import n6.j;

/* JADX INFO: loaded from: classes.dex */
public final class CoilImageDownloaderKt {
    private static final long MAX_CACHE_SIZE_BYTES = 26214400;
    private static final String PAYWALL_IMAGE_CACHE_FOLDER = "revenuecatui_cache";

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.CoilImageDownloaderKt$getRevenueCatUIImageLoader$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements p6.a<DiskCache> {
        final /* synthetic */ Context $this_getRevenueCatUIImageLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(0);
            this.$this_getRevenueCatUIImageLoader = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p6.a
        public final DiskCache invoke() {
            DiskCache.Builder builder = new DiskCache.Builder();
            File cacheDir = this.$this_getRevenueCatUIImageLoader.getCacheDir();
            q.e(cacheDir, "cacheDir");
            return builder.directory(j.g(cacheDir, CoilImageDownloaderKt.PAYWALL_IMAGE_CACHE_FOLDER)).maxSizeBytes(CoilImageDownloaderKt.MAX_CACHE_SIZE_BYTES).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageLoader getRevenueCatUIImageLoader(Context context) {
        return new ImageLoader.Builder(context).diskCache(new AnonymousClass1(context)).build();
    }
}
