package carreiras.com.github.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import carreiras.com.github.orgs.R

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {

    /**
     * Com AppCompatActivity, podemos retirar toda a parte do setContentView
     * e até mesmo o método onCreate e colocar a referência ao layout no
     * contrutor da classe
     *
     *  override fun onCreate(savedInstanceState: Bundle?) {
     *      super.onCreate(savedInstanceState)
     *      setContentView(R.layout.activity_formulario_produto)
     *  }
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val campoNome = findViewById<EditText>(R.id.nome)
        val nome = campoNome.text.toString()
        Log.i("FormularioProduto", "onCreate: $nome")
    }
}