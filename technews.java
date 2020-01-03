package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 08-06-2019.
 */
public class technews extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        setContentView(R.layout.technews);
        String[] url1 = {"www.theverge.com              -    THE VERGE" ,"techcrunch.com                   -    TECHCRUNCH",
                "www.cnet.com                      -    CNET","www.engadget.com             -    ENGADGET",
                "www.techradar.com             -    TECHRADAR","www.vox.com/recode          -    RECODE",
                "slashdot.org                          -    SLASHDOT","www.techdirt.com                -   TECHDIRT",
                "in.mashable.com                  -    MASHABLE","www.theinquirer.net             -    THE INQUIRER",
                "www.dslreports.com            -    DSLREPORTS","gizmodo.com                         -    GIZMODO",
                "www.polygon.com                -     POLYGON","thenextweb.com                   -     THE NEXTWEB",
                "www.wired.com                    -     WIRED","www.digitaltrends.com       -     DIGITALTRENDS",
                "www.businessinsider.in    -   BUSINESSINSIDER","www.macrumors.com        -     MACRUMORS","www.droid-life.com             -     DROID-LIFE"};
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
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}



