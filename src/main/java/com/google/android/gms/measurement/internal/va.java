package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.ne;
import com.google.android.gms.internal.measurement.od;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.w4;
import com.google.android.gms.internal.measurement.yf;
import com.google.android.gms.measurement.internal.y6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class va implements w6 {
    private static volatile va H;
    private long A;
    private final Map<String, y6> B;
    private final Map<String, v> C;
    private final Map<String, b> D;
    private p8 E;
    private String F;
    private final kb G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i5 f20571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u4 f20572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m f20573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w4 f20574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private pa f20575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private pb f20576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final db f20577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n8 f20578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private y9 f20579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ta f20580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private g5 f20581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w5 f20582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f20583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f20585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<Runnable> f20586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Set<String> f20587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20589s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20590t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20591u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20592v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private FileLock f20593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private FileChannel f20594x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<Long> f20595y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<Long> f20596z;

    private class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.google.android.gms.internal.measurement.b5 f20597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<Long> f20598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List<com.google.android.gms.internal.measurement.w4> f20599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f20600d;

        private a() {
        }

        private static long c(com.google.android.gms.internal.measurement.w4 w4Var) {
            return ((w4Var.X() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.measurement.internal.q
        public final void a(com.google.android.gms.internal.measurement.b5 b5Var) {
            a3.o.j(b5Var);
            this.f20597a = b5Var;
        }

        @Override // com.google.android.gms.measurement.internal.q
        public final boolean b(long j8, com.google.android.gms.internal.measurement.w4 w4Var) {
            a3.o.j(w4Var);
            if (this.f20599c == null) {
                this.f20599c = new ArrayList();
            }
            if (this.f20598b == null) {
                this.f20598b = new ArrayList();
            }
            if (!this.f20599c.isEmpty() && c(this.f20599c.get(0)) != c(w4Var)) {
                return false;
            }
            long jO0 = this.f20600d + ((long) w4Var.o0());
            va.this.c0();
            if (jO0 >= Math.max(0, e0.f19943k.a(null).intValue())) {
                return false;
            }
            this.f20600d = jO0;
            this.f20599c.add(w4Var);
            this.f20598b.add(Long.valueOf(j8));
            int size = this.f20599c.size();
            va.this.c0();
            return size < Math.max(1, e0.f19945l.a(null).intValue());
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f20602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f20603b;

        private b(va vaVar) {
            this(vaVar, vaVar.n0().S0());
        }

        private b(va vaVar, String str) {
            this.f20602a = str;
            this.f20603b = vaVar.k().b();
        }
    }

    private va(fb fbVar) {
        this(fbVar, null);
    }

    private va(fb fbVar, w5 w5Var) {
        this.f20583m = false;
        this.f20587q = new HashSet();
        this.G = new cb(this);
        a3.o.j(fbVar);
        this.f20582l = w5.a(fbVar.f20023a, null, null);
        this.A = -1L;
        this.f20580j = new ta(this);
        db dbVar = new db(this);
        dbVar.v();
        this.f20577g = dbVar;
        u4 u4Var = new u4(this);
        u4Var.v();
        this.f20572b = u4Var;
        i5 i5Var = new i5(this);
        i5Var.v();
        this.f20571a = i5Var;
        this.B = new HashMap();
        this.C = new HashMap();
        this.D = new HashMap();
        u().D(new ya(this, fbVar));
    }

    private final void F(String str, boolean z7) {
        r5 r5VarD0 = e0().D0(str);
        if (r5VarD0 != null) {
            r5VarD0.G(z7);
            if (r5VarD0.s()) {
                e0().V(r5VarD0);
            }
        }
    }

    private final void G(List<Long> list) {
        a3.o.a(!list.isEmpty());
        if (this.f20595y != null) {
            t().G().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f20595y = new ArrayList(list);
        }
    }

    private final boolean J(int i8, FileChannel fileChannel) {
        u().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            t().G().a("Bad channel to read from");
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i8);
        byteBufferAllocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(byteBufferAllocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                t().G().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e8) {
            t().G().b("Failed to write to channel", e8);
            return false;
        }
    }

    private final boolean K(w4.a aVar, w4.a aVar2) {
        a3.o.a("_e".equals(aVar.G()));
        m0();
        com.google.android.gms.internal.measurement.y4 y4VarE = db.E((com.google.android.gms.internal.measurement.w4) ((com.google.android.gms.internal.measurement.y8) aVar.d()), "_sc");
        String strC0 = y4VarE == null ? null : y4VarE.c0();
        m0();
        com.google.android.gms.internal.measurement.y4 y4VarE2 = db.E((com.google.android.gms.internal.measurement.w4) ((com.google.android.gms.internal.measurement.y8) aVar2.d()), "_pc");
        String strC02 = y4VarE2 != null ? y4VarE2.c0() : null;
        if (strC02 == null || !strC02.equals(strC0)) {
            return false;
        }
        a3.o.a("_e".equals(aVar.G()));
        m0();
        com.google.android.gms.internal.measurement.y4 y4VarE3 = db.E((com.google.android.gms.internal.measurement.w4) ((com.google.android.gms.internal.measurement.y8) aVar.d()), "_et");
        if (y4VarE3 == null || !y4VarE3.g0() || y4VarE3.W() <= 0) {
            return true;
        }
        long jW = y4VarE3.W();
        m0();
        com.google.android.gms.internal.measurement.y4 y4VarE4 = db.E((com.google.android.gms.internal.measurement.w4) ((com.google.android.gms.internal.measurement.y8) aVar2.d()), "_et");
        if (y4VarE4 != null && y4VarE4.W() > 0) {
            jW += y4VarE4.W();
        }
        m0();
        db.R(aVar2, "_et", Long.valueOf(jW));
        m0();
        db.R(aVar, "_fr", 1L);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0587 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0652 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0ead, EDGE_INSN: B:59:0x01ca->B:21:0x0074 BREAK  A[LOOP:15: B:54:0x0198->B:567:?], PHI: r4
  0x0074: PHI (r4v133 android.database.Cursor) = 
  (r4v5 android.database.Cursor)
  (r4v139 android.database.Cursor)
  (r4v140 android.database.Cursor)
  (r4v141 android.database.Cursor)
  (r4v141 android.database.Cursor)
  (r4v141 android.database.Cursor)
  (r4v140 android.database.Cursor)
  (r4v144 android.database.Cursor)
 binds: [B:78:0x021c, B:36:0x00be, B:66:0x01e8, B:64:0x01e5, B:59:0x01ca, B:53:0x0185, B:41:0x00f4, B:20:0x0072] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06a4 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06f8 A[PHI: r7 r9
  0x06f8: PHI (r7v6 com.google.android.gms.internal.measurement.b5$a) = 
  (r7v5 com.google.android.gms.internal.measurement.b5$a)
  (r7v5 com.google.android.gms.internal.measurement.b5$a)
  (r7v9 com.google.android.gms.internal.measurement.b5$a)
 binds: [B:231:0x06b2, B:233:0x06c5, B:229:0x069f] A[DONT_GENERATE, DONT_INLINE]
  0x06f8: PHI (r9v59 int) = (r9v58 int), (r9v58 int), (r9v61 int) binds: [B:231:0x06b2, B:233:0x06c5, B:229:0x069f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0749 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0b1e A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0b34 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0b56 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[Catch: SQLiteException -> 0x01fc, all -> 0x0ea5, TryCatch #4 {all -> 0x0ea5, blocks: (B:10:0x0035, B:19:0x006e, B:23:0x0079, B:24:0x007d, B:39:0x00c7, B:41:0x00f4, B:42:0x0107, B:43:0x010b, B:44:0x011d, B:46:0x0123, B:47:0x0134, B:49:0x0140, B:51:0x0164, B:53:0x0185, B:54:0x0198, B:55:0x01a1, B:57:0x01ac, B:62:0x01df, B:61:0x01cd, B:50:0x0156, B:66:0x01e8, B:77:0x020b, B:34:0x00b8, B:37:0x00bf), top: B:509:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107 A[Catch: SQLiteException -> 0x01fc, all -> 0x0ea5, TRY_LEAVE, TryCatch #4 {all -> 0x0ea5, blocks: (B:10:0x0035, B:19:0x006e, B:23:0x0079, B:24:0x007d, B:39:0x00c7, B:41:0x00f4, B:42:0x0107, B:43:0x010b, B:44:0x011d, B:46:0x0123, B:47:0x0134, B:49:0x0140, B:51:0x0164, B:53:0x0185, B:54:0x0198, B:55:0x01a1, B:57:0x01ac, B:62:0x01df, B:61:0x01cd, B:50:0x0156, B:66:0x01e8, B:77:0x020b, B:34:0x00b8, B:37:0x00bf), top: B:509:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0e95 A[Catch: all -> 0x0ead, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0ea9 A[Catch: all -> 0x0ead, TRY_ENTER, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:568:? A[Catch: all -> 0x0ead, SYNTHETIC, TRY_LEAVE, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0224 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0230 A[Catch: all -> 0x0ead, TryCatch #8 {all -> 0x0ead, blocks: (B:3:0x000b, B:21:0x0074, B:80:0x0220, B:82:0x0224, B:88:0x0230, B:89:0x0243, B:92:0x0259, B:95:0x027f, B:97:0x02b4, B:103:0x02ca, B:105:0x02d4, B:243:0x0714, B:107:0x02fe, B:109:0x030c, B:112:0x0328, B:114:0x032e, B:116:0x0340, B:118:0x034e, B:120:0x035e, B:121:0x036b, B:122:0x0370, B:124:0x0386, B:139:0x03bf, B:142:0x03c9, B:144:0x03d7, B:148:0x0422, B:145:0x03f6, B:147:0x0406, B:152:0x042f, B:154:0x045d, B:155:0x0489, B:157:0x04bb, B:159:0x04c1, B:162:0x04cd, B:164:0x0500, B:165:0x051b, B:167:0x0521, B:169:0x052f, B:173:0x0543, B:170:0x0538, B:176:0x054a, B:178:0x0550, B:179:0x056e, B:181:0x0587, B:182:0x0593, B:185:0x059d, B:191:0x05c0, B:188:0x05af, B:194:0x05c6, B:196:0x05d2, B:198:0x05de, B:214:0x062b, B:217:0x0646, B:219:0x0652, B:222:0x0665, B:224:0x0677, B:226:0x0685, B:242:0x06fc, B:230:0x06a4, B:232:0x06b4, B:235:0x06c9, B:237:0x06db, B:239:0x06e9, B:202:0x05fd, B:206:0x0611, B:208:0x0617, B:211:0x0622, B:127:0x039c, B:246:0x072a, B:248:0x0738, B:250:0x0741, B:262:0x0779, B:251:0x0749, B:253:0x0752, B:255:0x0758, B:258:0x0764, B:260:0x076c, B:263:0x077e, B:264:0x078c, B:266:0x0792, B:272:0x07ab, B:273:0x07b6, B:278:0x07c3, B:282:0x07e8, B:284:0x07f5, B:286:0x0801, B:288:0x0817, B:290:0x0821, B:291:0x0833, B:292:0x0836, B:293:0x0845, B:295:0x084b, B:297:0x085b, B:298:0x0862, B:300:0x086e, B:301:0x0875, B:302:0x0878, B:304:0x0881, B:306:0x0893, B:308:0x08a2, B:310:0x08b2, B:313:0x08bb, B:315:0x08c3, B:316:0x08d9, B:318:0x08df, B:323:0x08f4, B:325:0x090c, B:327:0x091e, B:329:0x0941, B:331:0x096e, B:332:0x099b, B:333:0x09a6, B:334:0x09aa, B:336:0x09e5, B:337:0x09f8, B:339:0x09fe, B:342:0x0a16, B:344:0x0a31, B:346:0x0a47, B:348:0x0a4c, B:350:0x0a50, B:352:0x0a54, B:354:0x0a5e, B:355:0x0a66, B:357:0x0a6a, B:359:0x0a70, B:360:0x0a7e, B:361:0x0a89, B:431:0x0ccc, B:362:0x0a96, B:366:0x0ac8, B:367:0x0ad0, B:369:0x0ad6, B:371:0x0ae8, B:373:0x0af6, B:375:0x0afa, B:377:0x0b04, B:379:0x0b08, B:385:0x0b1e, B:388:0x0b34, B:389:0x0b56, B:391:0x0b62, B:393:0x0b78, B:395:0x0bb7, B:399:0x0bcf, B:401:0x0bd6, B:403:0x0be7, B:405:0x0beb, B:407:0x0bef, B:409:0x0bf3, B:410:0x0c01, B:412:0x0c07, B:414:0x0c26, B:415:0x0c2f, B:430:0x0cc9, B:416:0x0c46, B:418:0x0c4d, B:422:0x0c6b, B:424:0x0c95, B:425:0x0ca0, B:426:0x0cb2, B:428:0x0cbc, B:419:0x0c56, B:432:0x0cd8, B:434:0x0ce5, B:435:0x0cec, B:436:0x0cf4, B:438:0x0cfa, B:441:0x0d12, B:443:0x0d22, B:463:0x0d95, B:465:0x0d9b, B:467:0x0dab, B:470:0x0db2, B:475:0x0de3, B:471:0x0dba, B:473:0x0dc6, B:474:0x0dcc, B:476:0x0df4, B:477:0x0e0b, B:480:0x0e13, B:481:0x0e18, B:482:0x0e28, B:484:0x0e42, B:485:0x0e5b, B:486:0x0e63, B:491:0x0e85, B:490:0x0e74, B:444:0x0d3a, B:446:0x0d40, B:448:0x0d4a, B:450:0x0d51, B:456:0x0d61, B:458:0x0d68, B:460:0x0d87, B:462:0x0d8e, B:461:0x0d8b, B:457:0x0d65, B:449:0x0d4e, B:279:0x07c8, B:281:0x07ce, B:494:0x0e95, B:500:0x0ea9, B:501:0x0eac), top: B:515:0x000b, inners: #6 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [p3.g0] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean L(java.lang.String r41, long r42) {
        /*
            Method dump skipped, instruction units count: 3767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.L(java.lang.String, long):boolean");
    }

    private final void M() {
        u().i();
        if (this.f20590t || this.f20591u || this.f20592v) {
            t().K().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f20590t), Boolean.valueOf(this.f20591u), Boolean.valueOf(this.f20592v));
            return;
        }
        t().K().a("Stopping uploading service(s)");
        List<Runnable> list = this.f20586p;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        ((List) a3.o.j(this.f20586p)).clear();
    }

    private final void N() {
        h4<Long> h4Var;
        long jMax;
        u().i();
        p0();
        if (this.f20585o > 0) {
            long jAbs = 3600000 - Math.abs(k().b() - this.f20585o);
            if (jAbs > 0) {
                t().K().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                v0().c();
                w0().z();
                return;
            }
            this.f20585o = 0L;
        }
        if (!this.f20582l.q() || !O()) {
            t().K().a("Nothing to upload or uploading impossible");
            v0().c();
            w0().z();
            return;
        }
        long jA = k().a();
        c0();
        long jMax2 = Math.max(0L, e0.C.a(null).longValue());
        boolean z7 = e0().W0() || e0().V0();
        if (z7) {
            String strN = c0().N();
            if (TextUtils.isEmpty(strN) || ".none.".equals(strN)) {
                c0();
                h4Var = e0.f19967w;
            } else {
                c0();
                h4Var = e0.f19969x;
            }
        } else {
            c0();
            h4Var = e0.f19965v;
        }
        long jMax3 = Math.max(0L, h4Var.a(null).longValue());
        long jA2 = this.f20579i.f20736g.a();
        long jA3 = this.f20579i.f20737h.a();
        long jMax4 = Math.max(e0().z(), e0().A());
        if (jMax4 == 0) {
            jMax = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            long jMax5 = Math.max(jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z7 && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            if (!m0().b0(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i8 = 0;
                while (true) {
                    c0();
                    if (i8 >= Math.min(20, Math.max(0, e0.E.a(null).intValue()))) {
                        break;
                    }
                    c0();
                    jMax += Math.max(0L, e0.D.a(null).longValue()) * (1 << i8);
                    if (jMax > jAbs4) {
                        break;
                    } else {
                        i8++;
                    }
                }
                jMax = 0;
            }
        }
        if (jMax == 0) {
            t().K().a("Next upload time is 0");
            v0().c();
            w0().z();
            return;
        }
        if (!g0().A()) {
            t().K().a("No network");
            v0().b();
            w0().z();
            return;
        }
        long jA4 = this.f20579i.f20735f.a();
        c0();
        long jMax6 = Math.max(0L, e0.f19961t.a(null).longValue());
        if (!m0().b0(jA4, jMax6)) {
            jMax = Math.max(jMax, jA4 + jMax6);
        }
        v0().c();
        long jA5 = jMax - k().a();
        if (jA5 <= 0) {
            c0();
            jA5 = Math.max(0L, e0.f19971y.a(null).longValue());
            this.f20579i.f20736g.b(k().a());
        }
        t().K().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        w0().y(jA5);
    }

    private final boolean O() {
        u().i();
        p0();
        return e0().U0() || !TextUtils.isEmpty(e0().C());
    }

    private final boolean P() {
        p4 p4VarL;
        String str;
        u().i();
        FileLock fileLock = this.f20593w;
        if (fileLock != null && fileLock.isValid()) {
            t().K().a("Storage concurrent access okay");
            return true;
        }
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f20582l.j().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f20594x = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f20593w = fileLockTryLock;
            if (fileLockTryLock != null) {
                t().K().a("Storage concurrent access okay");
                return true;
            }
            t().G().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e8) {
            e = e8;
            p4VarL = t().G();
            str = "Failed to acquire storage lock";
            p4VarL.b(str, e);
            return false;
        } catch (IOException e9) {
            e = e9;
            p4VarL = t().G();
            str = "Failed to access storage lock file";
            p4VarL.b(str, e);
            return false;
        } catch (OverlappingFileLockException e10) {
            e = e10;
            p4VarL = t().L();
            str = "Storage lock already acquired";
            p4VarL.b(str, e);
            return false;
        }
    }

    private final void U(d0 d0Var, lb lbVar) {
        a3.o.f(lbVar.f20210a);
        r4 r4VarB = r4.b(d0Var);
        n0().M(r4VarB.f20427d, e0().A0(lbVar.f20210a));
        n0().V(r4VarB, c0().y(lbVar.f20210a));
        d0 d0VarA = r4VarB.a();
        if ("_cmp".equals(d0VarA.f19888a) && "referrer API v2".equals(d0VarA.f19889b.w("_cis"))) {
            String strW = d0VarA.f19889b.w("gclid");
            if (!TextUtils.isEmpty(strW)) {
                x(new hb("_lgclid", d0VarA.f19891d, strW, "auto"), lbVar);
            }
        }
        if (ne.a() && ne.c() && "_cmp".equals(d0VarA.f19888a) && "referrer API v2".equals(d0VarA.f19889b.w("_cis"))) {
            String strW2 = d0VarA.f19889b.w("gbraid");
            if (!TextUtils.isEmpty(strW2)) {
                x(new hb("_gbraid", d0VarA.f19891d, strW2, "auto"), lbVar);
            }
        }
        r(d0VarA, lbVar);
    }

    private final void V(r5 r5Var) {
        u().i();
        if (TextUtils.isEmpty(r5Var.j()) && TextUtils.isEmpty(r5Var.r0())) {
            z((String) a3.o.j(r5Var.t0()), 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String strJ = r5Var.j();
        if (TextUtils.isEmpty(strJ)) {
            strJ = r5Var.r0();
        }
        p.a aVar = null;
        builder.scheme(e0.f19935g.a(null)).encodedAuthority(e0.f19937h.a(null)).path("config/app/" + strJ).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "82001").appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            String str = (String) a3.o.j(r5Var.t0());
            URL url = new URL(string);
            t().K().b("Fetching remote configuration", str);
            com.google.android.gms.internal.measurement.j4 j4VarL = h0().L(str);
            String strP = h0().P(str);
            if (j4VarL != null) {
                if (!TextUtils.isEmpty(strP)) {
                    aVar = new p.a();
                    aVar.put("If-Modified-Since", strP);
                }
                String strN = h0().N(str);
                if (!TextUtils.isEmpty(strN)) {
                    if (aVar == null) {
                        aVar = new p.a();
                    }
                    aVar.put("If-None-Match", strN);
                }
            }
            this.f20590t = true;
            u4 u4VarG0 = g0();
            ab abVar = new ab(this);
            u4VarG0.i();
            u4VarG0.s();
            a3.o.j(url);
            a3.o.j(abVar);
            u4VarG0.u().z(new x4(u4VarG0, str, url, null, aVar, abVar));
        } catch (MalformedURLException unused) {
            t().G().c("Failed to parse config URL. Not fetching. appId", n4.v(r5Var.t0()), string);
        }
    }

    private final lb W(String str) {
        String str2;
        p4 p4VarF;
        Object objV;
        String strI;
        int iB;
        String str3 = str;
        r5 r5VarD0 = e0().D0(str3);
        if (r5VarD0 == null || TextUtils.isEmpty(r5VarD0.h())) {
            str2 = "No app data available; dropping";
            objV = str3;
            p4VarF = t().F();
        } else {
            Boolean boolH = h(r5VarD0);
            if (boolH == null || boolH.booleanValue()) {
                y6 y6VarQ = Q(str);
                if (td.a() && c0().q(e0.T0)) {
                    strI = a0(str).i();
                    iB = y6VarQ.b();
                } else {
                    strI = "";
                    iB = 100;
                }
                return new lb(str, r5VarD0.j(), r5VarD0.h(), r5VarD0.z(), r5VarD0.v0(), r5VarD0.g0(), r5VarD0.a0(), (String) null, r5VarD0.r(), false, r5VarD0.i(), r5VarD0.v(), 0L, 0, r5VarD0.q(), false, r5VarD0.r0(), r5VarD0.q0(), r5VarD0.c0(), r5VarD0.n(), (String) null, y6VarQ.v(), "", (String) null, r5VarD0.t(), r5VarD0.p0(), iB, strI, r5VarD0.a(), r5VarD0.D());
            }
            p4 p4VarG = t().G();
            str2 = "App version does not match; dropping. appId";
            objV = n4.v(str);
            p4VarF = p4VarG;
        }
        p4VarF.b(str2, objV);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x030c A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:56:0x0197, B:59:0x01a6, B:61:0x01b0, B:66:0x01bc, B:73:0x01ce, B:76:0x01da, B:78:0x01f1, B:83:0x020a, B:88:0x023f, B:90:0x0245, B:92:0x0253, B:94:0x026b, B:97:0x0272, B:106:0x0302, B:108:0x030c, B:112:0x0342, B:116:0x0356, B:118:0x03ac, B:120:0x03b1, B:121:0x03c8, B:125:0x03d9, B:127:0x03f1, B:129:0x03f8, B:130:0x040f, B:134:0x0431, B:138:0x0457, B:139:0x046e, B:142:0x047d, B:145:0x049c, B:146:0x04b6, B:148:0x04c0, B:150:0x04cc, B:152:0x04d2, B:153:0x04db, B:155:0x04e9, B:156:0x04fe, B:158:0x0524, B:161:0x053b, B:164:0x057a, B:166:0x05a4, B:168:0x05e2, B:169:0x05e7, B:171:0x05ef, B:172:0x05f4, B:174:0x05fc, B:175:0x0601, B:177:0x0607, B:179:0x060f, B:181:0x061b, B:183:0x0629, B:184:0x062e, B:186:0x0637, B:187:0x063b, B:189:0x0648, B:190:0x064d, B:192:0x0674, B:194:0x067c, B:195:0x0681, B:197:0x0687, B:199:0x0695, B:201:0x06a0, B:205:0x06b5, B:210:0x06c4, B:212:0x06cb, B:216:0x06da, B:220:0x06e7, B:224:0x06f4, B:228:0x0701, B:232:0x070e, B:236:0x0719, B:240:0x0726, B:242:0x0737, B:244:0x073d, B:245:0x0740, B:247:0x074f, B:248:0x0752, B:250:0x076e, B:252:0x0772, B:254:0x077c, B:256:0x0786, B:258:0x078a, B:260:0x0795, B:261:0x079e, B:263:0x07a4, B:265:0x07b0, B:267:0x07b8, B:269:0x07c4, B:271:0x07d0, B:273:0x07d6, B:275:0x07f3, B:277:0x083a, B:279:0x0844, B:280:0x0847, B:282:0x0853, B:284:0x0873, B:285:0x0880, B:286:0x08b3, B:288:0x08b9, B:290:0x08c3, B:291:0x08d0, B:293:0x08da, B:294:0x08e7, B:295:0x08f2, B:297:0x08f8, B:299:0x0936, B:301:0x093e, B:303:0x0950, B:305:0x0956, B:306:0x0966, B:308:0x096e, B:309:0x0972, B:311:0x0978, B:320:0x09c0, B:322:0x09c6, B:325:0x09e0, B:314:0x0985, B:316:0x09ad, B:324:0x09ca, B:165:0x0596, B:99:0x029d, B:100:0x02bb, B:105:0x02e9, B:104:0x02d8, B:86:0x0218, B:87:0x0235), top: B:333:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0342 A[Catch: all -> 0x0a11, TRY_LEAVE, TryCatch #1 {all -> 0x0a11, blocks: (B:56:0x0197, B:59:0x01a6, B:61:0x01b0, B:66:0x01bc, B:73:0x01ce, B:76:0x01da, B:78:0x01f1, B:83:0x020a, B:88:0x023f, B:90:0x0245, B:92:0x0253, B:94:0x026b, B:97:0x0272, B:106:0x0302, B:108:0x030c, B:112:0x0342, B:116:0x0356, B:118:0x03ac, B:120:0x03b1, B:121:0x03c8, B:125:0x03d9, B:127:0x03f1, B:129:0x03f8, B:130:0x040f, B:134:0x0431, B:138:0x0457, B:139:0x046e, B:142:0x047d, B:145:0x049c, B:146:0x04b6, B:148:0x04c0, B:150:0x04cc, B:152:0x04d2, B:153:0x04db, B:155:0x04e9, B:156:0x04fe, B:158:0x0524, B:161:0x053b, B:164:0x057a, B:166:0x05a4, B:168:0x05e2, B:169:0x05e7, B:171:0x05ef, B:172:0x05f4, B:174:0x05fc, B:175:0x0601, B:177:0x0607, B:179:0x060f, B:181:0x061b, B:183:0x0629, B:184:0x062e, B:186:0x0637, B:187:0x063b, B:189:0x0648, B:190:0x064d, B:192:0x0674, B:194:0x067c, B:195:0x0681, B:197:0x0687, B:199:0x0695, B:201:0x06a0, B:205:0x06b5, B:210:0x06c4, B:212:0x06cb, B:216:0x06da, B:220:0x06e7, B:224:0x06f4, B:228:0x0701, B:232:0x070e, B:236:0x0719, B:240:0x0726, B:242:0x0737, B:244:0x073d, B:245:0x0740, B:247:0x074f, B:248:0x0752, B:250:0x076e, B:252:0x0772, B:254:0x077c, B:256:0x0786, B:258:0x078a, B:260:0x0795, B:261:0x079e, B:263:0x07a4, B:265:0x07b0, B:267:0x07b8, B:269:0x07c4, B:271:0x07d0, B:273:0x07d6, B:275:0x07f3, B:277:0x083a, B:279:0x0844, B:280:0x0847, B:282:0x0853, B:284:0x0873, B:285:0x0880, B:286:0x08b3, B:288:0x08b9, B:290:0x08c3, B:291:0x08d0, B:293:0x08da, B:294:0x08e7, B:295:0x08f2, B:297:0x08f8, B:299:0x0936, B:301:0x093e, B:303:0x0950, B:305:0x0956, B:306:0x0966, B:308:0x096e, B:309:0x0972, B:311:0x0978, B:320:0x09c0, B:322:0x09c6, B:325:0x09e0, B:314:0x0985, B:316:0x09ad, B:324:0x09ca, B:165:0x0596, B:99:0x029d, B:100:0x02bb, B:105:0x02e9, B:104:0x02d8, B:86:0x0218, B:87:0x0235), top: B:333:0x0197, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x09c6 A[Catch: all -> 0x0a11, TryCatch #1 {all -> 0x0a11, blocks: (B:56:0x0197, B:59:0x01a6, B:61:0x01b0, B:66:0x01bc, B:73:0x01ce, B:76:0x01da, B:78:0x01f1, B:83:0x020a, B:88:0x023f, B:90:0x0245, B:92:0x0253, B:94:0x026b, B:97:0x0272, B:106:0x0302, B:108:0x030c, B:112:0x0342, B:116:0x0356, B:118:0x03ac, B:120:0x03b1, B:121:0x03c8, B:125:0x03d9, B:127:0x03f1, B:129:0x03f8, B:130:0x040f, B:134:0x0431, B:138:0x0457, B:139:0x046e, B:142:0x047d, B:145:0x049c, B:146:0x04b6, B:148:0x04c0, B:150:0x04cc, B:152:0x04d2, B:153:0x04db, B:155:0x04e9, B:156:0x04fe, B:158:0x0524, B:161:0x053b, B:164:0x057a, B:166:0x05a4, B:168:0x05e2, B:169:0x05e7, B:171:0x05ef, B:172:0x05f4, B:174:0x05fc, B:175:0x0601, B:177:0x0607, B:179:0x060f, B:181:0x061b, B:183:0x0629, B:184:0x062e, B:186:0x0637, B:187:0x063b, B:189:0x0648, B:190:0x064d, B:192:0x0674, B:194:0x067c, B:195:0x0681, B:197:0x0687, B:199:0x0695, B:201:0x06a0, B:205:0x06b5, B:210:0x06c4, B:212:0x06cb, B:216:0x06da, B:220:0x06e7, B:224:0x06f4, B:228:0x0701, B:232:0x070e, B:236:0x0719, B:240:0x0726, B:242:0x0737, B:244:0x073d, B:245:0x0740, B:247:0x074f, B:248:0x0752, B:250:0x076e, B:252:0x0772, B:254:0x077c, B:256:0x0786, B:258:0x078a, B:260:0x0795, B:261:0x079e, B:263:0x07a4, B:265:0x07b0, B:267:0x07b8, B:269:0x07c4, B:271:0x07d0, B:273:0x07d6, B:275:0x07f3, B:277:0x083a, B:279:0x0844, B:280:0x0847, B:282:0x0853, B:284:0x0873, B:285:0x0880, B:286:0x08b3, B:288:0x08b9, B:290:0x08c3, B:291:0x08d0, B:293:0x08da, B:294:0x08e7, B:295:0x08f2, B:297:0x08f8, B:299:0x0936, B:301:0x093e, B:303:0x0950, B:305:0x0956, B:306:0x0966, B:308:0x096e, B:309:0x0972, B:311:0x0978, B:320:0x09c0, B:322:0x09c6, B:325:0x09e0, B:314:0x0985, B:316:0x09ad, B:324:0x09ca, B:165:0x0596, B:99:0x029d, B:100:0x02bb, B:105:0x02e9, B:104:0x02d8, B:86:0x0218, B:87:0x0235), top: B:333:0x0197, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Y(com.google.android.gms.measurement.internal.d0 r29, com.google.android.gms.measurement.internal.lb r30) {
        /*
            Method dump skipped, instruction units count: 2587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.Y(com.google.android.gms.measurement.internal.d0, com.google.android.gms.measurement.internal.lb):void");
    }

    private final int a(FileChannel fileChannel) {
        u().i();
        if (fileChannel == null || !fileChannel.isOpen()) {
            t().G().a("Bad channel to read from");
            return 0;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int i8 = fileChannel.read(byteBufferAllocate);
            if (i8 == 4) {
                byteBufferAllocate.flip();
                return byteBufferAllocate.getInt();
            }
            if (i8 != -1) {
                t().L().b("Unexpected data length. Bytes read", Integer.valueOf(i8));
            }
            return 0;
        } catch (IOException e8) {
            t().G().b("Failed to read from channel", e8);
            return 0;
        }
    }

    private final v a0(String str) {
        u().i();
        p0();
        if (!td.a()) {
            return v.f20539f;
        }
        v vVar = this.C.get(str);
        if (vVar != null) {
            return vVar;
        }
        v vVarG0 = e0().G0(str);
        this.C.put(str, vVarG0);
        return vVarG0;
    }

    private final v c(String str, v vVar, y6 y6Var, k kVar) {
        if (!td.a()) {
            return v.f20539f;
        }
        int iA = 90;
        if (h0().J(str) == null) {
            Boolean boolF = vVar.f();
            Boolean bool = Boolean.FALSE;
            if (boolF == bool) {
                iA = vVar.a();
                kVar.c(y6.a.AD_USER_DATA, iA);
            } else {
                kVar.d(y6.a.AD_USER_DATA, j.FAILSAFE);
            }
            return new v(bool, iA, Boolean.TRUE, "-");
        }
        Boolean boolF2 = vVar.f();
        if (boolF2 != null) {
            iA = vVar.a();
            kVar.c(y6.a.AD_USER_DATA, iA);
        } else {
            i5 i5Var = this.f20571a;
            y6.a aVar = y6.a.AD_USER_DATA;
            if (i5Var.C(str, aVar) == y6.a.AD_STORAGE && y6Var.s() != null) {
                boolF2 = y6Var.s();
                kVar.d(aVar, j.REMOTE_DELEGATION);
            }
            if (boolF2 == null) {
                boolF2 = Boolean.valueOf(this.f20571a.K(str, aVar));
                kVar.d(aVar, j.REMOTE_DEFAULT);
            }
        }
        a3.o.j(boolF2);
        boolean zY = this.f20571a.Y(str);
        SortedSet<String> sortedSetS = h0().S(str);
        if (!boolF2.booleanValue() || sortedSetS.isEmpty()) {
            return new v(Boolean.FALSE, iA, Boolean.valueOf(zY), "-");
        }
        return new v(Boolean.TRUE, iA, Boolean.valueOf(zY), zY ? TextUtils.join("", sortedSetS) : "");
    }

    private static boolean d0(lb lbVar) {
        return (TextUtils.isEmpty(lbVar.f20211b) && TextUtils.isEmpty(lbVar.f20226q)) ? false : true;
    }

    private static ua f(ua uaVar) {
        if (uaVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (uaVar.w()) {
            return uaVar;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(uaVar.getClass()));
    }

    public static va g(Context context) {
        a3.o.j(context);
        a3.o.j(context.getApplicationContext());
        if (H == null) {
            synchronized (va.class) {
                if (H == null) {
                    H = new va((fb) a3.o.j(new fb(context)));
                }
            }
        }
        return H;
    }

    private final Boolean h(r5 r5Var) {
        try {
            if (r5Var.z() != -2147483648L) {
                if (r5Var.z() == f3.e.a(this.f20582l.j()).f(r5Var.t0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = f3.e.a(this.f20582l.j()).f(r5Var.t0(), 0).versionName;
                String strH = r5Var.h();
                if (strH != null && strH.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final String i(y6 y6Var) {
        if (!y6Var.y()) {
            return null;
        }
        byte[] bArr = new byte[16];
        n0().U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    private static void l(w4.a aVar, int i8, String str) {
        List<com.google.android.gms.internal.measurement.y4> listH = aVar.H();
        for (int i9 = 0; i9 < listH.size(); i9++) {
            if ("_err".equals(listH.get(i9).b0())) {
                return;
            }
        }
        aVar.y((com.google.android.gms.internal.measurement.y4) ((com.google.android.gms.internal.measurement.y8) com.google.android.gms.internal.measurement.y4.Y().x("_err").u(Long.valueOf(i8).longValue()).d())).y((com.google.android.gms.internal.measurement.y4) ((com.google.android.gms.internal.measurement.y8) com.google.android.gms.internal.measurement.y4.Y().x("_ev").z(str).d()));
    }

    private static void m(w4.a aVar, String str) {
        List<com.google.android.gms.internal.measurement.y4> listH = aVar.H();
        for (int i8 = 0; i8 < listH.size(); i8++) {
            if (str.equals(listH.get(i8).b0())) {
                aVar.t(i8);
                return;
            }
        }
    }

    private final void n(b5.a aVar, long j8, boolean z7) {
        String str = z7 ? "_se" : "_lte";
        jb jbVarF0 = e0().F0(aVar.T0(), str);
        jb jbVar = (jbVarF0 == null || jbVarF0.f20166e == null) ? new jb(aVar.T0(), "auto", str, k().a(), Long.valueOf(j8)) : new jb(aVar.T0(), "auto", str, k().a(), Long.valueOf(((Long) jbVarF0.f20166e).longValue() + j8));
        com.google.android.gms.internal.measurement.f5 f5Var = (com.google.android.gms.internal.measurement.f5) ((com.google.android.gms.internal.measurement.y8) com.google.android.gms.internal.measurement.f5.W().v(str).x(k().a()).u(((Long) jbVar.f20166e).longValue()).d());
        boolean z8 = false;
        int iY = db.y(aVar, str);
        if (iY >= 0) {
            aVar.w(iY, f5Var);
            z8 = true;
        }
        if (!z8) {
            aVar.C(f5Var);
        }
        if (j8 > 0) {
            e0().e0(jbVar);
            t().K().c("Updated engagement user property. scope, value", z7 ? "session-scoped" : "lifetime", jbVar.f20166e);
        }
    }

    private final long u0() {
        long jA = k().a();
        y9 y9Var = this.f20579i;
        y9Var.s();
        y9Var.i();
        long jA2 = y9Var.f20738i.a();
        if (jA2 == 0) {
            jA2 = 1 + ((long) y9Var.f().U0().nextInt(86400000));
            y9Var.f20738i.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    private final w4 v0() {
        w4 w4Var = this.f20574d;
        if (w4Var != null) {
            return w4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    static /* synthetic */ void w(va vaVar, fb fbVar) {
        vaVar.u().i();
        vaVar.f20581k = new g5(vaVar);
        m mVar = new m(vaVar);
        mVar.v();
        vaVar.f20573c = mVar;
        vaVar.c0().o((h) a3.o.j(vaVar.f20571a));
        y9 y9Var = new y9(vaVar);
        y9Var.v();
        vaVar.f20579i = y9Var;
        pb pbVar = new pb(vaVar);
        pbVar.v();
        vaVar.f20576f = pbVar;
        n8 n8Var = new n8(vaVar);
        n8Var.v();
        vaVar.f20578h = n8Var;
        pa paVar = new pa(vaVar);
        paVar.v();
        vaVar.f20575e = paVar;
        vaVar.f20574d = new w4(vaVar);
        if (vaVar.f20588r != vaVar.f20589s) {
            vaVar.t().G().c("Not all upload components initialized", Integer.valueOf(vaVar.f20588r), Integer.valueOf(vaVar.f20589s));
        }
        vaVar.f20583m = true;
    }

    private final pa w0() {
        return (pa) f(this.f20575e);
    }

    final void A(String str, b5.a aVar) {
        int iY;
        int iIndexOf;
        Set<String> setR = h0().R(str);
        if (setR != null) {
            aVar.V(setR);
        }
        if (h0().b0(str)) {
            aVar.h0();
        }
        if (h0().e0(str)) {
            if (c0().B(str, e0.B0)) {
                String strX0 = aVar.X0();
                if (!TextUtils.isEmpty(strX0) && (iIndexOf = strX0.indexOf(".")) != -1) {
                    aVar.N0(strX0.substring(0, iIndexOf));
                }
            } else {
                aVar.F0();
            }
        }
        if (h0().f0(str) && (iY = db.y(aVar, "_id")) != -1) {
            aVar.N(iY);
        }
        if (h0().d0(str)) {
            aVar.q0();
        }
        if (h0().a0(str)) {
            aVar.Y();
            b bVar = this.D.get(str);
            if (bVar == null || bVar.f20603b + c0().x(str, e0.W) < k().b()) {
                bVar = new b();
                this.D.put(str, bVar);
            }
            aVar.E0(bVar.f20602a);
        }
        if (h0().c0(str)) {
            aVar.O0();
        }
    }

    final void B(String str, v vVar) {
        u().i();
        p0();
        if (td.a()) {
            this.C.put(str, vVar);
            e0().W(str, vVar);
        }
    }

    final void C(String str, y6 y6Var) {
        u().i();
        p0();
        this.B.put(str, y6Var);
        e0().X(str, y6Var);
    }

    public final void D(String str, p8 p8Var) {
        u().i();
        String str2 = this.F;
        if (str2 == null || str2.equals(str) || p8Var != null) {
            this.F = str;
            this.E = p8Var;
        }
    }

    final void E(String str, lb lbVar) {
        u().i();
        p0();
        if (d0(lbVar)) {
            if (!lbVar.f20217h) {
                d(lbVar);
                return;
            }
            if ("_npa".equals(str) && lbVar.f20227r != null) {
                t().F().a("Falling back to manifest metadata value for ad personalization");
                x(new hb("_npa", k().a(), Long.valueOf(lbVar.f20227r.booleanValue() ? 1L : 0L), "auto"), lbVar);
                return;
            }
            t().F().b("Removing user property", this.f20582l.D().g(str));
            e0().Q0();
            try {
                d(lbVar);
                if ("_id".equals(str)) {
                    e0().L0((String) a3.o.j(lbVar.f20210a), "_lair");
                }
                e0().L0((String) a3.o.j(lbVar.f20210a), str);
                e0().T0();
                t().F().b("User property removed", this.f20582l.D().g(str));
            } finally {
                e0().R0();
            }
        }
    }

    final void H(boolean z7) {
        N();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: SQLiteException -> 0x0149, all -> 0x01c0, TryCatch #2 {SQLiteException -> 0x0149, blocks: (B:15:0x0039, B:17:0x003f, B:21:0x005c, B:23:0x006e, B:27:0x007d, B:29:0x0083, B:31:0x008d, B:33:0x00b1, B:55:0x0118, B:57:0x012b, B:59:0x0131, B:61:0x013c, B:60:0x0135, B:63:0x0141, B:64:0x0148, B:32:0x009b, B:20:0x004d), top: B:83:0x0039, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void I(boolean r9, int r10, java.lang.Throwable r11, byte[] r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.I(boolean, int, java.lang.Throwable, byte[], java.lang.String):void");
    }

    final y6 Q(String str) {
        u().i();
        p0();
        y6 y6VarI0 = this.B.get(str);
        if (y6VarI0 == null) {
            y6VarI0 = e0().I0(str);
            if (y6VarI0 == null) {
                y6VarI0 = y6.f20721c;
            }
            C(str, y6VarI0);
        }
        return y6VarI0;
    }

    final String R(lb lbVar) {
        try {
            return (String) u().w(new za(this, lbVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e8) {
            t().G().c("Failed to get app instance id. appId", n4.v(lbVar.f20210a), e8);
            return null;
        }
    }

    final void S(d dVar) {
        lb lbVarW = W((String) a3.o.j(dVar.f19877a));
        if (lbVarW != null) {
            T(dVar, lbVarW);
        }
    }

    final void T(d dVar, lb lbVar) {
        p4 p4VarG;
        String str;
        Object objV;
        String strG;
        Object objG;
        p4 p4VarG2;
        String str2;
        Object objV2;
        String strG2;
        Object obj;
        boolean z7;
        a3.o.j(dVar);
        a3.o.f(dVar.f19877a);
        a3.o.j(dVar.f19878b);
        a3.o.j(dVar.f19879c);
        a3.o.f(dVar.f19879c.f20071b);
        u().i();
        p0();
        if (d0(lbVar)) {
            if (!lbVar.f20217h) {
                d(lbVar);
                return;
            }
            d dVar2 = new d(dVar);
            boolean z8 = false;
            dVar2.f19881e = false;
            e0().Q0();
            try {
                d dVarB0 = e0().B0((String) a3.o.j(dVar2.f19877a), dVar2.f19879c.f20071b);
                if (dVarB0 != null && !dVarB0.f19878b.equals(dVar2.f19878b)) {
                    t().L().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f20582l.D().g(dVar2.f19879c.f20071b), dVar2.f19878b, dVarB0.f19878b);
                }
                if (dVarB0 != null && (z7 = dVarB0.f19881e)) {
                    dVar2.f19878b = dVarB0.f19878b;
                    dVar2.f19880d = dVarB0.f19880d;
                    dVar2.f19884h = dVarB0.f19884h;
                    dVar2.f19882f = dVarB0.f19882f;
                    dVar2.f19885i = dVarB0.f19885i;
                    dVar2.f19881e = z7;
                    hb hbVar = dVar2.f19879c;
                    dVar2.f19879c = new hb(hbVar.f20071b, dVarB0.f19879c.f20072c, hbVar.g(), dVarB0.f19879c.f20076g);
                } else if (TextUtils.isEmpty(dVar2.f19882f)) {
                    hb hbVar2 = dVar2.f19879c;
                    dVar2.f19879c = new hb(hbVar2.f20071b, dVar2.f19880d, hbVar2.g(), dVar2.f19879c.f20076g);
                    dVar2.f19881e = true;
                    z8 = true;
                }
                if (dVar2.f19881e) {
                    hb hbVar3 = dVar2.f19879c;
                    jb jbVar = new jb((String) a3.o.j(dVar2.f19877a), dVar2.f19878b, hbVar3.f20071b, hbVar3.f20072c, a3.o.j(hbVar3.g()));
                    if (e0().e0(jbVar)) {
                        p4VarG2 = t().F();
                        str2 = "User property updated immediately";
                        objV2 = dVar2.f19877a;
                        strG2 = this.f20582l.D().g(jbVar.f20164c);
                        obj = jbVar.f20166e;
                    } else {
                        p4VarG2 = t().G();
                        str2 = "(2)Too many active user properties, ignoring";
                        objV2 = n4.v(dVar2.f19877a);
                        strG2 = this.f20582l.D().g(jbVar.f20164c);
                        obj = jbVar.f20166e;
                    }
                    p4VarG2.d(str2, objV2, strG2, obj);
                    if (z8 && dVar2.f19885i != null) {
                        Y(new d0(dVar2.f19885i, dVar2.f19880d), lbVar);
                    }
                }
                if (e0().c0(dVar2)) {
                    p4VarG = t().F();
                    str = "Conditional property added";
                    objV = dVar2.f19877a;
                    strG = this.f20582l.D().g(dVar2.f19879c.f20071b);
                    objG = dVar2.f19879c.g();
                } else {
                    p4VarG = t().G();
                    str = "Too many conditional properties, ignoring";
                    objV = n4.v(dVar2.f19877a);
                    strG = this.f20582l.D().g(dVar2.f19879c.f20071b);
                    objG = dVar2.f19879c.g();
                }
                p4VarG.d(str, objV, strG, objG);
                e0().T0();
            } finally {
                e0().R0();
            }
        }
    }

    public final pb X() {
        return (pb) f(this.f20576f);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x03b6 A[Catch: all -> 0x054b, TryCatch #4 {all -> 0x054b, blocks: (B:24:0x00a3, B:26:0x00af, B:44:0x0107, B:46:0x0119, B:48:0x012e, B:49:0x0154, B:51:0x01b2, B:54:0x01c5, B:57:0x01d9, B:59:0x01e4, B:64:0x01f3, B:67:0x0201, B:71:0x020c, B:73:0x0210, B:75:0x0232, B:77:0x0237, B:78:0x023f, B:84:0x0253, B:87:0x0267, B:89:0x0291, B:92:0x0299, B:94:0x02a8, B:95:0x02b4, B:123:0x0384, B:125:0x03b6, B:126:0x03b9, B:128:0x03e1, B:170:0x04b2, B:171:0x04b7, B:182:0x053c, B:131:0x03f8, B:136:0x041d, B:138:0x0428, B:140:0x042f, B:145:0x0443, B:149:0x044d, B:153:0x0458, B:157:0x0471, B:162:0x0496, B:164:0x049c, B:165:0x04a1, B:167:0x04a7, B:160:0x0482, B:134:0x0409, B:96:0x02b9, B:98:0x02e4, B:99:0x02f1, B:101:0x02f8, B:103:0x02fe, B:105:0x0308, B:107:0x030e, B:109:0x0314, B:111:0x031a, B:112:0x031f, B:116:0x0341, B:119:0x0346, B:120:0x035a, B:121:0x0368, B:122:0x0376, B:174:0x04d4, B:176:0x0505, B:177:0x0508, B:178:0x051b, B:179:0x051f, B:181:0x0523, B:81:0x0247, B:30:0x00c1, B:32:0x00c5, B:36:0x00d6, B:38:0x00ee, B:40:0x00f8, B:43:0x0104), top: B:196:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e1 A[Catch: all -> 0x054b, TRY_LEAVE, TryCatch #4 {all -> 0x054b, blocks: (B:24:0x00a3, B:26:0x00af, B:44:0x0107, B:46:0x0119, B:48:0x012e, B:49:0x0154, B:51:0x01b2, B:54:0x01c5, B:57:0x01d9, B:59:0x01e4, B:64:0x01f3, B:67:0x0201, B:71:0x020c, B:73:0x0210, B:75:0x0232, B:77:0x0237, B:78:0x023f, B:84:0x0253, B:87:0x0267, B:89:0x0291, B:92:0x0299, B:94:0x02a8, B:95:0x02b4, B:123:0x0384, B:125:0x03b6, B:126:0x03b9, B:128:0x03e1, B:170:0x04b2, B:171:0x04b7, B:182:0x053c, B:131:0x03f8, B:136:0x041d, B:138:0x0428, B:140:0x042f, B:145:0x0443, B:149:0x044d, B:153:0x0458, B:157:0x0471, B:162:0x0496, B:164:0x049c, B:165:0x04a1, B:167:0x04a7, B:160:0x0482, B:134:0x0409, B:96:0x02b9, B:98:0x02e4, B:99:0x02f1, B:101:0x02f8, B:103:0x02fe, B:105:0x0308, B:107:0x030e, B:109:0x0314, B:111:0x031a, B:112:0x031f, B:116:0x0341, B:119:0x0346, B:120:0x035a, B:121:0x0368, B:122:0x0376, B:174:0x04d4, B:176:0x0505, B:177:0x0508, B:178:0x051b, B:179:0x051f, B:181:0x0523, B:81:0x0247, B:30:0x00c1, B:32:0x00c5, B:36:0x00d6, B:38:0x00ee, B:40:0x00f8, B:43:0x0104), top: B:196:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04b2 A[Catch: all -> 0x054b, TryCatch #4 {all -> 0x054b, blocks: (B:24:0x00a3, B:26:0x00af, B:44:0x0107, B:46:0x0119, B:48:0x012e, B:49:0x0154, B:51:0x01b2, B:54:0x01c5, B:57:0x01d9, B:59:0x01e4, B:64:0x01f3, B:67:0x0201, B:71:0x020c, B:73:0x0210, B:75:0x0232, B:77:0x0237, B:78:0x023f, B:84:0x0253, B:87:0x0267, B:89:0x0291, B:92:0x0299, B:94:0x02a8, B:95:0x02b4, B:123:0x0384, B:125:0x03b6, B:126:0x03b9, B:128:0x03e1, B:170:0x04b2, B:171:0x04b7, B:182:0x053c, B:131:0x03f8, B:136:0x041d, B:138:0x0428, B:140:0x042f, B:145:0x0443, B:149:0x044d, B:153:0x0458, B:157:0x0471, B:162:0x0496, B:164:0x049c, B:165:0x04a1, B:167:0x04a7, B:160:0x0482, B:134:0x0409, B:96:0x02b9, B:98:0x02e4, B:99:0x02f1, B:101:0x02f8, B:103:0x02fe, B:105:0x0308, B:107:0x030e, B:109:0x0314, B:111:0x031a, B:112:0x031f, B:116:0x0341, B:119:0x0346, B:120:0x035a, B:121:0x0368, B:122:0x0376, B:174:0x04d4, B:176:0x0505, B:177:0x0508, B:178:0x051b, B:179:0x051f, B:181:0x0523, B:81:0x0247, B:30:0x00c1, B:32:0x00c5, B:36:0x00d6, B:38:0x00ee, B:40:0x00f8, B:43:0x0104), top: B:196:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x051f A[Catch: all -> 0x054b, TryCatch #4 {all -> 0x054b, blocks: (B:24:0x00a3, B:26:0x00af, B:44:0x0107, B:46:0x0119, B:48:0x012e, B:49:0x0154, B:51:0x01b2, B:54:0x01c5, B:57:0x01d9, B:59:0x01e4, B:64:0x01f3, B:67:0x0201, B:71:0x020c, B:73:0x0210, B:75:0x0232, B:77:0x0237, B:78:0x023f, B:84:0x0253, B:87:0x0267, B:89:0x0291, B:92:0x0299, B:94:0x02a8, B:95:0x02b4, B:123:0x0384, B:125:0x03b6, B:126:0x03b9, B:128:0x03e1, B:170:0x04b2, B:171:0x04b7, B:182:0x053c, B:131:0x03f8, B:136:0x041d, B:138:0x0428, B:140:0x042f, B:145:0x0443, B:149:0x044d, B:153:0x0458, B:157:0x0471, B:162:0x0496, B:164:0x049c, B:165:0x04a1, B:167:0x04a7, B:160:0x0482, B:134:0x0409, B:96:0x02b9, B:98:0x02e4, B:99:0x02f1, B:101:0x02f8, B:103:0x02fe, B:105:0x0308, B:107:0x030e, B:109:0x0314, B:111:0x031a, B:112:0x031f, B:116:0x0341, B:119:0x0346, B:120:0x035a, B:121:0x0368, B:122:0x0376, B:174:0x04d4, B:176:0x0505, B:177:0x0508, B:178:0x051b, B:179:0x051f, B:181:0x0523, B:81:0x0247, B:30:0x00c1, B:32:0x00c5, B:36:0x00d6, B:38:0x00ee, B:40:0x00f8, B:43:0x0104), top: B:196:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0210 A[Catch: all -> 0x054b, TryCatch #4 {all -> 0x054b, blocks: (B:24:0x00a3, B:26:0x00af, B:44:0x0107, B:46:0x0119, B:48:0x012e, B:49:0x0154, B:51:0x01b2, B:54:0x01c5, B:57:0x01d9, B:59:0x01e4, B:64:0x01f3, B:67:0x0201, B:71:0x020c, B:73:0x0210, B:75:0x0232, B:77:0x0237, B:78:0x023f, B:84:0x0253, B:87:0x0267, B:89:0x0291, B:92:0x0299, B:94:0x02a8, B:95:0x02b4, B:123:0x0384, B:125:0x03b6, B:126:0x03b9, B:128:0x03e1, B:170:0x04b2, B:171:0x04b7, B:182:0x053c, B:131:0x03f8, B:136:0x041d, B:138:0x0428, B:140:0x042f, B:145:0x0443, B:149:0x044d, B:153:0x0458, B:157:0x0471, B:162:0x0496, B:164:0x049c, B:165:0x04a1, B:167:0x04a7, B:160:0x0482, B:134:0x0409, B:96:0x02b9, B:98:0x02e4, B:99:0x02f1, B:101:0x02f8, B:103:0x02fe, B:105:0x0308, B:107:0x030e, B:109:0x0314, B:111:0x031a, B:112:0x031f, B:116:0x0341, B:119:0x0346, B:120:0x035a, B:121:0x0368, B:122:0x0376, B:174:0x04d4, B:176:0x0505, B:177:0x0508, B:178:0x051b, B:179:0x051f, B:181:0x0523, B:81:0x0247, B:30:0x00c1, B:32:0x00c5, B:36:0x00d6, B:38:0x00ee, B:40:0x00f8, B:43:0x0104), top: B:196:0x00a3, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0253 A[Catch: all -> 0x054b, TRY_LEAVE, TryCatch #4 {all -> 0x054b, blocks: (B:24:0x00a3, B:26:0x00af, B:44:0x0107, B:46:0x0119, B:48:0x012e, B:49:0x0154, B:51:0x01b2, B:54:0x01c5, B:57:0x01d9, B:59:0x01e4, B:64:0x01f3, B:67:0x0201, B:71:0x020c, B:73:0x0210, B:75:0x0232, B:77:0x0237, B:78:0x023f, B:84:0x0253, B:87:0x0267, B:89:0x0291, B:92:0x0299, B:94:0x02a8, B:95:0x02b4, B:123:0x0384, B:125:0x03b6, B:126:0x03b9, B:128:0x03e1, B:170:0x04b2, B:171:0x04b7, B:182:0x053c, B:131:0x03f8, B:136:0x041d, B:138:0x0428, B:140:0x042f, B:145:0x0443, B:149:0x044d, B:153:0x0458, B:157:0x0471, B:162:0x0496, B:164:0x049c, B:165:0x04a1, B:167:0x04a7, B:160:0x0482, B:134:0x0409, B:96:0x02b9, B:98:0x02e4, B:99:0x02f1, B:101:0x02f8, B:103:0x02fe, B:105:0x0308, B:107:0x030e, B:109:0x0314, B:111:0x031a, B:112:0x031f, B:116:0x0341, B:119:0x0346, B:120:0x035a, B:121:0x0368, B:122:0x0376, B:174:0x04d4, B:176:0x0505, B:177:0x0508, B:178:0x051b, B:179:0x051f, B:181:0x0523, B:81:0x0247, B:30:0x00c1, B:32:0x00c5, B:36:0x00d6, B:38:0x00ee, B:40:0x00f8, B:43:0x0104), top: B:196:0x00a3, inners: #0, #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void Z(com.google.android.gms.measurement.internal.lb r24) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.Z(com.google.android.gms.measurement.internal.lb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.os.Bundle b(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.q5 r0 = r5.u()
            r0.i()
            r5.p0()
            boolean r0 = com.google.android.gms.internal.measurement.td.a()
            r1 = 0
            if (r0 == 0) goto L7e
            com.google.android.gms.measurement.internal.i5 r0 = r5.h0()
            com.google.android.gms.internal.measurement.g4 r0 = r0.J(r6)
            if (r0 != 0) goto L1c
            return r1
        L1c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.measurement.internal.y6 r1 = r5.Q(r6)
            android.os.Bundle r2 = r1.o()
            r0.putAll(r2)
            com.google.android.gms.measurement.internal.v r2 = r5.a0(r6)
            com.google.android.gms.measurement.internal.k r3 = new com.google.android.gms.measurement.internal.k
            r3.<init>()
            com.google.android.gms.measurement.internal.v r1 = r5.c(r6, r2, r1, r3)
            android.os.Bundle r1 = r1.e()
            r0.putAll(r1)
            com.google.android.gms.measurement.internal.db r1 = r5.m0()
            boolean r1 = r1.h0(r6)
            r2 = 1
            if (r1 != 0) goto L70
            com.google.android.gms.measurement.internal.m r1 = r5.e0()
            java.lang.String r3 = "_npa"
            com.google.android.gms.measurement.internal.jb r1 = r1.F0(r6, r3)
            if (r1 == 0) goto L64
            java.lang.Object r6 = r1.f20166e
            r3 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            boolean r6 = r6.equals(r1)
            goto L71
        L64:
            com.google.android.gms.measurement.internal.i5 r1 = r5.f20571a
            com.google.android.gms.measurement.internal.y6$a r3 = com.google.android.gms.measurement.internal.y6.a.AD_PERSONALIZATION
            boolean r6 = r1.K(r6, r3)
            if (r6 == 0) goto L70
            r6 = 0
            goto L71
        L70:
            r6 = 1
        L71:
            if (r6 != r2) goto L76
            java.lang.String r6 = "denied"
            goto L78
        L76:
            java.lang.String r6 = "granted"
        L78:
            java.lang.String r1 = "ad_personalization"
            r0.putString(r1, r6)
            return r0
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.b(java.lang.String):android.os.Bundle");
    }

    final void b0(lb lbVar) {
        if (this.f20595y != null) {
            ArrayList arrayList = new ArrayList();
            this.f20596z = arrayList;
            arrayList.addAll(this.f20595y);
        }
        m mVarE0 = e0();
        String str = (String) a3.o.j(lbVar.f20210a);
        a3.o.f(str);
        mVarE0.i();
        mVarE0.s();
        try {
            SQLiteDatabase sQLiteDatabaseB = mVarE0.B();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseB.delete("apps", "app_id=?", strArr) + 0 + sQLiteDatabaseB.delete("events", "app_id=?", strArr) + sQLiteDatabaseB.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseB.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseB.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseB.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseB.delete("queue", "app_id=?", strArr) + sQLiteDatabaseB.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseB.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseB.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseB.delete("trigger_uris", "app_id=?", strArr);
            if (iDelete > 0) {
                mVarE0.t().K().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e8) {
            mVarE0.t().G().c("Error resetting analytics data. appId, error", n4.v(str), e8);
        }
        if (lbVar.f20217h) {
            Z(lbVar);
        }
    }

    public final f c0() {
        return ((w5) a3.o.j(this.f20582l)).z();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.r5 d(com.google.android.gms.measurement.internal.lb r11) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.d(com.google.android.gms.measurement.internal.lb):com.google.android.gms.measurement.internal.r5");
    }

    public final m e0() {
        return (m) f(this.f20573c);
    }

    public final m4 f0() {
        return this.f20582l.D();
    }

    public final u4 g0() {
        return (u4) f(this.f20572b);
    }

    public final i5 h0() {
        return (i5) f(this.f20571a);
    }

    final w5 i0() {
        return this.f20582l;
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final Context j() {
        return this.f20582l.j();
    }

    public final n8 j0() {
        return (n8) f(this.f20578h);
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final e3.e k() {
        return ((w5) a3.o.j(this.f20582l)).k();
    }

    public final y9 k0() {
        return this.f20579i;
    }

    public final ta l0() {
        return this.f20580j;
    }

    public final db m0() {
        return (db) f(this.f20577g);
    }

    public final ib n0() {
        return ((w5) a3.o.j(this.f20582l)).L();
    }

    final void o(d dVar) {
        lb lbVarW = W((String) a3.o.j(dVar.f19877a));
        if (lbVarW != null) {
            q(dVar, lbVarW);
        }
    }

    final void o0() {
        p4 p4VarG;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        u().i();
        p0();
        if (this.f20584n) {
            return;
        }
        this.f20584n = true;
        if (P()) {
            int iA = a(this.f20594x);
            int iD = this.f20582l.B().D();
            u().i();
            if (iA > iD) {
                p4VarG = t().G();
                numValueOf = Integer.valueOf(iA);
                numValueOf2 = Integer.valueOf(iD);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (iA >= iD) {
                    return;
                }
                if (J(iD, this.f20594x)) {
                    p4VarG = t().K();
                    numValueOf = Integer.valueOf(iA);
                    numValueOf2 = Integer.valueOf(iD);
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    p4VarG = t().G();
                    numValueOf = Integer.valueOf(iA);
                    numValueOf2 = Integer.valueOf(iD);
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            p4VarG.c(str, numValueOf, numValueOf2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final e p() {
        return this.f20582l.p();
    }

    final void p0() {
        if (!this.f20583m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void q(d dVar, lb lbVar) {
        a3.o.j(dVar);
        a3.o.f(dVar.f19877a);
        a3.o.j(dVar.f19879c);
        a3.o.f(dVar.f19879c.f20071b);
        u().i();
        p0();
        if (d0(lbVar)) {
            if (!lbVar.f20217h) {
                d(lbVar);
                return;
            }
            e0().Q0();
            try {
                d(lbVar);
                String str = (String) a3.o.j(dVar.f19877a);
                d dVarB0 = e0().B0(str, dVar.f19879c.f20071b);
                if (dVarB0 != null) {
                    t().F().c("Removing conditional user property", dVar.f19877a, this.f20582l.D().g(dVar.f19879c.f20071b));
                    e0().D(str, dVar.f19879c.f20071b);
                    if (dVarB0.f19881e) {
                        e0().L0(str, dVar.f19879c.f20071b);
                    }
                    d0 d0Var = dVar.f19887k;
                    if (d0Var != null) {
                        z zVar = d0Var.f19889b;
                        Y((d0) a3.o.j(n0().G(str, ((d0) a3.o.j(dVar.f19887k)).f19888a, zVar != null ? zVar.p() : null, dVarB0.f19878b, dVar.f19887k.f19891d, true, true)), lbVar);
                    }
                } else {
                    t().L().c("Conditional user property doesn't exist", n4.v(dVar.f19877a), this.f20582l.D().g(dVar.f19879c.f20071b));
                }
                e0().T0();
            } finally {
                e0().R0();
            }
        }
    }

    final void q0() {
        this.f20589s++;
    }

    final void r(d0 d0Var, lb lbVar) {
        d0 d0Var2;
        List<d> listS;
        List<d> listS2;
        List<d> listS3;
        p4 p4VarG;
        String str;
        Object objV;
        String strG;
        Object obj;
        String str2;
        a3.o.j(lbVar);
        a3.o.f(lbVar.f20210a);
        u().i();
        p0();
        String str3 = lbVar.f20210a;
        long j8 = d0Var.f19891d;
        r4 r4VarB = r4.b(d0Var);
        u().i();
        ib.W((this.E == null || (str2 = this.F) == null || !str2.equals(str3)) ? null : this.E, r4VarB.f20427d, false);
        d0 d0VarA = r4VarB.a();
        m0();
        if (db.c0(d0VarA, lbVar)) {
            if (!lbVar.f20217h) {
                d(lbVar);
                return;
            }
            List<String> list = lbVar.f20229t;
            if (list == null) {
                d0Var2 = d0VarA;
            } else if (!list.contains(d0VarA.f19888a)) {
                t().F().d("Dropping non-safelisted event. appId, event name, origin", str3, d0VarA.f19888a, d0VarA.f19890c);
                return;
            } else {
                Bundle bundleP = d0VarA.f19889b.p();
                bundleP.putLong("ga_safelisted", 1L);
                d0Var2 = new d0(d0VarA.f19888a, new z(bundleP), d0VarA.f19890c, d0VarA.f19891d);
            }
            e0().Q0();
            try {
                m mVarE0 = e0();
                a3.o.f(str3);
                mVarE0.i();
                mVarE0.s();
                if (j8 < 0) {
                    mVarE0.t().L().c("Invalid time querying timed out conditional properties", n4.v(str3), Long.valueOf(j8));
                    listS = Collections.emptyList();
                } else {
                    listS = mVarE0.S("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j8)});
                }
                for (d dVar : listS) {
                    if (dVar != null) {
                        t().K().d("User property timed out", dVar.f19877a, this.f20582l.D().g(dVar.f19879c.f20071b), dVar.f19879c.g());
                        if (dVar.f19883g != null) {
                            Y(new d0(dVar.f19883g, j8), lbVar);
                        }
                        e0().D(str3, dVar.f19879c.f20071b);
                    }
                }
                m mVarE02 = e0();
                a3.o.f(str3);
                mVarE02.i();
                mVarE02.s();
                if (j8 < 0) {
                    mVarE02.t().L().c("Invalid time querying expired conditional properties", n4.v(str3), Long.valueOf(j8));
                    listS2 = Collections.emptyList();
                } else {
                    listS2 = mVarE02.S("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j8)});
                }
                ArrayList arrayList = new ArrayList(listS2.size());
                for (d dVar2 : listS2) {
                    if (dVar2 != null) {
                        t().K().d("User property expired", dVar2.f19877a, this.f20582l.D().g(dVar2.f19879c.f20071b), dVar2.f19879c.g());
                        e0().L0(str3, dVar2.f19879c.f20071b);
                        d0 d0Var3 = dVar2.f19887k;
                        if (d0Var3 != null) {
                            arrayList.add(d0Var3);
                        }
                        e0().D(str3, dVar2.f19879c.f20071b);
                    }
                }
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    Y(new d0((d0) obj2, j8), lbVar);
                }
                m mVarE03 = e0();
                String str4 = d0Var2.f19888a;
                a3.o.f(str3);
                a3.o.f(str4);
                mVarE03.i();
                mVarE03.s();
                if (j8 < 0) {
                    mVarE03.t().L().d("Invalid time querying triggered conditional properties", n4.v(str3), mVarE03.c().c(str4), Long.valueOf(j8));
                    listS3 = Collections.emptyList();
                } else {
                    listS3 = mVarE03.S("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j8)});
                }
                ArrayList arrayList2 = new ArrayList(listS3.size());
                for (d dVar3 : listS3) {
                    if (dVar3 != null) {
                        hb hbVar = dVar3.f19879c;
                        jb jbVar = new jb((String) a3.o.j(dVar3.f19877a), dVar3.f19878b, hbVar.f20071b, j8, a3.o.j(hbVar.g()));
                        if (e0().e0(jbVar)) {
                            p4VarG = t().K();
                            str = "User property triggered";
                            objV = dVar3.f19877a;
                            strG = this.f20582l.D().g(jbVar.f20164c);
                            obj = jbVar.f20166e;
                        } else {
                            p4VarG = t().G();
                            str = "Too many active user properties, ignoring";
                            objV = n4.v(dVar3.f19877a);
                            strG = this.f20582l.D().g(jbVar.f20164c);
                            obj = jbVar.f20166e;
                        }
                        p4VarG.d(str, objV, strG, obj);
                        d0 d0Var4 = dVar3.f19885i;
                        if (d0Var4 != null) {
                            arrayList2.add(d0Var4);
                        }
                        dVar3.f19879c = new hb(jbVar);
                        dVar3.f19881e = true;
                        e0().c0(dVar3);
                    }
                }
                Y(d0Var2, lbVar);
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj3 = arrayList2.get(i9);
                    i9++;
                    Y(new d0((d0) obj3, j8), lbVar);
                }
                e0().T0();
            } finally {
                e0().R0();
            }
        }
    }

    final void r0() {
        this.f20588r++;
    }

    final void s(d0 d0Var, String str) {
        String strI;
        int iB;
        r5 r5VarD0 = e0().D0(str);
        if (r5VarD0 == null || TextUtils.isEmpty(r5VarD0.h())) {
            t().F().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolH = h(r5VarD0);
        if (boolH == null) {
            if (!"_ui".equals(d0Var.f19888a)) {
                t().L().b("Could not find package. appId", n4.v(str));
            }
        } else if (!boolH.booleanValue()) {
            t().G().b("App version does not match; dropping event. appId", n4.v(str));
            return;
        }
        y6 y6VarQ = Q(str);
        if (td.a() && c0().q(e0.T0)) {
            strI = a0(str).i();
            iB = y6VarQ.b();
        } else {
            strI = "";
            iB = 100;
        }
        U(d0Var, new lb(str, r5VarD0.j(), r5VarD0.h(), r5VarD0.z(), r5VarD0.v0(), r5VarD0.g0(), r5VarD0.a0(), (String) null, r5VarD0.r(), false, r5VarD0.i(), r5VarD0.v(), 0L, 0, r5VarD0.q(), false, r5VarD0.r0(), r5VarD0.q0(), r5VarD0.c0(), r5VarD0.n(), (String) null, y6VarQ.v(), "", (String) null, r5VarD0.t(), r5VarD0.p0(), iB, strI, r5VarD0.a(), r5VarD0.D()));
    }

    protected final void s0() {
        u().i();
        e0().S0();
        if (this.f20579i.f20736g.a() == 0) {
            this.f20579i.f20736g.b(k().a());
        }
        N();
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final n4 t() {
        return ((w5) a3.o.j(this.f20582l)).t();
    }

    final void t0() {
        r5 r5VarD0;
        boolean z7;
        List<Pair<com.google.android.gms.internal.measurement.b5, Long>> list;
        a5.a aVar;
        String strS0;
        p4 p4VarK;
        String str;
        u().i();
        p0();
        this.f20592v = true;
        boolean z8 = false;
        try {
            Boolean boolW = this.f20582l.J().W();
            if (boolW == null) {
                p4VarK = t().L();
                str = "Upload data called on the client side before use of service was decided";
            } else {
                if (!boolW.booleanValue()) {
                    if (this.f20585o <= 0) {
                        u().i();
                        if (this.f20595y != null) {
                            p4VarK = t().K();
                            str = "Uploading requested multiple times";
                        } else {
                            if (g0().A()) {
                                long jA = k().a();
                                int iS = c0().s(null, e0.U);
                                c0();
                                long jG = jA - f.G();
                                for (int i8 = 0; i8 < iS && L(null, jG); i8++) {
                                }
                                if (mf.a()) {
                                    u().i();
                                    for (String str2 : this.f20587q) {
                                        if (mf.a() && c0().B(str2, e0.L0)) {
                                            t().F().b("Notifying app that trigger URIs are available. App ID", str2);
                                            Intent intent = new Intent();
                                            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                            intent.setPackage(str2);
                                            this.f20582l.j().sendBroadcast(intent);
                                        }
                                    }
                                    this.f20587q.clear();
                                }
                                long jA2 = this.f20579i.f20736g.a();
                                if (jA2 != 0) {
                                    t().F().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jA - jA2)));
                                }
                                String strC = e0().C();
                                if (!TextUtils.isEmpty(strC)) {
                                    if (this.A == -1) {
                                        this.A = e0().y();
                                    }
                                    List<Pair<com.google.android.gms.internal.measurement.b5, Long>> listQ = e0().Q(strC, c0().s(strC, e0.f19939i), Math.max(0, c0().s(strC, e0.f19941j)));
                                    if (!listQ.isEmpty()) {
                                        if (Q(strC).x()) {
                                            Iterator<Pair<com.google.android.gms.internal.measurement.b5, Long>> it = listQ.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    strS0 = null;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.b5 b5Var = (com.google.android.gms.internal.measurement.b5) it.next().first;
                                                if (!b5Var.s0().isEmpty()) {
                                                    strS0 = b5Var.s0();
                                                    break;
                                                }
                                            }
                                            if (strS0 != null) {
                                                int i9 = 0;
                                                while (true) {
                                                    if (i9 >= listQ.size()) {
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.b5 b5Var2 = (com.google.android.gms.internal.measurement.b5) listQ.get(i9).first;
                                                    if (!b5Var2.s0().isEmpty() && !b5Var2.s0().equals(strS0)) {
                                                        listQ = listQ.subList(0, i9);
                                                        break;
                                                    }
                                                    i9++;
                                                }
                                            }
                                        }
                                        a5.a aVarI = com.google.android.gms.internal.measurement.a5.I();
                                        int size = listQ.size();
                                        List<Long> arrayList = new ArrayList<>(listQ.size());
                                        boolean z9 = c0().K(strC) && Q(strC).x();
                                        boolean zX = Q(strC).x();
                                        boolean zY = Q(strC).y();
                                        boolean z10 = yf.a() && c0().B(strC, e0.f19972y0);
                                        int i10 = 0;
                                        while (i10 < size) {
                                            b5.a aVarX = ((com.google.android.gms.internal.measurement.b5) listQ.get(i10).first).x();
                                            arrayList.add((Long) listQ.get(i10).second);
                                            c0();
                                            List<Pair<com.google.android.gms.internal.measurement.b5, Long>> list2 = listQ;
                                            a5.a aVar2 = aVarI;
                                            aVarX.G0(82001L).D0(jA).X(z8);
                                            if (!z9) {
                                                aVarX.q0();
                                            }
                                            if (!zX) {
                                                aVarX.M0();
                                                aVarX.C0();
                                            }
                                            if (!zY) {
                                                aVarX.Y();
                                            }
                                            A(strC, aVarX);
                                            if (!z10) {
                                                aVarX.O0();
                                            }
                                            if (od.a() && c0().q(e0.Y0)) {
                                                String strY0 = aVarX.Y0();
                                                if (TextUtils.isEmpty(strY0) || strY0.equals("00000000-0000-0000-0000-000000000000")) {
                                                    ArrayList arrayList2 = new ArrayList(aVarX.Z0());
                                                    Iterator it2 = arrayList2.iterator();
                                                    boolean z11 = false;
                                                    boolean z12 = false;
                                                    while (it2.hasNext()) {
                                                        com.google.android.gms.internal.measurement.w4 w4Var = (com.google.android.gms.internal.measurement.w4) it2.next();
                                                        List<Pair<com.google.android.gms.internal.measurement.b5, Long>> list3 = list2;
                                                        if ("_fx".equals(w4Var.a0())) {
                                                            it2.remove();
                                                            list2 = list3;
                                                            z11 = true;
                                                            z12 = true;
                                                        } else {
                                                            if ("_f".equals(w4Var.a0())) {
                                                                z12 = true;
                                                            }
                                                            list2 = list3;
                                                        }
                                                    }
                                                    list = list2;
                                                    if (z11) {
                                                        aVarX.u0();
                                                        aVarX.J(arrayList2);
                                                    }
                                                    if (z12) {
                                                        F(aVarX.T0(), true);
                                                    }
                                                } else {
                                                    list = list2;
                                                }
                                                if (aVarX.s() == 0) {
                                                    aVar = aVar2;
                                                    i10++;
                                                    aVarI = aVar;
                                                    listQ = list;
                                                    z8 = false;
                                                }
                                            } else {
                                                list = list2;
                                            }
                                            if (c0().B(strC, e0.f19936g0)) {
                                                aVarX.x(m0().A(((com.google.android.gms.internal.measurement.b5) ((com.google.android.gms.internal.measurement.y8) aVarX.d())).k()));
                                            }
                                            aVar = aVar2;
                                            aVar.t(aVarX);
                                            i10++;
                                            aVarI = aVar;
                                            listQ = list;
                                            z8 = false;
                                        }
                                        a5.a aVar3 = aVarI;
                                        if (od.a() && c0().q(e0.Y0) && aVar3.s() == 0) {
                                            G(arrayList);
                                            I(false, 204, null, null, strC);
                                            z7 = false;
                                            this.f20592v = z7;
                                        } else {
                                            Object objK = t().C(2) ? m0().K((com.google.android.gms.internal.measurement.a5) ((com.google.android.gms.internal.measurement.y8) aVar3.d())) : null;
                                            m0();
                                            byte[] bArrK = ((com.google.android.gms.internal.measurement.a5) ((com.google.android.gms.internal.measurement.y8) aVar3.d())).k();
                                            wa waVarS = this.f20580j.s(strC);
                                            try {
                                                G(arrayList);
                                                this.f20579i.f20737h.b(jA);
                                                t().K().d("Uploading data. app, uncompressed size, data", size > 0 ? aVar3.u(0).H3() : "?", Integer.valueOf(bArrK.length), objK);
                                                this.f20591u = true;
                                                u4 u4VarG0 = g0();
                                                URL url = new URL(waVarS.a());
                                                Map<String, String> mapB = waVarS.b();
                                                xa xaVar = new xa(this, strC);
                                                u4VarG0.i();
                                                u4VarG0.s();
                                                a3.o.j(url);
                                                a3.o.j(bArrK);
                                                a3.o.j(xaVar);
                                                u4VarG0.u().z(new x4(u4VarG0, strC, url, bArrK, mapB, xaVar));
                                            } catch (MalformedURLException unused) {
                                                t().G().c("Failed to parse upload URL. Not uploading. appId", n4.v(strC), waVarS.a());
                                            }
                                        }
                                    }
                                    M();
                                }
                                this.A = -1L;
                                m mVarE0 = e0();
                                c0();
                                String strO = mVarE0.O(jA - f.G());
                                if (!TextUtils.isEmpty(strO) && (r5VarD0 = e0().D0(strO)) != null) {
                                    V(r5VarD0);
                                }
                                z7 = false;
                                this.f20592v = z7;
                                M();
                            }
                            t().K().a("Network not connected, ignoring upload request");
                        }
                    }
                    N();
                    this.f20592v = false;
                    M();
                }
                p4VarK = t().G();
                str = "Upload called in the client side when service should be used";
            }
            p4VarK.a(str);
            this.f20592v = false;
            M();
        } catch (Throwable th) {
            this.f20592v = false;
            M();
            throw th;
        }
    }

    @Override // com.google.android.gms.measurement.internal.w6
    public final q5 u() {
        return ((w5) a3.o.j(this.f20582l)).u();
    }

    final void v(r5 r5Var, b5.a aVar) {
        u().i();
        p0();
        if (td.a()) {
            k kVarB = k.b(aVar.V0());
            String strT0 = r5Var.t0();
            u().i();
            p0();
            if (td.a()) {
                y6 y6VarQ = Q(strT0);
                if (td.a() && c0().q(e0.V0)) {
                    aVar.p0(y6VarQ.w());
                }
                if (y6VarQ.s() != null) {
                    kVarB.c(y6.a.AD_STORAGE, y6VarQ.b());
                } else {
                    kVarB.d(y6.a.AD_STORAGE, j.FAILSAFE);
                }
                if (y6VarQ.u() != null) {
                    kVarB.c(y6.a.ANALYTICS_STORAGE, y6VarQ.b());
                } else {
                    kVarB.d(y6.a.ANALYTICS_STORAGE, j.FAILSAFE);
                }
            }
            String strT02 = r5Var.t0();
            u().i();
            p0();
            if (td.a()) {
                v vVarC = c(strT02, a0(strT02), Q(strT02), kVarB);
                aVar.L(((Boolean) a3.o.j(vVarC.g())).booleanValue());
                if (!TextUtils.isEmpty(vVarC.h())) {
                    aVar.t0(vVarC.h());
                }
            }
            u().i();
            p0();
            if (td.a()) {
                com.google.android.gms.internal.measurement.f5 f5Var = null;
                Iterator<com.google.android.gms.internal.measurement.f5> it = aVar.a1().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.f5 next = it.next();
                    if ("_npa".equals(next.Y())) {
                        f5Var = next;
                        break;
                    }
                }
                if (f5Var != null) {
                    y6.a aVar2 = y6.a.AD_PERSONALIZATION;
                    if (kVarB.a(aVar2) == j.UNSET) {
                        Boolean boolQ0 = r5Var.q0();
                        kVarB.d(aVar2, (boolQ0 == null || (boolQ0 == Boolean.TRUE && f5Var.T() != 1) || (boolQ0 == Boolean.FALSE && f5Var.T() != 0)) ? j.API : j.MANIFEST);
                    }
                } else if (td.a() && c0().q(e0.W0)) {
                    int i8 = 1;
                    if (this.f20571a.J(r5Var.t0()) == null) {
                        kVarB.d(y6.a.AD_PERSONALIZATION, j.FAILSAFE);
                    } else {
                        i5 i5Var = this.f20571a;
                        String strT03 = r5Var.t0();
                        y6.a aVar3 = y6.a.AD_PERSONALIZATION;
                        i8 = 1 ^ (i5Var.K(strT03, aVar3) ? 1 : 0);
                        kVarB.d(aVar3, j.REMOTE_DEFAULT);
                    }
                    aVar.C((com.google.android.gms.internal.measurement.f5) ((com.google.android.gms.internal.measurement.y8) com.google.android.gms.internal.measurement.f5.W().v("_npa").x(k().a()).u(i8).d()));
                }
            }
            aVar.g0(kVarB.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void x(com.google.android.gms.measurement.internal.hb r14, com.google.android.gms.measurement.internal.lb r15) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.x(com.google.android.gms.measurement.internal.hb, com.google.android.gms.measurement.internal.lb):void");
    }

    final void y(Runnable runnable) {
        u().i();
        if (this.f20586p == null) {
            this.f20586p = new ArrayList();
        }
        this.f20586p.add(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x013c A[Catch: all -> 0x017f, TryCatch #1 {all -> 0x017f, blocks: (B:6:0x002b, B:15:0x0047, B:70:0x0173, B:20:0x0061, B:27:0x00a6, B:28:0x00b5, B:31:0x00bd, B:34:0x00c9, B:36:0x00cf, B:39:0x00d9, B:42:0x00e5, B:44:0x00eb, B:49:0x00f8, B:61:0x0128, B:63:0x013c, B:65:0x0160, B:67:0x016a, B:69:0x0170, B:64:0x014a, B:55:0x010f, B:57:0x0119), top: B:79:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[Catch: all -> 0x017f, TryCatch #1 {all -> 0x017f, blocks: (B:6:0x002b, B:15:0x0047, B:70:0x0173, B:20:0x0061, B:27:0x00a6, B:28:0x00b5, B:31:0x00bd, B:34:0x00c9, B:36:0x00cf, B:39:0x00d9, B:42:0x00e5, B:44:0x00eb, B:49:0x00f8, B:61:0x0128, B:63:0x013c, B:65:0x0160, B:67:0x016a, B:69:0x0170, B:64:0x014a, B:55:0x010f, B:57:0x0119), top: B:79:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void z(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.va.z(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
