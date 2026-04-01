package q0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25739a;

        public a(int i8) {
            this.f25739a = i8;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e8) {
                Log.w("SupportSQLite", "delete failed: ", e8);
            }
        }

        public void b(q0.b bVar) {
        }

        public void c(q0.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.U());
            if (!bVar.isOpen()) {
                a(bVar.U());
                return;
            }
            List<Pair<String, String>> listM = null;
            try {
                try {
                    listM = bVar.m();
                } finally {
                    if (listM != null) {
                        Iterator<Pair<String, String>> it = listM.iterator();
                        while (it.hasNext()) {
                            a((String) it.next().second);
                        }
                    } else {
                        a(bVar.U());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                bVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(q0.b bVar);

        public abstract void e(q0.b bVar, int i8, int i9);

        public void f(q0.b bVar) {
        }

        public abstract void g(q0.b bVar, int i8, int i9);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f25740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f25742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25743d;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Context f25744a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            String f25745b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f25746c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f25747d;

            a(Context context) {
                this.f25744a = context;
            }

            public b a() {
                if (this.f25746c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f25744a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f25747d && TextUtils.isEmpty(this.f25745b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f25744a, this.f25745b, this.f25746c, this.f25747d);
            }

            public a b(a aVar) {
                this.f25746c = aVar;
                return this;
            }

            public a c(String str) {
                this.f25745b = str;
                return this;
            }

            public a d(boolean z7) {
                this.f25747d = z7;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z7) {
            this.f25740a = context;
            this.f25741b = str;
            this.f25742c = aVar;
            this.f25743d = z7;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* JADX INFO: renamed from: q0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0159c {
        c a(b bVar);
    }

    q0.b H();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z7);
}
