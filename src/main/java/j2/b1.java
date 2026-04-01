package j2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.w73;
import com.google.android.gms.internal.ads.wr2;
import com.google.android.gms.internal.ads.z83;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static Point a(MotionEvent motionEvent, View view) {
        int[] iArrJ = j(view);
        return new Point(((int) motionEvent.getRawX()) - iArrJ[0], ((int) motionEvent.getRawY()) - iArrJ[1]);
    }

    public static WindowManager.LayoutParams b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) h2.y.c().b(ns.O7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject c(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("x", h2.v.b().f(context, point2.x));
                    jSONObject3.put("y", h2.v.b().f(context, point2.y));
                    jSONObject3.put("start_x", h2.v.b().f(context, point.x));
                    jSONObject3.put("start_y", h2.v.b().f(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e8) {
                    qg0.e("Error occurred while putting signals into JSON object.", e8);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e9) {
                e = e9;
                jSONObject = jSONObject2;
                qg0.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static JSONObject d(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] iArrJ = j(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] iArrJ2 = j(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", h2.v.b().f(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", h2.v.b().f(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", h2.v.b().f(context, iArrJ2[0] - iArrJ[0]));
                        jSONObject5.put("y", h2.v.b().f(context, iArrJ2[1] - iArrJ[1]));
                        jSONObject5.put(str4, str3);
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = k(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", h2.v.b().f(context, iArrJ2[0] - iArrJ[0]));
                            jSONObject2.put("y", h2.v.b().f(context, iArrJ2[1] - iArrJ[1]));
                            jSONObject2.put(str4, str3);
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry.getKey()).equals("3010")) {
                            if (((Boolean) h2.y.c().b(ns.I7)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) h2.y.c().b(ns.J7)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", l(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", l(layoutParams.height) - 1);
                            }
                            if (((Boolean) h2.y.c().b(ns.K7)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (((Boolean) h2.y.c().b(ns.L7)).booleanValue() && scaleType != null) {
                                jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject4.put("font_size", textView.getTextSize());
                                jSONObject4.put("text", textView.getText());
                            } catch (JSONException unused) {
                                jSONObject = jSONObject6;
                                qg0.g("Unable to get asset views information");
                                it = it2;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                        try {
                            jSONObject.put((String) entry.getKey(), jSONObject4);
                        } catch (JSONException unused2) {
                            qg0.g("Unable to get asset views information");
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                    }
                } catch (JSONException unused4) {
                    str = str3;
                    str2 = str4;
                    jSONObject = jSONObject3;
                }
                it = it2;
                jSONObject3 = jSONObject;
                str3 = str;
                str4 = str2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject e(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            g2.t.r();
            jSONObject.put("can_show_on_lock_screen", k2.O(view));
            g2.t.r();
            jSONObject.put("is_keyguard_locked", k2.c(context));
        } catch (JSONException unused) {
            qg0.g("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject f(android.view.View r6) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            com.google.android.gms.internal.ads.fs r1 = com.google.android.gms.internal.ads.ns.H7     // Catch: java.lang.Exception -> L58
            com.google.android.gms.internal.ads.ls r2 = h2.y.c()     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Exception -> L58
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L58
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L58
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L38
            g2.t.r()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L25:
            if (r6 == 0) goto L30
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L30
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
            goto L25
        L30:
            if (r6 != 0) goto L33
            goto L34
        L33:
            r2 = 1
        L34:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L58
            goto L58
        L38:
            g2.t.r()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r1 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L3f:
            if (r1 == 0) goto L4a
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch: java.lang.Exception -> L58
            if (r5 != 0) goto L4a
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L58
            goto L3f
        L4a:
            r5 = -1
            if (r1 != 0) goto L4f
            r6 = -1
            goto L55
        L4f:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch: java.lang.Exception -> L58
            int r6 = r1.getPositionForView(r6)     // Catch: java.lang.Exception -> L58
        L55:
            if (r6 == r5) goto L34
            goto L33
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.b1.f(android.view.View):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c A[Catch: JSONException -> 0x0170, PHI: r4
  0x016c: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:44:0x0163, B:47:0x016b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {JSONException -> 0x0170, blocks: (B:30:0x013c, B:46:0x0167, B:48:0x016c), top: B:64:0x013c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0171 -> B:63:0x0176). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject g(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.b1.g(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean h(Context context, wr2 wr2Var) {
        if (!wr2Var.P) {
            return false;
        }
        if (((Boolean) h2.y.c().b(ns.M7)).booleanValue()) {
            return ((Boolean) h2.y.c().b(ns.P7)).booleanValue();
        }
        String str = (String) h2.y.c().b(ns.N7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = z83.c(w73.c(';')).d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(int i8) {
        if (((Boolean) h2.y.c().b(ns.f12115k3)).booleanValue()) {
            return ((Boolean) h2.y.c().b(ns.f12124l3)).booleanValue() || i8 <= 15299999;
        }
        return true;
    }

    public static int[] j(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    private static JSONObject k(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", h2.v.b().f(context, rect.right - rect.left));
        jSONObject.put("height", h2.v.b().f(context, rect.bottom - rect.top));
        jSONObject.put("x", h2.v.b().f(context, rect.left));
        jSONObject.put("y", h2.v.b().f(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int l(int i8) {
        if (i8 != -2) {
            return i8 != -1 ? 2 : 3;
        }
        return 4;
    }
}
