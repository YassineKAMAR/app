package r5;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import s5.a;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.a<Object> f25920a;

    public interface a {
        void a(boolean z7);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KeyEvent f25921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Character f25922b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f25921a = keyEvent;
            this.f25922b = ch;
        }
    }

    public d(s5.c cVar) {
        this.f25920a = new s5.a<>(cVar, "flutter/keyevent", s5.f.f26250a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: r5.c
            @Override // s5.a.e
            public final void a(Object obj) throws JSONException {
                d.d(aVar, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z7) {
        HashMap map = new HashMap();
        map.put("type", z7 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(bVar.f25921a.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(bVar.f25921a.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(bVar.f25921a.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(bVar.f25921a.getKeyCode()));
        map.put("scanCode", Integer.valueOf(bVar.f25921a.getScanCode()));
        map.put("metaState", Integer.valueOf(bVar.f25921a.getMetaState()));
        Character ch = bVar.f25922b;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(bVar.f25921a.getSource()));
        map.put("deviceId", Integer.valueOf(bVar.f25921a.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(bVar.f25921a.getRepeatCount()));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) throws JSONException {
        boolean z7 = false;
        if (obj != null) {
            try {
                z7 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e8) {
                g5.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e8);
            }
        }
        aVar.a(z7);
    }

    public void e(b bVar, boolean z7, a aVar) {
        this.f25920a.d(c(bVar, z7), b(aVar));
    }
}
