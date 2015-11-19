package gcm.play.android.samples.com.gcmquickstart;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/**
 * Created by nontachai on 10/19/2015 AD.
 */
public class MessageView extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_listview);

        int[] resId = { R.drawable.news, R.drawable.news
                ,R.drawable.news,R.drawable.news
                ,R.drawable.news,R.drawable.news
                ,R.drawable.news,R.drawable.news
                ,R.drawable.news,R.drawable.news};

        String[] list = { "No Image", "No Image"
                    ,"No Image","No Image"
                    ,"No Image","No Image"
                    ,"No Image","No Image"
                    ,"No Image","No Image"};

        String[] empty = {};

        String[] clear = {};

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list, empty, clear, resId);

        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }
}
