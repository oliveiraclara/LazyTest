package br.senai.sp.jandira.lazyproduct.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazyproduct.R
import br.senai.sp.jandira.lazyproduct.model.Product

class ProductRepository {

    companion object{

        var teste: String ="teste"
@Composable
        fun getProductsList(): List<Product>{
             return listOf<Product>(
                Product(
                   id = 1,
                   name = "Mouse",
                   price = 2.0,
                   description = "say hi!",
                   image = painterResource(id =R.drawable.mouse)
                ),
                Product(id= 2, 
                   name = "Teclado",
                price = 800.0,
                description ="apple keyboard",
                image = painterResource(id = R.drawable.teclado)),
                Product(id= 3, name = "Monitor"),
                Product(id= 4, name = "Impressora",  image = painterResource(id = R.drawable.tiana)),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora",  image = painterResource(id = R.drawable.lisa)),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
                Product(id= 4, name = "Impressora"),
            )
        }
    }
}