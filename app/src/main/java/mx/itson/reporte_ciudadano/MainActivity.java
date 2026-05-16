package mx.itson.reporte_ciudadano;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layoutReporte;
    private LinearLayout layoutContacto;
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Vincular componentes del XML a Java
        layoutReporte = findViewById(R.id.layoutReporte);
        layoutContacto = findViewById(R.id.layoutContacto);
        bottomNavigation = findViewById(R.id.bottomNavigation);

        // 2. Configurar el detector de clics del menú inferior
        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_reporte) {
                    // Muestra Reporte y oculta Contacto
                    layoutReporte.setVisibility(View.VISIBLE);
                    layoutContacto.setVisibility(View.GONE);
                    return true;
                } else if (id == R.id.nav_contacto) {
                    // Muestra Contacto y oculta Reporte
                    layoutReporte.setVisibility(View.GONE);
                    layoutContacto.setVisibility(View.VISIBLE);
                    return true;
                }
                return false;
            }
        });
    }
}