package com.gowhich.androidbutton_2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = (Button) this.findViewById(R.id.button);
//
//        SpannableString spannableStringLeft = new SpannableString("left");
//
//        Bitmap bitmapLeft = BitmapFactory.decodeResource(getResources(), R.drawable.face5);
//        ImageSpan imageSpanLeft = new ImageSpan(bitmapLeft, DynamicDrawableSpan.ALIGN_BOTTOM);
//        spannableStringLeft.setSpan(imageSpanLeft, 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        SpannableString spannableStringRight = new SpannableString("right");
//        Bitmap bitmapRight = BitmapFactory.decodeResource(getResources(), R.drawable.face6);
//        ImageSpan imageSpanRight = new ImageSpan(bitmapRight, DynamicDrawableSpan.ALIGN_BOTTOM);
//        spannableStringRight.setSpan(imageSpanRight, 0, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        button.append(spannableStringLeft);
//        button.append("我的按钮");
//        button.append(spannableStringRight);

    }
}
