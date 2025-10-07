package edu.miu.midterm.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.miu.midterm.data.ImageRepositoryImpl

@Composable
fun ImageExpScreen(modifier: Modifier = Modifier) {
    val imageExpViewModel: ImageExpViewModel = viewModel{
        ImageExpViewModel(ImageRepositoryImpl())
    }
    val item by imageExpViewModel.uiState.collectAsState()

    Scaffold { innerPadding ->
        Column (
            modifier = modifier
                .padding(innerPadding)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Text(text = "ImageExpScreen")
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = item.item.image),
                contentDescription = stringResource(id = item.item.title)
            )
            Button(onClick = { imageExpViewModel.getNext() }) {
                Text(text = "Next")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ImageExpScreenPreview() {
    ImageExpScreen()
}
