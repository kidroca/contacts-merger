package com.example.kidroca.contactsmerger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    private int currentScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        this.webView = (WebView) findViewById(R.id.webview);
        this.currentScale = 130;

        this.webView.loadUrl("localhost:8081");
    }

    public void onDecreaseClick(View view) {
        if (this.currentScale >= 20) {
            this.currentScale -= 10;
        }

        this.webView.setInitialScale(this.currentScale);
    }

    public void onIncreaseClick(View view) {
        if (this.currentScale <= 290) {
            this.currentScale += 10;
        }

        this.webView.setInitialScale(this.currentScale);
    }

    public void onResetClick(View view) {
        this.currentScale = 130;
        this.webView.setInitialScale(this.currentScale);
    }
}
