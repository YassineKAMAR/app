package v1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n1.i;
import q1.a;
import q1.c;
import w1.b;

/* JADX INFO: loaded from: classes.dex */
public class m0 implements v1.d, w1.b, v1.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l1.b f26799f = l1.b.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f26800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1.a f26801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x1.a f26802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f26803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d6.a<String> f26804e;

    interface b<T, U> {
        U apply(T t7);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f26805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f26806b;

        private c(String str, String str2) {
            this.f26805a = str;
            this.f26806b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    m0(x1.a aVar, x1.a aVar2, e eVar, t0 t0Var, d6.a<String> aVar3) {
        this.f26800a = t0Var;
        this.f26801b = aVar;
        this.f26802c = aVar2;
        this.f26803d = eVar;
        this.f26804e = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object A0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object B0(Throwable th) {
        throw new w1.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase C0(Throwable th) {
        throw new w1.a("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long D0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q1.f E0(long j8, Cursor cursor) {
        cursor.moveToNext();
        return q1.f.c().c(cursor.getLong(0)).b(j8).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q1.f F0(final long j8, SQLiteDatabase sQLiteDatabase) {
        return (q1.f) f1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: v1.d0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.E0(j8, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long G0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean H0(n1.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lU0 = u0(sQLiteDatabase, oVar);
        return lU0 == null ? Boolean.FALSE : (Boolean) f1(p0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lU0.toString()}), new b() { // from class: v1.z
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List I0(SQLiteDatabase sQLiteDatabase) {
        return (List) f1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: v1.k0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.J0((Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List J0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(n1.o.a().b(cursor.getString(1)).d(y1.a.b(cursor.getInt(2))).c(Z0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List K0(n1.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> listX0 = X0(sQLiteDatabase, oVar, this.f26803d.d());
        for (l1.d dVar : l1.d.values()) {
            if (dVar != oVar.d()) {
                int iD = this.f26803d.d() - listX0.size();
                if (iD <= 0) {
                    break;
                }
                listX0.addAll(X0(sQLiteDatabase, oVar.f(dVar), iD));
            }
        }
        return x0(listX0, Y0(sQLiteDatabase, listX0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ q1.a L0(Map map, a.C0160a c0160a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarL0 = l0(cursor.getInt(1));
            long j8 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(q1.c.c().c(bVarL0).b(j8).a());
        }
        a1(c0160a, map);
        c0160a.e(t0());
        c0160a.d(q0());
        c0160a.c(this.f26804e.get());
        return c0160a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ q1.a M0(String str, final Map map, final a.C0160a c0160a, SQLiteDatabase sQLiteDatabase) {
        return (q1.a) f1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: v1.b0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26778a.L0(map, c0160a, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object N0(List list, n1.o oVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j8 = cursor.getLong(0);
            boolean z7 = cursor.getInt(7) != 0;
            i.a aVarK = n1.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            aVarK.h(z7 ? new n1.h(d1(cursor.getString(4)), cursor.getBlob(5)) : new n1.h(d1(cursor.getString(4)), b1(j8)));
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j8, oVar, aVarK.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object O0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j8 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j8));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j8), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long P0(n1.i iVar, n1.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (w0()) {
            h(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jN0 = n0(sQLiteDatabase, oVar);
        int iE = this.f26803d.e();
        byte[] bArrA = iVar.e().a();
        boolean z7 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jN0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z7));
        contentValues.put("payload", z7 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z7) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i8 = 1; i8 <= iCeil; i8++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i8 - 1) * iE, Math.min(i8 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i8));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] Q0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            byte[] bArr2 = (byte[]) arrayList.get(i8);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object R0(Cursor cursor) {
        while (cursor.moveToNext()) {
            h(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object S0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        f1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: v1.x
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26840a.R0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean T0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object U0(String str, c.b bVar, long j8, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) f1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())}), new b() { // from class: v1.v
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.T0((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j8 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.a())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object V0(long j8, n1.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(y1.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(y1.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object W0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f26801b.a()).execute();
        return null;
    }

    private List<k> X0(SQLiteDatabase sQLiteDatabase, final n1.o oVar, int i8) {
        final ArrayList arrayList = new ArrayList();
        Long lU0 = u0(sQLiteDatabase, oVar);
        if (lU0 == null) {
            return arrayList;
        }
        f1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lU0.toString()}, null, null, null, String.valueOf(i8)), new b() { // from class: v1.y
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26841a.N0(arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> Y0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(list.get(i8).c());
            if (i8 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        f1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: v1.t
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.O0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] Z0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void a1(a.C0160a c0160a, Map<String, List<q1.c>> map) {
        for (Map.Entry<String, List<q1.c>> entry : map.entrySet()) {
            c0160a.a(q1.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] b1(long j8) {
        return (byte[]) f1(p0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j8)}, null, null, "sequence_num"), new b() { // from class: v1.a0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.Q0((Cursor) obj);
            }
        });
    }

    private <T> T c1(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f26802c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f26802c.a() >= ((long) this.f26803d.b()) + jA) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static l1.b d1(String str) {
        return str == null ? f26799f : l1.b.b(str);
    }

    private static String e1(Iterable<k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    static <T> T f1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private c.b l0(int i8) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i8 == bVar.a()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i8 == bVar2.a()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i8 == bVar3.a()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i8 == bVar4.a()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i8 == bVar5.a()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i8 == bVar6.a()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i8 == bVar7.a()) {
            return bVar7;
        }
        r1.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i8));
        return bVar;
    }

    private void m0(final SQLiteDatabase sQLiteDatabase) {
        c1(new d() { // from class: v1.g0
            @Override // v1.m0.d
            public final Object a() {
                return m0.A0(sQLiteDatabase);
            }
        }, new b() { // from class: v1.h0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.B0((Throwable) obj);
            }
        });
    }

    private long n0(SQLiteDatabase sQLiteDatabase, n1.o oVar) {
        Long lU0 = u0(sQLiteDatabase, oVar);
        if (lU0 != null) {
            return lU0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(y1.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private q1.b q0() {
        return q1.b.b().b(q1.e.c().b(o0()).c(e.f26783a.f()).a()).a();
    }

    private long r0() {
        return p0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long s0() {
        return p0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private q1.f t0() {
        final long jA = this.f26801b.a();
        return (q1.f) v0(new b() { // from class: v1.c0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.F0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long u0(SQLiteDatabase sQLiteDatabase, n1.o oVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(y1.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) f1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: v1.s
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.G0((Cursor) obj);
            }
        });
    }

    private boolean w0() {
        return r0() * s0() >= this.f26803d.f();
    }

    private List<k> x0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a aVarL = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarL.c(cVar.f26805a, cVar.f26806b);
                }
                listIterator.set(k.a(next.c(), next.d(), aVarL.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object y0(Cursor cursor) {
        while (cursor.moveToNext()) {
            h(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer z0(long j8, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j8)};
        f1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: v1.r
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26820a.y0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    @Override // v1.d
    public k D(final n1.o oVar, final n1.i iVar) {
        r1.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) v0(new b() { // from class: v1.i0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26788a.P0(iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return k.a(jLongValue, oVar, iVar);
    }

    @Override // v1.d
    public long K(n1.o oVar) {
        return ((Long) f1(p0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(y1.a.a(oVar.d()))}), new b() { // from class: v1.f0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.D0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // v1.c
    public void a() {
        v0(new b() { // from class: v1.o
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26814a.W0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // v1.d
    public void b0(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + e1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            v0(new b() { // from class: v1.q
                @Override // v1.m0.b
                public final Object apply(Object obj) {
                    return this.f26817a.S0(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // v1.c
    public q1.a c() {
        final a.C0160a c0160aE = q1.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (q1.a) v0(new b() { // from class: v1.u
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26832a.M0(str, map, c0160aE, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f26800a.close();
    }

    @Override // w1.b
    public <T> T d(b.a<T> aVar) {
        SQLiteDatabase sQLiteDatabaseP0 = p0();
        m0(sQLiteDatabaseP0);
        try {
            T tA = aVar.a();
            sQLiteDatabaseP0.setTransactionSuccessful();
            return tA;
        } finally {
            sQLiteDatabaseP0.endTransaction();
        }
    }

    @Override // v1.d
    public Iterable<k> d0(final n1.o oVar) {
        return (Iterable) v0(new b() { // from class: v1.p
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26815a.K0(oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // v1.d
    public int g() {
        final long jA = this.f26801b.a() - this.f26803d.c();
        return ((Integer) v0(new b() { // from class: v1.j0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26792a.z0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // v1.c
    public void h(final long j8, final c.b bVar, final String str) {
        v0(new b() { // from class: v1.m
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.U0(str, bVar, j8, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // v1.d
    public void i(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            p0().compileStatement("DELETE FROM events WHERE _id in " + e1(iterable)).execute();
        }
    }

    long o0() {
        return r0() * s0();
    }

    SQLiteDatabase p0() {
        final t0 t0Var = this.f26800a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) c1(new d() { // from class: v1.w
            @Override // v1.m0.d
            public final Object a() {
                return t0Var.getWritableDatabase();
            }
        }, new b() { // from class: v1.e0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.C0((Throwable) obj);
            }
        });
    }

    @Override // v1.d
    public boolean u(final n1.o oVar) {
        return ((Boolean) v0(new b() { // from class: v1.l0
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return this.f26794a.H0(oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    <T> T v0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseP0 = p0();
        sQLiteDatabaseP0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseP0);
            sQLiteDatabaseP0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseP0.endTransaction();
        }
    }

    @Override // v1.d
    public Iterable<n1.o> x() {
        return (Iterable) v0(new b() { // from class: v1.l
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.I0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // v1.d
    public void y(final n1.o oVar, final long j8) {
        v0(new b() { // from class: v1.n
            @Override // v1.m0.b
            public final Object apply(Object obj) {
                return m0.V0(j8, oVar, (SQLiteDatabase) obj);
            }
        });
    }
}
