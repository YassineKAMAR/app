package v1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class t0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f26822c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f26823d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f26824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f26825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f26826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f26827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f26828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<a> f26829j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26831b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: v1.o0
            @Override // v1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.q(sQLiteDatabase);
            }
        };
        f26824e = aVar;
        a aVar2 = new a() { // from class: v1.p0
            @Override // v1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.t(sQLiteDatabase);
            }
        };
        f26825f = aVar2;
        a aVar3 = new a() { // from class: v1.q0
            @Override // v1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f26826g = aVar3;
        a aVar4 = new a() { // from class: v1.r0
            @Override // v1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.z(sQLiteDatabase);
            }
        };
        f26827h = aVar4;
        a aVar5 = new a() { // from class: v1.s0
            @Override // v1.t0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                t0.E(sQLiteDatabase);
            }
        };
        f26828i = aVar5;
        f26829j = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    t0(Context context, String str, int i8) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
        this.f26831b = false;
        this.f26830a = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f26822c);
    }

    private void G(SQLiteDatabase sQLiteDatabase, int i8) {
        o(sQLiteDatabase);
        J(sQLiteDatabase, 0, i8);
    }

    private void J(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        List<a> list = f26829j;
        if (i9 <= list.size()) {
            while (i8 < i9) {
                f26829j.get(i8).a(sQLiteDatabase);
                i8++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i8 + " to " + i9 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    private void o(SQLiteDatabase sQLiteDatabase) {
        if (this.f26831b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f26831b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        G(sQLiteDatabase, this.f26830a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        G(sQLiteDatabase, i9);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        o(sQLiteDatabase);
        J(sQLiteDatabase, i8, i9);
    }
}
