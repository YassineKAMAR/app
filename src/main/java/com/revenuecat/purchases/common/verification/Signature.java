package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import f6.i;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Signature {
    public static final Companion Companion = new Companion(null);
    private final byte[] intermediateKey;
    private final byte[] intermediateKeyExpiration;
    private final byte[] intermediateKeySignature;
    private final byte[] payload;
    private final byte[] salt;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Signature fromString$purchases_defaultsRelease(String signature) throws InvalidSignatureSizeException {
            q.f(signature, "signature");
            byte[] signatureBytes = Base64.decode(signature, 0);
            int totalSize = Component.Companion.getTotalSize();
            if (signatureBytes.length == totalSize) {
                q.e(signatureBytes, "signatureBytes");
                return new Signature(SignatureKt.copyOf(signatureBytes, Component.INTERMEDIATE_KEY), SignatureKt.copyOf(signatureBytes, Component.INTERMEDIATE_KEY_EXPIRATION), SignatureKt.copyOf(signatureBytes, Component.INTERMEDIATE_KEY_SIGNATURE), SignatureKt.copyOf(signatureBytes, Component.SALT), SignatureKt.copyOf(signatureBytes, Component.PAYLOAD));
            }
            throw new InvalidSignatureSizeException("Invalid signature size. Expected " + totalSize + ", got " + signatureBytes.length + " bytes");
        }
    }

    public enum Component {
        INTERMEDIATE_KEY(32),
        INTERMEDIATE_KEY_EXPIRATION(4),
        INTERMEDIATE_KEY_SIGNATURE(64),
        SALT(16),
        PAYLOAD(64);

        public static final Companion Companion = new Companion(null);
        private final int size;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }

            public final int getTotalSize() {
                int size = 0;
                for (Component component : Component.values()) {
                    size += component.getSize();
                }
                return size;
            }
        }

        Component(int i8) {
            this.size = i8;
        }

        public final int getEndByte() {
            return getStartByte() + this.size;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartByte() {
            int i8 = 0;
            for (Object obj : i.g(values(), 0, ordinal())) {
                i8 += ((Component) obj).size;
            }
            return i8;
        }
    }

    public Signature(byte[] intermediateKey, byte[] intermediateKeyExpiration, byte[] intermediateKeySignature, byte[] salt, byte[] payload) {
        q.f(intermediateKey, "intermediateKey");
        q.f(intermediateKeyExpiration, "intermediateKeyExpiration");
        q.f(intermediateKeySignature, "intermediateKeySignature");
        q.f(salt, "salt");
        q.f(payload, "payload");
        this.intermediateKey = intermediateKey;
        this.intermediateKeyExpiration = intermediateKeyExpiration;
        this.intermediateKeySignature = intermediateKeySignature;
        this.salt = salt;
        this.payload = payload;
    }

    public static /* synthetic */ Signature copy$default(Signature signature, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bArr = signature.intermediateKey;
        }
        if ((i8 & 2) != 0) {
            bArr2 = signature.intermediateKeyExpiration;
        }
        byte[] bArr6 = bArr2;
        if ((i8 & 4) != 0) {
            bArr3 = signature.intermediateKeySignature;
        }
        byte[] bArr7 = bArr3;
        if ((i8 & 8) != 0) {
            bArr4 = signature.salt;
        }
        byte[] bArr8 = bArr4;
        if ((i8 & 16) != 0) {
            bArr5 = signature.payload;
        }
        return signature.copy(bArr, bArr6, bArr7, bArr8, bArr5);
    }

    public final byte[] component1() {
        return this.intermediateKey;
    }

    public final byte[] component2() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] component3() {
        return this.intermediateKeySignature;
    }

    public final byte[] component4() {
        return this.salt;
    }

    public final byte[] component5() {
        return this.payload;
    }

    public final Signature copy(byte[] intermediateKey, byte[] intermediateKeyExpiration, byte[] intermediateKeySignature, byte[] salt, byte[] payload) {
        q.f(intermediateKey, "intermediateKey");
        q.f(intermediateKeyExpiration, "intermediateKeyExpiration");
        q.f(intermediateKeySignature, "intermediateKeySignature");
        q.f(salt, "salt");
        q.f(payload, "payload");
        return new Signature(intermediateKey, intermediateKeyExpiration, intermediateKeySignature, salt, payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!q.b(Signature.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        q.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.Signature");
        Signature signature = (Signature) obj;
        return Arrays.equals(this.intermediateKey, signature.intermediateKey) && Arrays.equals(this.intermediateKeyExpiration, signature.intermediateKeyExpiration) && Arrays.equals(this.intermediateKeySignature, signature.intermediateKeySignature) && Arrays.equals(this.salt, signature.salt) && Arrays.equals(this.payload, signature.payload);
    }

    public final byte[] getIntermediateKey() {
        return this.intermediateKey;
    }

    public final byte[] getIntermediateKeyExpiration() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] getIntermediateKeySignature() {
        return this.intermediateKeySignature;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(this.intermediateKey) * 31) + Arrays.hashCode(this.intermediateKeyExpiration)) * 31) + Arrays.hashCode(this.intermediateKeySignature)) * 31) + Arrays.hashCode(this.salt)) * 31) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        return "Signature(intermediateKey=" + Arrays.toString(this.intermediateKey) + ", intermediateKeyExpiration=" + Arrays.toString(this.intermediateKeyExpiration) + ", intermediateKeySignature=" + Arrays.toString(this.intermediateKeySignature) + ", salt=" + Arrays.toString(this.salt) + ", payload=" + Arrays.toString(this.payload) + ')';
    }
}
