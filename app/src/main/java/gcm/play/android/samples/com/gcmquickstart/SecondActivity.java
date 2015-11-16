package gcm.play.android.samples.com.gcmquickstart;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Gerbert on 11/16/2015.
 */
public class SecondActivity extends Activity {

    private WebView webView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);

        webView = (WebView) findViewById(R.id.web_view);
        WebSettings webSettings = webView.getSettings();
        webSettings.setSavePassword(false);
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);
        webView.loadUrl("http://www.sitms.com/index.php?option=com_content&view=article&id="+Model.articleID);
        //webView.loadUrl("http://www.sitms.com");

    }

}
