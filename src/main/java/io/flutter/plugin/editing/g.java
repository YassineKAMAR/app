package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f22888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f22889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22895h;

    public g(CharSequence charSequence, int i8, int i9, int i10, int i11) {
        this.f22892e = i8;
        this.f22893f = i9;
        this.f22894g = i10;
        this.f22895h = i11;
        a(charSequence, "", -1, -1);
    }

    public g(CharSequence charSequence, int i8, int i9, CharSequence charSequence2, int i10, int i11, int i12, int i13) {
        this.f22892e = i10;
        this.f22893f = i11;
        this.f22894g = i12;
        this.f22895h = i13;
        a(charSequence, charSequence2.toString(), i8, i9);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i8, int i9) {
        this.f22888a = charSequence;
        this.f22889b = charSequence2;
        this.f22890c = i8;
        this.f22891d = i9;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f22888a.toString());
            jSONObject.put("deltaText", this.f22889b.toString());
            jSONObject.put("deltaStart", this.f22890c);
            jSONObject.put("deltaEnd", this.f22891d);
            jSONObject.put("selectionBase", this.f22892e);
            jSONObject.put("selectionExtent", this.f22893f);
            jSONObject.put("composingBase", this.f22894g);
            jSONObject.put("composingExtent", this.f22895h);
        } catch (JSONException e8) {
            g5.b.b("TextEditingDelta", "unable to create JSONObject: " + e8);
        }
        return jSONObject;
    }
}
