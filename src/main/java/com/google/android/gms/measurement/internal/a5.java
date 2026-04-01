package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.mf;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bundle f19784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f19785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ y4 f19786d;

    public a5(y4 y4Var, String str, Bundle bundle) {
        this.f19786d = y4Var;
        a3.o.f(str);
        this.f19783a = str;
        this.f19784b = new Bundle();
    }

    private final String c(Bundle bundle) {
        p4 p4VarG;
        Class<?> cls;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    if (!mf.a() || !this.f19786d.a().q(e0.M0)) {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                            jSONArray.put(jSONObject);
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                            jSONArray.put(jSONObject);
                        } else {
                            p4VarG = this.f19786d.t().G();
                            cls = obj.getClass();
                            p4VarG.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "s");
                        jSONArray.put(jSONObject);
                    } else if (obj instanceof Long) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "l");
                        jSONArray.put(jSONObject);
                    } else {
                        if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            str = "ia";
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            str = "la";
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", String.valueOf(obj));
                            jSONObject.put("t", "d");
                            jSONArray.put(jSONObject);
                        } else {
                            p4VarG = this.f19786d.t().G();
                            cls = obj.getClass();
                            p4VarG.b("Cannot serialize bundle value to SharedPreferences. Type", cls);
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    }
                } catch (JSONException e8) {
                    this.f19786d.t().G().b("Cannot serialize bundle value to SharedPreferences", e8);
                }
            }
        }
        return jSONArray.toString();
    }

    public final Bundle a() {
        if (this.f19785c == null) {
            String string = this.f19786d.F().getString(this.f19783a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i8);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            byte b8 = -1;
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b8 = 4;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b8 = 3;
                                        }
                                    } else if (string3.equals("s")) {
                                        b8 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    b8 = 2;
                                }
                            } else if (string3.equals("d")) {
                                b8 = 1;
                            }
                            if (b8 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b8 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b8 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b8 != 3) {
                                if (b8 != 4) {
                                    this.f19786d.t().G().b("Unrecognized persisted bundle type. Type", string3);
                                } else if (mf.a() && this.f19786d.a().q(e0.M0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    long[] jArr = new long[length];
                                    for (int i9 = 0; i9 < length; i9++) {
                                        jArr[i9] = jSONArray2.optLong(i9);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            } else if (mf.a() && this.f19786d.a().q(e0.M0)) {
                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                int length2 = jSONArray3.length();
                                int[] iArr = new int[length2];
                                for (int i10 = 0; i10 < length2; i10++) {
                                    iArr[i10] = jSONArray3.optInt(i10);
                                }
                                bundle.putIntArray(string2, iArr);
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f19786d.t().G().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f19785c = bundle;
                } catch (JSONException unused2) {
                    this.f19786d.t().G().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f19785c == null) {
                this.f19785c = this.f19784b;
            }
        }
        return this.f19785c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.f19786d.F().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.f19783a);
        } else {
            editorEdit.putString(this.f19783a, c(bundle));
        }
        editorEdit.apply();
        this.f19785c = bundle;
    }
}
