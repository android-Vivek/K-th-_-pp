package com.vivek.hack.katha_app;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.NativeExpressAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "MainActivity";

    private AdView mAdView1;
    NativeExpressAdView mAdView;

    private static String LOG_TAG = "EXAMPLE";
    VideoController mVideoController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vivek.hack.katha_app.R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-2609666985136692~5177036572");
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        mAdView1 = (AdView) findViewById(com.vivek.hack.katha_app.R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);


        mAdView = (NativeExpressAdView) findViewById(R.id.adView);

        // Set its video options.
        mAdView.setVideoOptions(new VideoOptions.Builder()
                .setStartMuted(true)
                .build());

        // The VideoController can be used to get lifecycle events and info about an ad's video
        // asset. One will always be returned by getVideoController, even if the ad has no video
        // asset.
        mVideoController = mAdView.getVideoController();
        mVideoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() {
            @Override
            public void onVideoEnd() {
                Log.d(LOG_TAG, "Video playback is finished.");
                super.onVideoEnd();
            }
        });

        // Set an AdListener for the AdView, so the Activity can take action when an ad has finished
        // loading.
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if (mVideoController.hasVideoContent()) {
                    Log.d(LOG_TAG, "Received an ad that contains a video asset.");
                } else {
                    Log.d(LOG_TAG, "Received an ad that does not contain a video asset.");
                }
            }
        });

        mAdView.loadAd(new AdRequest.Builder().build());

    }



    public void katha(View view)
    {
        Intent intent = new Intent(MainActivity.this,katha.class);
        startActivity(intent);
    }

    public void mantra(View view)
    {
        Intent intent = new Intent(MainActivity.this,Mantra.class);
        startActivity(intent);
    }

    public void share(View view)
    {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.vivek.hack.katha_app");

        sendIntent.setType("text/plain");
        startActivity(sendIntent);

    }
    public void rateus(View view)
    {
        Uri uri = Uri.parse("market://details?id=com.vivek.hack.katha_app");
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

        // After pressing back button from google play will continue to app
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);

        startActivity(goToMarket);
    }



}
