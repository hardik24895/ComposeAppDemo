package com.tv.composeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(10.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(img), contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDesc(title, subtitle, Modifier.weight(.8f))
        }

    }
}

@Composable
private fun ItemDesc(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.labelLarge
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp,
            style = MaterialTheme.typography.headlineSmall
        )
    }
}

data class Category(val img: Int, val title: String, val desc: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.dummy, "Hardik", "Software developer1"))
    list.add(Category(R.drawable.dummy, "Sunny", "Software developer2"))
    list.add(Category(R.drawable.dummy, "Milan", "Software developer3"))
    list.add(Category(R.drawable.dummy, "Dhaval", "Software developer4"))
    list.add(Category(R.drawable.dummy, "Dharit", "Software developer5"))
    list.add(Category(R.drawable.dummy, "Parmar", "Software developer6"))
    list.add(Category(R.drawable.dummy, "Hardik", "Software developer1"))
    list.add(Category(R.drawable.dummy, "Sunny", "Software developer2"))
    list.add(Category(R.drawable.dummy, "Milan", "Software developer3"))
    list.add(Category(R.drawable.dummy, "Dhaval", "Software developer4"))
    list.add(Category(R.drawable.dummy, "Dharit", "Software developer5"))
    list.add(Category(R.drawable.dummy, "Parmar", "Software developer6"))
    list.add(Category(R.drawable.dummy, "Hardik", "Software developer1"))
    list.add(Category(R.drawable.dummy, "Sunny", "Software developer2"))
    list.add(Category(R.drawable.dummy, "Milan", "Software developer3"))
    list.add(Category(R.drawable.dummy, "Dhaval", "Software developer4"))
    list.add(Category(R.drawable.dummy, "Dharit", "Software developer5"))
    list.add(Category(R.drawable.dummy, "Parmar", "Software developer6"))
    list.add(Category(R.drawable.dummy, "Hardik", "Software developer1"))
    list.add(Category(R.drawable.dummy, "Sunny", "Software developer2"))
    list.add(Category(R.drawable.dummy, "Milan", "Software developer3"))
    list.add(Category(R.drawable.dummy, "Dhaval", "Software developer4"))
    list.add(Category(R.drawable.dummy, "Dharit", "Software developer5"))
    list.add(Category(R.drawable.dummy, "Parmar", "Software developer6"))
    list.add(Category(R.drawable.dummy, "Hardik", "Software developer1"))
    list.add(Category(R.drawable.dummy, "Sunny", "Software developer2"))
    list.add(Category(R.drawable.dummy, "Milan", "Software developer3"))
    list.add(Category(R.drawable.dummy, "Dhaval", "Software developer4"))
    list.add(Category(R.drawable.dummy, "Dharit", "Software developer5"))
    list.add(Category(R.drawable.dummy, "Parmar", "Software developer6"))
    list.add(Category(R.drawable.dummy, "Hardik", "Software developer1"))
    list.add(Category(R.drawable.dummy, "Sunny", "Software developer2"))
    list.add(Category(R.drawable.dummy, "Milan", "Software developer3"))
    list.add(Category(R.drawable.dummy, "Dhaval", "Software developer4"))
    list.add(Category(R.drawable.dummy, "Dharit", "Software developer5"))
    list.add(Category(R.drawable.dummy, "Parmar", "Software developer6"))
    return list
}


@Preview (heightDp = 500)
@Composable
fun PreviewItem() {
  LazyColumn(content ={

      items(getCategoryList()){
          BlogCategory(img = it.img, title = it.title, subtitle =it.desc )
      }
  })

}