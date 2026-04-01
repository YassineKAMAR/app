package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import f6.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ProductEntitlementMapping {
    private static final String BASE_PLAN_ID_KEY = "base_plan_id";
    public static final Companion Companion = new Companion(null);
    private static final String ENTITLEMENTS_KEY = "entitlements";
    private static final String PRODUCT_ENTITLEMENT_MAPPING_KEY = "product_entitlement_mapping";
    private static final String PRODUCT_ID_KEY = "product_identifier";
    private final Map<String, Mapping> mappings;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final ProductEntitlementMapping fromJson(JSONObject json) throws JSONException {
            q.f(json, "json");
            JSONObject jSONObject = json.getJSONObject(ProductEntitlementMapping.PRODUCT_ENTITLEMENT_MAPPING_KEY);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            q.e(itKeys, "productsObject.keys()");
            while (itKeys.hasNext()) {
                String mappingIdentifier = itKeys.next();
                JSONObject productObject = jSONObject.getJSONObject(mappingIdentifier);
                String productIdentifier = productObject.getString("product_identifier");
                q.e(productObject, "productObject");
                String strOptNullableString = JSONObjectExtensionsKt.optNullableString(productObject, ProductEntitlementMapping.BASE_PLAN_ID_KEY);
                JSONArray jSONArray = productObject.getJSONArray("entitlements");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    String string = jSONArray.getString(i8);
                    q.e(string, "entitlementsArray.getString(entitlementIndex)");
                    arrayList.add(string);
                }
                q.e(mappingIdentifier, "mappingIdentifier");
                q.e(productIdentifier, "productIdentifier");
                linkedHashMap.put(mappingIdentifier, new Mapping(productIdentifier, strOptNullableString, arrayList));
            }
            return new ProductEntitlementMapping(linkedHashMap);
        }
    }

    public static final class Mapping {
        private final String basePlanId;
        private final List<String> entitlements;
        private final String productIdentifier;

        public Mapping(String productIdentifier, String str, List<String> entitlements) {
            q.f(productIdentifier, "productIdentifier");
            q.f(entitlements, "entitlements");
            this.productIdentifier = productIdentifier;
            this.basePlanId = str;
            this.entitlements = entitlements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Mapping copy$default(Mapping mapping, String str, String str2, List list, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = mapping.productIdentifier;
            }
            if ((i8 & 2) != 0) {
                str2 = mapping.basePlanId;
            }
            if ((i8 & 4) != 0) {
                list = mapping.entitlements;
            }
            return mapping.copy(str, str2, list);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.basePlanId;
        }

        public final List<String> component3() {
            return this.entitlements;
        }

        public final Mapping copy(String productIdentifier, String str, List<String> entitlements) {
            q.f(productIdentifier, "productIdentifier");
            q.f(entitlements, "entitlements");
            return new Mapping(productIdentifier, str, entitlements);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mapping)) {
                return false;
            }
            Mapping mapping = (Mapping) obj;
            return q.b(this.productIdentifier, mapping.productIdentifier) && q.b(this.basePlanId, mapping.basePlanId) && q.b(this.entitlements, mapping.entitlements);
        }

        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final List<String> getEntitlements() {
            return this.entitlements;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            int iHashCode = this.productIdentifier.hashCode() * 31;
            String str = this.basePlanId;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.entitlements.hashCode();
        }

        public String toString() {
            return "Mapping(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", entitlements=" + this.entitlements + ')';
        }
    }

    public ProductEntitlementMapping(Map<String, Mapping> mappings) {
        q.f(mappings, "mappings");
        this.mappings = mappings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductEntitlementMapping copy$default(ProductEntitlementMapping productEntitlementMapping, Map map, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            map = productEntitlementMapping.mappings;
        }
        return productEntitlementMapping.copy(map);
    }

    public final Map<String, Mapping> component1() {
        return this.mappings;
    }

    public final ProductEntitlementMapping copy(Map<String, Mapping> mappings) {
        q.f(mappings, "mappings");
        return new ProductEntitlementMapping(mappings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductEntitlementMapping) && q.b(this.mappings, ((ProductEntitlementMapping) obj).mappings);
    }

    public final Map<String, Mapping> getMappings() {
        return this.mappings;
    }

    public int hashCode() {
        return this.mappings.hashCode();
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, Mapping> map = this.mappings;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Mapping mapping = (Mapping) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_identifier", mapping.getProductIdentifier());
            String basePlanId = mapping.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put(BASE_PLAN_ID_KEY, basePlanId);
            }
            jSONObject2.put("entitlements", new JSONArray((Collection) mapping.getEntitlements()));
            linkedHashMap.put(key, jSONObject2);
        }
        jSONObject.put(PRODUCT_ENTITLEMENT_MAPPING_KEY, new JSONObject(linkedHashMap));
        return jSONObject;
    }

    public String toString() {
        return "ProductEntitlementMapping(mappings=" + this.mappings + ')';
    }
}
