package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f2818m = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String[] f2820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Set<String>> f2821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h f2822d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    volatile q0.f f2825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f2826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.room.d f2827i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f2829k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AtomicBoolean f2823e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f2824f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    final m.b<c, d> f2828j = new m.b<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Runnable f2830l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final HashMap<String, Integer> f2819a = new HashMap<>();

    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor cursorP = e.this.f2822d.p(new q0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorP.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorP.getInt(0)));
                } catch (Throwable th) {
                    cursorP.close();
                    throw th;
                }
            }
            cursorP.close();
            if (!hashSet.isEmpty()) {
                e.this.f2825g.r();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockH = e.this.f2822d.h();
            Set<Integer> setA = null;
            try {
                try {
                    lockH.lock();
                } catch (SQLiteException | IllegalStateException e8) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                }
                if (e.this.c()) {
                    if (e.this.f2823e.compareAndSet(true, false)) {
                        if (e.this.f2822d.k()) {
                            return;
                        }
                        h hVar = e.this.f2822d;
                        if (hVar.f2869g) {
                            q0.b bVarH = hVar.i().H();
                            bVarH.f();
                            try {
                                setA = a();
                                bVarH.B();
                                bVarH.L();
                            } catch (Throwable th) {
                                bVarH.L();
                                throw th;
                            }
                        } else {
                            setA = a();
                        }
                        if (setA == null || setA.isEmpty()) {
                            return;
                        }
                        synchronized (e.this.f2828j) {
                            Iterator<Map.Entry<c, d>> it = e.this.f2828j.iterator();
                            while (it.hasNext()) {
                                it.next().getValue().a(setA);
                            }
                        }
                    }
                }
            } finally {
                lockH.unlock();
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f2832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean[] f2833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int[] f2834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f2836e;

        b(int i8) {
            long[] jArr = new long[i8];
            this.f2832a = jArr;
            boolean[] zArr = new boolean[i8];
            this.f2833b = zArr;
            this.f2834c = new int[i8];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f2835d && !this.f2836e) {
                    int length = this.f2832a.length;
                    int i8 = 0;
                    while (true) {
                        int i9 = 1;
                        if (i8 >= length) {
                            this.f2836e = true;
                            this.f2835d = false;
                            return this.f2834c;
                        }
                        boolean z7 = this.f2832a[i8] > 0;
                        boolean[] zArr = this.f2833b;
                        if (z7 != zArr[i8]) {
                            int[] iArr = this.f2834c;
                            if (!z7) {
                                i9 = 2;
                            }
                            iArr[i8] = i9;
                        } else {
                            this.f2834c[i8] = 0;
                        }
                        zArr[i8] = z7;
                        i8++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z7;
            synchronized (this) {
                z7 = false;
                for (int i8 : iArr) {
                    long[] jArr = this.f2832a;
                    long j8 = jArr[i8];
                    jArr[i8] = 1 + j8;
                    if (j8 == 0) {
                        this.f2835d = true;
                        z7 = true;
                    }
                }
            }
            return z7;
        }

        boolean c(int... iArr) {
            boolean z7;
            synchronized (this) {
                z7 = false;
                for (int i8 : iArr) {
                    long[] jArr = this.f2832a;
                    long j8 = jArr[i8];
                    jArr[i8] = j8 - 1;
                    if (j8 == 1) {
                        this.f2835d = true;
                        z7 = true;
                    }
                }
            }
            return z7;
        }

        void d() {
            synchronized (this) {
                this.f2836e = false;
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String[] f2837a;

        public c(String[] strArr) {
            this.f2837a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f2838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f2839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c f2840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<String> f2841d;

        d(c cVar, int[] iArr, String[] strArr) {
            Set<String> setUnmodifiableSet;
            this.f2840c = cVar;
            this.f2838a = iArr;
            this.f2839b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = null;
            }
            this.f2841d = setUnmodifiableSet;
        }

        void a(Set<Integer> set) {
            int length = this.f2838a.length;
            Set<String> hashSet = null;
            for (int i8 = 0; i8 < length; i8++) {
                if (set.contains(Integer.valueOf(this.f2838a[i8]))) {
                    if (length == 1) {
                        hashSet = this.f2841d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f2839b[i8]);
                    }
                }
            }
            if (hashSet != null) {
                this.f2840c.b(hashSet);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f2839b.length == 1) {
                int length = strArr.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    if (strArr[i8].equalsIgnoreCase(this.f2839b[0])) {
                        set = this.f2841d;
                        break;
                    }
                    i8++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f2839b;
                    int length2 = strArr2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length2) {
                            String str2 = strArr2[i9];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i9++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f2840c.b(set);
            }
        }
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2822d = hVar;
        this.f2826h = new b(strArr.length);
        this.f2821c = map2;
        this.f2827i = new androidx.room.d(hVar);
        int length = strArr.length;
        this.f2820b = new String[length];
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr[i8];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f2819a.put(lowerCase, Integer.valueOf(i8));
            String str2 = map.get(strArr[i8]);
            if (str2 != null) {
                this.f2820b[i8] = str2.toLowerCase(locale);
            } else {
                this.f2820b[i8] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f2819a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f2819a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f2821c.containsKey(lowerCase)) {
                hashSet.addAll(this.f2821c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(q0.b bVar, int i8) {
        bVar.n("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i8 + ", 0)");
        String str = this.f2820b[i8];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2818m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i8);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.n(sb.toString());
        }
    }

    private void k(q0.b bVar, int i8) {
        String str = this.f2820b[i8];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2818m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.n(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d dVarP;
        String[] strArrH = h(cVar.f2837a);
        int[] iArr = new int[strArrH.length];
        int length = strArrH.length;
        for (int i8 = 0; i8 < length; i8++) {
            Integer num = this.f2819a.get(strArrH[i8].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrH[i8]);
            }
            iArr[i8] = num.intValue();
        }
        d dVar = new d(cVar, iArr, strArrH);
        synchronized (this.f2828j) {
            dVarP = this.f2828j.p(cVar, dVar);
        }
        if (dVarP == null && this.f2826h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (!this.f2822d.o()) {
            return false;
        }
        if (!this.f2824f) {
            this.f2822d.i().H();
        }
        if (this.f2824f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void d(q0.b bVar) {
        synchronized (this) {
            if (this.f2824f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.n("PRAGMA temp_store = MEMORY;");
            bVar.n("PRAGMA recursive_triggers='ON';");
            bVar.n("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f2825g = bVar.s("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f2824f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f2828j) {
            for (Map.Entry<c, d> entry : this.f2828j) {
                if (!entry.getKey().a()) {
                    entry.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f2823e.compareAndSet(false, true)) {
            this.f2822d.j().execute(this.f2830l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d dVarU;
        synchronized (this.f2828j) {
            dVarU = this.f2828j.u(cVar);
        }
        if (dVarU == null || !this.f2826h.c(dVarU.f2838a)) {
            return;
        }
        l();
    }

    void i(Context context, String str) {
        this.f2829k = new f(context, str, this, this.f2822d.j());
    }

    void l() {
        if (this.f2822d.o()) {
            m(this.f2822d.i().H());
        }
    }

    void m(q0.b bVar) {
        if (bVar.V()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.f2822d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.f2826h.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    bVar.f();
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            int i9 = iArrA[i8];
                            if (i9 == 1) {
                                j(bVar, i8);
                            } else if (i9 == 2) {
                                k(bVar, i8);
                            }
                        } finally {
                        }
                    }
                    bVar.B();
                    bVar.L();
                    this.f2826h.d();
                } finally {
                    lockH.unlock();
                }
            } catch (SQLiteException | IllegalStateException e8) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e8);
                return;
            }
        }
    }
}
