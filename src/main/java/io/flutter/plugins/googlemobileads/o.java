package io.flutter.plugins.googlemobileads;

import f2.a;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f23309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f23310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Number f23311c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23312a;

        static {
            int[] iArr = new int[a.EnumC0105a.values().length];
            f23312a = iArr;
            try {
                iArr[a.EnumC0105a.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23312a[a.EnumC0105a.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    enum b {
        NOT_READY,
        READY
    }

    o(f2.a aVar) {
        b bVar;
        int i8 = a.f23312a[aVar.a().ordinal()];
        if (i8 == 1) {
            bVar = b.NOT_READY;
        } else {
            if (i8 != 2) {
                throw new IllegalArgumentException(String.format("Unable to handle state: %s", aVar.a()));
            }
            bVar = b.READY;
        }
        this.f23309a = bVar;
        this.f23310b = aVar.getDescription();
        this.f23311c = Integer.valueOf(aVar.b());
    }

    o(b bVar, String str, Number number) {
        this.f23309a = bVar;
        this.f23310b = str;
        this.f23311c = number;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f23309a == oVar.f23309a && this.f23310b.equals(oVar.f23310b)) {
            return this.f23311c.equals(oVar.f23311c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f23309a.hashCode() * 31) + this.f23310b.hashCode()) * 31) + this.f23311c.hashCode();
    }
}
