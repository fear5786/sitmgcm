package gcm.play.android.samples.com.gcmquickstart;

/**
 * Created by nontachai on 10/19/2015 AD.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    String[] strTitle;
    String[] strAuthor;
    String[] strDate;
    int[] resId;

    public CustomAdapter(Context context, String[] strTitle, String[] strAuthor, String[] strDate, int[] resId) {
        this.mContext= context;
        this.strTitle = strTitle;
        this.strAuthor = strAuthor;
        this.strDate = strDate;
        this.resId = resId;
    }

    public int getCount() {

        return strTitle.length;
    }

    public Object getItem(int position) {

        return null;
    }

    public long getItemId(int position) {

        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.listview_row, parent, false);

        TextView title = (TextView)view.findViewById(R.id.post_title);
       // title.setText(strTitle[position]);

        ImageView imageView = (ImageView)view.findViewById(R.id.post_thumbnail);
       // imageView.setBackgroundResource(resId[position]);

        TextView authorName = (TextView)view.findViewById(R.id.post_author);
       // authorName.setText(strAuthor[position]);

        TextView date = (TextView)view.findViewById(R.id.post_date);
       // date.setText(strDate[position]);


        return view;
    }
}