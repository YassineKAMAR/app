package com.revenuecat.purchases.common.verification;

import com.revenuecat.purchases.EntitlementVerificationMode;
import e6.p;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class SignatureVerificationMode {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntitlementVerificationMode.values().length];
                try {
                    iArr[EntitlementVerificationMode.DISABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntitlementVerificationMode.INFORMATIONAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IntermediateSignatureHelper createIntermediateSignatureHelper() {
            return new IntermediateSignatureHelper(new DefaultSignatureVerifier(null, 1, null));
        }

        public static /* synthetic */ SignatureVerificationMode fromEntitlementVerificationMode$default(Companion companion, EntitlementVerificationMode entitlementVerificationMode, SignatureVerifier signatureVerifier, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                signatureVerifier = null;
            }
            return companion.fromEntitlementVerificationMode(entitlementVerificationMode, signatureVerifier);
        }

        public final SignatureVerificationMode fromEntitlementVerificationMode(EntitlementVerificationMode verificationMode, SignatureVerifier signatureVerifier) {
            q.f(verificationMode, "verificationMode");
            int i8 = WhenMappings.$EnumSwitchMapping$0[verificationMode.ordinal()];
            if (i8 == 1) {
                return Disabled.INSTANCE;
            }
            if (i8 != 2) {
                throw new p();
            }
            if (signatureVerifier == null) {
                signatureVerifier = new DefaultSignatureVerifier(null, 1, null);
            }
            return new Informational(new IntermediateSignatureHelper(signatureVerifier));
        }
    }

    public static final class Disabled extends SignatureVerificationMode {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    public static final class Enforced extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Enforced() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enforced(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            q.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }

        public /* synthetic */ Enforced(IntermediateSignatureHelper intermediateSignatureHelper, int i8, j jVar) {
            this((i8 & 1) != 0 ? SignatureVerificationMode.Companion.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        public static /* synthetic */ Enforced copy$default(Enforced enforced, IntermediateSignatureHelper intermediateSignatureHelper, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                intermediateSignatureHelper = enforced.getIntermediateSignatureHelper();
            }
            return enforced.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper component1() {
            return getIntermediateSignatureHelper();
        }

        public final Enforced copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            q.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Enforced(intermediateSignatureHelper);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enforced) && q.b(getIntermediateSignatureHelper(), ((Enforced) obj).getIntermediateSignatureHelper());
        }

        @Override // com.revenuecat.purchases.common.verification.SignatureVerificationMode
        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return getIntermediateSignatureHelper().hashCode();
        }

        public String toString() {
            return "Enforced(intermediateSignatureHelper=" + getIntermediateSignatureHelper() + ')';
        }
    }

    public static final class Informational extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Informational() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Informational(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            q.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }

        public /* synthetic */ Informational(IntermediateSignatureHelper intermediateSignatureHelper, int i8, j jVar) {
            this((i8 & 1) != 0 ? SignatureVerificationMode.Companion.createIntermediateSignatureHelper() : intermediateSignatureHelper);
        }

        public static /* synthetic */ Informational copy$default(Informational informational, IntermediateSignatureHelper intermediateSignatureHelper, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                intermediateSignatureHelper = informational.getIntermediateSignatureHelper();
            }
            return informational.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper component1() {
            return getIntermediateSignatureHelper();
        }

        public final Informational copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            q.f(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Informational(intermediateSignatureHelper);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Informational) && q.b(getIntermediateSignatureHelper(), ((Informational) obj).getIntermediateSignatureHelper());
        }

        @Override // com.revenuecat.purchases.common.verification.SignatureVerificationMode
        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return getIntermediateSignatureHelper().hashCode();
        }

        public String toString() {
            return "Informational(intermediateSignatureHelper=" + getIntermediateSignatureHelper() + ')';
        }
    }

    private SignatureVerificationMode() {
    }

    public /* synthetic */ SignatureVerificationMode(j jVar) {
        this();
    }

    public IntermediateSignatureHelper getIntermediateSignatureHelper() {
        if (this instanceof Disabled) {
            return null;
        }
        if (this instanceof Informational) {
            return ((Informational) this).getIntermediateSignatureHelper();
        }
        if (this instanceof Enforced) {
            return ((Enforced) this).getIntermediateSignatureHelper();
        }
        throw new p();
    }

    public final boolean getShouldVerify() {
        if (q.b(this, Disabled.INSTANCE)) {
            return false;
        }
        if (this instanceof Informational ? true : this instanceof Enforced) {
            return true;
        }
        throw new p();
    }
}
