package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.a6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f4497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f4500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.g f4501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f4502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4503g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f4506c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f4507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.a f4509f;

        /* synthetic */ a(j1.w wVar) {
            c.a aVarA = c.a();
            c.a.g(aVarA);
            this.f4509f = aVarA;
        }

        public e a() {
            ArrayList arrayList = this.f4507d;
            boolean z7 = true;
            boolean z8 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f4506c;
            boolean z9 = (list == null || list.isEmpty()) ? false : true;
            if (!z8 && !z9) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z8 && z9) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            j1.b0 b0Var = null;
            if (!z8) {
                b bVar = (b) this.f4506c.get(0);
                for (int i8 = 0; i8 < this.f4506c.size(); i8++) {
                    b bVar2 = (b) this.f4506c.get(i8);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i8 != 0 && !bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strH = bVar.b().h();
                for (b bVar3 : this.f4506c) {
                    if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !strH.equals(bVar3.b().h())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f4507d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f4507d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f4507d.get(0);
                    String strB = skuDetails.b();
                    ArrayList arrayList2 = this.f4507d;
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i9);
                        if (!strB.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !strB.equals(skuDetails2.b())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strF = skuDetails.f();
                    ArrayList arrayList3 = this.f4507d;
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i10);
                        if (!strB.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !strF.equals(skuDetails3.f())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            e eVar = new e(b0Var);
            if ((!z8 || ((SkuDetails) this.f4507d.get(0)).f().isEmpty()) && (!z9 || ((b) this.f4506c.get(0)).b().h().isEmpty())) {
                z7 = false;
            }
            eVar.f4497a = z7;
            eVar.f4498b = this.f4504a;
            eVar.f4499c = this.f4505b;
            eVar.f4500d = this.f4509f.a();
            ArrayList arrayList4 = this.f4507d;
            eVar.f4502f = arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList();
            eVar.f4503g = this.f4508e;
            List list2 = this.f4506c;
            eVar.f4501e = list2 != null ? com.google.android.gms.internal.play_billing.g.x(list2) : com.google.android.gms.internal.play_billing.g.y();
            return eVar;
        }

        public a b(boolean z7) {
            this.f4508e = z7;
            return this;
        }

        public a c(String str) {
            this.f4504a = str;
            return this;
        }

        public a d(List<b> list) {
            this.f4506c = new ArrayList(list);
            return this;
        }

        public a e(c cVar) {
            this.f4509f = c.d(cVar);
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f4510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f4511b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private h f4512a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f4513b;

            /* synthetic */ a(j1.x xVar) {
            }

            public b a() {
                a6.c(this.f4512a, "ProductDetails is required for constructing ProductDetailsParams.");
                a6.c(this.f4513b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(String str) {
                this.f4513b = str;
                return this;
            }

            public a c(h hVar) {
                this.f4512a = hVar;
                if (hVar.c() != null) {
                    hVar.c().getClass();
                    this.f4513b = hVar.c().d();
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, j1.y yVar) {
            this.f4510a = aVar.f4512a;
            this.f4511b = aVar.f4513b;
        }

        public static a a() {
            return new a(null);
        }

        public final h b() {
            return this.f4510a;
        }

        public final String c() {
            return this.f4511b;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4516c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4517d = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f4518a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f4519b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f4520c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f4521d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f4522e = 0;

            /* synthetic */ a(j1.z zVar) {
            }

            static /* synthetic */ a g(a aVar) {
                aVar.f4520c = true;
                return aVar;
            }

            public c a() {
                j1.a0 a0Var = null;
                boolean z7 = (TextUtils.isEmpty(this.f4518a) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(this.f4519b);
                if (z7 && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f4520c && !z7 && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(a0Var);
                cVar.f4514a = this.f4518a;
                cVar.f4516c = this.f4521d;
                cVar.f4517d = this.f4522e;
                cVar.f4515b = this.f4519b;
                return cVar;
            }

            public a b(String str) {
                this.f4518a = str;
                return this;
            }

            @Deprecated
            public a c(String str) {
                this.f4518a = str;
                return this;
            }

            public a d(String str) {
                this.f4519b = str;
                return this;
            }

            @Deprecated
            public a e(int i8) {
                this.f4521d = i8;
                return this;
            }

            public a f(int i8) {
                this.f4522e = i8;
                return this;
            }
        }

        /* synthetic */ c(j1.a0 a0Var) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a d(c cVar) {
            a aVarA = a();
            aVarA.c(cVar.f4514a);
            aVarA.e(cVar.f4516c);
            aVarA.f(cVar.f4517d);
            aVarA.d(cVar.f4515b);
            return aVarA;
        }

        @Deprecated
        final int b() {
            return this.f4516c;
        }

        final int c() {
            return this.f4517d;
        }

        final String e() {
            return this.f4514a;
        }

        final String f() {
            return this.f4515b;
        }
    }

    private e() {
    }

    /* synthetic */ e(j1.b0 b0Var) {
    }

    public static a a() {
        return new a(null);
    }

    @Deprecated
    public final int b() {
        return this.f4500d.b();
    }

    public final int c() {
        return this.f4500d.c();
    }

    public final String d() {
        return this.f4498b;
    }

    public final String e() {
        return this.f4499c;
    }

    public final String f() {
        return this.f4500d.e();
    }

    public final String g() {
        return this.f4500d.f();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f4502f);
        return arrayList;
    }

    public final List i() {
        return this.f4501e;
    }

    public final boolean q() {
        return this.f4503g;
    }

    final boolean r() {
        return (this.f4498b == null && this.f4499c == null && this.f4500d.f() == null && this.f4500d.b() == 0 && this.f4500d.c() == 0 && !this.f4497a && !this.f4503g) ? false : true;
    }
}
