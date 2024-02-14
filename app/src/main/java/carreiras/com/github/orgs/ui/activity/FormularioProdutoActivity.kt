package carreiras.com.github.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}