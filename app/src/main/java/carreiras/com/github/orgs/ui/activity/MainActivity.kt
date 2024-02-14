package carreiras.com.github.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.R
import carreiras.com.github.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding: processo de vinculação do código fonte com o arquivo de layout.
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//        nome.text = "Cesta de frutas"

//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e uva"

//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }
}