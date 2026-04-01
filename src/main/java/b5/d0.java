package b5;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f3320b;

    public d0(String str, List<Object> list) {
        this.f3319a = str;
        this.f3320b = list == null ? new ArrayList<>() : list;
    }

    private Object[] e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            bArr[i8] = (byte) ((Integer) list.get(i8)).intValue();
        }
        return bArr;
    }

    public void a(SQLiteProgram sQLiteProgram) {
        long jLongValue;
        List<Object> list = this.f3320b;
        if (list != null) {
            int size = list.size();
            int i8 = 0;
            while (i8 < size) {
                Object objF = f(this.f3320b.get(i8));
                int i9 = i8 + 1;
                if (objF == null) {
                    sQLiteProgram.bindNull(i9);
                } else if (objF instanceof byte[]) {
                    sQLiteProgram.bindBlob(i9, (byte[]) objF);
                } else if (objF instanceof Double) {
                    sQLiteProgram.bindDouble(i9, ((Double) objF).doubleValue());
                } else {
                    if (objF instanceof Integer) {
                        jLongValue = ((Integer) objF).intValue();
                    } else if (objF instanceof Long) {
                        jLongValue = ((Long) objF).longValue();
                    } else if (objF instanceof String) {
                        sQLiteProgram.bindString(i9, (String) objF);
                    } else {
                        if (!(objF instanceof Boolean)) {
                            throw new IllegalArgumentException("Could not bind " + objF + " from index " + i8 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        jLongValue = ((Boolean) objF).booleanValue() ? 1L : 0L;
                    }
                    sQLiteProgram.bindLong(i9, jLongValue);
                }
                i8 = i9;
            }
        }
    }

    public List<Object> b() {
        return this.f3320b;
    }

    public String c() {
        return this.f3319a;
    }

    public Object[] d() {
        return e(this.f3320b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        String str = this.f3319a;
        if (str != null) {
            if (!str.equals(d0Var.f3319a)) {
                return false;
            }
        } else if (d0Var.f3319a != null) {
            return false;
        }
        if (this.f3320b.size() != d0Var.f3320b.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f3320b.size(); i8++) {
            if ((this.f3320b.get(i8) instanceof byte[]) && (d0Var.f3320b.get(i8) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f3320b.get(i8), (byte[]) d0Var.f3320b.get(i8))) {
                    return false;
                }
            } else if (!this.f3320b.get(i8).equals(d0Var.f3320b.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3319a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3319a);
        List<Object> list = this.f3320b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f3320b;
        }
        sb.append(str);
        return sb.toString();
    }
}
