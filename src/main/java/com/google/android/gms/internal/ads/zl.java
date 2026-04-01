package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vl f18275b = new bm();

    public zl(int i8) {
        this.f18274a = i8;
    }

    public final String a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append(((String) arrayList.get(i8)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        xl xlVar = new xl();
        PriorityQueue priorityQueue = new PriorityQueue(this.f18274a, new wl(this));
        for (String str : strArrSplit) {
            String[] strArrB = am.b(str, false);
            if (strArrB.length != 0) {
                em.c(strArrB, this.f18274a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                xlVar.f17359b.write(this.f18275b.b(((dm) it.next()).f6805b));
            } catch (IOException e8) {
                qg0.e("Error while writing hash to byteStream", e8);
            }
        }
        return xlVar.toString();
    }
}
