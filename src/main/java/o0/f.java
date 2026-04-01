package o0;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, a> f25233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<b> f25234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<d> f25235d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f25239d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f25240e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f25241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f25242g;

        public a(String str, String str2, boolean z7, int i8, String str3, int i9) {
            this.f25236a = str;
            this.f25237b = str2;
            this.f25239d = z7;
            this.f25240e = i8;
            this.f25238c = a(str2);
            this.f25241f = str3;
            this.f25242g = i9;
        }

        private static int a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f25240e != aVar.f25240e || !this.f25236a.equals(aVar.f25236a) || this.f25239d != aVar.f25239d) {
                return false;
            }
            if (this.f25242g == 1 && aVar.f25242g == 2 && (str3 = this.f25241f) != null && !str3.equals(aVar.f25241f)) {
                return false;
            }
            if (this.f25242g == 2 && aVar.f25242g == 1 && (str2 = aVar.f25241f) != null && !str2.equals(this.f25241f)) {
                return false;
            }
            int i8 = this.f25242g;
            return (i8 == 0 || i8 != aVar.f25242g || ((str = this.f25241f) == null ? aVar.f25241f == null : str.equals(aVar.f25241f))) && this.f25238c == aVar.f25238c;
        }

        public int hashCode() {
            return (((((this.f25236a.hashCode() * 31) + this.f25238c) * 31) + (this.f25239d ? 1231 : 1237)) * 31) + this.f25240e;
        }

        public String toString() {
            return "Column{name='" + this.f25236a + "', type='" + this.f25237b + "', affinity='" + this.f25238c + "', notNull=" + this.f25239d + ", primaryKeyPosition=" + this.f25240e + ", defaultValue='" + this.f25241f + "'}";
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<String> f25246d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<String> f25247e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f25243a = str;
            this.f25244b = str2;
            this.f25245c = str3;
            this.f25246d = Collections.unmodifiableList(list);
            this.f25247e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25243a.equals(bVar.f25243a) && this.f25244b.equals(bVar.f25244b) && this.f25245c.equals(bVar.f25245c) && this.f25246d.equals(bVar.f25246d)) {
                return this.f25247e.equals(bVar.f25247e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f25243a.hashCode() * 31) + this.f25244b.hashCode()) * 31) + this.f25245c.hashCode()) * 31) + this.f25246d.hashCode()) * 31) + this.f25247e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f25243a + "', onDelete='" + this.f25244b + "', onUpdate='" + this.f25245c + "', columnNames=" + this.f25246d + ", referenceColumnNames=" + this.f25247e + '}';
        }
    }

    static class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f25248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f25249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f25250c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f25251d;

        c(int i8, int i9, String str, String str2) {
            this.f25248a = i8;
            this.f25249b = i9;
            this.f25250c = str;
            this.f25251d = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i8 = this.f25248a - cVar.f25248a;
            return i8 == 0 ? this.f25249b - cVar.f25249b : i8;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f25253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<String> f25254c;

        public d(String str, boolean z7, List<String> list) {
            this.f25252a = str;
            this.f25253b = z7;
            this.f25254c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f25253b == dVar.f25253b && this.f25254c.equals(dVar.f25254c)) {
                return this.f25252a.startsWith("index_") ? dVar.f25252a.startsWith("index_") : this.f25252a.equals(dVar.f25252a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f25252a.startsWith("index_") ? -1184239155 : this.f25252a.hashCode()) * 31) + (this.f25253b ? 1 : 0)) * 31) + this.f25254c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f25252a + "', unique=" + this.f25253b + ", columns=" + this.f25254c + '}';
        }
    }

    public f(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f25232a = str;
        this.f25233b = Collections.unmodifiableMap(map);
        this.f25234c = Collections.unmodifiableSet(set);
        this.f25235d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    public static f a(q0.b bVar, String str) {
        return new f(str, b(bVar, str), d(bVar, str), f(bVar, str));
    }

    private static Map<String, a> b(q0.b bVar, String str) {
        Cursor cursorI = bVar.I("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorI.getColumnCount() > 0) {
                int columnIndex = cursorI.getColumnIndex("name");
                int columnIndex2 = cursorI.getColumnIndex("type");
                int columnIndex3 = cursorI.getColumnIndex("notnull");
                int columnIndex4 = cursorI.getColumnIndex("pk");
                int columnIndex5 = cursorI.getColumnIndex("dflt_value");
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(columnIndex);
                    map.put(string, new a(string, cursorI.getString(columnIndex2), cursorI.getInt(columnIndex3) != 0, cursorI.getInt(columnIndex4), cursorI.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorI.close();
        }
    }

    private static List<c> c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < count; i8++) {
            cursor.moveToPosition(i8);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static Set<b> d(q0.b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorI = bVar.I("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorI.getColumnIndex("id");
            int columnIndex2 = cursorI.getColumnIndex("seq");
            int columnIndex3 = cursorI.getColumnIndex("table");
            int columnIndex4 = cursorI.getColumnIndex("on_delete");
            int columnIndex5 = cursorI.getColumnIndex("on_update");
            List<c> listC = c(cursorI);
            int count = cursorI.getCount();
            for (int i8 = 0; i8 < count; i8++) {
                cursorI.moveToPosition(i8);
                if (cursorI.getInt(columnIndex2) == 0) {
                    int i9 = cursorI.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listC) {
                        if (cVar.f25248a == i9) {
                            arrayList.add(cVar.f25250c);
                            arrayList2.add(cVar.f25251d);
                        }
                    }
                    hashSet.add(new b(cursorI.getString(columnIndex3), cursorI.getString(columnIndex4), cursorI.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorI.close();
        }
    }

    private static d e(q0.b bVar, String str, boolean z7) {
        Cursor cursorI = bVar.I("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorI.getColumnIndex("seqno");
            int columnIndex2 = cursorI.getColumnIndex("cid");
            int columnIndex3 = cursorI.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorI.moveToNext()) {
                    if (cursorI.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorI.getInt(columnIndex)), cursorI.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z7, arrayList);
            }
            return null;
        } finally {
            cursorI.close();
        }
    }

    private static Set<d> f(q0.b bVar, String str) {
        Cursor cursorI = bVar.I("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorI.getColumnIndex("name");
            int columnIndex2 = cursorI.getColumnIndex("origin");
            int columnIndex3 = cursorI.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorI.moveToNext()) {
                    if ("c".equals(cursorI.getString(columnIndex2))) {
                        String string = cursorI.getString(columnIndex);
                        boolean z7 = true;
                        if (cursorI.getInt(columnIndex3) != 1) {
                            z7 = false;
                        }
                        d dVarE = e(bVar, string, z7);
                        if (dVarE == null) {
                            return null;
                        }
                        hashSet.add(dVarE);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorI.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f25232a;
        if (str == null ? fVar.f25232a != null : !str.equals(fVar.f25232a)) {
            return false;
        }
        Map<String, a> map = this.f25233b;
        if (map == null ? fVar.f25233b != null : !map.equals(fVar.f25233b)) {
            return false;
        }
        Set<b> set2 = this.f25234c;
        if (set2 == null ? fVar.f25234c != null : !set2.equals(fVar.f25234c)) {
            return false;
        }
        Set<d> set3 = this.f25235d;
        if (set3 == null || (set = fVar.f25235d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f25232a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f25233b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f25234c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f25232a + "', columns=" + this.f25233b + ", foreignKeys=" + this.f25234c + ", indices=" + this.f25235d + '}';
    }
}
