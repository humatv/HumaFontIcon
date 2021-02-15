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
        get() = R.font.huma_font_v1_3

    override val characters: Map<String, Char> by lazy {
        Icon.values().associate { it.name to it.character }
    }
    
    override val mappingPrefix: String
        get() = "hm"

    override val fontName: String
        get() = "Huma"

    override val version: String
        get() = "1.3"

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
		hm_calender('\ue804'),
		hm_card('\ue806'),
		hm_card_fill('\ue807'),
		hm_cart('\ue808'),
		hm_cart_fill('\ue809'),
		hm_checklist('\ue80a'),
		hm_checklist_fill('\ue80b'),
		hm_close('\ue80c'),
		hm_close_fill('\ue80d'),
		hm_color('\ue80e'),
		hm_color_fill('\ue80f'),
		hm_dashboard('\ue810'),
		hm_dashboard_fill('\ue811'),
		hm_delete('\ue812'),
		hm_delete_fill('\ue813'),
		hm_developer('\ue814'),
		hm_developer_fill('\ue815'),
		hm_document('\ue816'),
		hm_document_fill('\ue817'),
		hm_downarrow('\ue818'),
		hm_download('\ue819'),
		hm_download_fill('\ue81a'),
		hm_easy('\ue81b'),
		hm_edit('\ue81c'),
		hm_edit_fill('\ue81d'),
		hm_email('\ue81e'),
		hm_email_fill('\ue81f'),
		hm_exit('\ue820'),
		hm_exit_fill('\ue821'),
		hm_expiration('\ue822'),
		hm_expiration_fill('\ue823'),
		hm_filter('\ue824'),
		hm_filter_fill('\ue825'),
		hm_fitness('\ue826'),
		hm_fitness_fill('\ue827'),
		hm_game('\ue828'),
		hm_game_fill('\ue829'),
		hm_grouping('\ue82a'),
		hm_grouping_fill('\ue82b'),
		hm_hard('\ue82c'),
		hm_hide('\ue82d'),
		hm_hide_fill('\ue82e'),
		hm_home('\ue82f'),
		hm_home_fill('\ue830'),
		hm_info('\ue831'),
		hm_info2('\ue833'),
		hm_info2_fill('\ue834'),
		hm_info_fill('\ue832'),
		hm_language('\ue835'),
		hm_language_fill('\ue836'),
		hm_left('\ue837'),
		hm_leftarrow('\ue838'),
		hm_like('\ue839'),
		hm_like_fill('\ue83a'),
		hm_link('\ue83b'),
		hm_list('\ue83c'),
		hm_list_fill('\ue83d'),
		hm_location('\ue83e'),
		hm_location_fill('\ue83f'),
		hm_medium('\ue840'),
		hm_minuse('\ue841'),
		hm_minuse_fill('\ue842'),
		hm_music('\ue843'),
		hm_music_fill('\ue844'),
		hm_notv('\ue845'),
		hm_notv_fill('\ue846'),
		hm_pause('\ue847'),
		hm_pause_fill('\ue848'),
		hm_phone('\ue849'),
		hm_phone_fill('\ue84a'),
		hm_picture('\ue84b'),
		hm_picture_fill('\ue84c'),
		hm_play('\ue84d'),
		hm_play_fill('\ue84e'),
		hm_plus('\ue84f'),
		hm_plus_fill('\ue850'),
		hm_price('\ue851'),
		hm_price_fill('\ue852'),
		hm_priority('\ue853'),
		hm_profile('\ue854'),
		hm_profile_fill('\ue855'),
		hm_promotion('\ue856'),
		hm_promotion_fill('\ue857'),
		hm_rightarrow('\ue858'),
		hm_search('\ue859'),
		hm_search_fill('\ue85a'),
		hm_setting('\ue85b'),
		hm_setting_fill('\ue85c'),
		hm_show('\ue85d'),
		hm_show_fill('\ue85e'),
		hm_skip('\ue85f'),
		hm_sort('\ue860'),
		hm_sort_fill('\ue861'),
		hm_star('\ue862'),
		hm_star_fill('\ue863'),
		hm_tag('\ue864'),
		hm_tag_fill('\ue865'),
		hm_time('\ue866'),
		hm_time_fill('\ue867'),
		hm_title('\ue868'),
		hm_title_fill('\ue869'),
		hm_tv('\ue86a'),
		hm_tv_fill('\ue86b'),
		hm_uparrow('\ue86c'),
		hm_update('\ue86d'),
		hm_upload('\ue86e'),
		hm_upload_fill('\ue86f'),
		hm_users('\ue870'),
		hm_users_fill('\ue871'),
		hm_version('\ue872'),
		hm_version_fill('\ue873'),
		hm_video('\ue874'),
		hm_video_fill('\ue875'),
		hm_voice('\ue876'),
		hm_voice_fill('\ue877'),
		hm_warning('\ue878'),
		hm_warning_fill('\ue879'),
		hm_web('\ue87a'),
		hm_web_fill('\ue87b');

        override val typeface: ITypeface by lazy { Huma }
    }
}