package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import r5.o;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class f implements o.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f22884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextServicesManager f22885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SpellCheckerSession f22886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    k.d f22887d;

    public f(TextServicesManager textServicesManager, o oVar) {
        this.f22885b = textServicesManager;
        this.f22884a = oVar;
        oVar.b(this);
    }

    @Override // r5.o.b
    public void a(String str, String str2, k.d dVar) {
        if (this.f22887d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.f22887d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f22884a.b(null);
        SpellCheckerSession spellCheckerSession = this.f22886c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale localeB = t5.b.b(str);
        if (this.f22886c == null) {
            this.f22886c = this.f22885b.newSpellCheckerSession(null, localeB, this, true);
        }
        this.f22886c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f22887d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            if (sentenceSuggestionsInfo == null) {
                dVar = this.f22887d;
                arrayList = new ArrayList();
            } else {
                for (int i8 = 0; i8 < sentenceSuggestionsInfo.getSuggestionsCount(); i8++) {
                    SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i8);
                    int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                    if (suggestionsCount > 0) {
                        HashMap map = new HashMap();
                        int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i8);
                        int lengthAt = sentenceSuggestionsInfo.getLengthAt(i8) + offsetAt;
                        map.put("startIndex", Integer.valueOf(offsetAt));
                        map.put("endIndex", Integer.valueOf(lengthAt));
                        ArrayList arrayList2 = new ArrayList();
                        boolean z7 = false;
                        for (int i9 = 0; i9 < suggestionsCount; i9++) {
                            String suggestionAt = suggestionsInfoAt.getSuggestionAt(i9);
                            if (!suggestionAt.equals("")) {
                                arrayList2.add(suggestionAt);
                                z7 = true;
                            }
                        }
                        if (z7) {
                            map.put("suggestions", arrayList2);
                            arrayList.add(map);
                        }
                    }
                }
                dVar = this.f22887d;
            }
        }
        dVar.a(arrayList);
        this.f22887d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
