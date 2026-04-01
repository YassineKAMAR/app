package e5;

import java.util.Map;
import kotlin.jvm.internal.q;
import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f21389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dev.fluttercommunity.plus.share.a f21390b;

    public a(c share, dev.fluttercommunity.plus.share.a manager) {
        q.f(share, "share");
        q.f(manager, "manager");
        this.f21389a = share;
        this.f21390b = manager;
    }

    private final void a(j jVar) {
        if (!(jVar.f26253b instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected".toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r3.equals("share") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r3.equals("shareFilesWithResult") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r3.equals("shareWithResult") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r12.f21390b.c(r14) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r2 = r12.f21389a;
        r3 = r13.a("text");
        kotlin.jvm.internal.q.d(r3, "null cannot be cast to non-null type kotlin.String");
        r2.m((java.lang.String) r3, (java.lang.String) r13.a("subject"), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r1 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        r14.a("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        if (r3.equals("shareFiles") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        a(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (r1 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r12.f21390b.c(r14) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        r5 = r12.f21389a;
        r2 = r13.a("paths");
        kotlin.jvm.internal.q.c(r2);
        r5.n((java.util.List) r2, (java.util.List) r13.a("mimeTypes"), (java.lang.String) r13.a("text"), (java.lang.String) r13.a("subject"), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r1 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r0 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        r14.a("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
    
        r14.a(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r14.b("Share failed", r13.getMessage(), null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00f3 -> B:55:0x0100). Please report as a decompilation issue!!! */
    @Override // s5.k.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(s5.j r13, s5.k.d r14) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.onMethodCall(s5.j, s5.k$d):void");
    }
}
