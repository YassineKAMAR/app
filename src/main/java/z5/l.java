package z5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.a;
import z5.a;

/* JADX INFO: loaded from: classes.dex */
public class l implements l5.a, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f27766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f27767b;

    static class a implements k {
        a() {
        }

        @Override // z5.k
        public String a(List<String> list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        }

        @Override // z5.k
        public List<String> b(String str) {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    public l() {
        this(new a());
    }

    l(k kVar) {
        this.f27767b = kVar;
    }

    private Map<String, Object> h(String str, Set<String> set) {
        Map<String, ?> all = this.f27766a.getAll();
        HashMap map = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                map.put(str2, j(str2, all.get(str2)));
            }
        }
        return map;
    }

    private void i(s5.c cVar, Context context) {
        this.f27766a = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            j.j(cVar, this);
        } catch (Exception e8) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e8);
        }
    }

    private Object j(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f27767b.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f27766a.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f27767b.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // z5.a.b
    public Map<String, Object> a(String str, List<String> list) {
        return h(str, list == null ? null : new HashSet(list));
    }

    @Override // z5.a.b
    public Boolean b(String str, List<String> list) {
        SharedPreferences.Editor editorEdit = this.f27766a.edit();
        Map<String, ?> all = this.f27766a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        return Boolean.valueOf(editorEdit.commit());
    }

    @Override // z5.a.b
    public Boolean c(String str, List<String> list) {
        return Boolean.valueOf(this.f27766a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f27767b.a(list)).commit());
    }

    @Override // z5.a.b
    public Boolean d(String str, Long l8) {
        return Boolean.valueOf(this.f27766a.edit().putLong(str, l8.longValue()).commit());
    }

    @Override // z5.a.b
    public Boolean e(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f27766a.edit().putString(str, str2).commit());
    }

    @Override // z5.a.b
    public Boolean f(String str, Boolean bool) {
        return Boolean.valueOf(this.f27766a.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // z5.a.b
    public Boolean g(String str, Double d8) {
        String string = Double.toString(d8.doubleValue());
        return Boolean.valueOf(this.f27766a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + string).commit());
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        i(bVar.b(), bVar.a());
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        j.j(bVar.b(), null);
    }

    @Override // z5.a.b
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f27766a.edit().remove(str).commit());
    }
}
