package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m8 implements ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11201a;

    public m8(int i8) {
        this.f11201a = jb3.z();
    }

    public m8(int i8, List list) {
        this.f11201a = list;
    }

    private final r9 b(aa aaVar) {
        return new r9(d(aaVar));
    }

    private final fa c(aa aaVar) {
        return new fa(d(aaVar));
    }

    private final List d(aa aaVar) {
        String str;
        int i8;
        List listSingletonList;
        dq2 dq2Var = new dq2(aaVar.f5159d);
        List arrayList = this.f11201a;
        while (dq2Var.j() > 0) {
            int iU = dq2Var.u();
            int iL = dq2Var.l() + dq2Var.u();
            if (iU == 134) {
                arrayList = new ArrayList();
                int iU2 = dq2Var.u() & 31;
                for (int i9 = 0; i9 < iU2; i9++) {
                    String strH = dq2Var.H(3, x73.f17098c);
                    int iU3 = dq2Var.u();
                    boolean z7 = (iU3 & 128) != 0;
                    if (z7) {
                        i8 = iU3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i8 = 1;
                    }
                    byte bU = (byte) dq2Var.u();
                    dq2Var.h(1);
                    if (z7) {
                        int i10 = bU & 64;
                        int i11 = ww1.f16970c;
                        listSingletonList = Collections.singletonList(i10 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    l9 l9Var = new l9();
                    l9Var.u(str);
                    l9Var.m(strH);
                    l9Var.i0(i8);
                    l9Var.k(listSingletonList);
                    arrayList.add(l9Var.D());
                }
            }
            dq2Var.g(iL);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final da a(int i8, aa aaVar) {
        if (i8 != 2) {
            if (i8 == 3 || i8 == 4) {
                return new g9(new d9(aaVar.f5157b));
            }
            if (i8 == 21) {
                return new g9(new b9());
            }
            if (i8 == 27) {
                return new g9(new y8(b(aaVar), false, false));
            }
            if (i8 == 36) {
                return new g9(new a9(b(aaVar)));
            }
            if (i8 == 89) {
                return new g9(new o8(aaVar.f5158c));
            }
            if (i8 == 138) {
                return new g9(new n8(aaVar.f5157b));
            }
            if (i8 == 172) {
                return new g9(new h8(aaVar.f5157b));
            }
            if (i8 == 257) {
                return new q9(new f9("application/vnd.dvb.ait"));
            }
            if (i8 != 128) {
                if (i8 != 129) {
                    if (i8 == 134) {
                        return new q9(new f9("application/x-scte35"));
                    }
                    if (i8 != 135) {
                        switch (i8) {
                            case 15:
                                return new g9(new l8(false, aaVar.f5157b));
                            case com.amazon.c.a.a.c.f4052g /* 16 */:
                                return new g9(new u8(c(aaVar)));
                            case 17:
                                return new g9(new c9(aaVar.f5157b));
                            default:
                                return null;
                        }
                    }
                }
                return new g9(new e8(aaVar.f5157b));
            }
        }
        return new g9(new r8(c(aaVar)));
    }
}
