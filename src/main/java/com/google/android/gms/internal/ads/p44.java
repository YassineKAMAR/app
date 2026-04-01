package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class p44 implements e14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final e14 f12743a = new p44();

    private p44() {
    }

    @Override // com.google.android.gms.internal.ads.e14
    public final boolean b(int i8) {
        if (i8 != 0 && i8 != 1 && i8 != 2 && i8 != 1999) {
            switch (i8) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case 1005:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
