package com.amazon.device.iap.internal.util;

import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4336a = "c";

    /* JADX INFO: renamed from: com.amazon.device.iap.internal.util.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4337a;

        static {
            int[] iArr = new int[d.values().length];
            f4337a = iArr;
            try {
                iArr[d.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4337a[d.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4337a[d.V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4337a[d.V3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static Receipt a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("token");
        String string = jSONObject.getString("sku");
        ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f3901k).toUpperCase());
        String strOptString2 = jSONObject.optString(com.amazon.a.a.o.b.P);
        Date dateB = a(strOptString2) ? null : b(strOptString2);
        String strOptString3 = jSONObject.optString(com.amazon.a.a.o.b.f3894d);
        return new ReceiptBuilder().setReceiptId(strOptString).setSku(string).setProductType(productTypeValueOf).setPurchaseDate(dateB).setCancelDate(a(strOptString3) ? null : b(strOptString3)).build();
    }

    public static Receipt a(JSONObject jSONObject, String str, String str2) {
        int i8 = AnonymousClass1.f4337a[b(jSONObject).ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? e(jSONObject, str, str2) : d(jSONObject, str, str2) : b(jSONObject, str, str2) : c(jSONObject, str, str2);
    }

    public static List<Receipt> a(String str, String str2, String str3) {
        if (str2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                arrayList.add(a(jSONArray.getJSONObject(i8), str, str3));
            } catch (e e8) {
                b.b(f4336a, "fail to parse receipt, requestId:" + e8.a());
                throw e8;
            } catch (f e9) {
                b.b(f4336a, "fail to verify receipt, requestId:" + e9.a());
                throw e9;
            } catch (Throwable th) {
                b.b(f4336a, "fail to verify receipt, requestId:" + th.getMessage());
                throw th;
            }
        }
        return arrayList;
    }

    protected static JSONObject a(Receipt receipt, String str) {
        JSONObject jSONObject = new JSONObject();
        if (receipt != null && !com.amazon.a.a.o.f.a(str)) {
            try {
                jSONObject.put(com.amazon.a.a.o.b.E, receipt.getReceiptId());
                jSONObject.put("sku", receipt.getSku());
                jSONObject.put(com.amazon.a.a.o.b.f3901k, receipt.getProductType());
                jSONObject.put(com.amazon.a.a.o.b.Q, receipt.getPurchaseDate());
                jSONObject.put(com.amazon.a.a.o.b.f3894d, receipt.getCancelDate());
                jSONObject.put("signature", str);
            } catch (JSONException unused) {
                b.b(f4336a, "Failure during toJsonInternal: " + receipt + ", signature:" + str);
            }
        }
        return jSONObject;
    }

    protected static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    private static d b(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(com.amazon.a.a.o.b.Z);
        String strOptString2 = jSONObject.optString(com.amazon.a.a.o.b.E);
        String strOptString3 = jSONObject.optString(com.amazon.a.a.o.b.N);
        if (!com.amazon.a.a.o.f.a(strOptString3)) {
            d dVar = d.V3;
            if (strOptString3.equals(dVar.name())) {
                return dVar;
            }
        }
        return !com.amazon.a.a.o.f.a(strOptString2) ? d.V2 : com.amazon.a.a.o.f.a(strOptString) ? d.LEGACY : d.V1;
    }

    private static Receipt b(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString("signature");
        if (com.amazon.a.a.o.f.a(strOptString)) {
            b.b(f4336a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString);
            throw new f(str2, null, strOptString);
        }
        try {
            Receipt receiptA = a(jSONObject);
            String str3 = str + "-" + receiptA.getReceiptId();
            boolean zA = com.amazon.a.a.a(str3, strOptString);
            b.a(f4336a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + strOptString);
            if (zA) {
                return receiptA;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString);
            throw new f(str2, str3, strOptString);
        } catch (JSONException e8) {
            throw new e(str2, jSONObject.toString(), e8);
        }
    }

    public static String b(Receipt receipt, String str) {
        try {
            return a(receipt, str).toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected static Date b(String str) throws JSONException {
        try {
            Date date = new SimpleDateFormat(com.amazon.a.a.o.b.ag).parse(str);
            if (0 == date.getTime()) {
                return null;
            }
            return date;
        } catch (ParseException e8) {
            throw new JSONException(e8.getMessage());
        }
    }

    private static Receipt c(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(com.amazon.a.a.o.b.Z);
        String strOptString2 = jSONObject.optString("signature");
        if (com.amazon.a.a.o.f.a(strOptString2)) {
            b.b(f4336a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString2);
            throw new f(str2, null, strOptString2);
        }
        try {
            Receipt receiptA = a(jSONObject);
            Object[] objArr = new Object[9];
            objArr[0] = PurchasingService.SDK_VERSION;
            objArr[1] = str;
            objArr[2] = strOptString;
            objArr[3] = receiptA.getProductType();
            objArr[4] = receiptA.getSku();
            objArr[5] = receiptA.getReceiptId();
            objArr[6] = str2;
            ProductType productType = ProductType.SUBSCRIPTION;
            objArr[7] = productType == receiptA.getProductType() ? receiptA.getPurchaseDate() : null;
            objArr[8] = productType == receiptA.getProductType() ? receiptA.getCancelDate() : null;
            String str3 = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", objArr);
            b.a(f4336a, "stringToVerify/v1:\n" + str3 + "\nsignature:\n" + strOptString2);
            if (com.amazon.a.a.a(str3, strOptString2)) {
                return receiptA;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString2);
            throw new f(str2, str3, strOptString2);
        } catch (JSONException e8) {
            throw new e(str2, jSONObject.toString(), e8);
        }
    }

    private static Receipt d(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(com.amazon.a.a.o.b.Z);
        String strOptString2 = jSONObject.optString("signature");
        Date dateB = null;
        if (com.amazon.a.a.o.f.a(strOptString2)) {
            b.b(f4336a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString2);
            throw new f(str2, null, strOptString2);
        }
        try {
            String string = jSONObject.getString(com.amazon.a.a.o.b.E);
            String string2 = jSONObject.getString("sku");
            ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f3901k).toUpperCase());
            String strOptString3 = jSONObject.optString(com.amazon.a.a.o.b.Q);
            Date dateB2 = a(strOptString3) ? null : b(strOptString3);
            String strOptString4 = jSONObject.optString(com.amazon.a.a.o.b.f3895e);
            if (!a(strOptString4)) {
                dateB = b(strOptString4);
            }
            Receipt receiptBuild = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(productTypeValueOf).setPurchaseDate(dateB2).setCancelDate(dateB).build();
            String str3 = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", str, strOptString, receiptBuild.getProductType(), receiptBuild.getSku(), receiptBuild.getReceiptId(), receiptBuild.getPurchaseDate(), receiptBuild.getCancelDate());
            b.a(f4336a, "stringToVerify/v2:\n" + str3 + "\nsignature:\n" + strOptString2);
            if (com.amazon.a.a.a(str3, strOptString2)) {
                return receiptBuild;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString2);
            throw new f(str2, str3, strOptString2);
        } catch (JSONException e8) {
            throw new e(str2, jSONObject.toString(), e8);
        }
    }

    private static Receipt e(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(com.amazon.a.a.o.b.Z);
        String strOptString2 = jSONObject.optString("signature");
        Date dateB = null;
        if (com.amazon.a.a.o.f.a(strOptString2)) {
            b.b(f4336a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", strOptString2);
            throw new f(str2, null, strOptString2);
        }
        try {
            String string = jSONObject.getString(com.amazon.a.a.o.b.E);
            String string2 = jSONObject.getString("sku");
            String strOptString3 = jSONObject.optString(com.amazon.a.a.o.b.L, null);
            String strOptString4 = jSONObject.optString(com.amazon.a.a.o.b.M, null);
            ProductType productTypeValueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f3901k).toUpperCase());
            String strOptString5 = jSONObject.optString(com.amazon.a.a.o.b.Q);
            Date dateB2 = a(strOptString5) ? null : b(strOptString5);
            String strOptString6 = jSONObject.optString(com.amazon.a.a.o.b.f3895e);
            Date dateB3 = a(strOptString6) ? null : b(strOptString6);
            String strOptString7 = jSONObject.optString(com.amazon.a.a.o.b.R);
            if (!a(strOptString7)) {
                dateB = b(strOptString7);
            }
            Receipt receiptBuild = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(productTypeValueOf).setPurchaseDate(dateB2).setCancelDate(dateB3).setDeferredDate(dateB).setDeferredSku(strOptString4).setTermSku(strOptString3).build();
            String str3 = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ|%tQ", str, strOptString, receiptBuild.getProductType(), receiptBuild.getSku(), receiptBuild.getReceiptId(), receiptBuild.getDeferredSku(), receiptBuild.getTermSku(), receiptBuild.getPurchaseDate(), receiptBuild.getCancelDate(), receiptBuild.getDeferredDate());
            b.a(f4336a, "stringToVerify/v3:\n" + str3 + "\nsignature:\n" + strOptString2);
            if (com.amazon.a.a.a(str3, strOptString2)) {
                return receiptBuild;
            }
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, strOptString2);
            throw new f(str2, str3, strOptString2);
        } catch (JSONException e8) {
            throw new e(str2, jSONObject.toString(), e8);
        }
    }
}
