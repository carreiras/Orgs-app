package carreiras.com.github.orgs.ui.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.model.Produto

class ListaProdutosAdapter(private val produtos: List<Produto>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

//    override fun getItemCount(): Int {
//        return produtos.size
//    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
