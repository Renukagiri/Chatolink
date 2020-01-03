package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 31-05-2019.
 */
public class travel extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.travel);
        String[] url1 = {"www.yatra.com              -       YATRA" ,"www.booking.com         -       BOOKING dot COM",
                "www.expedia.com          -      EXPEDIA","www.kayak.co.in            -      KAYAK","www.hipmunk.com        -      HIPMUNK",
        "www.priceline.com        -      PRICELINE","www.travelocity.com     -     TRAVELOCITY","www.tripadvisor.in         -     TRIPADVISOR",
                "www.makemytrip.com  -     MAKEMYTRIP","www.goibibo.com          -     GOIBIBO","www.cleartrip.com        -     CLEARTRIP",
        "www.easemytrip.com   -     EASEMYTRIP","www.ixigo.com              -     IXIGO","www.travelguru.com    -     TRAVELGURU","www.thomascook.in     -     THOMASCOOK"};
        String[] t = {"yatra","expedia"};
//        final TextView myClickableUrl = (TextView) findViewById(R.id.TextView1);
//        myClickableUrl.setText("web site1: www.stackoverflow.com");
      //  Linkify.addLinks(myClickableUrl, Linkify.WEB_URLS);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_view, url1);  //adapter should hold textview id(list_view.xml)
       // ArrayAdapter adapter1 = new ArrayAdapter<String>(this, R.layout.list_view, t);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
       // listView.setAdapter(adapter1);
       // Linkify.addLinks(listView, Linkify.WEB_URLS);

    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
