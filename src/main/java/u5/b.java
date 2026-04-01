package u5;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import java.util.HashMap;
import r5.h;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, Integer> f26737c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f26738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f26739b;

    class a implements h.b {
        a() {
        }

        @Override // r5.h.b
        public void a(String str) {
            b.this.f26738a.setPointerIcon(b.this.d(str));
        }
    }

    /* JADX INFO: renamed from: u5.b$b, reason: collision with other inner class name */
    class C0179b extends HashMap<String, Integer> {
        C0179b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    public interface c {
        PointerIcon a(int i8);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public b(c cVar, h hVar) {
        this.f26738a = cVar;
        this.f26739b = hVar;
        hVar.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointerIcon d(String str) {
        if (f26737c == null) {
            f26737c = new C0179b();
        }
        return this.f26738a.a(((Integer) f26737c.getOrDefault(str, 1000)).intValue());
    }

    public void c() {
        this.f26739b.b(null);
    }
}
