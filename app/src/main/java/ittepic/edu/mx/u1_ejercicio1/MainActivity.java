package ittepic.edu.mx.u1_ejercicio1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void ImpTabla(View v){
        String numero1 = et1.getText().toString();
        int numero2 = Integer.parseInt(numero1);
        String result2 = "";
        for(int i = 1; i <= 20; i++){
            int result1 = i * numero2;
            result2 += i+ " x " + numero1 + " = " + String.valueOf(result1) + '\n';
        }
        et2.setText(result2);
    }

}