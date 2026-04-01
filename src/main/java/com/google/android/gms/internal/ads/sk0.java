package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sk0 extends pk0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f14731f = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final DecimalFormat f14732g = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f14733h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f14734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14735e;

    public sk0(dj0 dj0Var) {
        super(dj0Var);
        File cacheDir = this.f12918a.getCacheDir();
        if (cacheDir == null) {
            qg0.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.f14734d = file;
        if (!file.isDirectory() && !this.f14734d.mkdirs()) {
            qg0.g("Could not create preload cache directory at ".concat(String.valueOf(this.f14734d.getAbsolutePath())));
            this.f14734d = null;
        } else {
            if (this.f14734d.setReadable(true, false) && this.f14734d.setExecutable(true, false)) {
                return;
            }
            qg0.g("Could not set cache file permissions at ".concat(String.valueOf(this.f14734d.getAbsolutePath())));
            this.f14734d = null;
        }
    }

    private final File x(File file) {
        return new File(this.f14734d, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void h() {
        this.f14735e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0349, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0351, code lost:
    
        if (com.google.android.gms.internal.ads.qg0.j(3) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0353, code lost:
    
        com.google.android.gms.internal.ads.qg0.b("Preloaded " + com.google.android.gms.internal.ads.sk0.f14732g.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0376, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037f, code lost:
    
        if (r0.isFile() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0381, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040d  */
    @Override // com.google.android.gms.internal.ads.pk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(final java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk0.u(java.lang.String):boolean");
    }
}
