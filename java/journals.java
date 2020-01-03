package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 05-06-2019.
 */
public class journals extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.journals);
        String[] url1 = {"www.inderscience.com           -    IJCAET" ,"www.tmrfindia.org/ijcsa         -    IJCSA",
                "www.ijcseonline.org                -    IJCSE","www.iaeme.com/ijcet             -    IJCET",
                "www.ijcte.org                           -    IJCTE","www.ijcaonline.org                 -    IJCA",
                "www.ijrar.org                           -    IJRAR  ","ijeti.imeti.org                           -    IJETI",
                "www.ijee.ie                              -    IJEE","ijesm.co.in                               -    IJESM",
                "www.iasir.net                          -    IASIRR","www.i2or-ijrece.com             -    IJRECE",
                "www.indusedu.org                 -    IJREISS","www.ijrat.org                          -    IJRAT",
                "www.ijsk.org                           -    IJSK","ijrte.penpublishing.net          -    IJRTE",
                "ijpsr.com                                  -    IJSPR","www.tandfonline.com/loi/cwse20    -   IJRME","www.tandfonline.com/loi/hjpr20      -   HJPR"};
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







