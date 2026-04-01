package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qj extends ak {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f13527i;

    public qj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", ceVar, i8, 61);
        this.f13527i = iiVar.s();
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        long jLongValue = ((Long) this.f5297f.invoke(null, this.f5293b.b(), Boolean.valueOf(this.f13527i))).longValue();
        synchronized (this.f5296e) {
            this.f5296e.y(jLongValue);
        }
    }
}
