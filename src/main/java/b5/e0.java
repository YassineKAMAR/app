package b5;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class e0 {
    public static List<Object> a(Cursor cursor, int i8) {
        ArrayList arrayList = new ArrayList(i8);
        for (int i9 = 0; i9 < i8; i9++) {
            Object objB = b(cursor, i9);
            if (c5.a.f3474c) {
                String name = objB != null ? objB.getClass().isArray() ? "array(" + objB.getClass().getComponentType().getName() + ")" : objB.getClass().getName() : null;
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i9);
                sb.append(" ");
                sb.append(cursor.getType(i9));
                sb.append(": ");
                sb.append(objB);
                sb.append(name == null ? "" : " (" + name + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(objB);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i8) {
        int type = cursor.getType(i8);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i8));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i8));
        }
        if (type == 3) {
            return cursor.getString(i8);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i8);
    }

    static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    static Locale d(String str) {
        return c(str);
    }
}
