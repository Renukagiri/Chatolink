package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 31-05-2019.
 */
public class hotels extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.hotels);
        String[] url1 = {"www.airbnb.co.in           -     AIRBNB" ,"www.makemytrip.com  -    MAKEMYTRIP",
                "www.booking.com         -    BOOKING dot COM","www.oyorooms.com      -   OYO ROOMS",
                "www.expedia.com          -    EXPEDIA","www.yatra.com               -    YATRA",
                "www.goibibo.com           -    GOIBIBO","www.agoda.com             -     AGODA",
                "in.hotels.com                  -     HOTELS","www.cleartrip.com        -     CLEARTRIP",
                "www.tripadvisor.in         -     TRIPADVISOR","www.trivago.in               -     TRIVAGO",
                "www.mistay.in                -     MISTAY","www.holiday4u.com      -     HOLIDAY 4U",
                "www.pridehotel.com     -    PRIDEHOTEL","www.lemontreehotels.com     -    LEMONTREE",
                "www.ixigo.com               -   IXIGO","www.coxandkings.com    -   COX AND KINGS","www.icanstay.com            -   ICANSTAY"};
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



