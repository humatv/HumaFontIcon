/*
 * Copyright 2019 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.iconics.typeface.library.huma

import com.mikepenz.iconics.typeface.IIcon
import com.mikepenz.iconics.typeface.ITypeface
import java.util.LinkedList

@Suppress("EnumEntryName")
object Huma : ITypeface {

    override val fontRes: Int
        get() = R.font.huma_font_v1_0

    override val characters: Map<String, Char> by lazy {
        Icon.values().associate { it.name to it.character }
    }
    
    override val mappingPrefix: String
        get() = "hm"

    override val fontName: String
        get() = "Huma"

    override val version: String
        get() = "1.0"

    override val iconCount: Int
        get() = characters.size

    override val icons: List<String>
        get() = characters.keys.toCollection(LinkedList())

    override val author: String
        get() = "Huma"

    override val url: String
        get() = "huma.ir"

    override val description: String
        get() = ""

    override val license: String
        get() = ""

    override val licenseUrl: String
        get() = ""

    override fun getIcon(key: String): IIcon = Icon.valueOf(key)

    enum class Icon constructor(override val character: Char) : IIcon {
        hm_bookmark('\ue800'),
		hm_bookmark_fill('\ue801'),
		hm_bullet('\ue802'),
		hm_bullet_fill('\ue803'),
		hm_checklist('\ue804'),
		hm_checklist_fill('\ue805'),
		hm_document('\ue806'),
		hm_document_fill('\ue807'),
		hm_easy('\ue808'),
		hm_edit('\ue809'),
		hm_edit_fill('\ue80a'),
		hm_fitness('\ue80b'),
		hm_fitness_fill('\ue80c'),
		hm_grouping('\ue80d'),
		hm_grouping_fill('\ue80e'),
		hm_hard('\ue80f'),
		hm_home('\ue810'),
		hm_home_fill('\ue811'),
		hm_info('\ue812'),
		hm_info2('\ue814'),
		hm_info2_fill('\ue815'),
		hm_info_fill('\ue813'),
		hm_like('\ue816'),
		hm_like_fill('\ue817'),
		hm_medium('\ue818'),
		hm_music('\ue819'),
		hm_music_fill_('\ue81a'),
		hm_pause('\ue81b'),
		hm_pause_fill('\ue81c'),
		hm_play('\ue82d'),
		hm_play_fill('\ue81e'),
		hm_profile('\ue81f'),
		hm_profile_fill('\ue820'),
		hm_search('\ue821'),
		hm_search_fill('\ue822'),
		hm_setting('\ue823'),
		hm_setting_fill('\ue824'),
		hm_time('\ue825'),
		hm_time_fill('\ue826'),
		hm_video('\ue827'),
		hm_video_fill('\ue828'),
		hm_voice('\ue829'),
		hm_voice_fill('\ue82a'),
		hm_warning('\ue82b'),
		hm_warning_fill('\ue82c');

        override val typeface: ITypeface by lazy { Huma }
    }
}