package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k62 implements x22 {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final x3.d a(ks2 ks2Var, wr2 wr2Var) {
        String strOptString = wr2Var.f16909x.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        ts2 ts2Var = ks2Var.f10322a.f8947a;
        rs2 rs2Var = new rs2();
        rs2Var.G(ts2Var);
        rs2Var.J(strOptString);
        Bundle bundleD = d(ts2Var.f15302d.f22264m);
        Bundle bundleD2 = d(bundleD.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleD2.putInt("gw", 1);
        String strOptString2 = wr2Var.f16909x.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleD2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = wr2Var.f16909x.optString("adJson", null);
        if (strOptString3 != null) {
            bundleD2.putString("_ad", strOptString3);
        }
        bundleD2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = wr2Var.F.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = wr2Var.F.optString(next, null);
            if (next != null) {
                bundleD2.putString(next, strOptString4);
            }
        }
        bundleD.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleD2);
        h2.r4 r4Var = ts2Var.f15302d;
        Bundle bundle = r4Var.f22265n;
        List list = r4Var.f22266o;
        String str = r4Var.f22267p;
        int i8 = r4Var.f22255d;
        String str2 = r4Var.f22268q;
        List list2 = r4Var.f22256e;
        boolean z7 = r4Var.f22269r;
        boolean z8 = r4Var.f22257f;
        h2.y0 y0Var = r4Var.f22270s;
        int i9 = r4Var.f22258g;
        int i10 = r4Var.f22271t;
        boolean z9 = r4Var.f22259h;
        String str3 = r4Var.f22272u;
        String str4 = r4Var.f22260i;
        List list3 = r4Var.f22273v;
        rs2Var.e(new h2.r4(r4Var.f22252a, r4Var.f22253b, bundleD2, i8, list2, z8, i9, z9, str4, r4Var.f22261j, r4Var.f22262k, r4Var.f22263l, bundleD, bundle, list, str, str2, z7, y0Var, i10, str3, list3, r4Var.f22274w, r4Var.f22275x, r4Var.f22276y));
        ts2 ts2VarG = rs2Var.g();
        Bundle bundle2 = new Bundle();
        as2 as2Var = ks2Var.f10323b.f9793b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(as2Var.f5461a));
        bundle3.putInt("refresh_interval", as2Var.f5463c);
        bundle3.putString("gws_query_id", as2Var.f5462b);
        bundle2.putBundle("parent_common_config", bundle3);
        ts2 ts2Var2 = ks2Var.f10322a.f8947a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", ts2Var2.f15304f);
        bundle4.putString("allocation_id", wr2Var.f16910y);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(wr2Var.f16869c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(wr2Var.f16871d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(wr2Var.f16899r));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(wr2Var.f16893o));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(wr2Var.f16881i));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(wr2Var.f16883j));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(wr2Var.f16885k));
        bundle4.putString("transaction_id", wr2Var.f16887l);
        bundle4.putString("valid_from_timestamp", wr2Var.f16889m);
        bundle4.putBoolean("is_closable_area_disabled", wr2Var.R);
        bundle4.putString("recursive_server_response_data", wr2Var.f16898q0);
        if (wr2Var.f16891n != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", wr2Var.f16891n.f5709b);
            bundle5.putString("rb_type", wr2Var.f16891n.f5708a);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return c(ts2VarG, bundle2, wr2Var, ks2Var);
    }

    @Override // com.google.android.gms.internal.ads.x22
    public final boolean b(ks2 ks2Var, wr2 wr2Var) {
        return !TextUtils.isEmpty(wr2Var.f16909x.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    protected abstract x3.d c(ts2 ts2Var, Bundle bundle, wr2 wr2Var, ks2 ks2Var);
}
