package gcm.play.android.samples.com.gcmquickstart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Created by nontachai on 10/23/2015 AD.
 */
public class FragmentWebview extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


            String url = "http://www.sitms.com/";

            //WebView wv = new WebView(context);
            // or
            View rootView = inflater.inflate(R.layout.fragment_webview, container, false);
            WebView wv = (WebView) rootView.findViewById(R.id.webView);

            wv.loadUrl(url);
            wv.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });

            return rootView;
            //return inflater.inflate(R.layout.fragment_webview,container,false);
        }
}

