package com.revenuecat.purchases.common;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import f6.k0;
import i7.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import n7.n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class OfferingParser {
    public static final Companion Companion = new Companion(null);
    private static final n7.a json = n.b(null, OfferingParser$Companion$json$1.INSTANCE, 1, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }

        public final n7.a getJson$purchases_defaultsRelease() {
            return OfferingParser.json;
        }
    }

    public final Offering createOffering(JSONObject offeringJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        Map mapE;
        PaywallData paywallData;
        PaywallData paywallData2;
        q.f(offeringJson, "offeringJson");
        q.f(productsById, "productsById");
        String offeringIdentifier = offeringJson.getString("identifier");
        JSONObject jSONObjectOptJSONObject = offeringJson.optJSONObject("metadata");
        if (jSONObjectOptJSONObject == null || (mapE = JSONObjectExtensionsKt.toMap(jSONObjectOptJSONObject, true)) == null) {
            mapE = k0.e();
        }
        Map map = mapE;
        JSONArray jSONArray = offeringJson.getJSONArray("packages");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject packageJson = jSONArray.getJSONObject(i8);
            q.e(packageJson, "packageJson");
            q.e(offeringIdentifier, "offeringIdentifier");
            Package packageCreatePackage = createPackage(packageJson, productsById, offeringIdentifier);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = offeringJson.optJSONObject("paywall");
        if (jSONObjectOptJSONObject2 != null) {
            try {
                n7.a aVar = json;
                String string = jSONObjectOptJSONObject2.toString();
                q.e(string, "it.toString()");
                i7.b<Object> bVarB = l.b(aVar.a(), z.g(PaywallData.class));
                q.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                paywallData = (PaywallData) aVar.c(bVarB, string);
            } catch (IllegalArgumentException e8) {
                LogUtilsKt.errorLog("Error deserializing paywall data", e8);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        q.e(offeringIdentifier, "offeringIdentifier");
        String string2 = offeringJson.getString(com.amazon.a.a.o.b.f3893c);
        q.e(string2, "offeringJson.getString(\"description\")");
        return new Offering(offeringIdentifier, string2, map, arrayList, paywallData2);
    }

    public final Offerings createOfferings(JSONObject offeringsJson, Map<String, ? extends List<? extends StoreProduct>> productsById) throws JSONException {
        q.f(offeringsJson, "offeringsJson");
        q.f(productsById, "productsById");
        JSONArray jSONArray = offeringsJson.getJSONArray("offerings");
        String string = offeringsJson.getString("current_offering_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject offeringJson = jSONArray.getJSONObject(i8);
            q.e(offeringJson, "offeringJson");
            Offering offeringCreateOffering = createOffering(offeringJson, productsById);
            if (offeringCreateOffering != null) {
                linkedHashMap.put(offeringCreateOffering.getIdentifier(), offeringCreateOffering);
                if (offeringCreateOffering.getAvailablePackages().isEmpty()) {
                    String str = String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{offeringCreateOffering.getIdentifier()}, 1));
                    q.e(str, "format(this, *args)");
                    LogUtilsKt.warnLog(str);
                }
            }
        }
        return new Offerings((Offering) linkedHashMap.get(string), linkedHashMap);
    }

    public final Package createPackage(JSONObject packageJson, Map<String, ? extends List<? extends StoreProduct>> productsById, String offeringIdentifier) throws JSONException {
        q.f(packageJson, "packageJson");
        q.f(productsById, "productsById");
        q.f(offeringIdentifier, "offeringIdentifier");
        String packageIdentifier = packageJson.getString("identifier");
        StoreProduct storeProductFindMatchingProduct = findMatchingProduct(productsById, packageJson);
        q.e(packageIdentifier, "packageIdentifier");
        PackageType packageType = OfferingParserKt.toPackageType(packageIdentifier);
        if (storeProductFindMatchingProduct != null) {
            return new Package(packageIdentifier, packageType, storeProductFindMatchingProduct.copyWithOfferingId(offeringIdentifier), offeringIdentifier);
        }
        return null;
    }

    protected abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject);
}
