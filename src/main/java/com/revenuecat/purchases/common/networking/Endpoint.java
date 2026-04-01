package com.revenuecat.purchases.common.networking;

import android.net.Uri;
import e6.p;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class Endpoint {
    private final String name;
    private final String pathTemplate;

    public static final class GetAmazonReceipt extends Endpoint {
        private final String receiptId;
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAmazonReceipt(String userId, String receiptId) {
            super("/receipts/amazon/%s/%s", "get_amazon_receipt", null);
            q.f(userId, "userId");
            q.f(receiptId, "receiptId");
            this.userId = userId;
            this.receiptId = receiptId;
        }

        public static /* synthetic */ GetAmazonReceipt copy$default(GetAmazonReceipt getAmazonReceipt, String str, String str2, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = getAmazonReceipt.userId;
            }
            if ((i8 & 2) != 0) {
                str2 = getAmazonReceipt.receiptId;
            }
            return getAmazonReceipt.copy(str, str2);
        }

        public final String component1() {
            return this.userId;
        }

        public final String component2() {
            return this.receiptId;
        }

        public final GetAmazonReceipt copy(String userId, String receiptId) {
            q.f(userId, "userId");
            q.f(receiptId, "receiptId");
            return new GetAmazonReceipt(userId, receiptId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAmazonReceipt)) {
                return false;
            }
            GetAmazonReceipt getAmazonReceipt = (GetAmazonReceipt) obj;
            return q.b(this.userId, getAmazonReceipt.userId) && q.b(this.receiptId, getAmazonReceipt.receiptId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId), this.receiptId}, 2));
            q.e(str, "format(this, *args)");
            return str;
        }

        public final String getReceiptId() {
            return this.receiptId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return (this.userId.hashCode() * 31) + this.receiptId.hashCode();
        }

        public String toString() {
            return "GetAmazonReceipt(userId=" + this.userId + ", receiptId=" + this.receiptId + ')';
        }
    }

    public static final class GetCustomerInfo extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetCustomerInfo(String userId) {
            super("/subscribers/%s", "get_customer", null);
            q.f(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ GetCustomerInfo copy$default(GetCustomerInfo getCustomerInfo, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = getCustomerInfo.userId;
            }
            return getCustomerInfo.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetCustomerInfo copy(String userId) {
            q.f(userId, "userId");
            return new GetCustomerInfo(userId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetCustomerInfo) && q.b(this.userId, ((GetCustomerInfo) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            q.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetCustomerInfo(userId=" + this.userId + ')';
        }
    }

    public static final class GetOfferings extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetOfferings(String userId) {
            super("/subscribers/%s/offerings", "get_offerings", null);
            q.f(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ GetOfferings copy$default(GetOfferings getOfferings, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = getOfferings.userId;
            }
            return getOfferings.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final GetOfferings copy(String userId) {
            q.f(userId, "userId");
            return new GetOfferings(userId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetOfferings) && q.b(this.userId, ((GetOfferings) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            q.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "GetOfferings(userId=" + this.userId + ')';
        }
    }

    public static final class GetProductEntitlementMapping extends Endpoint {
        public static final GetProductEntitlementMapping INSTANCE = new GetProductEntitlementMapping();

        private GetProductEntitlementMapping() {
            super("/product_entitlement_mapping", "get_product_entitlement_mapping", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class LogIn extends Endpoint {
        public static final LogIn INSTANCE = new LogIn();

        private LogIn() {
            super("/subscribers/identify", "log_in", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostAttributes extends Endpoint {
        private final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostAttributes(String userId) {
            super("/subscribers/%s/attributes", "post_attributes", null);
            q.f(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ PostAttributes copy$default(PostAttributes postAttributes, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = postAttributes.userId;
            }
            return postAttributes.copy(str);
        }

        public final String component1() {
            return this.userId;
        }

        public final PostAttributes copy(String userId) {
            q.f(userId, "userId");
            return new PostAttributes(userId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PostAttributes) && q.b(this.userId, ((PostAttributes) obj).userId);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            String str = String.format(getPathTemplate(), Arrays.copyOf(new Object[]{Uri.encode(this.userId)}, 1));
            q.e(str, "format(this, *args)");
            return str;
        }

        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        public String toString() {
            return "PostAttributes(userId=" + this.userId + ')';
        }
    }

    public static final class PostDiagnostics extends Endpoint {
        public static final PostDiagnostics INSTANCE = new PostDiagnostics();

        private PostDiagnostics() {
            super("/diagnostics", "post_diagnostics", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostPaywallEvents extends Endpoint {
        public static final PostPaywallEvents INSTANCE = new PostPaywallEvents();

        private PostPaywallEvents() {
            super("/events", "post_paywall_events", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    public static final class PostReceipt extends Endpoint {
        public static final PostReceipt INSTANCE = new PostReceipt();

        private PostReceipt() {
            super("/receipts", "post_receipt", null);
        }

        @Override // com.revenuecat.purchases.common.networking.Endpoint
        public String getPath() {
            return getPathTemplate();
        }
    }

    private Endpoint(String str, String str2) {
        this.pathTemplate = str;
        this.name = str2;
    }

    public /* synthetic */ Endpoint(String str, String str2, j jVar) {
        this(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsNonceToPerformSigning() {
        if (this instanceof GetCustomerInfo ? true : q.b(this, LogIn.INSTANCE) ? true : q.b(this, PostReceipt.INSTANCE)) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof GetOfferings ? true : this instanceof PostAttributes ? true : q.b(this, PostDiagnostics.INSTANCE) ? true : q.b(this, PostPaywallEvents.INSTANCE) ? true : q.b(this, GetProductEntitlementMapping.INSTANCE)) {
            return false;
        }
        throw new p();
    }

    public abstract String getPath();

    public final String getPathTemplate() {
        return this.pathTemplate;
    }

    public final boolean getSupportsSignatureVerification() {
        if (this instanceof GetCustomerInfo ? true : q.b(this, LogIn.INSTANCE) ? true : q.b(this, PostReceipt.INSTANCE) ? true : this instanceof GetOfferings ? true : q.b(this, GetProductEntitlementMapping.INSTANCE)) {
            return true;
        }
        if (this instanceof GetAmazonReceipt ? true : this instanceof PostAttributes ? true : q.b(this, PostDiagnostics.INSTANCE) ? true : q.b(this, PostPaywallEvents.INSTANCE)) {
            return false;
        }
        throw new p();
    }
}
