package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17769a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ws3 f17770b = ws3.f16937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17771c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Iterator it = this.f17769a.iterator();
        while (it.hasNext()) {
            ((wh3) it.next()).f16739a = false;
        }
    }

    public final yh3 a(wh3 wh3Var) {
        if (wh3Var.f16744f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (wh3Var.f16739a) {
            d();
        }
        wh3Var.f16744f = this;
        this.f17769a.add(wh3Var);
        return this;
    }

    public final bi3 b() throws GeneralSecurityException {
        int i8;
        if (this.f17771c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c8 = 1;
        this.f17771c = true;
        List list = this.f17769a;
        gw3 gw3VarO = jw3.O();
        int i9 = 0;
        while (i9 < list.size() - 1) {
            int i10 = i9 + 1;
            if (((wh3) list.get(i9)).f16743e == xh3.f17236a && ((wh3) list.get(i10)).f16743e != xh3.f17236a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i9 = i10;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (wh3 wh3Var : this.f17769a) {
            sh3 unused = wh3Var.f16740b;
            if (wh3Var.f16743e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i11 = 3;
            if (wh3Var.f16743e == xh3.f17236a) {
                i8 = 0;
                while (true) {
                    if (i8 != 0 && !hashSet.contains(Integer.valueOf(i8))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i12 = 0;
                    while (i12 == 0) {
                        secureRandom.nextBytes(bArr);
                        i12 = ((bArr[0] & 255) << 24) | ((bArr[c8] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        c8 = 1;
                    }
                    i8 = i12;
                }
            } else {
                xh3 unused2 = wh3Var.f16743e;
                i8 = 0;
            }
            Integer numValueOf = Integer.valueOf(i8);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i8 + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            wh3.a(wh3Var);
            fi3 fi3Var = wh3Var.f16742d;
            sh3 sh3VarC = wh3Var.c();
            sh3 sh3Var = sh3.f14673b;
            if (!sh3Var.equals(sh3VarC)) {
                if (sh3.f14674c.equals(sh3VarC)) {
                    i11 = 4;
                } else {
                    if (!sh3.f14675d.equals(sh3VarC)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i11 = 5;
                }
            }
            if (fi3Var instanceof no3) {
                throw null;
            }
            up3 up3Var = (up3) yo3.b().c(fi3Var, up3.class);
            vv3 vv3VarA = qi3.a(up3Var.b());
            hw3 hw3VarO = iw3.O();
            hw3VarO.v(i8);
            hw3VarO.x(i11);
            hw3VarO.u(vv3VarA);
            hw3VarO.w(up3Var.b().P());
            gw3VarO.u((iw3) hw3VarO.q());
            if (wh3Var.f16739a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (wh3Var.f16740b != sh3Var) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            c8 = 1;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        gw3VarO.v(num.intValue());
        return bi3.b((jw3) gw3VarO.q(), this.f17770b);
    }
}
