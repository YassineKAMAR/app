package com.android.billingclient.api;

import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.g f4566a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.play_billing.g f4567a;

        /* synthetic */ a(j1.p0 p0Var) {
        }

        public i a() {
            return new i(this, null);
        }

        public a b(List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f4567a = com.google.android.gms.internal.play_billing.g.x(list);
            return this;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4569b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f4570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f4571b;

            /* synthetic */ a(j1.q0 q0Var) {
            }

            public b a() {
                if ("first_party".equals(this.f4571b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f4570a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f4571b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f4570a = str;
                return this;
            }

            public a c(String str) {
                this.f4571b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, j1.r0 r0Var) {
            this.f4568a = aVar.f4570a;
            this.f4569b = aVar.f4571b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f4568a;
        }

        public final String c() {
            return this.f4569b;
        }
    }

    /* synthetic */ i(a aVar, j1.s0 s0Var) {
        this.f4566a = aVar.f4567a;
    }

    public static a a() {
        return new a(null);
    }

    public final com.google.android.gms.internal.play_billing.g b() {
        return this.f4566a;
    }

    public final String c() {
        return ((b) this.f4566a.get(0)).c();
    }
}
