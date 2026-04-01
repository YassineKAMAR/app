package w6;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h c(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new i(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t6.f d(MatchResult matchResult, int i8) {
        return t6.l.k(matchResult.start(i8), matchResult.end(i8));
    }
}
