package r5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.k f26071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f26072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final k.c f26073c;

    class a implements k.c {
        a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // s5.k.c
        public void onMethodCall(s5.j jVar, k.d dVar) {
            Bundle bundle;
            if (q.this.f26072b == null) {
            }
            String str = jVar.f26252a;
            Object obj = jVar.f26253b;
            g5.b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            byte b8 = -1;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        b8 = 0;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        b8 = 1;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        b8 = 2;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        b8 = 3;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        b8 = 4;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        b8 = 5;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        b8 = 6;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        b8 = 7;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        b8 = 8;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        b8 = 9;
                    }
                    break;
            }
            try {
                switch (b8) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        q.this.f26072b.c(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    case 1:
                        q.this.f26072b.h(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            q.this.f26072b.i(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                        } catch (NoSuchFieldException e8) {
                            e = e8;
                            dVar.b("error", e.getMessage(), null);
                            return;
                        }
                        break;
                    case 3:
                        q.this.f26072b.j();
                        dVar.a(null);
                        break;
                    case 4:
                        q.this.f26072b.b();
                        dVar.a(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        q.this.f26072b.a(string, bundle);
                        dVar.a(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d8 = jSONObject3.getDouble("width");
                        double d9 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i8 = 0; i8 < 16; i8++) {
                            dArr[i8] = jSONArray2.getDouble(i8);
                        }
                        q.this.f26072b.d(d8, d9, dArr);
                        dVar.a(null);
                        break;
                    case 7:
                        q.this.f26072b.f(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case 8:
                        q.this.f26072b.g();
                        dVar.a(null);
                        break;
                    case 9:
                        q.this.f26072b.e();
                        dVar.a(null);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (JSONException e9) {
                e = e9;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f26075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f26076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f26078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f26079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f26080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f26081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Integer f26082h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f26083i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f26084j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String[] f26085k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final b[] f26086l;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f26087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String[] f26088b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e f26089c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f26090d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f26087a = str;
                this.f26088b = strArr;
                this.f26090d = str2;
                this.f26089c = eVar;
            }

            public static a a(JSONObject jSONObject) throws JSONException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    strArr[i8] = b(jSONArray.getString(i8));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    Method dump skipped, instruction units count: 802
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: r5.q.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f26075a = z7;
            this.f26076b = z8;
            this.f26077c = z9;
            this.f26078d = z10;
            this.f26079e = z11;
            this.f26080f = dVar;
            this.f26081g = cVar;
            this.f26082h = num;
            this.f26083i = str;
            this.f26084j = aVar;
            this.f26085k = strArr;
            this.f26086l = bVarArr;
        }

        public static b a(JSONObject jSONObject) throws JSONException {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i8 = 0; i8 < length; i8++) {
                    bVarArr2[i8] = a(jSONArray.getJSONObject(i8));
                }
                bVarArr = bVarArr2;
            }
            Integer numB = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                    arrayList.add(jSONArray2.optString(i9));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.a(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), numB, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:4:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.Integer b(java.lang.String r12) {
            /*
                Method dump skipped, instruction units count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r5.q.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f26091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f26092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26093c;

        public c(g gVar, boolean z7, boolean z8) {
            this.f26091a = gVar;
            this.f26092b = z7;
            this.f26093c = z8;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.a(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26099a;

        d(String str) {
            this.f26099a = str;
        }

        static d a(String str) throws NoSuchFieldException {
            for (d dVar : values()) {
                if (dVar.f26099a.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f26102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f26103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f26104e;

        public e(String str, int i8, int i9, int i10, int i11) {
            if (!(i8 == -1 && i9 == -1) && (i8 < 0 || i9 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i8) + ", " + String.valueOf(i9) + ")");
            }
            if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i10 > i11)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i10) + ", " + String.valueOf(i11) + ")");
            }
            if (i11 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i10));
            }
            if (i8 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i8));
            }
            if (i9 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i9));
            }
            this.f26100a = str;
            this.f26101b = i8;
            this.f26102c = i9;
            this.f26103d = i10;
            this.f26104e = i11;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i8 = this.f26103d;
            return i8 >= 0 && this.f26104e > i8;
        }

        public boolean c() {
            return this.f26101b >= 0;
        }
    }

    public interface f {
        void a(String str, Bundle bundle);

        void b();

        void c(int i8, boolean z7);

        void d(double d8, double d9, double[] dArr);

        void e();

        void f(boolean z7);

        void g();

        void h(e eVar);

        void i(int i8, b bVar);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26117a;

        g(String str) {
            this.f26117a = str;
        }

        static g a(String str) throws NoSuchFieldException {
            for (g gVar : values()) {
                if (gVar.f26117a.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public q(h5.a aVar) {
        a aVar2 = new a();
        this.f26073c = aVar2;
        s5.k kVar = new s5.k(aVar, "flutter/textinput", s5.g.f26251a);
        this.f26071a = kVar;
        kVar.e(aVar2);
    }

    private static HashMap<Object, Object> c(ArrayList<io.flutter.plugin.editing.g> arrayList) {
        HashMap<Object, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.g> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap<Object, Object> d(String str, int i8, int i9, int i10, int i11) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i8));
        map.put("selectionExtent", Integer.valueOf(i9));
        map.put("composingBase", Integer.valueOf(i10));
        map.put("composingExtent", Integer.valueOf(i11));
        return map;
    }

    public void b(int i8, Map<String, Object> map) {
        g5.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.commitContent", map));
    }

    public void e(int i8) {
        g5.b.f("TextInputChannel", "Sending 'done' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.done"));
    }

    public void f(int i8) {
        g5.b.f("TextInputChannel", "Sending 'go' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.go"));
    }

    public void g(int i8) {
        g5.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.newline"));
    }

    public void h(int i8) {
        g5.b.f("TextInputChannel", "Sending 'next' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.next"));
    }

    public void i(int i8) {
        g5.b.f("TextInputChannel", "Sending 'onConnectionClosed' message.");
        this.f26071a.c("TextInputClient.onConnectionClosed", Arrays.asList(Integer.valueOf(i8), "TextInputClient.onConnectionClosed"));
    }

    public void j(int i8, String str, Bundle bundle) {
        HashMap map = new HashMap();
        map.put("action", str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.f26071a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i8), map));
    }

    public void k(int i8) {
        g5.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.previous"));
    }

    public void l() {
        this.f26071a.c("TextInputClient.requestExistingInputState", null);
    }

    public void m(int i8) {
        g5.b.f("TextInputChannel", "Sending 'search' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.search"));
    }

    public void n(int i8) {
        g5.b.f("TextInputChannel", "Sending 'send' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.send"));
    }

    public void o(f fVar) {
        this.f26072b = fVar;
    }

    public void p(int i8) {
        g5.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f26071a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.unspecified"));
    }

    public void q(int i8, String str, int i9, int i10, int i11, int i12) {
        g5.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i9 + "\nSelection end: " + i10 + "\nComposing start: " + i11 + "\nComposing end: " + i12);
        this.f26071a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i8), d(str, i9, i10, i11, i12)));
    }

    public void r(int i8, ArrayList<io.flutter.plugin.editing.g> arrayList) {
        g5.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f26071a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i8), c(arrayList)));
    }

    public void s(int i8, HashMap<String, e> map) {
        g5.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, e> entry : map.entrySet()) {
            e value = entry.getValue();
            map2.put(entry.getKey(), d(value.f26100a, value.f26101b, value.f26102c, -1, -1));
        }
        this.f26071a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i8), map2));
    }
}
