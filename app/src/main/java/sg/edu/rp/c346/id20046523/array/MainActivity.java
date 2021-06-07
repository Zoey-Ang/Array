package sg.edu.rp.c346.id20046523.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);

        String display= "Fruits\n";
        display+= "=====\n";
        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        for(int i=0; i< fruits.size(); i++)
        {
            display += fruits.get(i) + "\n";
        }

        tv.setText(display);

        String theFruit=fruits.get(1);
        fruits.remove(0);
        fruits.set(-1,"dragon fruit");
    }
}