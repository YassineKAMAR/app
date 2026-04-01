package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import e6.i0;
import e6.x;
import f6.j0;
import f6.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import org.json.JSONException;
import org.json.JSONObject;
import p6.l;
import p6.q;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    static final class AnonymousClass1 extends r implements l<PurchasesError, i0> {
        final /* synthetic */ q<PurchasesError, Boolean, List<SubscriberAttributeError>, i0> $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, i0> qVar) {
            super(1);
            this.$onErrorHandler = qVar;
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f21430a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError error) {
            kotlin.jvm.internal.q.f(error, "error");
            this.$onErrorHandler.invoke(error, Boolean.FALSE, o.d());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    static final class AnonymousClass2 extends r implements q<PurchasesError, Integer, JSONObject, i0> {
        final /* synthetic */ q<PurchasesError, Boolean, List<SubscriberAttributeError>, i0> $onErrorHandler;
        final /* synthetic */ p6.a<i0> $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p6.a<i0> aVar, q<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, i0> qVar) {
            super(3);
            this.$onSuccessHandler = aVar;
            this.$onErrorHandler = qVar;
        }

        @Override // p6.q
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError, Integer num, JSONObject jSONObject) throws JSONException {
            invoke(purchasesError, num.intValue(), jSONObject);
            return i0.f21430a;
        }

        public final void invoke(PurchasesError purchasesError, int i8, JSONObject body) throws JSONException {
            i0 i0Var;
            kotlin.jvm.internal.q.f(body, "body");
            if (purchasesError != null) {
                q<PurchasesError, Boolean, List<SubscriberAttributeError>, i0> qVar = this.$onErrorHandler;
                boolean z7 = (RCHTTPStatusCodes.INSTANCE.isServerError(i8) || (i8 == 404)) ? false : true;
                List<SubscriberAttributeError> listD = o.d();
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    listD = BackendHelpersKt.getAttributeErrors(body);
                }
                qVar.invoke(purchasesError, Boolean.valueOf(z7), listD);
                i0Var = i0.f21430a;
            } else {
                i0Var = null;
            }
            if (i0Var == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        kotlin.jvm.internal.q.f(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> attributes, String appUserID, p6.a<i0> onSuccessHandler, q<? super PurchasesError, ? super Boolean, ? super List<SubscriberAttributeError>, i0> onErrorHandler) {
        kotlin.jvm.internal.q.f(attributes, "attributes");
        kotlin.jvm.internal.q.f(appUserID, "appUserID");
        kotlin.jvm.internal.q.f(onSuccessHandler, "onSuccessHandler");
        kotlin.jvm.internal.q.f(onErrorHandler, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(appUserID), j0.c(x.a("attributes", attributes)), null, Delay.DEFAULT, new AnonymousClass1(onErrorHandler), new AnonymousClass2(onSuccessHandler, onErrorHandler));
    }
}
