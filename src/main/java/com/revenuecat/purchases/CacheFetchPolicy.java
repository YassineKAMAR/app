package com.revenuecat.purchases;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public enum CacheFetchPolicy {
    CACHE_ONLY,
    FETCH_CURRENT,
    NOT_STALE_CACHED_OR_CURRENT,
    CACHED_OR_FETCHED;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final CacheFetchPolicy m8default() {
            return CacheFetchPolicy.CACHED_OR_FETCHED;
        }
    }
}
