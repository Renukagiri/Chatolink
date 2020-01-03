//dummy program to make selection either chat or links

package sample.chat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 26-05-2019.
 */
public class fileselect extends AppCompatActivity
{

    private Button BTN1,BTN2,BTN3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectoption);
        //BTN1 = (Button) findViewById(R.id.button);
        BTN2 = (Button) findViewById(R.id.button2);

        addListenerOnButton();

    }
    public void addListenerOnButton() {

        final Context context = this;

        BTN3 = (Button) findViewById(R.id.button);

        BTN3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, chat.class);
                startActivity(intent);

            }

        });
    }



}
