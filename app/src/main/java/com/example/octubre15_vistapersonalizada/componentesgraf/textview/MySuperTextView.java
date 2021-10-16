package com.example.octubre15_vistapersonalizada.componentesgraf.textview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import timber.log.Timber;

public class MySuperTextView extends AppCompatTextView {

    public MySuperTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        // pone un .var después del (event) para que es ?

        boolean isOnTouchEvent = super.onTouchEvent(event);
        decorateText();
        Timber.d("onTouchEvent " + event.toString());
        return isOnTouchEvent;
    }

    private void decorateText() {
        if (!getText().toString().isEmpty()) {
            setShadowLayer(6, 4, 4, Color.rgb(250, 00, 250));
            setBackgroundColor(Color.CYAN);
        } else {
            setBackgroundColor(Color.RED);
        }
    }
}
