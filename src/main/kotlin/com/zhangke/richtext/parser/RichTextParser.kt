package com.zhangke.richtext.parser

/**
 * <h1>Header<a>Link</a>Ending</h1>some content aaa<image>http://sample.com/image.png</image>>
 * [
 *  {
 *     "type": "h1",
 *     "content":[
 *         "Header",
 *         {
 *             "type": "a",
 *             "content": "Link",
 *         },
 *     "Ending"
 *     ]
 *  },
 *  "some content aaa",
 *  {
 *     "type": "image",
 *     "content": "http://sample.com/image.png",
 *  }
 * ]
 */
class RichTextParser {

    fun parse(richText: String){

    }
}
