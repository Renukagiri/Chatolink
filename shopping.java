package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 07-06-2019.
 */
public class shopping extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.shopping);
        String[] url1 = {"www.amazon.in                  -    AMAZON" ,"www.flipkart.com               -    FLIPKART",
                "www.snapdeal.com            -    SNAPDEAL","www.jabong.com                -    JABONG",
                "www.myntra.com               -    MYNTRA","www.homeshop18.com    -     HOMESHOP18",
                "www.infibeam.com            -     INFIBEAM  ","www.shopclues.com         -     SHOPCLUES",
                "in.ebay.com                         -     EBAY","www.paytmmall.com         -     PAYTMMALL",
                "www.yebhi.com                  -     YEBHI","www.trendin.com               -    TRENDIN",
                "www.nykaa.com                 -     NYKAA","www.firstcry.com               -     FIRSTCRY",
                "www.limeroad.com            -     LIMEROAD","www.shein.in                       -    SHEIN",
                "charlotterusse.com            - CHARLOTTERUSSE","www.asos.com                    -    ASOS","www.prettylittlething.com -    PRETTYLITTLE THING"};
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












