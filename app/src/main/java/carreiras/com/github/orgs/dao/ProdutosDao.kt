package carreiras.com.github.orgs.dao

import carreiras.com.github.orgs.model.Produto

class ProdutosDao {

    private val produtos = mutableListOf<Produto>()

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }
}