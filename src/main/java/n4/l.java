package n4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25153a;

    public l(Context context, String str) {
        this.f25153a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j8 = this.f25153a.getLong("fire-count", 0L);
        String str = null;
        String key = "";
        for (Map.Entry<String, ?> entry : this.f25153a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f25153a.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f25153a.edit().putStringSet(key, hashSet).putLong("fire-count", j8 - 1).commit();
    }

    private synchronized String d(long j8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j8).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j8));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f25153a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void f(String str) {
        String strE = e(str);
        if (strE == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f25153a.getStringSet(strE, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f25153a.edit().remove(strE) : this.f25153a.edit().putStringSet(strE, hashSet)).commit();
    }

    private synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f25153a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f25153a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        SharedPreferences.Editor editorEdit = this.f25153a.edit();
        int i8 = 0;
        for (Map.Entry<String, ?> entry : this.f25153a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String strD = d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(strD)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(strD);
                    i8++;
                    editorEdit.putStringSet(key, hashSet);
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i8 == 0) {
            editorEdit.remove("fire-count");
        } else {
            editorEdit.putLong("fire-count", i8);
        }
        editorEdit.commit();
    }

    synchronized List<m> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f25153a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(m.a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        h(System.currentTimeMillis());
        return arrayList;
    }

    synchronized void g(long j8, String str) {
        String strD = d(j8);
        if (this.f25153a.getString("last-used-date", "").equals(strD)) {
            String strE = e(strD);
            if (strE == null) {
                return;
            }
            if (strE.equals(str)) {
                return;
            }
            i(str, strD);
            return;
        }
        long j9 = this.f25153a.getLong("fire-count", 0L);
        if (j9 + 1 == 30) {
            a();
            j9 = this.f25153a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f25153a.getStringSet(str, new HashSet()));
        hashSet.add(strD);
        this.f25153a.edit().putStringSet(str, hashSet).putLong("fire-count", j9 + 1).putString("last-used-date", strD).commit();
    }

    synchronized void h(long j8) {
        this.f25153a.edit().putLong("fire-global", j8).commit();
    }
}
