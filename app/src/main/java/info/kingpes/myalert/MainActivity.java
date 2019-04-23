package info.kingpes.myalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MyAlert.Builder(MainActivity.this)
                        .setTitle("OoOAlertDialog")
                        .setMessage("Deseja fechar este OoOAlertDialog?")
                        .setImage(R.mipmap.ic_launcher)
                        .setAnimation(Animationez.POP)
                        //.setAnimation(Animationez.SIDE)
                        //.setAnimation(Animationez.ZOOM)
                        //.setAnimation(Animationez.SIDE)
                        .setPositiveButton("Fechar", null)
                        .setNegativeButton("Mensagem", new OnClickListener() {
                            @Override
                            public void onClick() {
                                Toast.makeText(MainActivity.this, "mensagem", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .build();
            }
        });

    }
}
