package sample.chat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by USER on 31-05-2019.
 */
public class links extends AppCompatActivity
{
    Spinner link;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        setContentView(R.layout.links);

        TextView txt = (TextView)findViewById(R.id.text1);
        txt.setSelected(true);
        txt.setHorizontallyScrolling(true);


        final Button ok = (Button) findViewById(R.id.button4);
        //name = (EditText) update.this.findViewById(R.id.rollt);
        link = (Spinner) findViewById(R.id.spinner);
        // Roll=(Spinner) findViewById(R.id.spinner3);
        // name1 = (EditText) update.this.findViewById(R.id.comt);
        final Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(links.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);
        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //String label=(String)myspinner.getSelectedItem();
                // String label = parent.getItemAtPosition(position).toString();
                String item = myspinner.getSelectedItem().toString();
//                Toast.makeText(parent.getContext(), "Please choose...",
//                        Toast.LENGTH_LONG).show();

//                Toast.makeText(parent.getContext(), "You selected: " + item,
//                        Toast.LENGTH_LONG).show();
                //toastState("selected", st);
                if (item.equals("Travel"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, travel.class);
                            startActivity(intent);

                        }

                    });
            }
                else if (item.equals("Hotels"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, hotels.class);
                            startActivity(intent);

                        }

                    });
                }
                else if (item.equals("Hospitals"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, hospitals.class);
                            startActivity(intent);

                        }

                    });
                }
                else if (item.equals("Journals"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, journals.class);
                            startActivity(intent);

                        }

                    });
                }
                else if (item.equals("Shopping"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, shopping.class);
                            startActivity(intent);

                        }

                    });
                }
                else if (item.equals("Programming Sites"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, pgmsites.class);
                            startActivity(intent);

                        }

                    });
                }

                else if (item.equals("Tech NEWS"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, technews.class);
                            startActivity(intent);

                        }

                    });
                }

                else if (item.equals("Online Courses"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, onlinecourse.class);
                            startActivity(intent);

                        }

                    });
                }
                else if(item.equals("Banking"))
                {
                    Toast.makeText(parent.getContext(), "You selected: " + item,
                            Toast.LENGTH_LONG).show();
                    ok.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View arg0) {

                            Intent intent = new Intent(links.this, banking.class);
                            startActivity(intent);

                        }

                    });
                }


            }

//                public void toastState(String name, String st)
//                {
//                    if( st != null) {
//                        Gen = st.name;
//                    }
//                }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

            //@Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }

        });



    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }



}
