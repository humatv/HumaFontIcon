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
        get() = "hum"

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
        hum_bookmark('\ue800'),
		hum_bookmark_fill('\ue801'),
		hum_bullet('\ue802'),
		hum_bullet_fill('\ue803'),
		hum_calender('\ue804'),
		hum_card('\ue806'),
		hum_card_fill('\ue807'),
		hum_cart('\ue808'),
		hum_cart_fill('\ue809'),
		hum_checklist('\ue80a'),
		hum_checklist_fill('\ue80b'),
		hum_close('\ue80c'),
		hum_close_fill('\ue80d'),
		hum_color('\ue80e'),
		hum_color_fill('\ue80f'),
		hum_dashboard('\ue810'),
		hum_dashboard_fill('\ue811'),
		hum_delete('\ue812'),
		hum_delete_fill('\ue813'),
		hum_developer('\ue814'),
		hum_developer_fill('\ue815'),
		hum_document('\ue816'),
		hum_document_fill('\ue817'),
		hum_downarrow('\ue818'),
		hum_download('\ue819'),
		hum_download_fill('\ue81a'),
		hum_easy('\ue81b'),
		hum_edit('\ue81c'),
		hum_edit_fill('\ue81d'),
		hum_email('\ue81e'),
		hum_email_fill('\ue81f'),
		hum_exit('\ue820'),
		hum_exit_fill('\ue821'),
		hum_expiration('\ue822'),
		hum_expiration_fill('\ue823'),
		hum_filter('\ue824'),
		hum_filter_fill('\ue825'),
		hum_fitness('\ue826'),
		hum_fitness_fill('\ue827'),
		hum_game('\ue828'),
		hum_game_fill('\ue829'),
		hum_grouping('\ue82a'),
		hum_grouping_fill('\ue82b'),
		hum_hard('\ue82c'),
		hum_hide('\ue82d'),
		hum_hide_fill('\ue82e'),
		hum_home('\ue82f'),
		hum_home_fill('\ue830'),
		hum_info('\ue831'),
		hum_info2('\ue833'),
		hum_info2_fill('\ue834'),
		hum_info_fill('\ue832'),
		hum_language('\ue835'),
		hum_language_fill('\ue836'),
		hum_left('\ue837'),
		hum_leftarrow('\ue838'),
		hum_like('\ue839'),
		hum_like_fill('\ue83a'),
		hum_link('\ue83b'),
		hum_list('\ue83c'),
		hum_list_fill('\ue83d'),
		hum_location('\ue83e'),
		hum_location_fill('\ue83f'),
		hum_medium('\ue840'),
		hum_minuse('\ue841'),
		hum_minuse_fill('\ue842'),
		hum_music('\ue843'),
		hum_music_fill('\ue844'),
		hum_notv('\ue845'),
		hum_notv_fill('\ue846'),
		hum_pause('\ue847'),
		hum_pause_fill('\ue848'),
		hum_phone('\ue849'),
		hum_phone_fill('\ue84a'),
		hum_picture('\ue84b'),
		hum_picture_fill('\ue84c'),
		hum_play('\ue84d'),
		hum_play_fill('\ue84e'),
		hum_plus('\ue84f'),
		hum_plus_fill('\ue850'),
		hum_price('\ue851'),
		hum_price_fill('\ue852'),
		hum_priority('\ue853'),
		hum_profile('\ue854'),
		hum_profile_fill('\ue855'),
		hum_promotion('\ue856'),
		hum_promotion_fill('\ue857'),
		hum_rightarrow('\ue858'),
		hum_search('\ue859'),
		hum_search_fill('\ue85a'),
		hum_setting('\ue85b'),
		hum_setting_fill('\ue85c'),
		hum_show('\ue85d'),
		hum_show_fill('\ue85e'),
		hum_skip('\ue85f'),
		hum_sort('\ue860'),
		hum_sort_fill('\ue861'),
		hum_star('\ue862'),
		hum_star_fill('\ue863'),
		hum_tag('\ue864'),
		hum_tag_fill('\ue865'),
		hum_time('\ue866'),
		hum_time_fill('\ue867'),
		hum_title('\ue868'),
		hum_title_fill('\ue869'),
		hum_tv('\ue86a'),
		hum_tv_fill('\ue86b'),
		hum_uparrow('\ue86c'),
		hum_update('\ue86d'),
		hum_upload('\ue86e'),
		hum_upload_fill('\ue86f'),
		hum_users('\ue870'),
		hum_users_fill('\ue871'),
		hum_version('\ue872'),
		hum_version_fill('\ue873'),
		hum_video('\ue874'),
		hum_video_fill('\ue875'),
		hum_voice('\ue876'),
		hum_voice_fill('\ue877'),
		hum_warning('\ue878'),
		hum_warning_fill('\ue879'),
		hum_web('\ue87a'),
		hum_web_fill('\ue87b');

        override val typeface: ITypeface by lazy { Huma }
    }
}