package mx.itson.reporte_ciudadano;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Ocultar barra de navegación superior de la app
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Esperar 2 segundos antes de cambiar de pantalla
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,  MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // 2000 milisegundos = 2 segundos
    }
}