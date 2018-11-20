package com.abc.phongnguyen.duan_cafemanage;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.Toast;


import com.abc.phongnguyen.duan_cafemanage.Resource.SimpleIdlingResource;
import com.abc.phongnguyen.duan_cafemanage.model.Coffee;

import java.util.ArrayList;


public class ImageDownloader {

    private static final int DELAY_MILLIS = 3000;

    final static ArrayList<Coffee> M_COFFEES = new ArrayList<>();

    interface DelayerCallback{
        void onDone(ArrayList<Coffee> coffees);
    }

    static void downloadImage(Context context, final  DelayerCallback callback,
                              @Nullable final SimpleIdlingResource idlingResource){

        if (idlingResource != null) {
            idlingResource.setIdleState(false);
        }

        String text = context.getString(R.string.loading_msg);
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        M_COFFEES.add(new Coffee(context.getString(R.string.black_tea_name), R.drawable.americano));
        M_COFFEES.add(new Coffee(context.getString(R.string.green_tea_name), R.drawable.cafeden));
        M_COFFEES.add(new Coffee(context.getString(R.string.white_tea_name), R.drawable.cappuccino));
        M_COFFEES.add(new Coffee(context.getString(R.string.oolong_tea_name), R.drawable.viennese));
        M_COFFEES.add(new Coffee(context.getString(R.string.honey_lemon_tea_name), R.drawable.escup));
        M_COFFEES.add(new Coffee(context.getString(R.string.chamomile_tea_name), R.drawable.mocha));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    callback.onDone(M_COFFEES);
                    if (idlingResource != null) {
                        idlingResource.setIdleState(true);
                    }
                }
            }
        }, DELAY_MILLIS);


    }
}
