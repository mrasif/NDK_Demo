package in.mrasif.dev.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public native String helloWorld();
    public native int addTwoNumbers(int a, int b);
    public native int pow(int a, int b);

    static {
        System.loadLibrary("ndktest");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.tvHelloWorld)).setText(helloWorld()+"\n5+6="+addTwoNumbers(5,6)+"\n6^2="+pow(6,2));

    }
}
