package bandofthehawk.atrapathots;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class wordActivity extends AppCompatActivity {
    public final String[] PALABRAS = {"Vis a vis","Chicas del cable","Elite","Stranger Things","Peaky Blinders","Rick y Morty","Hannah Montana","Magos Waverly Place","Zack y Cody","Fisica o Quimica","El internado","LQSA","ANHQV","Juego de tronos","FRIENDS","COMO CONOCI VUESTRA A MADRE","Big Bang","Dos hombres y medio","Simpsons","Amar en tiempos revueltos/para siempre","Pornhub","Xvideos","Beeg","Empoderación de la mujer","Rebelde","Pasión de gavilanes","Harry Potter","Crepúsculo","Teen Wolf","Crónicas Vampíricas","Glee","HSM","Camp Rock","American Horror History","3 metros sobre el cielo","Narcos","Modern Family"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        newWord(findViewById(android.R.id.content));
        }
    public void newWord(View view){
        Random rand = new Random();
        int rNumber = rand.nextInt(PALABRAS.length);
        ((TextView)findViewById(R.id.wordView)).setText(PALABRAS[rNumber]);
    }


}
