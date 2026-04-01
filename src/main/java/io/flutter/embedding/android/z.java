package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.a0;
import io.flutter.embedding.android.b0;
import io.flutter.embedding.android.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
public class z implements a0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f22727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<Long, Long> f22728b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<Long, b0.e> f22729c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0.b f22730d = new a0.b();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22731a;

        static {
            int[] iArr = new int[v.a.values().length];
            f22731a = iArr;
            try {
                iArr[v.a.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22731a[v.a.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22731a[v.a.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public z(s5.c cVar) {
        this.f22727a = cVar;
        for (b0.e eVar : b0.a()) {
            this.f22729c.put(Long.valueOf(eVar.f22599c), eVar);
        }
    }

    private static v.a e(KeyEvent keyEvent) {
        boolean z7 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z7 ? v.a.kRepeat : v.a.kDown;
        }
        if (action == 1) {
            return v.a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long f(KeyEvent keyEvent) {
        Long l8 = b0.f22591b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l8 != null ? l8 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l8 = b0.f22590a.get(Long.valueOf(scanCode2));
            if (l8 != null) {
                return l8;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(j(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119 A[LOOP:2: B:55:0x0113->B:57:0x0119, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean i(android.view.KeyEvent r18, io.flutter.embedding.android.a0.d.a r19) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.z.i(android.view.KeyEvent, io.flutter.embedding.android.a0$d$a):boolean");
    }

    private static long j(long j8, long j9) {
        return (j8 & 4294967295L) | j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(a0.d.a aVar, ByteBuffer byteBuffer) {
        Boolean boolValueOf = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            boolValueOf = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(boolValueOf.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(b0.c cVar, long j8, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f22594b), Long.valueOf(j8), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(b0.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f22594b), Long.valueOf(cVar.f22593a), keyEvent.getEventTime());
    }

    private void n(v vVar, final a0.d.a aVar) {
        this.f22727a.h("flutter/keydata", vVar.a(), aVar == null ? null : new c.b() { // from class: io.flutter.embedding.android.w
            @Override // s5.c.b
            public final void a(ByteBuffer byteBuffer) {
                z.k(aVar, byteBuffer);
            }
        });
    }

    private void q(boolean z7, Long l8, Long l9, long j8) {
        v vVar = new v();
        vVar.f22708a = j8;
        vVar.f22709b = z7 ? v.a.kDown : v.a.kUp;
        vVar.f22711d = l8.longValue();
        vVar.f22710c = l9.longValue();
        vVar.f22713f = null;
        vVar.f22712e = true;
        if (l9.longValue() != 0 && l8.longValue() != 0) {
            if (!z7) {
                l8 = null;
            }
            r(l9, l8);
        }
        n(vVar, null);
    }

    @Override // io.flutter.embedding.android.a0.d
    public void a(KeyEvent keyEvent, a0.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        q(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public Map<Long, Long> h() {
        return Collections.unmodifiableMap(this.f22728b);
    }

    void o(b0.d dVar, boolean z7, long j8, final long j9, final KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        b0.c[] cVarArr = dVar.f22596b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            b0.c[] cVarArr2 = dVar.f22596b;
            boolean z9 = true;
            if (i8 >= cVarArr2.length) {
                break;
            }
            final b0.c cVar = cVarArr2[i8];
            boolean zContainsKey = this.f22728b.containsKey(Long.valueOf(cVar.f22593a));
            zArr[i8] = zContainsKey;
            if (cVar.f22594b == j8) {
                int i9 = a.f22731a[e(keyEvent).ordinal()];
                if (i9 == 1) {
                    boolArr[i8] = Boolean.FALSE;
                    if (!z7) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f22720a.l(cVar, j9, keyEvent);
                            }
                        });
                    }
                } else if (i9 == 2) {
                    boolArr[i8] = Boolean.valueOf(zArr[i8]);
                } else if (i9 == 3) {
                    if (!z7) {
                        arrayList.add(new Runnable() { // from class: io.flutter.embedding.android.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f22724a.m(cVar, keyEvent);
                            }
                        });
                    }
                    boolArr[i8] = Boolean.valueOf(zArr[i8]);
                }
                z8 = true;
            } else {
                if (!z8 && !zContainsKey) {
                    z9 = false;
                }
                z8 = z9;
            }
            i8++;
        }
        if (z7) {
            for (int i10 = 0; i10 < dVar.f22596b.length; i10++) {
                if (boolArr[i10] == null) {
                    if (z8) {
                        boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    } else {
                        boolArr[i10] = Boolean.TRUE;
                        z8 = true;
                    }
                }
            }
            if (!z8) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i11 = 0; i11 < dVar.f22596b.length; i11++) {
                if (boolArr[i11] == null) {
                    boolArr[i11] = Boolean.FALSE;
                }
            }
        }
        for (int i12 = 0; i12 < dVar.f22596b.length; i12++) {
            if (zArr[i12] != boolArr[i12].booleanValue()) {
                b0.c cVar2 = dVar.f22596b[i12];
                q(boolArr[i12].booleanValue(), Long.valueOf(cVar2.f22594b), Long.valueOf(cVar2.f22593a), keyEvent.getEventTime());
            }
        }
    }

    void p(b0.e eVar, boolean z7, long j8, KeyEvent keyEvent) {
        if (eVar.f22599c == j8 || eVar.f22600d == z7) {
            return;
        }
        boolean z8 = !this.f22728b.containsKey(Long.valueOf(eVar.f22598b));
        if (z8) {
            eVar.f22600d = !eVar.f22600d;
        }
        q(z8, Long.valueOf(eVar.f22599c), Long.valueOf(eVar.f22598b), keyEvent.getEventTime());
        if (!z8) {
            eVar.f22600d = !eVar.f22600d;
        }
        q(!z8, Long.valueOf(eVar.f22599c), Long.valueOf(eVar.f22598b), keyEvent.getEventTime());
    }

    void r(Long l8, Long l9) {
        if (l9 != null) {
            if (this.f22728b.put(l8, l9) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f22728b.remove(l8) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
