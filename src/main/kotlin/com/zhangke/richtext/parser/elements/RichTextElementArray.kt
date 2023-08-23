package com.zhangke.richtext.parser.elements

import java.util.*

data class RichTextElementArray(
    private val elements: LinkedList<RichTextElement>,
) : RichTextElement, Collection<RichTextElement> by elements
