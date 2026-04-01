package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zi extends ak {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final bk f18242j = new bk();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f18243i;

    public zi(ii iiVar, String str, String str2, ce ceVar, int i8, int i9, Context context, vd vdVar) {
        super(iiVar, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", ceVar, i8, 27);
        this.f18243i = context;
    }

    private final String d() {
        try {
            if (this.f5293b.l() != null) {
                this.f5293b.l().get();
            }
            ze zeVarC = this.f5293b.c();
            if (zeVarC == null || !zeVarC.w0()) {
                return null;
            }
            return zeVarC.L0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        int i8;
        rf rfVar;
        AtomicReference atomicReferenceA = f18242j.a(this.f18243i.getPackageName());
        synchronized (atomicReferenceA) {
            rf rfVar2 = (rf) atomicReferenceA.get();
            if (rfVar2 == null || li.d(rfVar2.f14084b) || rfVar2.f14084b.equals("E") || rfVar2.f14084b.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (li.d(null)) {
                    li.d(null);
                    Boolean.FALSE.booleanValue();
                    i8 = 3;
                } else {
                    i8 = 5;
                }
                Boolean boolValueOf = Boolean.valueOf(i8 == 3);
                Boolean bool = (Boolean) h2.y.c().b(ns.f12105j2);
                String strC = ((Boolean) h2.y.c().b(ns.f12096i2)).booleanValue() ? c() : null;
                if (bool.booleanValue() && this.f5293b.p() && li.d(strC)) {
                    strC = d();
                }
                rf rfVar3 = new rf((String) this.f5297f.invoke(null, this.f18243i, boolValueOf, strC));
                if (li.d(rfVar3.f14084b) || rfVar3.f14084b.equals("E")) {
                    int i9 = i8 - 1;
                    if (i9 == 3) {
                        String strD = d();
                        if (!li.d(strD)) {
                            rfVar3.f14084b = strD;
                        }
                    } else if (i9 == 4) {
                        throw null;
                    }
                }
                atomicReferenceA.set(rfVar3);
            }
            rfVar = (rf) atomicReferenceA.get();
        }
        synchronized (this.f5296e) {
            if (rfVar != null) {
                this.f5296e.y0(rfVar.f14084b);
                this.f5296e.R(rfVar.f14085c);
                this.f5296e.T(rfVar.f14086d);
                this.f5296e.j0(rfVar.f14087e);
                this.f5296e.x0(rfVar.f14088f);
            }
        }
    }

    protected final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrF = li.f((String) h2.y.c().b(ns.f12114k2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrF)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(li.f((String) h2.y.c().b(ns.f12123l2)))));
            }
            Context context = this.f18243i;
            String packageName = context.getPackageName();
            this.f5293b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final tg3 tg3VarC = tg3.C();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.ck
                public final void onChecksumsReady(List list) {
                    tg3 tg3Var = tg3VarC;
                    if (list == null) {
                        tg3Var.f(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i8);
                            if (apkChecksum.getType() == 8) {
                                tg3Var.f(li.b(apkChecksum.getValue()));
                                return;
                            }
                        }
                        tg3Var.f(null);
                    } catch (Throwable unused) {
                        tg3Var.f(null);
                    }
                }
            });
            return (String) tg3VarC.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
