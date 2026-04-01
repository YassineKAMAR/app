package androidx.window.layout;

import androidx.window.core.ExperimentalWindowApi;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalWindowApi
public interface WindowMetricsCalculatorDecorator {
    @ExperimentalWindowApi
    WindowMetricsCalculator decorate(WindowMetricsCalculator windowMetricsCalculator);
}
