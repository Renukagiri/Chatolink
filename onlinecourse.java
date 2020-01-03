package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 10-06-2019.
 */
public class onlinecourse extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.onlinecourse);
        String[] url1 = {"www.coursera.org                  -        COURSERA" ,"www.khanacademy.org         -        KHAN ACADEMY",
                "www.udacity.com                   -        UDACITY","www.edx.org                           -        EDX",
                "alison.com                               -       ALISON","oyc.yale.edu                            -       OPEN YALE",
                "academicearth.org                 -       ACADEMIC EARTH  ","ocw.mit.edu                             -       MIT OPEN COURSEWARE",
                "www.openculture.com          -        OPEN CULTURE","www.udemy.com                    -        UDEMY",
                "online.stanford.edu/courses  -      STANFORD","www.classcentral.com/university/berkeley               -        UC BERKELEY CLASS CENTRAL",
                "oli.cmu.edu/independent-learner-courses                 -        Carnegie Mellon Open Learning Initiative","www.memrise.com               -        MEMRISE",
        "iversity.org                              -        IVERSITY"};

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
