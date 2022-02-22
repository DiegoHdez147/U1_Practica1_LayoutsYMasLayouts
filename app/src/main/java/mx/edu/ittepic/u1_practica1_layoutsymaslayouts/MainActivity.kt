package mx.edu.ittepic.u1_practica1_layoutsymaslayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mx.edu.ittepic.u1_practica1_layoutsymaslayouts.data.LoginDataSource
import mx.edu.ittepic.u1_practica1_layoutsymaslayouts.ui.login.LoggedInUserView
import mx.edu.ittepic.u1_practica1_layoutsymaslayouts.ui.login.LoginActivity1
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton2.setOnClickListener {
            var musica = Intent(this, SettingsActivity1::class.java)
            startActivity(musica)
        }

        boton1.setOnClickListener {
            var loginUsuario = Intent(this,LoginActivity1::class.java)
            startActivity(loginUsuario)
        }
    }
}