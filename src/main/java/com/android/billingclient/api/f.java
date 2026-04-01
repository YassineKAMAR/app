package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4524b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4526b = "";

        /* synthetic */ a(j1.d0 d0Var) {
        }

        public f a() {
            f fVar = new f();
            fVar.f4523a = this.f4525a;
            fVar.f4524b = this.f4526b;
            return fVar;
        }

        public a b(String str) {
            this.f4526b = str;
            return this;
        }

        public a c(int i8) {
            this.f4525a = i8;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f4524b;
    }

    public int b() {
        return this.f4523a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.v.h(this.f4523a) + ", Debug Message: " + this.f4524b;
    }
}
