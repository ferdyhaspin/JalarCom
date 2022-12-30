package org.ferdyhaspin.jalarcom.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.ferdyhaspin.jalarcom.ui.theme.JalarComTheme

/**
 * Created by ferdyhaspin on 31/12/22.
 */

@Composable
fun SectionItem(
    section: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = section,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(top = 15.dp, start = 15.dp)
    )
}

@Preview
@Composable
fun SectionPreview() {
    JalarComTheme {
        SectionItem("Section")
    }
}