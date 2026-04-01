package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class a04 extends za3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4943a;

    public a04(Map map) {
        this.f4943a = map;
    }

    @Override // com.google.android.gms.internal.ads.ab3
    protected final /* synthetic */ Object a() {
        return this.f4943a;
    }

    @Override // com.google.android.gms.internal.ads.za3, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.za3
    protected final Map d() {
        return this.f4943a;
    }

    @Override // com.google.android.gms.internal.ads.za3, java.util.Map
    public final Set entrySet() {
        return gd3.b(this.f4943a.entrySet(), new m83() { // from class: com.google.android.gms.internal.ads.yx3
            @Override // com.google.android.gms.internal.ads.m83
            public final boolean a(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.i(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f4943a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.g();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f4943a.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return gd3.b(this.f4943a.keySet(), new m83() { // from class: com.google.android.gms.internal.ads.zy3
            @Override // com.google.android.gms.internal.ads.m83
            public final boolean a(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.za3, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
