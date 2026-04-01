package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a83 {
    static final CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb, Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                CharSequence charSequenceA = a(it.next());
                while (true) {
                    sb.append(charSequenceA);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) str);
                    charSequenceA = a(it.next());
                }
            }
            return sb;
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
