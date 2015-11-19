package gcm.play.android.samples.com.gcmquickstart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by nontachai on 10/23/2015 AD.
 */
public class FragmentListview extends android.support.v4.app.Fragment{


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

            //return inflater.inflate(R.layout.fragment_webview,container,false);
            int[] resId = {R.drawable.news
                    , R.drawable.news, R.drawable.news
                    , R.drawable.news, R.drawable.news, R.drawable.news
                    , R.drawable.news, R.drawable.news, R.drawable.news
                    , R.drawable.news};

            String[] author = {"Aerith Gainsborough", "Barret Wallace", "Cait Sith"
                    , "Cid Highwind","Aerith Gainsborough", "Barret Wallace", "Cait Sith"
                    , "Cid Highwind", "Aerith Gainsborough", "Barret Wallace"};

            String[] title = {"ค่าย Junior Programmer Camp", "ค่าย Junior Programmer Camp"
                    , "ค่าย Junior Programmer Camp", "ค่าย Junior Programmer Camp"
                    , "ค่าย Junior Programmer Camp", "ค่าย Junior Programmer Camp"
                    , "ค่าย Junior Programmer Camp", "ค่าย Junior Programmer Camp"
                    , "ค่าย Junior Programmer Camp", "ค่าย Junior Programmer Camp"

            };

            String[] date = {"9:00", "12:00", "15:00", "18:00"
                    ,"9:00", "12:00", "15:00", "18:00"
                    ,"9:00", "12:00"};

            CustomAdapter adapter = new CustomAdapter(getActivity(), title, author, date, resId);

            ListView listView = (ListView) rootView.findViewById(R.id.listView);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getActivity(), "item: "+position, Toast.LENGTH_LONG).show();
                }
            });
            return rootView;
        }

}

