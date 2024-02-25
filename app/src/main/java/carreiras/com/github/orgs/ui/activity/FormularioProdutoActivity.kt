package carreiras.com.github.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
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

        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)

        botaoSalvar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val campoNome = findViewById<EditText>(R.id.nome)
                val nome = campoNome.text.toString()
                Log.i("FormularioProduto", "onCreate: $nome")
            }
        })
    }
}